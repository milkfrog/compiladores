// Generated from /home/milkfrog/git/compiladores/src/main/antlr4/ConvCC20212.g4 by ANTLR 4.8

import ExpressionTree.*;
import Scope.*;
import SymbolTable.*;
import Enum.*;
import GCI.*;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.exit;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConvCC20212Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, FOR=2, ELSE=3, RETURN=4, READ=5, PRINT=6, NEW=7, BREAK=8, DEF=9, 
		TYPE_STRING=10, TYPE_FLOAT=11, TYPE_INT=12, NULL=13, INT=14, FLOAT=15, 
		STRING=16, IDENT=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, LBRACK=22, 
		RBRACK=23, SEMI=24, COMMA=25, ASSIGN=26, ADD=27, SUB=28, MUL=29, DIV=30, 
		MOD=31, GT=32, LT=33, EQUAL=34, LE=35, GE=36, NOTEQUAL=37, WHITESPACE=38;
	public static final int
		RULE_program = 0, RULE_funclist = 1, RULE_funclist2 = 2, RULE_funcdef = 3, 
		RULE_paramlist = 4, RULE_paramlist2 = 5, RULE_statement = 6, RULE_statelist = 7, 
		RULE_statelist2 = 8, RULE_vardecl = 9, RULE_a = 10, RULE_t1 = 11, RULE_paramlistcall = 12, 
		RULE_paramlistcall2 = 13, RULE_printstat = 14, RULE_readstat = 15, RULE_returnstat = 16, 
		RULE_ifstat = 17, RULE_ifstat1 = 18, RULE_forstat = 19, RULE_allocexpression = 20, 
		RULE_allocexpression1 = 21, RULE_atribstat1 = 22, RULE_atribstat2 = 23, 
		RULE_atribstat3 = 24, RULE_b = 25, RULE_t2 = 26, RULE_expression = 27, 
		RULE_expression2 = 28, RULE_numexpression = 29, RULE_c = 30, RULE_t3 = 31, 
		RULE_term = 32, RULE_d = 33, RULE_t4 = 34, RULE_unaryexpr = 35, RULE_factor = 36, 
		RULE_lvalue = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "funclist", "funclist2", "funcdef", "paramlist", "paramlist2", 
			"statement", "statelist", "statelist2", "vardecl", "a", "t1", "paramlistcall", 
			"paramlistcall2", "printstat", "readstat", "returnstat", "ifstat", "ifstat1", 
			"forstat", "allocexpression", "allocexpression1", "atribstat1", "atribstat2", 
			"atribstat3", "b", "t2", "expression", "expression2", "numexpression", 
			"c", "t3", "term", "d", "t4", "unaryexpr", "factor", "lvalue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'for'", "'else'", "'return'", "'read'", "'print'", "'new'", 
			"'break'", "'def'", "'string'", "'float'", "'int'", "'null'", null, null, 
			null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'=='", "'<='", "'>='", 
			"'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "FOR", "ELSE", "RETURN", "READ", "PRINT", "NEW", "BREAK", 
			"DEF", "TYPE_STRING", "TYPE_FLOAT", "TYPE_INT", "NULL", "INT", "FLOAT", 
			"STRING", "IDENT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "SEMI", "COMMA", "ASSIGN", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", "WHITESPACE"
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
	public String getGrammarFileName() { return "ConvCC20212.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    List<ExpressionTree> trees = new ArrayList<ExpressionTree>();

	    List<ScopeNode> scopes = new ArrayList<ScopeNode>();

	    LinkedStack scopeStack = new LinkedStack();

	    int temporaryCounter, labelCounter, funcCounter, beginCounter, exprTrueCounter, exprFalseCounter = 0;

	    ExpressionTree addTree(Node node) {
	        ExpressionTree expTree = new ExpressionTree(node, temporaryCounter);
	        Node root = expTree.getRoot();
	        String result = expTree.validateTree(root);
	        if (result.equals("")) {
	            String msg = "A árvore abaixo contém experssões inválidas\n" + expTree.getRoot().toString();
	            notifyErrorListeners("Expressão Inválida detectada");
	            throw new ParseCancellationException('\n' + msg);
	        }

	        trees.add(expTree);
	        return expTree;
	    }

	    String createLabel(String type) {
	        String s = "";
	        switch (type) {
	            case "label": {
	                s = "L_" + labelCounter;
	                labelCounter++;
	                break;
	            }
	            case "func": {
	                s = "FUNC_" + funcCounter;
	                funcCounter++;
	                break;
	            }
	            case "begin": {
	                s = "BEGIN_" + beginCounter;
	                beginCounter++;
	                break;
	            }
	            case "exprTrue": {
	                s = "EXPR_TRUE_" + exprTrueCounter;
	                exprTrueCounter++;
	                break;
	            }
	            case "exprFalse": {
	                s = "EXPR_FALSE_" + exprFalseCounter;
	                exprFalseCounter++;
	                break;
	            }
	        }
	        return s;
	    }

	    GenerateReturn generateCode(ExpressionTree expTree) {
	        StringBuilder sb = new StringBuilder();
	        Node root = expTree.getRoot();
	        GenerateReturn generateReturn = new GenerateReturn(expTree.generateCode(root, sb), sb.toString());
	        temporaryCounter = expTree.getCounter();
	        return generateReturn;
	    }

	    void insertIdent(String lexeme, boolean isFunction, String type, int declarationLine) {
	        ScopeNode actualScope = scopeStack.peek();
	        SemanticReports report = actualScope.getSymbolTable().insert(lexeme, isFunction, type, declarationLine);
	        if (report == SemanticReports.IDENT_ALREADY_EXISTS) {
	            int previousDeclarationLine = actualScope.getSymbolTable().getEntry(lexeme).getDeclarationLine();
	            String msg = "A variável " + lexeme + " já foi declarada anteriormente na linha " + previousDeclarationLine;
	            notifyErrorListeners(msg);
	            throw new ParseCancellationException('\n' + msg);
	        }
	    }

	    void putScope(boolean isFor) {
	        scopeStack.push(new SymbolTable(), isFor);
	    }

	    void popScope() {
	        scopes.add(scopeStack.pop());
	    }

	    void verifyBreak() {
	        ScopeNode actualScope = scopeStack.peek();
	        if (!actualScope.isFor()) {
	            String msg = "Um comando break foi utilizado fora de uma operação 'for'";
	            notifyErrorListeners(msg);
	            throw new ParseCancellationException('\n' + msg);
	        }
	    }

	    String getTypeOfIdent(String lexeme) {
	        ScopeNode previous = scopeStack.peek();
	        while (previous != null) {
	             SymbolTableEntry entry = previous.getSymbolTable().getEntry(lexeme);
	             if (entry != null) {
	                return entry.getType();
	             }
	             previous = previous.getPrevious();
	        }
	        String msg = "O identificador " + lexeme + " foi usado mas nunca definido!";
	        notifyErrorListeners(msg);
	        throw new ParseCancellationException('\n' + msg);
	    }

	public ConvCC20212Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public String code;
		public StatementContext statement;
		public FunclistContext funclist;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunclistContext funclist() {
			return getRuleContext(FunclistContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);

		    {putScope(false);}
		    ((ProgramContext)_localctx).code =  "";

		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case RETURN:
			case READ:
			case PRINT:
			case BREAK:
			case TYPE_STRING:
			case TYPE_FLOAT:
			case TYPE_INT:
			case IDENT:
			case LBRACE:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				((ProgramContext)_localctx).statement = statement(false, createLabel("label"), "");
				((ProgramContext)_localctx).code =  ((ProgramContext)_localctx).statement.code ;
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				((ProgramContext)_localctx).funclist = funclist();
				((ProgramContext)_localctx).code =  ((ProgramContext)_localctx).funclist.code;
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);

			    popScope();
			    Utils.exportExpressionTrees(trees);
			    Utils.exportIntermediaryCode(_localctx.code);
			    Utils.exportScopes(scopes);

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

	public static class FunclistContext extends ParserRuleContext {
		public String code;
		public FuncdefContext funcdef;
		public Funclist2Context funclist2;
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Funclist2Context funclist2() {
			return getRuleContext(Funclist2Context.class,0);
		}
		public FunclistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funclist; }
	}

	public final FunclistContext funclist() throws RecognitionException {
		FunclistContext _localctx = new FunclistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funclist);

		        ((FunclistContext)_localctx).code =  "";
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((FunclistContext)_localctx).funcdef = funcdef();
			setState(86);
			((FunclistContext)_localctx).funclist2 = funclist2();
			((FunclistContext)_localctx).code =  ((FunclistContext)_localctx).funcdef.code + "\n" +  ((FunclistContext)_localctx).funclist2.code;
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

	public static class Funclist2Context extends ParserRuleContext {
		public String code;
		public FunclistContext funclist;
		public FunclistContext funclist() {
			return getRuleContext(FunclistContext.class,0);
		}
		public Funclist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funclist2; }
	}

	public final Funclist2Context funclist2() throws RecognitionException {
		Funclist2Context _localctx = new Funclist2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_funclist2);

		        ((Funclist2Context)_localctx).code =  "";
		    
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				((Funclist2Context)_localctx).funclist = funclist();
				((Funclist2Context)_localctx).code =  ((Funclist2Context)_localctx).funclist.code;
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FuncdefContext extends ParserRuleContext {
		public String code;
		public String funcLabel;
		public String next;
		public Token IDENT;
		public StatelistContext statelist;
		public TerminalNode DEF() { return getToken(ConvCC20212Parser.DEF, 0); }
		public TerminalNode IDENT() { return getToken(ConvCC20212Parser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(ConvCC20212Parser.LPAREN, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ConvCC20212Parser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ConvCC20212Parser.LBRACE, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ConvCC20212Parser.RBRACE, 0); }
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdef);

		        ((FuncdefContext)_localctx).code =  "";
		        ((FuncdefContext)_localctx).funcLabel =  createLabel("func");
		        ((FuncdefContext)_localctx).next =  createLabel("label");
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(DEF);
			setState(96);
			((FuncdefContext)_localctx).IDENT = match(IDENT);
			insertIdent((((FuncdefContext)_localctx).IDENT!=null?((FuncdefContext)_localctx).IDENT.getText():null), true, "function", (((FuncdefContext)_localctx).IDENT!=null?((FuncdefContext)_localctx).IDENT.getLine():0));
			putScope(false);
			setState(99);
			match(LPAREN);
			setState(100);
			paramlist();
			setState(101);
			match(RPAREN);
			setState(102);
			match(LBRACE);
			setState(103);
			((FuncdefContext)_localctx).statelist = statelist(false, _localctx.next, "");
			setState(104);
			match(RBRACE);
			popScope();
			((FuncdefContext)_localctx).code =  _localctx.funcLabel + ":\n" + ((FuncdefContext)_localctx).statelist.code;
					
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

	public static class ParamlistContext extends ParserRuleContext {
		public Token TYPE_INT;
		public Token IDENT;
		public Token TYPE_FLOAT;
		public Token TYPE_STRING;
		public TerminalNode TYPE_INT() { return getToken(ConvCC20212Parser.TYPE_INT, 0); }
		public TerminalNode IDENT() { return getToken(ConvCC20212Parser.IDENT, 0); }
		public Paramlist2Context paramlist2() {
			return getRuleContext(Paramlist2Context.class,0);
		}
		public TerminalNode TYPE_FLOAT() { return getToken(ConvCC20212Parser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(ConvCC20212Parser.TYPE_STRING, 0); }
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramlist);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((ParamlistContext)_localctx).TYPE_INT = match(TYPE_INT);
				setState(109);
				((ParamlistContext)_localctx).IDENT = match(IDENT);
				setState(110);
				paramlist2();
				insertIdent((((ParamlistContext)_localctx).IDENT!=null?((ParamlistContext)_localctx).IDENT.getText():null), false, (((ParamlistContext)_localctx).TYPE_INT!=null?((ParamlistContext)_localctx).TYPE_INT.getText():null), (((ParamlistContext)_localctx).IDENT!=null?((ParamlistContext)_localctx).IDENT.getLine():0));
				}
				break;
			case TYPE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				((ParamlistContext)_localctx).TYPE_FLOAT = match(TYPE_FLOAT);
				setState(114);
				((ParamlistContext)_localctx).IDENT = match(IDENT);
				setState(115);
				paramlist2();
				insertIdent((((ParamlistContext)_localctx).IDENT!=null?((ParamlistContext)_localctx).IDENT.getText():null), false, (((ParamlistContext)_localctx).TYPE_FLOAT!=null?((ParamlistContext)_localctx).TYPE_FLOAT.getText():null), (((ParamlistContext)_localctx).IDENT!=null?((ParamlistContext)_localctx).IDENT.getLine():0));
				}
				break;
			case TYPE_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				((ParamlistContext)_localctx).TYPE_STRING = match(TYPE_STRING);
				setState(119);
				((ParamlistContext)_localctx).IDENT = match(IDENT);
				setState(120);
				paramlist2();
				insertIdent((((ParamlistContext)_localctx).IDENT!=null?((ParamlistContext)_localctx).IDENT.getText():null), false, (((ParamlistContext)_localctx).TYPE_STRING!=null?((ParamlistContext)_localctx).TYPE_STRING.getText():null), (((ParamlistContext)_localctx).IDENT!=null?((ParamlistContext)_localctx).IDENT.getLine():0));
						
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Paramlist2Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ConvCC20212Parser.COMMA, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public Paramlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist2; }
	}

	public final Paramlist2Context paramlist2() throws RecognitionException {
		Paramlist2Context _localctx = new Paramlist2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramlist2);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(COMMA);
				setState(127);
				paramlist();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public boolean isFor;
		public String next;
		public String breakNext;
		public String code;
		public Atribstat1Context atribstat1;
		public IfstatContext ifstat;
		public ForstatContext forstat;
		public StatelistContext statelist;
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ConvCC20212Parser.SEMI, 0); }
		public Atribstat1Context atribstat1() {
			return getRuleContext(Atribstat1Context.class,0);
		}
		public PrintstatContext printstat() {
			return getRuleContext(PrintstatContext.class,0);
		}
		public ReadstatContext readstat() {
			return getRuleContext(ReadstatContext.class,0);
		}
		public ReturnstatContext returnstat() {
			return getRuleContext(ReturnstatContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public ForstatContext forstat() {
			return getRuleContext(ForstatContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ConvCC20212Parser.LBRACE, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ConvCC20212Parser.RBRACE, 0); }
		public TerminalNode BREAK() { return getToken(ConvCC20212Parser.BREAK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, boolean isFor, String next, String breakNext) {
			super(parent, invokingState);
			this.isFor = isFor;
			this.next = next;
			this.breakNext = breakNext;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement(boolean isFor,String next,String breakNext) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), isFor, next, breakNext);
		enterRule(_localctx, 12, RULE_statement);

		        ((StatementContext)_localctx).code =  "";
		    
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_STRING:
			case TYPE_FLOAT:
			case TYPE_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				vardecl();
				setState(132);
				match(SEMI);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				((StatementContext)_localctx).atribstat1 = atribstat1();
				setState(135);
				match(SEMI);
				((StatementContext)_localctx).code =  ((StatementContext)_localctx).atribstat1.code;
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				printstat();
				setState(139);
				match(SEMI);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				readstat();
				setState(142);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				returnstat();
				setState(145);
				match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				((StatementContext)_localctx).ifstat = ifstat(isFor, next, breakNext);
				((StatementContext)_localctx).code =  ((StatementContext)_localctx).ifstat.code;
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				((StatementContext)_localctx).forstat = forstat(next);
				((StatementContext)_localctx).code =  ((StatementContext)_localctx).forstat.code;
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				match(LBRACE);
				putScope(isFor);
				setState(155);
				((StatementContext)_localctx).statelist = statelist(isFor, next, breakNext);
				setState(156);
				match(RBRACE);
				popScope();
				((StatementContext)_localctx).code =  ((StatementContext)_localctx).statelist.code;
						
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
				match(BREAK);
				verifyBreak();
				((StatementContext)_localctx).code =  Generator.generateInconditionalDeviationCode(_localctx.breakNext);
				setState(163);
				match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				match(SEMI);
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

	public static class StatelistContext extends ParserRuleContext {
		public boolean isFor;
		public String next;
		public String breakNext;
		public String code;
		public String stmtNext;
		public StatementContext statement;
		public Statelist2Context statelist2;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statelist2Context statelist2() {
			return getRuleContext(Statelist2Context.class,0);
		}
		public StatelistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatelistContext(ParserRuleContext parent, int invokingState, boolean isFor, String next, String breakNext) {
			super(parent, invokingState);
			this.isFor = isFor;
			this.next = next;
			this.breakNext = breakNext;
		}
		@Override public int getRuleIndex() { return RULE_statelist; }
	}

	public final StatelistContext statelist(boolean isFor,String next,String breakNext) throws RecognitionException {
		StatelistContext _localctx = new StatelistContext(_ctx, getState(), isFor, next, breakNext);
		enterRule(_localctx, 14, RULE_statelist);

		        ((StatelistContext)_localctx).stmtNext =  createLabel("label");
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((StatelistContext)_localctx).statement = statement(isFor, _localctx.stmtNext, breakNext);
			setState(168);
			((StatelistContext)_localctx).statelist2 = statelist2(isFor, next, breakNext);
			((StatelistContext)_localctx).code =  ((StatelistContext)_localctx).statement.code + "\n" + _localctx.stmtNext + ":\n" +  ((StatelistContext)_localctx).statelist2.code ;
					
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

	public static class Statelist2Context extends ParserRuleContext {
		public boolean isFor;
		public String next;
		public String breakNext;
		public String code;
		public StatelistContext statelist;
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public Statelist2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statelist2Context(ParserRuleContext parent, int invokingState, boolean isFor, String next, String breakNext) {
			super(parent, invokingState);
			this.isFor = isFor;
			this.next = next;
			this.breakNext = breakNext;
		}
		@Override public int getRuleIndex() { return RULE_statelist2; }
	}

	public final Statelist2Context statelist2(boolean isFor,String next,String breakNext) throws RecognitionException {
		Statelist2Context _localctx = new Statelist2Context(_ctx, getState(), isFor, next, breakNext);
		enterRule(_localctx, 16, RULE_statelist2);

		        ((Statelist2Context)_localctx).code =  "";
		    
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case RETURN:
			case READ:
			case PRINT:
			case BREAK:
			case TYPE_STRING:
			case TYPE_FLOAT:
			case TYPE_INT:
			case IDENT:
			case LBRACE:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((Statelist2Context)_localctx).statelist = statelist(isFor, next, breakNext);
				((Statelist2Context)_localctx).code =  ((Statelist2Context)_localctx).statelist.code;
				}
				break;
			case RBRACE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VardeclContext extends ParserRuleContext {
		public Token TYPE_INT;
		public Token IDENT;
		public Token TYPE_FLOAT;
		public Token TYPE_STRING;
		public TerminalNode TYPE_INT() { return getToken(ConvCC20212Parser.TYPE_INT, 0); }
		public TerminalNode IDENT() { return getToken(ConvCC20212Parser.IDENT, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode TYPE_FLOAT() { return getToken(ConvCC20212Parser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(ConvCC20212Parser.TYPE_STRING, 0); }
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardecl);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				((VardeclContext)_localctx).TYPE_INT = match(TYPE_INT);
				setState(178);
				((VardeclContext)_localctx).IDENT = match(IDENT);
				setState(179);
				a();
				insertIdent((((VardeclContext)_localctx).IDENT!=null?((VardeclContext)_localctx).IDENT.getText():null), false, (((VardeclContext)_localctx).TYPE_INT!=null?((VardeclContext)_localctx).TYPE_INT.getText():null), (((VardeclContext)_localctx).IDENT!=null?((VardeclContext)_localctx).IDENT.getLine():0));
				}
				break;
			case TYPE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				((VardeclContext)_localctx).TYPE_FLOAT = match(TYPE_FLOAT);
				setState(183);
				((VardeclContext)_localctx).IDENT = match(IDENT);
				setState(184);
				a();
				insertIdent((((VardeclContext)_localctx).IDENT!=null?((VardeclContext)_localctx).IDENT.getText():null), false, (((VardeclContext)_localctx).TYPE_FLOAT!=null?((VardeclContext)_localctx).TYPE_FLOAT.getText():null), (((VardeclContext)_localctx).IDENT!=null?((VardeclContext)_localctx).IDENT.getLine():0));
				}
				break;
			case TYPE_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				((VardeclContext)_localctx).TYPE_STRING = match(TYPE_STRING);
				setState(188);
				((VardeclContext)_localctx).IDENT = match(IDENT);
				setState(189);
				a();
				insertIdent((((VardeclContext)_localctx).IDENT!=null?((VardeclContext)_localctx).IDENT.getText():null), false, (((VardeclContext)_localctx).TYPE_STRING!=null?((VardeclContext)_localctx).TYPE_STRING.getText():null), (((VardeclContext)_localctx).IDENT!=null?((VardeclContext)_localctx).IDENT.getLine():0));
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

	public static class AContext extends ParserRuleContext {
		public T1Context t1() {
			return getRuleContext(T1Context.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_a);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				t1();
				setState(195);
				a();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class T1Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ConvCC20212Parser.LBRACK, 0); }
		public TerminalNode INT() { return getToken(ConvCC20212Parser.INT, 0); }
		public TerminalNode RBRACK() { return getToken(ConvCC20212Parser.RBRACK, 0); }
		public T1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t1; }
	}

	public final T1Context t1() throws RecognitionException {
		T1Context _localctx = new T1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_t1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LBRACK);
			setState(201);
			match(INT);
			setState(202);
			match(RBRACK);
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

	public static class ParamlistcallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ConvCC20212Parser.IDENT, 0); }
		public Paramlistcall2Context paramlistcall2() {
			return getRuleContext(Paramlistcall2Context.class,0);
		}
		public ParamlistcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlistcall; }
	}

	public final ParamlistcallContext paramlistcall() throws RecognitionException {
		ParamlistcallContext _localctx = new ParamlistcallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_paramlistcall);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(IDENT);
				setState(205);
				paramlistcall2();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Paramlistcall2Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ConvCC20212Parser.COMMA, 0); }
		public ParamlistcallContext paramlistcall() {
			return getRuleContext(ParamlistcallContext.class,0);
		}
		public Paramlistcall2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlistcall2; }
	}

	public final Paramlistcall2Context paramlistcall2() throws RecognitionException {
		Paramlistcall2Context _localctx = new Paramlistcall2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_paramlistcall2);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(COMMA);
				setState(210);
				paramlistcall();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PrintstatContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ConvCC20212Parser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstat; }
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(PRINT);
			setState(215);
			expression("");
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

	public static class ReadstatContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ConvCC20212Parser.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ReadstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstat; }
	}

	public final ReadstatContext readstat() throws RecognitionException {
		ReadstatContext _localctx = new ReadstatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_readstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(READ);
			setState(218);
			lvalue("");
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

	public static class ReturnstatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ConvCC20212Parser.RETURN, 0); }
		public ReturnstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat; }
	}

	public final ReturnstatContext returnstat() throws RecognitionException {
		ReturnstatContext _localctx = new ReturnstatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(RETURN);
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

	public static class IfstatContext extends ParserRuleContext {
		public boolean isFor;
		public String next;
		public String breakNext;
		public String code;
		public String exprTrue;
		public String exprFalse;
		public ExpressionContext expression;
		public StatelistContext statelist;
		public Ifstat1Context ifstat1;
		public TerminalNode IF() { return getToken(ConvCC20212Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ConvCC20212Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ConvCC20212Parser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ConvCC20212Parser.LBRACE, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ConvCC20212Parser.RBRACE, 0); }
		public Ifstat1Context ifstat1() {
			return getRuleContext(Ifstat1Context.class,0);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfstatContext(ParserRuleContext parent, int invokingState, boolean isFor, String next, String breakNext) {
			super(parent, invokingState);
			this.isFor = isFor;
			this.next = next;
			this.breakNext = breakNext;
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
	}

	public final IfstatContext ifstat(boolean isFor,String next,String breakNext) throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState(), isFor, next, breakNext);
		enterRule(_localctx, 34, RULE_ifstat);

		        ((IfstatContext)_localctx).exprTrue =  createLabel("exprTrue");
		        ((IfstatContext)_localctx).exprFalse =  createLabel("exprFalse");
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IF);
			setState(223);
			match(LPAREN);
			setState(224);
			((IfstatContext)_localctx).expression = expression(_localctx.exprFalse);
			setState(225);
			match(RPAREN);
			setState(226);
			match(LBRACE);
			putScope(isFor);
			setState(228);
			((IfstatContext)_localctx).statelist = statelist(isFor, next, breakNext);
			setState(229);
			match(RBRACE);
			popScope();
			setState(231);
			((IfstatContext)_localctx).ifstat1 = ifstat1(isFor, next, breakNext);

				((IfstatContext)_localctx).code =  ((IfstatContext)_localctx).expression.code
				        + _localctx.exprTrue + ":\n"
				        + ((IfstatContext)_localctx).statelist.code
				        + Generator.generateInconditionalDeviationCode(next)
				        + _localctx.exprFalse + ":\n"
				        + ((IfstatContext)_localctx).ifstat1.code;
				
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

	public static class Ifstat1Context extends ParserRuleContext {
		public boolean isFor;
		public String next;
		public String breakNext;
		public String code;
		public StatementContext statement;
		public TerminalNode ELSE() { return getToken(ConvCC20212Parser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Ifstat1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Ifstat1Context(ParserRuleContext parent, int invokingState, boolean isFor, String next, String breakNext) {
			super(parent, invokingState);
			this.isFor = isFor;
			this.next = next;
			this.breakNext = breakNext;
		}
		@Override public int getRuleIndex() { return RULE_ifstat1; }
	}

	public final Ifstat1Context ifstat1(boolean isFor,String next,String breakNext) throws RecognitionException {
		Ifstat1Context _localctx = new Ifstat1Context(_ctx, getState(), isFor, next, breakNext);
		enterRule(_localctx, 36, RULE_ifstat1);

		        ((Ifstat1Context)_localctx).code =  "";
		    
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(ELSE);
				setState(235);
				((Ifstat1Context)_localctx).statement = statement(isFor, next, breakNext);
				((Ifstat1Context)_localctx).code =  ((Ifstat1Context)_localctx).statement.code;
				}
				break;
			case EOF:
			case IF:
			case FOR:
			case RETURN:
			case READ:
			case PRINT:
			case BREAK:
			case TYPE_STRING:
			case TYPE_FLOAT:
			case TYPE_INT:
			case IDENT:
			case LBRACE:
			case RBRACE:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ForstatContext extends ParserRuleContext {
		public String next;
		public String code;
		public String begin;
		public String exprTrue;
		public ExpressionContext expression;
		public StatementContext statement;
		public TerminalNode FOR() { return getToken(ConvCC20212Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ConvCC20212Parser.LPAREN, 0); }
		public List<Atribstat1Context> atribstat1() {
			return getRuleContexts(Atribstat1Context.class);
		}
		public Atribstat1Context atribstat1(int i) {
			return getRuleContext(Atribstat1Context.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ConvCC20212Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ConvCC20212Parser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ConvCC20212Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForstatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ForstatContext(ParserRuleContext parent, int invokingState, String next) {
			super(parent, invokingState);
			this.next = next;
		}
		@Override public int getRuleIndex() { return RULE_forstat; }
	}

	public final ForstatContext forstat(String next) throws RecognitionException {
		ForstatContext _localctx = new ForstatContext(_ctx, getState(), next);
		enterRule(_localctx, 38, RULE_forstat);

		        ((ForstatContext)_localctx).begin =  createLabel("begin");
		        ((ForstatContext)_localctx).exprTrue =  createLabel("exprTrue");
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(FOR);
			setState(242);
			match(LPAREN);
			setState(243);
			atribstat1();
			setState(244);
			match(SEMI);
			setState(245);
			((ForstatContext)_localctx).expression = expression(next);
			setState(246);
			match(SEMI);
			setState(247);
			atribstat1();
			setState(248);
			match(RPAREN);
			setState(249);
			((ForstatContext)_localctx).statement = statement(true, _localctx.begin, next);

				((ForstatContext)_localctx).code =  _localctx.begin + ":\n"
				    + ((ForstatContext)_localctx).expression.code
				    + _localctx.exprTrue + ":\n"
				    + ((ForstatContext)_localctx).statement.code
				    + Generator.generateInconditionalDeviationCode(_localctx.begin);
				
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

	public static class AllocexpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ConvCC20212Parser.NEW, 0); }
		public Allocexpression1Context allocexpression1() {
			return getRuleContext(Allocexpression1Context.class,0);
		}
		public AllocexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocexpression; }
	}

	public final AllocexpressionContext allocexpression() throws RecognitionException {
		AllocexpressionContext _localctx = new AllocexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_allocexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(NEW);
			setState(253);
			allocexpression1();
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

	public static class Allocexpression1Context extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(ConvCC20212Parser.TYPE_INT, 0); }
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode TYPE_FLOAT() { return getToken(ConvCC20212Parser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(ConvCC20212Parser.TYPE_STRING, 0); }
		public Allocexpression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocexpression1; }
	}

	public final Allocexpression1Context allocexpression1() throws RecognitionException {
		Allocexpression1Context _localctx = new Allocexpression1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_allocexpression1);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(TYPE_INT);
				setState(256);
				t2();
				setState(257);
				b(null);
				}
				break;
			case TYPE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(TYPE_FLOAT);
				setState(260);
				t2();
				setState(261);
				b(null);
				}
				break;
			case TYPE_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(TYPE_STRING);
				setState(264);
				t2();
				setState(265);
				b(null);
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

	public static class Atribstat1Context extends ParserRuleContext {
		public String code;
		public LvalueContext lvalue;
		public Token ASSIGN;
		public Atribstat2Context atribstat2;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ConvCC20212Parser.ASSIGN, 0); }
		public Atribstat2Context atribstat2() {
			return getRuleContext(Atribstat2Context.class,0);
		}
		public Atribstat1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstat1; }
	}

	public final Atribstat1Context atribstat1() throws RecognitionException {
		Atribstat1Context _localctx = new Atribstat1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_atribstat1);

		        ((Atribstat1Context)_localctx).code =  "";
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			((Atribstat1Context)_localctx).lvalue = lvalue("");
			setState(270);
			((Atribstat1Context)_localctx).ASSIGN = match(ASSIGN);
			setState(271);
			((Atribstat1Context)_localctx).atribstat2 = atribstat2();

				    if (!((Atribstat1Context)_localctx).atribstat2.code.isEmpty()) {
				        ((Atribstat1Context)_localctx).code =  ((Atribstat1Context)_localctx).lvalue.code + ((Atribstat1Context)_localctx).atribstat2.code + ((Atribstat1Context)_localctx).lvalue.last + (((Atribstat1Context)_localctx).ASSIGN!=null?((Atribstat1Context)_localctx).ASSIGN.getText():null) + ((Atribstat1Context)_localctx).atribstat2.last;
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

	public static class Atribstat2Context extends ParserRuleContext {
		public String code;
		public String last;
		public ExpressionTree expTree;
		public Token IDENT;
		public Atribstat3Context atribstat3;
		public Token ADD;
		public FactorContext factor;
		public DContext d;
		public CContext c;
		public Token SUB;
		public Token INT;
		public Token FLOAT;
		public Token STRING;
		public NumexpressionContext numexpression;
		public TerminalNode IDENT() { return getToken(ConvCC20212Parser.IDENT, 0); }
		public Atribstat3Context atribstat3() {
			return getRuleContext(Atribstat3Context.class,0);
		}
		public AllocexpressionContext allocexpression() {
			return getRuleContext(AllocexpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ConvCC20212Parser.ADD, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public TerminalNode SUB() { return getToken(ConvCC20212Parser.SUB, 0); }
		public TerminalNode INT() { return getToken(ConvCC20212Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ConvCC20212Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(ConvCC20212Parser.STRING, 0); }
		public TerminalNode NULL() { return getToken(ConvCC20212Parser.NULL, 0); }
		public TerminalNode LPAREN() { return getToken(ConvCC20212Parser.LPAREN, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ConvCC20212Parser.RPAREN, 0); }
		public Atribstat2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstat2; }
	}

	public final Atribstat2Context atribstat2() throws RecognitionException {
		Atribstat2Context _localctx = new Atribstat2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_atribstat2);

		        ((Atribstat2Context)_localctx).code =  "";
		        ((Atribstat2Context)_localctx).last =  "";
		        ((Atribstat2Context)_localctx).expTree =  new ExpressionTree();
		    
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				((Atribstat2Context)_localctx).IDENT = match(IDENT);
				setState(275);
				((Atribstat2Context)_localctx).atribstat3 = atribstat3(new Node((((Atribstat2Context)_localctx).IDENT!=null?((Atribstat2Context)_localctx).IDENT.getText():null), getTypeOfIdent((((Atribstat2Context)_localctx).IDENT!=null?((Atribstat2Context)_localctx).IDENT.getText():null))));
				((Atribstat2Context)_localctx).code =  ((Atribstat2Context)_localctx).atribstat3.code; ((Atribstat2Context)_localctx).last =  ((Atribstat2Context)_localctx).atribstat3.last;
						
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				allocexpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				((Atribstat2Context)_localctx).ADD = match(ADD);
				setState(280);
				((Atribstat2Context)_localctx).factor = factor((((Atribstat2Context)_localctx).ADD!=null?((Atribstat2Context)_localctx).ADD.getText():null));
				setState(281);
				((Atribstat2Context)_localctx).d = d(((Atribstat2Context)_localctx).factor.sin);
				setState(282);
				((Atribstat2Context)_localctx).c = c(((Atribstat2Context)_localctx).d.sin);
				setState(283);
				expression2();
				((Atribstat2Context)_localctx).expTree =  addTree(((Atribstat2Context)_localctx).c.sin);

					    GenerateReturn generateReturn = generateCode(_localctx.expTree);
					    ((Atribstat2Context)_localctx).code =  generateReturn.getCode();
					    ((Atribstat2Context)_localctx).last =  generateReturn.getLast();
					
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				((Atribstat2Context)_localctx).SUB = match(SUB);
				setState(288);
				((Atribstat2Context)_localctx).factor = factor((((Atribstat2Context)_localctx).SUB!=null?((Atribstat2Context)_localctx).SUB.getText():null));
				setState(289);
				((Atribstat2Context)_localctx).d = d(((Atribstat2Context)_localctx).factor.sin);
				setState(290);
				((Atribstat2Context)_localctx).c = c(((Atribstat2Context)_localctx).d.sin);
				setState(291);
				expression2();
				((Atribstat2Context)_localctx).expTree =  addTree(((Atribstat2Context)_localctx).c.sin);

					    GenerateReturn generateReturn = generateCode(_localctx.expTree);
					    ((Atribstat2Context)_localctx).code =  generateReturn.getCode();
					    ((Atribstat2Context)_localctx).last =  generateReturn.getLast();
					
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				((Atribstat2Context)_localctx).INT = match(INT);
				setState(296);
				((Atribstat2Context)_localctx).d = d(new Node((((Atribstat2Context)_localctx).INT!=null?((Atribstat2Context)_localctx).INT.getText():null), "int"));
				setState(297);
				((Atribstat2Context)_localctx).c = c(((Atribstat2Context)_localctx).d.sin);
				setState(298);
				expression2();
				((Atribstat2Context)_localctx).expTree =  addTree(((Atribstat2Context)_localctx).c.sin);

					    GenerateReturn generateReturn = generateCode(_localctx.expTree);
					    ((Atribstat2Context)_localctx).code =  generateReturn.getCode();
					    ((Atribstat2Context)_localctx).last =  generateReturn.getLast();
					
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				((Atribstat2Context)_localctx).FLOAT = match(FLOAT);
				setState(303);
				((Atribstat2Context)_localctx).d = d(new Node((((Atribstat2Context)_localctx).FLOAT!=null?((Atribstat2Context)_localctx).FLOAT.getText():null), "float"));
				setState(304);
				((Atribstat2Context)_localctx).c = c(((Atribstat2Context)_localctx).d.sin);
				setState(305);
				expression2();
				((Atribstat2Context)_localctx).expTree =  addTree(((Atribstat2Context)_localctx).c.sin);

					    GenerateReturn generateReturn = generateCode(_localctx.expTree);
					    ((Atribstat2Context)_localctx).code =  generateReturn.getCode();
					    ((Atribstat2Context)_localctx).last =  generateReturn.getLast();
					
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				((Atribstat2Context)_localctx).STRING = match(STRING);
				setState(310);
				((Atribstat2Context)_localctx).d = d(new Node((((Atribstat2Context)_localctx).STRING!=null?((Atribstat2Context)_localctx).STRING.getText():null), "string"));
				setState(311);
				((Atribstat2Context)_localctx).c = c(((Atribstat2Context)_localctx).d.sin);
				setState(312);
				expression2();
				((Atribstat2Context)_localctx).expTree =  addTree(((Atribstat2Context)_localctx).c.sin);

					    GenerateReturn generateReturn = generateCode(_localctx.expTree);
					    ((Atribstat2Context)_localctx).code =  generateReturn.getCode();
					    ((Atribstat2Context)_localctx).last =  generateReturn.getLast();
					
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
				match(NULL);
				setState(317);
				d(null);
				setState(318);
				c(null);
				setState(319);
				expression2();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 9);
				{
				setState(321);
				match(LPAREN);
				setState(322);
				((Atribstat2Context)_localctx).numexpression = numexpression();
				setState(323);
				match(RPAREN);
				setState(324);
				((Atribstat2Context)_localctx).d = d(((Atribstat2Context)_localctx).numexpression.sin);
				setState(325);
				((Atribstat2Context)_localctx).c = c(((Atribstat2Context)_localctx).d.sin);
				setState(326);
				expression2();
				((Atribstat2Context)_localctx).expTree =  addTree(((Atribstat2Context)_localctx).c.sin);
						

					    GenerateReturn generateReturn = generateCode(_localctx.expTree);
					    ((Atribstat2Context)_localctx).code =  generateReturn.getCode();
					    ((Atribstat2Context)_localctx).last =  generateReturn.getLast();
					
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

	public static class Atribstat3Context extends ParserRuleContext {
		public Node h;
		public String code;
		public String last;
		public ExpressionTree expTree;
		public BContext b;
		public DContext d;
		public CContext c;
		public ParamlistcallContext paramlistcall;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ConvCC20212Parser.LPAREN, 0); }
		public ParamlistcallContext paramlistcall() {
			return getRuleContext(ParamlistcallContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ConvCC20212Parser.RPAREN, 0); }
		public Atribstat3Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Atribstat3Context(ParserRuleContext parent, int invokingState, Node h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_atribstat3; }
	}

	public final Atribstat3Context atribstat3(Node h) throws RecognitionException {
		Atribstat3Context _localctx = new Atribstat3Context(_ctx, getState(), h);
		enterRule(_localctx, 48, RULE_atribstat3);

		            ((Atribstat3Context)_localctx).code =  "";
		            ((Atribstat3Context)_localctx).last =  "";
		            ((Atribstat3Context)_localctx).expTree =  new ExpressionTree();
		    
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
			case LBRACK:
			case SEMI:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				((Atribstat3Context)_localctx).b = b(h);
				setState(333);
				((Atribstat3Context)_localctx).d = d(((Atribstat3Context)_localctx).b.sin);
				setState(334);
				((Atribstat3Context)_localctx).c = c(((Atribstat3Context)_localctx).d.sin);
				setState(335);
				expression2();
				((Atribstat3Context)_localctx).expTree =  addTree(((Atribstat3Context)_localctx).c.sin);

					    GenerateReturn generateReturn = generateCode(_localctx.expTree);
					    ((Atribstat3Context)_localctx).code =  generateReturn.getCode();
					    ((Atribstat3Context)_localctx).last =  generateReturn.getLast();
					
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(LPAREN);
				setState(340);
				((Atribstat3Context)_localctx).paramlistcall = paramlistcall();
				setState(341);
				match(RPAREN);

				        String[] params = (((Atribstat3Context)_localctx).paramlistcall!=null?_input.getText(((Atribstat3Context)_localctx).paramlistcall.start,((Atribstat3Context)_localctx).paramlistcall.stop):null).split(",");
				        String[] result = Generator.generateFunctionCallCode(h.getValue(), params);
				        ((Atribstat3Context)_localctx).code =  result[0];
				        ((Atribstat3Context)_localctx).last =  result[1];
				    
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

	public static class BContext extends ParserRuleContext {
		public Node type;
		public Node sin;
		public T2Context t2;
		public BContext b;
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BContext(ParserRuleContext parent, int invokingState, Node type) {
			super(parent, invokingState);
			this.type = type;
		}
		@Override public int getRuleIndex() { return RULE_b; }
	}

	public final BContext b(Node type) throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState(), type);
		enterRule(_localctx, 50, RULE_b);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				((BContext)_localctx).t2 = t2();
				setState(347);
				((BContext)_localctx).b = b(type);
				((BContext)_localctx).sin =  new Node("array", ((BContext)_localctx).t2.sin, ((BContext)_localctx).b.sin);
				}
				break;
			case RPAREN:
			case RBRACK:
			case SEMI:
			case ASSIGN:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				((BContext)_localctx).sin =  type;
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

	public static class T2Context extends ParserRuleContext {
		public Node sin;
		public NumexpressionContext numexpression;
		public TerminalNode LBRACK() { return getToken(ConvCC20212Parser.LBRACK, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ConvCC20212Parser.RBRACK, 0); }
		public T2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t2; }
	}

	public final T2Context t2() throws RecognitionException {
		T2Context _localctx = new T2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_t2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(LBRACK);
			setState(354);
			((T2Context)_localctx).numexpression = numexpression();
			setState(355);
			match(RBRACK);
			((T2Context)_localctx).sin =  ((T2Context)_localctx).numexpression.sin;
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
		public String exprFalse;
		public String code;
		public NumexpressionContext numexpression;
		public Expression2Context expression2;
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, String exprFalse) {
			super(parent, invokingState);
			this.exprFalse = exprFalse;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression(String exprFalse) throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState(), exprFalse);
		enterRule(_localctx, 54, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((ExpressionContext)_localctx).numexpression = numexpression();
			setState(359);
			((ExpressionContext)_localctx).expression2 = expression2();
			((ExpressionContext)_localctx).code =  Generator.generateConditionalDeviationCode("False " + ((ExpressionContext)_localctx).numexpression.last + ((ExpressionContext)_localctx).expression2.code, exprFalse);
					
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

	public static class Expression2Context extends ParserRuleContext {
		public String code;
		public Token GT;
		public NumexpressionContext numexpression;
		public Token LT;
		public Token LE;
		public Token GE;
		public Token EQUAL;
		public Token NOTEQUAL;
		public TerminalNode GT() { return getToken(ConvCC20212Parser.GT, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(ConvCC20212Parser.LT, 0); }
		public TerminalNode LE() { return getToken(ConvCC20212Parser.LE, 0); }
		public TerminalNode GE() { return getToken(ConvCC20212Parser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(ConvCC20212Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ConvCC20212Parser.NOTEQUAL, 0); }
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression2);

		        ((Expression2Context)_localctx).code =  "";
		    
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				((Expression2Context)_localctx).GT = match(GT);
				setState(363);
				((Expression2Context)_localctx).numexpression = numexpression();
				((Expression2Context)_localctx).code =  (((Expression2Context)_localctx).GT!=null?((Expression2Context)_localctx).GT.getText():null) + ((Expression2Context)_localctx).numexpression.last;
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				((Expression2Context)_localctx).LT = match(LT);
				setState(367);
				((Expression2Context)_localctx).numexpression = numexpression();
				((Expression2Context)_localctx).code =  (((Expression2Context)_localctx).LT!=null?((Expression2Context)_localctx).LT.getText():null) + ((Expression2Context)_localctx).numexpression.last;
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				((Expression2Context)_localctx).LE = match(LE);
				setState(371);
				((Expression2Context)_localctx).numexpression = numexpression();
				((Expression2Context)_localctx).code =  (((Expression2Context)_localctx).LE!=null?((Expression2Context)_localctx).LE.getText():null) + ((Expression2Context)_localctx).numexpression.last;
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				((Expression2Context)_localctx).GE = match(GE);
				setState(375);
				((Expression2Context)_localctx).numexpression = numexpression();
				((Expression2Context)_localctx).code =  (((Expression2Context)_localctx).GE!=null?((Expression2Context)_localctx).GE.getText():null) + ((Expression2Context)_localctx).numexpression.last;
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				((Expression2Context)_localctx).EQUAL = match(EQUAL);
				setState(379);
				((Expression2Context)_localctx).numexpression = numexpression();
				((Expression2Context)_localctx).code =  (((Expression2Context)_localctx).EQUAL!=null?((Expression2Context)_localctx).EQUAL.getText():null) + ((Expression2Context)_localctx).numexpression.last;
				}
				break;
			case NOTEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(382);
				((Expression2Context)_localctx).NOTEQUAL = match(NOTEQUAL);
				setState(383);
				((Expression2Context)_localctx).numexpression = numexpression();
				((Expression2Context)_localctx).code =  (((Expression2Context)_localctx).NOTEQUAL!=null?((Expression2Context)_localctx).NOTEQUAL.getText():null) + ((Expression2Context)_localctx).numexpression.last;
				}
				break;
			case RPAREN:
			case SEMI:
				enterOuterAlt(_localctx, 7);
				{
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

	public static class NumexpressionContext extends ParserRuleContext {
		public Node sin;
		public String code;
		public String last;
		public ExpressionTree expTree;
		public TermContext term;
		public CContext c;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public NumexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpression; }
	}

	public final NumexpressionContext numexpression() throws RecognitionException {
		NumexpressionContext _localctx = new NumexpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_numexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			((NumexpressionContext)_localctx).term = term();
			setState(390);
			((NumexpressionContext)_localctx).c = c(((NumexpressionContext)_localctx).term.sin);
			((NumexpressionContext)_localctx).sin =  ((NumexpressionContext)_localctx).c.sin; ((NumexpressionContext)_localctx).expTree =  addTree(_localctx.sin);

				    GenerateReturn generateReturn = generateCode(_localctx.expTree);
			        ((NumexpressionContext)_localctx).code =  generateReturn.getCode();
			        ((NumexpressionContext)_localctx).last =  generateReturn.getLast();
			    
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

	public static class CContext extends ParserRuleContext {
		public Node h;
		public Node sin;
		public T3Context t3;
		public CContext c;
		public T3Context t3() {
			return getRuleContext(T3Context.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CContext(ParserRuleContext parent, int invokingState, Node h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_c; }
	}

	public final CContext c(Node h) throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState(), h);
		enterRule(_localctx, 60, RULE_c);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				((CContext)_localctx).t3 = t3(h);
				setState(395);
				((CContext)_localctx).c = c(((CContext)_localctx).t3.sin);
				((CContext)_localctx).sin =  ((CContext)_localctx).c.sin;
				}
				break;
			case RPAREN:
			case RBRACK:
			case SEMI:
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				((CContext)_localctx).sin =  h;
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

	public static class T3Context extends ParserRuleContext {
		public Node h;
		public Node sin;
		public Token ADD;
		public TermContext term;
		public Token SUB;
		public TerminalNode ADD() { return getToken(ConvCC20212Parser.ADD, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SUB() { return getToken(ConvCC20212Parser.SUB, 0); }
		public T3Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public T3Context(ParserRuleContext parent, int invokingState, Node h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_t3; }
	}

	public final T3Context t3(Node h) throws RecognitionException {
		T3Context _localctx = new T3Context(_ctx, getState(), h);
		enterRule(_localctx, 62, RULE_t3);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				((T3Context)_localctx).ADD = match(ADD);
				setState(402);
				((T3Context)_localctx).term = term();
				((T3Context)_localctx).sin =  new Node((((T3Context)_localctx).ADD!=null?((T3Context)_localctx).ADD.getText():null), h, ((T3Context)_localctx).term.sin);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				((T3Context)_localctx).SUB = match(SUB);
				setState(406);
				((T3Context)_localctx).term = term();
				((T3Context)_localctx).sin =  new Node((((T3Context)_localctx).SUB!=null?((T3Context)_localctx).SUB.getText():null), h, ((T3Context)_localctx).term.sin);
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

	public static class TermContext extends ParserRuleContext {
		public Node sin;
		public UnaryexprContext unaryexpr;
		public DContext d;
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			((TermContext)_localctx).unaryexpr = unaryexpr();
			setState(412);
			((TermContext)_localctx).d = d(((TermContext)_localctx).unaryexpr.sin);
			((TermContext)_localctx).sin =  ((TermContext)_localctx).d.sin;
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

	public static class DContext extends ParserRuleContext {
		public Node h;
		public Node sin;
		public T4Context t4;
		public DContext d;
		public T4Context t4() {
			return getRuleContext(T4Context.class,0);
		}
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DContext(ParserRuleContext parent, int invokingState, Node h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_d; }
	}

	public final DContext d(Node h) throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState(), h);
		enterRule(_localctx, 66, RULE_d);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				((DContext)_localctx).t4 = t4(h);
				setState(416);
				((DContext)_localctx).d = d(((DContext)_localctx).t4.sin);
				((DContext)_localctx).sin =  ((DContext)_localctx).d.sin;
				}
				break;
			case RPAREN:
			case RBRACK:
			case SEMI:
			case ADD:
			case SUB:
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				((DContext)_localctx).sin =  h;
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

	public static class T4Context extends ParserRuleContext {
		public Node h;
		public Node sin;
		public Token MUL;
		public UnaryexprContext unaryexpr;
		public Token DIV;
		public Token MOD;
		public TerminalNode MUL() { return getToken(ConvCC20212Parser.MUL, 0); }
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public TerminalNode DIV() { return getToken(ConvCC20212Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ConvCC20212Parser.MOD, 0); }
		public T4Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public T4Context(ParserRuleContext parent, int invokingState, Node h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_t4; }
	}

	public final T4Context t4(Node h) throws RecognitionException {
		T4Context _localctx = new T4Context(_ctx, getState(), h);
		enterRule(_localctx, 68, RULE_t4);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				((T4Context)_localctx).MUL = match(MUL);
				setState(423);
				((T4Context)_localctx).unaryexpr = unaryexpr();
				((T4Context)_localctx).sin =  new Node((((T4Context)_localctx).MUL!=null?((T4Context)_localctx).MUL.getText():null), h, ((T4Context)_localctx).unaryexpr.sin);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				((T4Context)_localctx).DIV = match(DIV);
				setState(427);
				((T4Context)_localctx).unaryexpr = unaryexpr();
				((T4Context)_localctx).sin =  new Node((((T4Context)_localctx).DIV!=null?((T4Context)_localctx).DIV.getText():null), h, ((T4Context)_localctx).unaryexpr.sin);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				((T4Context)_localctx).MOD = match(MOD);
				setState(431);
				((T4Context)_localctx).unaryexpr = unaryexpr();
				((T4Context)_localctx).sin =  new Node((((T4Context)_localctx).MOD!=null?((T4Context)_localctx).MOD.getText():null), h, ((T4Context)_localctx).unaryexpr.sin);
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

	public static class UnaryexprContext extends ParserRuleContext {
		public Node sin;
		public Token ADD;
		public FactorContext factor;
		public Token SUB;
		public TerminalNode ADD() { return getToken(ConvCC20212Parser.ADD, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode SUB() { return getToken(ConvCC20212Parser.SUB, 0); }
		public UnaryexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpr; }
	}

	public final UnaryexprContext unaryexpr() throws RecognitionException {
		UnaryexprContext _localctx = new UnaryexprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryexpr);
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				((UnaryexprContext)_localctx).ADD = match(ADD);
				setState(437);
				((UnaryexprContext)_localctx).factor = factor((((UnaryexprContext)_localctx).ADD!=null?((UnaryexprContext)_localctx).ADD.getText():null));
				((UnaryexprContext)_localctx).sin =  ((UnaryexprContext)_localctx).factor.sin;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				((UnaryexprContext)_localctx).SUB = match(SUB);
				setState(441);
				((UnaryexprContext)_localctx).factor = factor((((UnaryexprContext)_localctx).SUB!=null?((UnaryexprContext)_localctx).SUB.getText():null));
				((UnaryexprContext)_localctx).sin =  ((UnaryexprContext)_localctx).factor.sin;
				}
				break;
			case NULL:
			case INT:
			case FLOAT:
			case STRING:
			case IDENT:
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				((UnaryexprContext)_localctx).factor = factor("");
				((UnaryexprContext)_localctx).sin =  ((UnaryexprContext)_localctx).factor.sin;
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

	public static class FactorContext extends ParserRuleContext {
		public String h;
		public Node sin;
		public Token INT;
		public Token FLOAT;
		public Token STRING;
		public LvalueContext lvalue;
		public NumexpressionContext numexpression;
		public TerminalNode INT() { return getToken(ConvCC20212Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ConvCC20212Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(ConvCC20212Parser.STRING, 0); }
		public TerminalNode NULL() { return getToken(ConvCC20212Parser.NULL, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ConvCC20212Parser.LPAREN, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ConvCC20212Parser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor(String h) throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState(), h);
		enterRule(_localctx, 72, RULE_factor);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				((FactorContext)_localctx).INT = match(INT);
				((FactorContext)_localctx).sin =  new Node(h + (((FactorContext)_localctx).INT!=null?((FactorContext)_localctx).INT.getText():null), "int");
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				((FactorContext)_localctx).FLOAT = match(FLOAT);
				((FactorContext)_localctx).sin =  new Node(h + (((FactorContext)_localctx).FLOAT!=null?((FactorContext)_localctx).FLOAT.getText():null), "float");
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				((FactorContext)_localctx).STRING = match(STRING);
				((FactorContext)_localctx).sin =  new Node((((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), "string");
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
				match(NULL);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(456);
				((FactorContext)_localctx).lvalue = lvalue(h);
				((FactorContext)_localctx).sin =  ((FactorContext)_localctx).lvalue.node;
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(459);
				match(LPAREN);
				setState(460);
				((FactorContext)_localctx).numexpression = numexpression();
				setState(461);
				match(RPAREN);
				((FactorContext)_localctx).sin =  ((FactorContext)_localctx).numexpression.sin;
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

	public static class LvalueContext extends ParserRuleContext {
		public String h;
		public Node node;
		public String code;
		public String last;
		public ExpressionTree expTree;
		public Token IDENT;
		public BContext b;
		public TerminalNode IDENT() { return getToken(ConvCC20212Parser.IDENT, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LvalueContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue(String h) throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState(), h);
		enterRule(_localctx, 74, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			((LvalueContext)_localctx).IDENT = match(IDENT);
			setState(467);
			((LvalueContext)_localctx).b = b(new Node(h + (((LvalueContext)_localctx).IDENT!=null?((LvalueContext)_localctx).IDENT.getText():null), getTypeOfIdent((((LvalueContext)_localctx).IDENT!=null?((LvalueContext)_localctx).IDENT.getText():null))));
			((LvalueContext)_localctx).node =  ((LvalueContext)_localctx).b.sin; ((LvalueContext)_localctx).expTree =  addTree(_localctx.node);
					

			        GenerateReturn generateReturn = generateCode(_localctx.expTree);
			        ((LvalueContext)_localctx).code =  generateReturn.getCode();
			        ((LvalueContext)_localctx).last =  generateReturn.getLast();
				 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u01da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2V\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\7\3\7\3\7\5\7\u0084\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a8"+
		"\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00b2\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c3\n\13"+
		"\3\f\3\f\3\f\3\f\5\f\u00c9\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00d2"+
		"\n\16\3\17\3\17\3\17\5\17\u00d7\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00f2\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u010e\n\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u014d\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u015b\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0162\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u0186\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \5 \u0192\n \3!\3!\3!\3!\3!\3!\3!\3!\5!\u019c\n!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\5#\u01a7\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01b5"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01c2\n%\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01d3\n&\3\'\3\'\3\'\3\'\3\'\3\'\2\2(\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2"+
		"\2\2\u01e8\2U\3\2\2\2\4W\3\2\2\2\6_\3\2\2\2\ba\3\2\2\2\n~\3\2\2\2\f\u0083"+
		"\3\2\2\2\16\u00a7\3\2\2\2\20\u00a9\3\2\2\2\22\u00b1\3\2\2\2\24\u00c2\3"+
		"\2\2\2\26\u00c8\3\2\2\2\30\u00ca\3\2\2\2\32\u00d1\3\2\2\2\34\u00d6\3\2"+
		"\2\2\36\u00d8\3\2\2\2 \u00db\3\2\2\2\"\u00de\3\2\2\2$\u00e0\3\2\2\2&\u00f1"+
		"\3\2\2\2(\u00f3\3\2\2\2*\u00fe\3\2\2\2,\u010d\3\2\2\2.\u010f\3\2\2\2\60"+
		"\u014c\3\2\2\2\62\u015a\3\2\2\2\64\u0161\3\2\2\2\66\u0163\3\2\2\28\u0168"+
		"\3\2\2\2:\u0185\3\2\2\2<\u0187\3\2\2\2>\u0191\3\2\2\2@\u019b\3\2\2\2B"+
		"\u019d\3\2\2\2D\u01a6\3\2\2\2F\u01b4\3\2\2\2H\u01c1\3\2\2\2J\u01d2\3\2"+
		"\2\2L\u01d4\3\2\2\2NO\5\16\b\2OP\b\2\1\2PV\3\2\2\2QR\5\4\3\2RS\b\2\1\2"+
		"SV\3\2\2\2TV\3\2\2\2UN\3\2\2\2UQ\3\2\2\2UT\3\2\2\2V\3\3\2\2\2WX\5\b\5"+
		"\2XY\5\6\4\2YZ\b\3\1\2Z\5\3\2\2\2[\\\5\4\3\2\\]\b\4\1\2]`\3\2\2\2^`\3"+
		"\2\2\2_[\3\2\2\2_^\3\2\2\2`\7\3\2\2\2ab\7\13\2\2bc\7\23\2\2cd\b\5\1\2"+
		"de\b\5\1\2ef\7\24\2\2fg\5\n\6\2gh\7\25\2\2hi\7\26\2\2ij\5\20\t\2jk\7\27"+
		"\2\2kl\b\5\1\2lm\b\5\1\2m\t\3\2\2\2no\7\16\2\2op\7\23\2\2pq\5\f\7\2qr"+
		"\b\6\1\2r\177\3\2\2\2st\7\r\2\2tu\7\23\2\2uv\5\f\7\2vw\b\6\1\2w\177\3"+
		"\2\2\2xy\7\f\2\2yz\7\23\2\2z{\5\f\7\2{|\b\6\1\2|\177\3\2\2\2}\177\3\2"+
		"\2\2~n\3\2\2\2~s\3\2\2\2~x\3\2\2\2~}\3\2\2\2\177\13\3\2\2\2\u0080\u0081"+
		"\7\33\2\2\u0081\u0084\5\n\6\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\r\3\2\2\2\u0085\u0086\5\24\13\2\u0086\u0087"+
		"\7\32\2\2\u0087\u00a8\3\2\2\2\u0088\u0089\5.\30\2\u0089\u008a\7\32\2\2"+
		"\u008a\u008b\b\b\1\2\u008b\u00a8\3\2\2\2\u008c\u008d\5\36\20\2\u008d\u008e"+
		"\7\32\2\2\u008e\u00a8\3\2\2\2\u008f\u0090\5 \21\2\u0090\u0091\7\32\2\2"+
		"\u0091\u00a8\3\2\2\2\u0092\u0093\5\"\22\2\u0093\u0094\7\32\2\2\u0094\u00a8"+
		"\3\2\2\2\u0095\u0096\5$\23\2\u0096\u0097\b\b\1\2\u0097\u00a8\3\2\2\2\u0098"+
		"\u0099\5(\25\2\u0099\u009a\b\b\1\2\u009a\u00a8\3\2\2\2\u009b\u009c\7\26"+
		"\2\2\u009c\u009d\b\b\1\2\u009d\u009e\5\20\t\2\u009e\u009f\7\27\2\2\u009f"+
		"\u00a0\b\b\1\2\u00a0\u00a1\b\b\1\2\u00a1\u00a8\3\2\2\2\u00a2\u00a3\7\n"+
		"\2\2\u00a3\u00a4\b\b\1\2\u00a4\u00a5\b\b\1\2\u00a5\u00a8\7\32\2\2\u00a6"+
		"\u00a8\7\32\2\2\u00a7\u0085\3\2\2\2\u00a7\u0088\3\2\2\2\u00a7\u008c\3"+
		"\2\2\2\u00a7\u008f\3\2\2\2\u00a7\u0092\3\2\2\2\u00a7\u0095\3\2\2\2\u00a7"+
		"\u0098\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\17\3\2\2\2\u00a9\u00aa\5\16\b\2\u00aa\u00ab\5\22\n\2\u00ab"+
		"\u00ac\b\t\1\2\u00ac\21\3\2\2\2\u00ad\u00ae\5\20\t\2\u00ae\u00af\b\n\1"+
		"\2\u00af\u00b2\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\23\3\2\2\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5\7\23\2\2\u00b5"+
		"\u00b6\5\26\f\2\u00b6\u00b7\b\13\1\2\u00b7\u00c3\3\2\2\2\u00b8\u00b9\7"+
		"\r\2\2\u00b9\u00ba\7\23\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\b\13\1\2"+
		"\u00bc\u00c3\3\2\2\2\u00bd\u00be\7\f\2\2\u00be\u00bf\7\23\2\2\u00bf\u00c0"+
		"\5\26\f\2\u00c0\u00c1\b\13\1\2\u00c1\u00c3\3\2\2\2\u00c2\u00b3\3\2\2\2"+
		"\u00c2\u00b8\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3\25\3\2\2\2\u00c4\u00c5"+
		"\5\30\r\2\u00c5\u00c6\5\26\f\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\3\2\2\2"+
		"\u00c8\u00c4\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\27\3\2\2\2\u00ca\u00cb"+
		"\7\30\2\2\u00cb\u00cc\7\20\2\2\u00cc\u00cd\7\31\2\2\u00cd\31\3\2\2\2\u00ce"+
		"\u00cf\7\23\2\2\u00cf\u00d2\5\34\17\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce"+
		"\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\7\33\2\2\u00d4"+
		"\u00d7\5\32\16\2\u00d5\u00d7\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d5\3"+
		"\2\2\2\u00d7\35\3\2\2\2\u00d8\u00d9\7\b\2\2\u00d9\u00da\58\35\2\u00da"+
		"\37\3\2\2\2\u00db\u00dc\7\7\2\2\u00dc\u00dd\5L\'\2\u00dd!\3\2\2\2\u00de"+
		"\u00df\7\6\2\2\u00df#\3\2\2\2\u00e0\u00e1\7\3\2\2\u00e1\u00e2\7\24\2\2"+
		"\u00e2\u00e3\58\35\2\u00e3\u00e4\7\25\2\2\u00e4\u00e5\7\26\2\2\u00e5\u00e6"+
		"\b\23\1\2\u00e6\u00e7\5\20\t\2\u00e7\u00e8\7\27\2\2\u00e8\u00e9\b\23\1"+
		"\2\u00e9\u00ea\5&\24\2\u00ea\u00eb\b\23\1\2\u00eb%\3\2\2\2\u00ec\u00ed"+
		"\7\5\2\2\u00ed\u00ee\5\16\b\2\u00ee\u00ef\b\24\1\2\u00ef\u00f2\3\2\2\2"+
		"\u00f0\u00f2\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\'\3"+
		"\2\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\7\24\2\2\u00f5\u00f6\5.\30\2\u00f6"+
		"\u00f7\7\32\2\2\u00f7\u00f8\58\35\2\u00f8\u00f9\7\32\2\2\u00f9\u00fa\5"+
		".\30\2\u00fa\u00fb\7\25\2\2\u00fb\u00fc\5\16\b\2\u00fc\u00fd\b\25\1\2"+
		"\u00fd)\3\2\2\2\u00fe\u00ff\7\t\2\2\u00ff\u0100\5,\27\2\u0100+\3\2\2\2"+
		"\u0101\u0102\7\16\2\2\u0102\u0103\5\66\34\2\u0103\u0104\5\64\33\2\u0104"+
		"\u010e\3\2\2\2\u0105\u0106\7\r\2\2\u0106\u0107\5\66\34\2\u0107\u0108\5"+
		"\64\33\2\u0108\u010e\3\2\2\2\u0109\u010a\7\f\2\2\u010a\u010b\5\66\34\2"+
		"\u010b\u010c\5\64\33\2\u010c\u010e\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0105"+
		"\3\2\2\2\u010d\u0109\3\2\2\2\u010e-\3\2\2\2\u010f\u0110\5L\'\2\u0110\u0111"+
		"\7\34\2\2\u0111\u0112\5\60\31\2\u0112\u0113\b\30\1\2\u0113/\3\2\2\2\u0114"+
		"\u0115\7\23\2\2\u0115\u0116\5\62\32\2\u0116\u0117\b\31\1\2\u0117\u014d"+
		"\3\2\2\2\u0118\u014d\5*\26\2\u0119\u011a\7\35\2\2\u011a\u011b\5J&\2\u011b"+
		"\u011c\5D#\2\u011c\u011d\5> \2\u011d\u011e\5:\36\2\u011e\u011f\b\31\1"+
		"\2\u011f\u0120\b\31\1\2\u0120\u014d\3\2\2\2\u0121\u0122\7\36\2\2\u0122"+
		"\u0123\5J&\2\u0123\u0124\5D#\2\u0124\u0125\5> \2\u0125\u0126\5:\36\2\u0126"+
		"\u0127\b\31\1\2\u0127\u0128\b\31\1\2\u0128\u014d\3\2\2\2\u0129\u012a\7"+
		"\20\2\2\u012a\u012b\5D#\2\u012b\u012c\5> \2\u012c\u012d\5:\36\2\u012d"+
		"\u012e\b\31\1\2\u012e\u012f\b\31\1\2\u012f\u014d\3\2\2\2\u0130\u0131\7"+
		"\21\2\2\u0131\u0132\5D#\2\u0132\u0133\5> \2\u0133\u0134\5:\36\2\u0134"+
		"\u0135\b\31\1\2\u0135\u0136\b\31\1\2\u0136\u014d\3\2\2\2\u0137\u0138\7"+
		"\22\2\2\u0138\u0139\5D#\2\u0139\u013a\5> \2\u013a\u013b\5:\36\2\u013b"+
		"\u013c\b\31\1\2\u013c\u013d\b\31\1\2\u013d\u014d\3\2\2\2\u013e\u013f\7"+
		"\17\2\2\u013f\u0140\5D#\2\u0140\u0141\5> \2\u0141\u0142\5:\36\2\u0142"+
		"\u014d\3\2\2\2\u0143\u0144\7\24\2\2\u0144\u0145\5<\37\2\u0145\u0146\7"+
		"\25\2\2\u0146\u0147\5D#\2\u0147\u0148\5> \2\u0148\u0149\5:\36\2\u0149"+
		"\u014a\b\31\1\2\u014a\u014b\b\31\1\2\u014b\u014d\3\2\2\2\u014c\u0114\3"+
		"\2\2\2\u014c\u0118\3\2\2\2\u014c\u0119\3\2\2\2\u014c\u0121\3\2\2\2\u014c"+
		"\u0129\3\2\2\2\u014c\u0130\3\2\2\2\u014c\u0137\3\2\2\2\u014c\u013e\3\2"+
		"\2\2\u014c\u0143\3\2\2\2\u014d\61\3\2\2\2\u014e\u014f\5\64\33\2\u014f"+
		"\u0150\5D#\2\u0150\u0151\5> \2\u0151\u0152\5:\36\2\u0152\u0153\b\32\1"+
		"\2\u0153\u0154\b\32\1\2\u0154\u015b\3\2\2\2\u0155\u0156\7\24\2\2\u0156"+
		"\u0157\5\32\16\2\u0157\u0158\7\25\2\2\u0158\u0159\b\32\1\2\u0159\u015b"+
		"\3\2\2\2\u015a\u014e\3\2\2\2\u015a\u0155\3\2\2\2\u015b\63\3\2\2\2\u015c"+
		"\u015d\5\66\34\2\u015d\u015e\5\64\33\2\u015e\u015f\b\33\1\2\u015f\u0162"+
		"\3\2\2\2\u0160\u0162\b\33\1\2\u0161\u015c\3\2\2\2\u0161\u0160\3\2\2\2"+
		"\u0162\65\3\2\2\2\u0163\u0164\7\30\2\2\u0164\u0165\5<\37\2\u0165\u0166"+
		"\7\31\2\2\u0166\u0167\b\34\1\2\u0167\67\3\2\2\2\u0168\u0169\5<\37\2\u0169"+
		"\u016a\5:\36\2\u016a\u016b\b\35\1\2\u016b9\3\2\2\2\u016c\u016d\7\"\2\2"+
		"\u016d\u016e\5<\37\2\u016e\u016f\b\36\1\2\u016f\u0186\3\2\2\2\u0170\u0171"+
		"\7#\2\2\u0171\u0172\5<\37\2\u0172\u0173\b\36\1\2\u0173\u0186\3\2\2\2\u0174"+
		"\u0175\7%\2\2\u0175\u0176\5<\37\2\u0176\u0177\b\36\1\2\u0177\u0186\3\2"+
		"\2\2\u0178\u0179\7&\2\2\u0179\u017a\5<\37\2\u017a\u017b\b\36\1\2\u017b"+
		"\u0186\3\2\2\2\u017c\u017d\7$\2\2\u017d\u017e\5<\37\2\u017e\u017f\b\36"+
		"\1\2\u017f\u0186\3\2\2\2\u0180\u0181\7\'\2\2\u0181\u0182\5<\37\2\u0182"+
		"\u0183\b\36\1\2\u0183\u0186\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u016c\3"+
		"\2\2\2\u0185\u0170\3\2\2\2\u0185\u0174\3\2\2\2\u0185\u0178\3\2\2\2\u0185"+
		"\u017c\3\2\2\2\u0185\u0180\3\2\2\2\u0185\u0184\3\2\2\2\u0186;\3\2\2\2"+
		"\u0187\u0188\5B\"\2\u0188\u0189\5> \2\u0189\u018a\b\37\1\2\u018a\u018b"+
		"\b\37\1\2\u018b=\3\2\2\2\u018c\u018d\5@!\2\u018d\u018e\5> \2\u018e\u018f"+
		"\b \1\2\u018f\u0192\3\2\2\2\u0190\u0192\b \1\2\u0191\u018c\3\2\2\2\u0191"+
		"\u0190\3\2\2\2\u0192?\3\2\2\2\u0193\u0194\7\35\2\2\u0194\u0195\5B\"\2"+
		"\u0195\u0196\b!\1\2\u0196\u019c\3\2\2\2\u0197\u0198\7\36\2\2\u0198\u0199"+
		"\5B\"\2\u0199\u019a\b!\1\2\u019a\u019c\3\2\2\2\u019b\u0193\3\2\2\2\u019b"+
		"\u0197\3\2\2\2\u019cA\3\2\2\2\u019d\u019e\5H%\2\u019e\u019f\5D#\2\u019f"+
		"\u01a0\b\"\1\2\u01a0C\3\2\2\2\u01a1\u01a2\5F$\2\u01a2\u01a3\5D#\2\u01a3"+
		"\u01a4\b#\1\2\u01a4\u01a7\3\2\2\2\u01a5\u01a7\b#\1\2\u01a6\u01a1\3\2\2"+
		"\2\u01a6\u01a5\3\2\2\2\u01a7E\3\2\2\2\u01a8\u01a9\7\37\2\2\u01a9\u01aa"+
		"\5H%\2\u01aa\u01ab\b$\1\2\u01ab\u01b5\3\2\2\2\u01ac\u01ad\7 \2\2\u01ad"+
		"\u01ae\5H%\2\u01ae\u01af\b$\1\2\u01af\u01b5\3\2\2\2\u01b0\u01b1\7!\2\2"+
		"\u01b1\u01b2\5H%\2\u01b2\u01b3\b$\1\2\u01b3\u01b5\3\2\2\2\u01b4\u01a8"+
		"\3\2\2\2\u01b4\u01ac\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5G\3\2\2\2\u01b6"+
		"\u01b7\7\35\2\2\u01b7\u01b8\5J&\2\u01b8\u01b9\b%\1\2\u01b9\u01c2\3\2\2"+
		"\2\u01ba\u01bb\7\36\2\2\u01bb\u01bc\5J&\2\u01bc\u01bd\b%\1\2\u01bd\u01c2"+
		"\3\2\2\2\u01be\u01bf\5J&\2\u01bf\u01c0\b%\1\2\u01c0\u01c2\3\2\2\2\u01c1"+
		"\u01b6\3\2\2\2\u01c1\u01ba\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2I\3\2\2\2"+
		"\u01c3\u01c4\7\20\2\2\u01c4\u01d3\b&\1\2\u01c5\u01c6\7\21\2\2\u01c6\u01d3"+
		"\b&\1\2\u01c7\u01c8\7\22\2\2\u01c8\u01d3\b&\1\2\u01c9\u01d3\7\17\2\2\u01ca"+
		"\u01cb\5L\'\2\u01cb\u01cc\b&\1\2\u01cc\u01d3\3\2\2\2\u01cd\u01ce\7\24"+
		"\2\2\u01ce\u01cf\5<\37\2\u01cf\u01d0\7\25\2\2\u01d0\u01d1\b&\1\2\u01d1"+
		"\u01d3\3\2\2\2\u01d2\u01c3\3\2\2\2\u01d2\u01c5\3\2\2\2\u01d2\u01c7\3\2"+
		"\2\2\u01d2\u01c9\3\2\2\2\u01d2\u01ca\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d3"+
		"K\3\2\2\2\u01d4\u01d5\7\23\2\2\u01d5\u01d6\5\64\33\2\u01d6\u01d7\b\'\1"+
		"\2\u01d7\u01d8\b\'\1\2\u01d8M\3\2\2\2\30U_~\u0083\u00a7\u00b1\u00c2\u00c8"+
		"\u00d1\u00d6\u00f1\u010d\u014c\u015a\u0161\u0185\u0191\u019b\u01a6\u01b4"+
		"\u01c1\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}