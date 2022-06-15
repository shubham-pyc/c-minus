package main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.CminusLexer;
import parser.CminusParser;
import submit.ASTVisitor;
import org.antlr.v4.runtime.Parser;
import submit.RegisterAllocator;
import submit.SymbolTable;
import submit.ast.Node;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger LOGGER;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // Logging setup
        Level level = Level.INFO;

        // TODO Enable trace-level code as needed. When true, LOGGER.fine() statements will be visible.
        final boolean trace = true;
        if (trace) {
            level = Level.ALL;
        }

        Properties props = System.getProperties();
        props.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%6$s%n");
        Logger.getLogger("").setLevel(level);
        for (Handler handler : Logger.getLogger("").getHandlers()) {
            handler.setLevel(level);
        }
        LOGGER = Logger.getLogger(Parser.class.getName());

        // if (args.length < 1) {
            // throw new RuntimeException("Be sure to add your test C- file as a command-line parameter.");
        // }
        // final String filename = args[0];
        final String filename = "/home/shubham/Desktop/Projects/Masters/Compiler/Project 5/p5-compiler/data/test4.c";

        LOGGER.info("");
        LOGGER.info("Parsing " + filename + "\n");
        LOGGER.info("");
        final CharStream charStream = CharStreams.fromFileName(filename);
        CminusLexer lexer = new CminusLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CminusParser parser = new CminusParser(tokens);
        parser.setBuildParseTree(true);
        CminusParser.ProgramContext programCtx = parser.program();

        LOGGER.info("");
        LOGGER.info("Building abstract syntax tree");
        LOGGER.info("");
        ASTVisitor v = new ASTVisitor(LOGGER);
        Node ast = v.visitProgram(programCtx);
        SymbolTable symbolTable = v.getSymbolTable();

        LOGGER.info("");
        LOGGER.info("MIPS code:");
        LOGGER.info("");
        StringBuilder code = new StringBuilder();
        StringBuilder data = new StringBuilder();
        RegisterAllocator regAllocator = new RegisterAllocator();
        try {
            ast.toMIPS(code, data, symbolTable, regAllocator);
        } finally {
            StringBuilder mips = new StringBuilder();
            mips.append("# All program code is placed after the\n" +
                    "# .text assembler directive\n" +
                    ".text\n" +
                    "\n" +
                    "# Declare main as a global function\n" +
                    ".globl\tmain\n\nj main\n");
            mips.append(code.toString());
            mips.append("\n# All memory structures are placed after the\n" +
                    "# .data assembler directive\n" +
                    ".data\n" +
                    "\n");
            mips.append(data.toString());

            // Write MIPS code to stdout
            LOGGER.info(mips.toString());

            // Write MIPS code to output file for easy loading into MARS
            final String fn = filename.substring(0, filename.length()-1) + "asm";
            try {
                FileWriter myWriter = new FileWriter(fn);
                myWriter.write(mips.toString());
                myWriter.close();
            } catch (IOException e) {
                LOGGER.severe("Error writing to file " + fn + "\n");
                e.printStackTrace();
            }
        }
    }

}
