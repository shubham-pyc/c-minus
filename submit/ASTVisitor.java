package submit;

import parser.CminusBaseVisitor;
import parser.CminusParser;
import parser.CminusParser.TypeSpecifierContext;
import submit.ast.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ASTVisitor extends CminusBaseVisitor<Node> {
    private final Logger LOGGER;
    private SymbolTable symbolTable;

    public ASTVisitor(Logger LOGGER) {
        this.LOGGER = LOGGER;
    }

    private VarType getVarType(CminusParser.TypeSpecifierContext ctx) {
        final String t = ctx.getText();
        return (t.equals("int")) ? VarType.INT : (t.equals("bool")) ? VarType.BOOL : VarType.CHAR;
    }

    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }

    @Override
    public Node visitProgram(CminusParser.ProgramContext ctx) {
        symbolTable = new SymbolTable();
        List<Declaration> decls = new ArrayList<>();
        for (CminusParser.DeclarationContext d : ctx.declaration()) {
            decls.add((Declaration) visitDeclaration(d));

        }

        return new Program(decls);
    }

    @Override
    public Node visitVarDeclaration(CminusParser.VarDeclarationContext ctx) {
        // for (CminusParser.VarDeclIdContext v : ctx.varDeclId()) {
        // String id = v.ID().getText();
        // LOGGER.fine("Var ID: " + id);
        // }
        // return null;

        VarType type = getVarType(ctx.typeSpecifier());
        List<String> ids = new ArrayList<>();
        List<Integer> arraySizes = new ArrayList<>();
        for (CminusParser.VarDeclIdContext v : ctx.varDeclId()) {
            String id = v.ID().getText();
            ids.add(id);
            if (v.NUMCONST() != null) {
                int size = Integer.parseInt(v.NUMCONST().getText());
                symbolTable.addSymbol(id, new SymbolInfo(id, type, false, symbolTable.getArrayOffset(size), size));
                arraySizes.add(Integer.parseInt(v.NUMCONST().getText()));
            } else {
                symbolTable.addSymbol(id, new SymbolInfo(id, type, false, symbolTable.getOffset()));
                arraySizes.add(-1);
            }
        }
        final boolean isStatic = false;
        return new VarDeclaration(type, ids, arraySizes, isStatic);
    }

    // @Override public Node visitReturnStmt(CminusParser.ReturnStmtContext ctx) {
    // if (ctx.expression() != null) {
    // return new Return((Expression) visitExpression(ctx.expression()));
    // }
    // return new Return(null);
    // }

    @Override
    public Node visitConstant(CminusParser.ConstantContext ctx) {
        final Node node;

        if (ctx.NUMCONST() != null) {
            node = new NumConstant(Integer.parseInt(ctx.NUMCONST().getText()));
        } else if (ctx.CHARCONST() != null) {
            String sCon = Character.toString(ctx.CHARCONST().getText().charAt(0));

            SymbolInfo c = symbolTable.find(sCon);
            if (c == null) {
                LOGGER.warning("Undefined symbol on line " + ctx.getStart().getLine() + ": " + sCon);
            }

            node = new CharConstant(ctx.CHARCONST().getText().charAt(0));
        } else if (ctx.STRINGCONST() != null) {
            String sCon = ctx.STRINGCONST().getText();

            SymbolInfo c = new SymbolInfo(SymbolTable.getDataLabel(), VarType.STRING, false);
            symbolTable.addSymbol(sCon, c);

            // SymbolInfo c = symbolTable.find(sCon);
            // if (c == null) {
            // LOGGER.warning("Undefined symbol on line " + ctx.getStart().getLine() + ": "
            // + sCon);
            // }

            node = new StringConstant(ctx.STRINGCONST().getText());
        } else {
            node = new BoolConstant(ctx.getText().equals("true"));
        }
        return node;
    }

    // TODO Uncomment and implement whatever methods make sense
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitDeclaration(CminusParser.DeclarationContext ctx) {
    // return visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitVarDeclId(CminusParser.VarDeclIdContext ctx) { return
    // visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public FunctionDeclaration visitFunDeclaration(CminusParser.FunDeclarationContext ctx) {
        Boolean isVoid = false;
        TypeSpecifierContext type = ctx.typeSpecifier();
        String Id = ctx.ID().getText();
        VarType varType = null;
        if (type == null) {
            isVoid = true;
        } else {
            varType = getVarType(type);
        }

        List<String> paramIds = new ArrayList<>();
        List<VarType> paramTypes = new ArrayList<>();

        symbolTable.addSymbol(Id, new SymbolInfo(Id, varType, true));

        // Create a new symbol table when function is declared is called
        symbolTable = symbolTable.createChild(true);
        for (CminusParser.ParamContext v : ctx.param()) {
            // + ", ");
            String id = v.paramId().getText();
            VarType vatT = getVarType(v.typeSpecifier());
            if (id.contains("[")) {
                id = id.replace("[]", "");
                symbolTable.addSymbol(id, new SymbolInfo(id, vatT, false, symbolTable.getOffset(), -99));
            } else {

                symbolTable.addSymbol(id, new SymbolInfo(id, vatT, false, symbolTable.getOffset()));
            }

            paramIds.add(id);
            paramTypes.add(vatT);
        }
        // Setting return offset
        symbolTable.returnOffset = symbolTable.getBaseOffset() - 4;

        CminusParser.StatementContext stmtCtx = ctx.statement();

        FunctionDeclaration funDeclaration = new FunctionDeclaration(varType, Id, paramIds, paramTypes, isVoid,
                symbolTable);

        funDeclaration.setStatement(visitStatement(stmtCtx));

        symbolTable = symbolTable.getParent();
        System.out.println("Changing parent again: " + symbolTable);

        // stmtCtx.
        // Statement s = stmtCtx.ifStmt();

        // VarType ptype = getVarType(v.typeSpecifier());

        // String id = v.ID().toString();
        // ids.add(id);
        // symbolTable.addSymbol(id, new SymbolInfo(id, type, false));
        // if (v.NUMCONST() != null) {
        // arraySizes.add(Integer.parseInt(v.NUMCONST().getText()));
        // } else {
        // arraySizes.add(-1);
        // }
        // }
        // final boolean isStatic = false;

        // return new VarDeclaration(type, ids, arraySizes, isStatic);
        return funDeclaration;
        // return null;
        // return
        // return visitChildren(ctx);
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitTypeSpecifier(CminusParser.TypeSpecifierContext ctx)
    // { return visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitParam(CminusParser.ParamContext ctx) { return
    // visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitParamId(CminusParser.ParamIdContext ctx) { return
    // visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Statement visitStatement(CminusParser.StatementContext stmtCtx) {

        CminusParser.IfStmtContext ifStmt = stmtCtx.ifStmt();
        CminusParser.ReturnStmtContext returnStmt = stmtCtx.returnStmt();
        CminusParser.ExpressionStmtContext exprStmt = stmtCtx.expressionStmt();
        CminusParser.CompoundStmtContext compoundStmt = stmtCtx.compoundStmt();
        CminusParser.BreakStmtContext breakStmt = stmtCtx.breakStmt();
        CminusParser.WhileStmtContext whileStmtContext = stmtCtx.whileStmt();

        Statement retValue = null;

        if (ifStmt != null) {
            retValue = visitIfStmt(ifStmt);
        } else if (returnStmt != null) {
            Expression e = null;
            if (returnStmt.expression() != null) {
                e = visitExpression(returnStmt.expression());
            }
            retValue = new Return(e);
        } else if (exprStmt != null) {
            retValue = visitExpressionStmt(exprStmt);
        } else if (breakStmt != null) {
            retValue = new BreakStmt();
        } else if (whileStmtContext != null) {
            Expression simpleExp = (Expression) visitSimpleExpression(whileStmtContext.simpleExpression());
            Statement stat = (Statement) visitStatement(whileStmtContext.statement());

            retValue = new WhileStmt(simpleExp, stat);

        } else if (compoundStmt != null) {
            retValue = visitCompoundStmt(compoundStmt);
        }

        return retValue;
        // return visitChildren(ctx);
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public CompoundStatement visitCompoundStmt(CminusParser.CompoundStmtContext ctx) {

        List<VarDeclaration> varDec = new ArrayList<>();
        List<Statement> statements = new ArrayList<>();
        symbolTable = symbolTable.createChild();
        for (CminusParser.VarDeclarationContext v : ctx.varDeclaration()) {
            varDec.add((VarDeclaration) visitVarDeclaration(v));
        }

        for (CminusParser.StatementContext v : ctx.statement()) {
            statements.add((Statement) visitStatement(v));
        }

        SymbolTable previous = symbolTable;
        symbolTable = symbolTable.getParent();
        return new CompoundStatement(varDec, statements, previous);
        // return visitChildren(ctx);
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public ExpressionStmt visitExpressionStmt(CminusParser.ExpressionStmtContext ctx) {
        Expression expression = (Expression) visitExpression(ctx.expression());
        return new ExpressionStmt(expression);
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Statement visitIfStmt(CminusParser.IfStmtContext ctx) {
        Expression simExp = (Expression) visitSimpleExpression(ctx.simpleExpression());

        Statement first = (Statement) visitStatement(ctx.statement().get(0));
        Statement second = null;
        if (ctx.statement().size() > 1) {
            second = (Statement) visitStatement(ctx.statement().get(1));
        }

        return new IfStmt(simExp, first, second);
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitWhileStmt(CminusParser.WhileStmtContext ctx) { return
    // visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitBreakStmt(CminusParser.BreakStmtContext ctx) { return
    // visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Expression visitExpression(CminusParser.ExpressionContext ctx) {
        CminusParser.MutableContext mutCtx = ctx.mutable();
        CminusParser.ExpressionContext expCtx = ctx.expression();
        CminusParser.SimpleExpressionContext simCtx = ctx.simpleExpression();

        String operator = "";
        String ctxText = ctx.getText();

        // TODO This can be a potential bug for expression

        Expression retValue = null;
        Expression lhs = null;
        // SimpleExpression simpleExpression
        if (mutCtx != null) {

            Mutable mut = (Mutable) visitMutable(mutCtx);
            String rStr = "";

            if (expCtx != null) {
                rStr = expCtx.getText();
                lhs = (Expression) visitExpression(expCtx);
            }
            ctxText = ctxText.replace(rStr, "");

            // TODO: This is still a potential bug
            if (ctxText.contains("+=")) {
                operator = "+=";
            } else if (ctxText.contains("-=")) {
                operator = "-=";
            } else if (ctxText.contains("*=")) {
                operator = "*=";
            } else if (ctxText.contains("/=")) {
                operator = "/=";
            } else if (ctxText.contains("++")) {
                operator = "++";
            } else if (ctxText.contains("--")) {
                operator = "--";
            } else if (ctxText.contains("=")) {
                operator = "=";
            }

            return new ExpressionImp(mut, operator, lhs);

        }
        if (simCtx != null) {
            return (Expression) visitSimpleExpression(simCtx);
        }

        return retValue;
        // return visitChildren(ctx);
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitSimpleExpression(CminusParser.SimpleExpressionContext
    // ctx) { return visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Expression visitOrExpression(CminusParser.OrExpressionContext ctx) {
        Expression retValue = null;

        List<AndExpression> ands = new ArrayList<>();

        for (CminusParser.AndExpressionContext v : ctx.andExpression()) {
            ands.add((AndExpression) visitAndExpression(v));
        }
        return (Expression) (new OrExpression(ands));
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Expression visitAndExpression(CminusParser.AndExpressionContext ctx) {
        Expression retValue = null;

        List<UnaryRealExpression> ands = new ArrayList<>();

        for (CminusParser.UnaryRelExpressionContext v : ctx.unaryRelExpression()) {
            ands.add((UnaryRealExpression) visitUnaryRelExpression(v));
        }

        return new AndExpression(ands);
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Expression visitUnaryRelExpression(CminusParser.UnaryRelExpressionContext ctx) {

        RealExpression exp = (RealExpression) visitRelExpression(ctx.relExpression());

        return new UnaryRealExpression(ctx.BANG().size(), exp);

    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Expression visitRelExpression(CminusParser.RelExpressionContext ctx) {
        List<SumExpression> sums = new ArrayList<>();
        List<String> relop = new ArrayList<>();

        List<CminusParser.SumExpressionContext> sumctxs = ctx.sumExpression();

        for (int i = 0; i < ctx.relop().size(); i++) {
            relop.add(ctx.relop().get(i).getText());
            sums.add((SumExpression) visitSumExpression(sumctxs.get(i)));
        }

        sums.add((SumExpression) visitSumExpression(sumctxs.get(sumctxs.size() - 1)));

        return new RealExpression(sums, relop);

    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitRelop(CminusParser.RelopContext ctx) { return
    // visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Expression visitSumExpression(CminusParser.SumExpressionContext ctx) {

        List<TermExpression> terms = new ArrayList<>();
        List<String> sumop = new ArrayList<>();

        List<CminusParser.TermExpressionContext> sumctxs = ctx.termExpression();

        // if (sumctxs.size() > 1) {
        // }

        for (int i = 0; i < ctx.sumop().size(); i++) {

            sumop.add(ctx.sumop().get(i).getText());
            terms.add((TermExpression) visitTermExpression(sumctxs.get(i)));
        }

        terms.add((TermExpression) visitTermExpression(sumctxs.get(sumctxs.size() - 1)));

        return new SumExpression(terms, sumop);

    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitSumop(CminusParser.SumopContext ctx) { return
    // visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Expression visitTermExpression(CminusParser.TermExpressionContext ctx) {
        List<Expression> terms = new ArrayList<>();
        List<String> mulop = new ArrayList<>();

        List<CminusParser.UnaryExpressionContext> sumctxs = ctx.unaryExpression();

        for (int i = 0; i < ctx.mulop().size(); i++) {
            mulop.add(ctx.mulop().get(i).getText());
            terms.add((Expression) visitUnaryExpression(sumctxs.get(i)));
        }

        terms.add((Expression) visitUnaryExpression(sumctxs.get(sumctxs.size() - 1)));

        return new TermExpression(terms, mulop);
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitMulop(CminusParser.MulopContext ctx) { return
    // visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Expression visitUnaryExpression(CminusParser.UnaryExpressionContext ctx) {

        CminusParser.FactorContext fCtx = ctx.factor();
        Expression e = null;
        List<String> unaryop = new ArrayList<>();

        for (CminusParser.UnaryopContext u : ctx.unaryop()) {
            unaryop.add(u.getText());
        }

        if (fCtx.mutable() != null) {
            CminusParser.MutableContext mctx = fCtx.mutable();

            Expression inner = null;
            if (mctx.expression() != null) {
                inner = (Expression) visitExpression(mctx.expression());
            }

            e = new Mutable(mctx.ID().getText(), inner);
        }
        if (fCtx.immutable() != null) {
            e = (Expression) visitImmutable(fCtx.immutable());
        }

        return new UnaryExpression(unaryop, e);
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitUnaryop(CminusParser.UnaryopContext ctx) { return
    // visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    // @Override public T visitFactor(CminusParser.FactorContext ctx) { return
    // visitChildren(ctx); }
    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Mutable visitMutable(CminusParser.MutableContext ctx) {
        Expression e = null;
        if (ctx.expression() != null) {
            e = visitExpression(ctx.expression());
        }
        String sCon = ctx.ID().getText();

        SymbolInfo c = symbolTable.find(sCon);
        if (c == null) {
            LOGGER.warning("Undefined symbol on line " + ctx.getStart().getLine() + ": " + sCon);
        }
        return new Mutable(ctx.ID().toString(), e);
    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Expression visitImmutable(CminusParser.ImmutableContext ctx) {
        CminusParser.ExpressionContext expCtx = ctx.expression();
        CminusParser.CallContext callCtx = ctx.call();
        CminusParser.ConstantContext conCtx = ctx.constant();

        Expression e = null;
        Call call = null;
        Constant constant = null;

        if (expCtx != null) {

            e = visitExpression(expCtx);
        }
        if (callCtx != null) {
            call = visitCall(callCtx);
        }

        if (conCtx != null) {

            constant = (Constant) visitConstant(conCtx);
        }

        return new Immutable(e, call, constant);

    }

    // /**
    // * {@inheritDoc}
    // *
    // * <p>The default implementation returns the result of calling
    // * {@link #visitChildren} on {@code ctx}.</p>
    // */
    @Override
    public Call visitCall(CminusParser.CallContext ctx) {

        List<Expression> expressions = new ArrayList<>();
        List<CminusParser.ExpressionContext> expCtxs = ctx.expression();

        if (expCtxs.size() > 0) {

            for (CminusParser.ExpressionContext e : ctx.expression()) {
                expressions.add((Expression) visitExpression(e));
            }
        }
        String id = ctx.ID().getText();
        SymbolInfo c = symbolTable.find(id);
        if (c == null) {
            LOGGER.warning("Undefined symbol on line " + ctx.getStart().getLine() + ": " + id);
        }

        return new Call(id, expressions);
        // return null;
    }

}
