// Generated from Cminus.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CminusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, ID=42, NUMCONST=43, STRINGCONST=44, CHARCONST=45, 
		BANG=46, WS=47, COMMENT=48;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_varDeclaration = 2, RULE_varDeclId = 3, 
		RULE_funDeclaration = 4, RULE_typeSpecifier = 5, RULE_param = 6, RULE_paramId = 7, 
		RULE_statement = 8, RULE_compoundStmt = 9, RULE_expressionStmt = 10, RULE_ifStmt = 11, 
		RULE_whileStmt = 12, RULE_returnStmt = 13, RULE_breakStmt = 14, RULE_expression = 15, 
		RULE_simpleExpression = 16, RULE_orExpression = 17, RULE_andExpression = 18, 
		RULE_unaryRelExpression = 19, RULE_relExpression = 20, RULE_relop = 21, 
		RULE_sumExpression = 22, RULE_sumop = 23, RULE_termExpression = 24, RULE_mulop = 25, 
		RULE_unaryExpression = 26, RULE_unaryop = 27, RULE_factor = 28, RULE_mutable = 29, 
		RULE_immutable = 30, RULE_call = 31, RULE_constant = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "varDeclaration", "varDeclId", "funDeclaration", 
			"typeSpecifier", "param", "paramId", "statement", "compoundStmt", "expressionStmt", 
			"ifStmt", "whileStmt", "returnStmt", "breakStmt", "expression", "simpleExpression", 
			"orExpression", "andExpression", "unaryRelExpression", "relExpression", 
			"relop", "sumExpression", "sumop", "termExpression", "mulop", "unaryExpression", 
			"unaryop", "factor", "mutable", "immutable", "call", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'['", "']'", "'void'", "'('", "')'", "'int'", "'bool'", 
			"'char'", "'[]'", "'{'", "'}'", "'if'", "'else'", "'while'", "'return'", 
			"'break'", "'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'||'", 
			"'&&'", "'<='", "'<'", "'>'", "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'?'", "'true'", "'false'", null, null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "NUMCONST", "STRINGCONST", 
			"CHARCONST", "BANG", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cminus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CminusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				declaration();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FunDeclarationContext funDeclaration() {
			return getRuleContext(FunDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				funDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public List<VarDeclIdContext> varDeclId() {
			return getRuleContexts(VarDeclIdContext.class);
		}
		public VarDeclIdContext varDeclId(int i) {
			return getRuleContext(VarDeclIdContext.class,i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			typeSpecifier();
			setState(76);
			varDeclId();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(77);
				match(T__0);
				setState(78);
				varDeclId();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public TerminalNode NUMCONST() { return getToken(CminusParser.NUMCONST, 0); }
		public VarDeclIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterVarDeclId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitVarDeclId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitVarDeclId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclIdContext varDeclId() throws RecognitionException {
		VarDeclIdContext _localctx = new VarDeclIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclId);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(ID);
				setState(88);
				match(T__2);
				setState(89);
				match(NUMCONST);
				setState(90);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public FunDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterFunDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitFunDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitFunDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclarationContext funDeclaration() throws RecognitionException {
		FunDeclarationContext _localctx = new FunDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(93);
				match(T__4);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
				{
				setState(94);
				typeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(97);
			match(ID);
			setState(98);
			match(T__5);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(99);
				param();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(102);
				match(T__0);
				setState(103);
				param();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__6);
			setState(110);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ParamIdContext paramId() {
			return getRuleContext(ParamIdContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			typeSpecifier();
			setState(115);
			paramId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public ParamIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterParamId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitParamId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitParamId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamIdContext paramId() throws RecognitionException {
		ParamIdContext _localctx = new ParamIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramId);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(ID);
				setState(119);
				match(T__10);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__5:
			case T__34:
			case T__35:
			case T__38:
			case T__39:
			case T__40:
			case ID:
			case NUMCONST:
			case STRINGCONST:
			case CHARCONST:
			case BANG:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				expressionStmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				compoundStmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				ifStmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				whileStmt();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				returnStmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				breakStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStmtContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterCompoundStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitCompoundStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitCompoundStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compoundStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__11);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(131);
				varDeclaration();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__34) | (1L << T__35) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << ID) | (1L << NUMCONST) | (1L << STRINGCONST) | (1L << CHARCONST) | (1L << BANG))) != 0)) {
				{
				{
				setState(137);
				statement();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitExpressionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitExpressionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionStmt);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__34:
			case T__35:
			case T__38:
			case T__39:
			case T__40:
			case ID:
			case NUMCONST:
			case STRINGCONST:
			case CHARCONST:
			case BANG:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				expression();
				setState(146);
				match(T__1);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStmt);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__13);
				setState(152);
				match(T__5);
				setState(153);
				simpleExpression();
				setState(154);
				match(T__6);
				setState(155);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__13);
				setState(158);
				match(T__5);
				setState(159);
				simpleExpression();
				setState(160);
				match(T__6);
				setState(161);
				statement();
				setState(162);
				match(T__14);
				setState(163);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__15);
			setState(168);
			match(T__5);
			setState(169);
			simpleExpression();
			setState(170);
			match(T__6);
			setState(171);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStmt);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__16);
				setState(174);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__16);
				setState(176);
				expression();
				setState(177);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStmtContext extends ParserRuleContext {
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__17);
			setState(182);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				mutable();
				setState(185);
				match(T__18);
				setState(186);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				mutable();
				setState(189);
				match(T__19);
				setState(190);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				mutable();
				setState(193);
				match(T__20);
				setState(194);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				mutable();
				setState(197);
				match(T__21);
				setState(198);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				mutable();
				setState(201);
				match(T__22);
				setState(202);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				mutable();
				setState(205);
				match(T__23);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				mutable();
				setState(208);
				match(T__24);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(210);
				simpleExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			orExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_orExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					andExpression();
					setState(216);
					match(T__25);
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(223);
			andExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<UnaryRelExpressionContext> unaryRelExpression() {
			return getRuleContexts(UnaryRelExpressionContext.class);
		}
		public UnaryRelExpressionContext unaryRelExpression(int i) {
			return getRuleContext(UnaryRelExpressionContext.class,i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					unaryRelExpression();
					setState(226);
					match(T__26);
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(233);
			unaryRelExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryRelExpressionContext extends ParserRuleContext {
		public RelExpressionContext relExpression() {
			return getRuleContext(RelExpressionContext.class,0);
		}
		public List<TerminalNode> BANG() { return getTokens(CminusParser.BANG); }
		public TerminalNode BANG(int i) {
			return getToken(CminusParser.BANG, i);
		}
		public UnaryRelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryRelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterUnaryRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitUnaryRelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitUnaryRelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryRelExpressionContext unaryRelExpression() throws RecognitionException {
		UnaryRelExpressionContext _localctx = new UnaryRelExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryRelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BANG) {
				{
				{
				setState(235);
				match(BANG);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			relExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExpressionContext extends ParserRuleContext {
		public List<SumExpressionContext> sumExpression() {
			return getRuleContexts(SumExpressionContext.class);
		}
		public SumExpressionContext sumExpression(int i) {
			return getRuleContext(SumExpressionContext.class,i);
		}
		public List<RelopContext> relop() {
			return getRuleContexts(RelopContext.class);
		}
		public RelopContext relop(int i) {
			return getRuleContext(RelopContext.class,i);
		}
		public RelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitRelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitRelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpressionContext relExpression() throws RecognitionException {
		RelExpressionContext _localctx = new RelExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243);
					sumExpression();
					setState(244);
					relop();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(251);
			sumExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumExpressionContext extends ParserRuleContext {
		public List<TermExpressionContext> termExpression() {
			return getRuleContexts(TermExpressionContext.class);
		}
		public TermExpressionContext termExpression(int i) {
			return getRuleContext(TermExpressionContext.class,i);
		}
		public List<SumopContext> sumop() {
			return getRuleContexts(SumopContext.class);
		}
		public SumopContext sumop(int i) {
			return getRuleContext(SumopContext.class,i);
		}
		public SumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterSumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitSumExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitSumExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumExpressionContext sumExpression() throws RecognitionException {
		SumExpressionContext _localctx = new SumExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sumExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					termExpression();
					setState(256);
					sumop();
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(263);
			termExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumopContext extends ParserRuleContext {
		public SumopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterSumop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitSumop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitSumop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumopContext sumop() throws RecognitionException {
		SumopContext _localctx = new SumopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sumop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterTermExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitTermExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitTermExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermExpressionContext termExpression() throws RecognitionException {
		TermExpressionContext _localctx = new TermExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					unaryExpression();
					setState(268);
					mulop();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(275);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitMulop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<UnaryopContext> unaryop() {
			return getRuleContexts(UnaryopContext.class);
		}
		public UnaryopContext unaryop(int i) {
			return getRuleContext(UnaryopContext.class,i);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__38))) != 0)) {
				{
				{
				setState(279);
				unaryop();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryopContext extends ParserRuleContext {
		public UnaryopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterUnaryop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitUnaryop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitUnaryop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryopContext unaryop() throws RecognitionException {
		UnaryopContext _localctx = new UnaryopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public ImmutableContext immutable() {
			return getRuleContext(ImmutableContext.class,0);
		}
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				immutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				mutable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MutableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterMutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitMutable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitMutable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutableContext mutable() throws RecognitionException {
		MutableContext _localctx = new MutableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mutable);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(ID);
				setState(295);
				match(T__2);
				setState(296);
				expression();
				setState(297);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmutableContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ImmutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immutable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterImmutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitImmutable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitImmutable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmutableContext immutable() throws RecognitionException {
		ImmutableContext _localctx = new ImmutableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_immutable);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(T__5);
				setState(302);
				expression();
				setState(303);
				match(T__6);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				call();
				}
				break;
			case T__39:
			case T__40:
			case NUMCONST:
			case STRINGCONST:
			case CHARCONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(ID);
			setState(310);
			match(T__5);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					expression();
					setState(312);
					match(T__0);
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__34) | (1L << T__35) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << ID) | (1L << NUMCONST) | (1L << STRINGCONST) | (1L << CHARCONST) | (1L << BANG))) != 0)) {
				{
				setState(319);
				expression();
				}
			}

			setState(322);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NUMCONST() { return getToken(CminusParser.NUMCONST, 0); }
		public TerminalNode CHARCONST() { return getToken(CminusParser.CHARCONST, 0); }
		public TerminalNode STRINGCONST() { return getToken(CminusParser.STRINGCONST, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CminusListener ) ((CminusListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CminusVisitor ) return ((CminusVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << NUMCONST) | (1L << STRINGCONST) | (1L << CHARCONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0149\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2F\n\2\r\2\16\2G\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\7"+
		"\4R\n\4\f\4\16\4U\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\5"+
		"\6b\n\6\3\6\3\6\3\6\5\6g\n\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0083\n\n\3\13\3\13\7\13\u0087\n\13\f\13\16\13\u008a\13\13\3\13\7\13"+
		"\u008d\n\13\f\13\16\13\u0090\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0098"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a8"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00b6\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00d6\n\21\3\22\3\22\3\23\3\23\3\23\7\23\u00dd"+
		"\n\23\f\23\16\23\u00e0\13\23\3\23\3\23\3\24\3\24\3\24\7\24\u00e7\n\24"+
		"\f\24\16\24\u00ea\13\24\3\24\3\24\3\25\7\25\u00ef\n\25\f\25\16\25\u00f2"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\7\26\u00f9\n\26\f\26\16\26\u00fc\13\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\7\30\u0105\n\30\f\30\16\30\u0108\13"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u0111\n\32\f\32\16\32\u0114"+
		"\13\32\3\32\3\32\3\33\3\33\3\34\7\34\u011b\n\34\f\34\16\34\u011e\13\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\5\36\u0126\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u012e\n\37\3 \3 \3 \3 \3 \3 \5 \u0136\n \3!\3!\3!\3!\3!\7!"+
		"\u013d\n!\f!\16!\u0140\13!\3!\5!\u0143\n!\3!\3!\3\"\3\"\3\"\2\2#\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\b\3\2\n"+
		"\f\3\2\36#\3\2$%\3\2&(\4\2%&))\4\2*+-/\2\u014d\2E\3\2\2\2\4K\3\2\2\2\6"+
		"M\3\2\2\2\b]\3\2\2\2\na\3\2\2\2\fr\3\2\2\2\16t\3\2\2\2\20z\3\2\2\2\22"+
		"\u0082\3\2\2\2\24\u0084\3\2\2\2\26\u0097\3\2\2\2\30\u00a7\3\2\2\2\32\u00a9"+
		"\3\2\2\2\34\u00b5\3\2\2\2\36\u00b7\3\2\2\2 \u00d5\3\2\2\2\"\u00d7\3\2"+
		"\2\2$\u00de\3\2\2\2&\u00e8\3\2\2\2(\u00f0\3\2\2\2*\u00fa\3\2\2\2,\u00ff"+
		"\3\2\2\2.\u0106\3\2\2\2\60\u010b\3\2\2\2\62\u0112\3\2\2\2\64\u0117\3\2"+
		"\2\2\66\u011c\3\2\2\28\u0121\3\2\2\2:\u0125\3\2\2\2<\u012d\3\2\2\2>\u0135"+
		"\3\2\2\2@\u0137\3\2\2\2B\u0146\3\2\2\2DF\5\4\3\2ED\3\2\2\2FG\3\2\2\2G"+
		"E\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IL\5\6\4\2JL\5\n\6\2KI\3\2\2\2KJ\3\2\2\2"+
		"L\5\3\2\2\2MN\5\f\7\2NS\5\b\5\2OP\7\3\2\2PR\5\b\5\2QO\3\2\2\2RU\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\4\2\2W\7\3\2\2\2X^\7,\2"+
		"\2YZ\7,\2\2Z[\7\5\2\2[\\\7-\2\2\\^\7\6\2\2]X\3\2\2\2]Y\3\2\2\2^\t\3\2"+
		"\2\2_b\7\7\2\2`b\5\f\7\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2cd\7,\2\2df\7\b"+
		"\2\2eg\5\16\b\2fe\3\2\2\2fg\3\2\2\2gl\3\2\2\2hi\7\3\2\2ik\5\16\b\2jh\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\t\2\2pq\5"+
		"\22\n\2q\13\3\2\2\2rs\t\2\2\2s\r\3\2\2\2tu\5\f\7\2uv\5\20\t\2v\17\3\2"+
		"\2\2w{\7,\2\2xy\7,\2\2y{\7\r\2\2zw\3\2\2\2zx\3\2\2\2{\21\3\2\2\2|\u0083"+
		"\5\26\f\2}\u0083\5\24\13\2~\u0083\5\30\r\2\177\u0083\5\32\16\2\u0080\u0083"+
		"\5\34\17\2\u0081\u0083\5\36\20\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082~"+
		"\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\23\3\2\2\2\u0084\u0088\7\16\2\2\u0085\u0087\5\6\4\2\u0086\u0085\3\2\2"+
		"\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008e"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\5\22\n\2\u008c\u008b\3\2\2\2"+
		"\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\17\2\2\u0092\25\3\2\2\2\u0093"+
		"\u0094\5 \21\2\u0094\u0095\7\4\2\2\u0095\u0098\3\2\2\2\u0096\u0098\7\4"+
		"\2\2\u0097\u0093\3\2\2\2\u0097\u0096\3\2\2\2\u0098\27\3\2\2\2\u0099\u009a"+
		"\7\20\2\2\u009a\u009b\7\b\2\2\u009b\u009c\5\"\22\2\u009c\u009d\7\t\2\2"+
		"\u009d\u009e\5\22\n\2\u009e\u00a8\3\2\2\2\u009f\u00a0\7\20\2\2\u00a0\u00a1"+
		"\7\b\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\5\22\n\2"+
		"\u00a4\u00a5\7\21\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a8\3\2\2\2\u00a7\u0099"+
		"\3\2\2\2\u00a7\u009f\3\2\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\22\2\2\u00aa"+
		"\u00ab\7\b\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\5"+
		"\22\n\2\u00ae\33\3\2\2\2\u00af\u00b0\7\23\2\2\u00b0\u00b6\7\4\2\2\u00b1"+
		"\u00b2\7\23\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\7\4\2\2\u00b4\u00b6\3"+
		"\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\35\3\2\2\2\u00b7"+
		"\u00b8\7\24\2\2\u00b8\u00b9\7\4\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\5<\37"+
		"\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd\5 \21\2\u00bd\u00d6\3\2\2\2\u00be"+
		"\u00bf\5<\37\2\u00bf\u00c0\7\26\2\2\u00c0\u00c1\5 \21\2\u00c1\u00d6\3"+
		"\2\2\2\u00c2\u00c3\5<\37\2\u00c3\u00c4\7\27\2\2\u00c4\u00c5\5 \21\2\u00c5"+
		"\u00d6\3\2\2\2\u00c6\u00c7\5<\37\2\u00c7\u00c8\7\30\2\2\u00c8\u00c9\5"+
		" \21\2\u00c9\u00d6\3\2\2\2\u00ca\u00cb\5<\37\2\u00cb\u00cc\7\31\2\2\u00cc"+
		"\u00cd\5 \21\2\u00cd\u00d6\3\2\2\2\u00ce\u00cf\5<\37\2\u00cf\u00d0\7\32"+
		"\2\2\u00d0\u00d6\3\2\2\2\u00d1\u00d2\5<\37\2\u00d2\u00d3\7\33\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d6\5\"\22\2\u00d5\u00ba\3\2\2\2\u00d5\u00be\3"+
		"\2\2\2\u00d5\u00c2\3\2\2\2\u00d5\u00c6\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5"+
		"\u00ce\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6!\3\2\2\2"+
		"\u00d7\u00d8\5$\23\2\u00d8#\3\2\2\2\u00d9\u00da\5&\24\2\u00da\u00db\7"+
		"\34\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e1\u00e2\5&\24\2\u00e2%\3\2\2\2\u00e3\u00e4\5(\25\2\u00e4\u00e5"+
		"\7\35\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ec\5(\25\2\u00ec\'\3\2\2\2\u00ed\u00ef\7\60\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\5*\26\2\u00f4"+
		")\3\2\2\2\u00f5\u00f6\5.\30\2\u00f6\u00f7\5,\27\2\u00f7\u00f9\3\2\2\2"+
		"\u00f8\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5.\30\2\u00fe"+
		"+\3\2\2\2\u00ff\u0100\t\3\2\2\u0100-\3\2\2\2\u0101\u0102\5\62\32\2\u0102"+
		"\u0103\5\60\31\2\u0103\u0105\3\2\2\2\u0104\u0101\3\2\2\2\u0105\u0108\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\5\62\32\2\u010a/\3\2\2\2\u010b\u010c\t\4\2"+
		"\2\u010c\61\3\2\2\2\u010d\u010e\5\66\34\2\u010e\u010f\5\64\33\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\5\66\34\2\u0116\63\3\2\2\2\u0117\u0118\t\5\2\2\u0118\65\3\2\2\2"+
		"\u0119\u011b\58\35\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0120\5:\36\2\u0120\67\3\2\2\2\u0121\u0122\t\6\2\2\u01229\3\2\2\2\u0123"+
		"\u0126\5> \2\u0124\u0126\5<\37\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2"+
		"\2\u0126;\3\2\2\2\u0127\u012e\7,\2\2\u0128\u0129\7,\2\2\u0129\u012a\7"+
		"\5\2\2\u012a\u012b\5 \21\2\u012b\u012c\7\6\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u0127\3\2\2\2\u012d\u0128\3\2\2\2\u012e=\3\2\2\2\u012f\u0130\7\b\2\2"+
		"\u0130\u0131\5 \21\2\u0131\u0132\7\t\2\2\u0132\u0136\3\2\2\2\u0133\u0136"+
		"\5@!\2\u0134\u0136\5B\"\2\u0135\u012f\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0134\3\2\2\2\u0136?\3\2\2\2\u0137\u0138\7,\2\2\u0138\u013e\7\b\2\2\u0139"+
		"\u013a\5 \21\2\u013a\u013b\7\3\2\2\u013b\u013d\3\2\2\2\u013c\u0139\3\2"+
		"\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\5 \21\2\u0142\u0141\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\t\2\2\u0145"+
		"A\3\2\2\2\u0146\u0147\t\7\2\2\u0147C\3\2\2\2\35GKS]aflz\u0082\u0088\u008e"+
		"\u0097\u00a7\u00b5\u00d5\u00de\u00e8\u00f0\u00fa\u0106\u0112\u011c\u0125"+
		"\u012d\u0135\u013e\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}