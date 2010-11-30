
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Nov 30 16:56:26 IST 2010
//----------------------------------------------------

package IC.Parser;

import IC.AST.*;
import IC.DataTypes;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Nov 30 16:56:26 IST 2010
  */
public @SuppressWarnings(value={"all"}) class LibraryParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public LibraryParser() {super();}

  /** Constructor which sets the default scanner. */
  public LibraryParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public LibraryParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\011\003\000\002\002\004\000\002\012" +
    "\003\000\002\012\004\000\002\002\007\000\002\002\006" +
    "\000\002\003\003\000\002\003\004\000\002\004\011\000" +
    "\002\004\010\000\002\005\003\000\002\005\003\000\002" +
    "\006\003\000\002\006\003\000\002\006\003\000\002\006" +
    "\005\000\002\007\003\000\002\007\005\000\002\010\004" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\004\045\007\001\002\000\006\002\001\045" +
    "\007\001\002\000\004\002\044\001\002\000\006\002\uffff" +
    "\045\uffff\001\002\000\004\007\010\001\002\000\004\032" +
    "\011\001\002\000\006\033\015\056\014\001\002\000\006" +
    "\033\ufffb\056\ufffb\001\002\000\006\033\043\056\014\001" +
    "\002\000\012\054\020\057\023\060\017\061\021\001\002" +
    "\000\006\002\ufffc\045\ufffc\001\002\000\006\006\ufff7\031" +
    "\040\001\002\000\006\006\ufff4\031\ufff4\001\002\000\004" +
    "\006\ufff6\001\002\000\006\006\ufff3\031\ufff3\001\002\000" +
    "\004\006\024\001\002\000\006\006\ufff5\031\ufff5\001\002" +
    "\000\004\020\025\001\002\000\012\015\031\057\023\060" +
    "\017\061\021\001\002\000\006\006\037\031\040\001\002" +
    "\000\006\015\ufff1\041\ufff1\001\002\000\006\015\034\041" +
    "\033\001\002\000\004\016\032\001\002\000\006\033\ufff8" +
    "\056\ufff8\001\002\000\010\057\023\060\017\061\021\001" +
    "\002\000\004\016\035\001\002\000\006\033\ufff9\056\ufff9" +
    "\001\002\000\006\015\ufff0\041\ufff0\001\002\000\006\015" +
    "\uffef\041\uffef\001\002\000\004\034\041\001\002\000\006" +
    "\006\ufff2\031\ufff2\001\002\000\006\033\ufffa\056\ufffa\001" +
    "\002\000\006\002\ufffd\045\ufffd\001\002\000\004\002\000" +
    "\001\002\000\006\002\ufffe\045\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\010\002\005\011\004\012\003\001\001\000" +
    "\004\002\044\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\003\012\004" +
    "\011\001\001\000\002\001\001\000\004\004\041\001\001" +
    "\000\006\005\021\006\015\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\006\025\007\027\010\026\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\006\025\010\035\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$LibraryParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$LibraryParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$LibraryParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {

	Token t = lexer.next_token();
	if (printTokens)
		System.out.println(t.getLine() + ":" + Utils.tokenIDToString(t.getId()));
	return t; 

    }


	/**
	 * Causes the parsr to print every token it reads. useful for debugging
	 */
	public boolean printTokens;
	
	private Lexer lexer;

	public LibraryParser(Lexer lexer) {
		super(lexer);
		this.lexer = lexer;
	}
	
	public int getLine() {
		return lexer.getLine();
	}
	
	public void syntax_error(Symbol s) {
		Token tok = (Token) s;
		System.out.println("Line " + tok.getLine()+": Syntax error; unexpected " + Utils.tokenIDToString(tok.getId()));
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$LibraryParser$actions {
  private final LibraryParser parser;

  /** Constructor */
  CUP$LibraryParser$actions(LibraryParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$LibraryParser$do_action(
    int                        CUP$LibraryParser$act_num,
    java_cup.runtime.lr_parser CUP$LibraryParser$parser,
    java.util.Stack            CUP$LibraryParser$stack,
    int                        CUP$LibraryParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$LibraryParser$result;

      /* select the action based on the action number */
      switch (CUP$LibraryParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Formal ::= Type ID 
            {
              Formal RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		 RESULT = new Formal(t,id); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("Formal",6, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Formals ::= Formals COMMA Formal 
            {
              List<Formal> RESULT =null;
		int flistleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).left;
		int flistright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).right;
		List<Formal> flist = (List<Formal>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).value;
		int foleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int foright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		Formal fo = (Formal)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		
			flist.add(fo); RESULT = flist; 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("Formals",5, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Formals ::= Formal 
            {
              List<Formal> RESULT =null;
		int foleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int foright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		Formal fo = (Formal)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		
			List<Formal> flist = new ArrayList<Formal>();
			flist.add(fo); RESULT = flist; 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("Formals",5, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Type ::= Type LB RB 
            {
              Type RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).right;
		Type type = (Type)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).value;
		
		type.incrementDimension();
		RESULT = type;
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("Type",4, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Type ::= BOOLEAN 
            {
              Type RESULT =null;
		
		RESULT = new PrimitiveType(parser.getLine(), DataTypes.BOOLEAN);
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("Type",4, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Type ::= STRING 
            {
              Type RESULT =null;
		
		RESULT = new PrimitiveType(parser.getLine(), DataTypes.STRING);
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("Type",4, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Type ::= INT 
            {
              Type RESULT =null;
		
		RESULT = new PrimitiveType(parser.getLine(), DataTypes.INT);
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("Type",4, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ReturnType ::= VOID 
            {
              Type RESULT =null;
		
			RESULT = new PrimitiveType(parser.getLine(), DataTypes.VOID);
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("ReturnType",3, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // ReturnType ::= Type 
            {
              Type RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		Type type = (Type)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		
			RESULT = type;
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("ReturnType",3, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // LMethod ::= STATIC ReturnType ID LP RP SEMI 
            {
              LibraryMethod RESULT =null;
		int rTypeleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).left;
		int rTyperight = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).right;
		Type rType = (Type)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-3)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-3)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-3)).value;
		
			RESULT = new LibraryMethod(rType, f, new ArrayList<Formal>());
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("LMethod",2, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-5)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // LMethod ::= STATIC ReturnType ID LP Formals RP SEMI 
            {
              LibraryMethod RESULT =null;
		int rTypeleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-5)).left;
		int rTyperight = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-5)).right;
		Type rType = (Type)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-5)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)).value;
		int formalsleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).left;
		int formalsright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).right;
		List<Formal> formals = (List<Formal>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).value;
		
			RESULT = new LibraryMethod(rType, f, formals);
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("LMethod",2, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-6)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LMethods ::= LMethods LMethod 
            {
              List<Method> RESULT =null;
		int lmethodsleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).left;
		int lmethodsright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).right;
		List<Method> lmethods = (List<Method>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).value;
		int lmethodleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int lmethodright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		LibraryMethod lmethod = (LibraryMethod)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		
			lmethods.add(lmethod);
			RESULT = lmethods;
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("LMethods",1, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // LMethods ::= LMethod 
            {
              List<Method> RESULT =null;
		int lmethodleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int lmethodright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		LibraryMethod lmethod = (LibraryMethod)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		
			List<Method> lmethods = new ArrayList<Method>();
			lmethods.add(lmethod);
			RESULT = lmethods;
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("LMethods",1, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // class ::= CLASS CLASS_ID LCBR RCBR 
            {
              ICClass RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-2)).value;
		
			RESULT = new ICClass(parser.getLine(), name, new ArrayList<Field>(), new ArrayList<Method>());
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("class",0, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-3)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // class ::= CLASS CLASS_ID LCBR LMethods RCBR 
            {
              ICClass RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-3)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-3)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-3)).value;
		int lmethodsleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).left;
		int lmethodsright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).right;
		List<Method> lmethods = (List<Method>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).value;
		 
			RESULT = new ICClass(parser.getLine(),name, new ArrayList<Field>(), lmethods);	
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("class",0, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-4)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // class_list ::= class_list class 
            {
              ArrayList<ICClass> RESULT =null;
		int clleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).left;
		int clright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).right;
		ArrayList<ICClass> cl = (ArrayList<ICClass>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		ICClass c = (ICClass)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		 cl.add(c); RESULT = cl; 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("class_list",8, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // class_list ::= class 
            {
              ArrayList<ICClass> RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		ICClass c = (ICClass)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		
      	RESULT = new ArrayList<ICClass>(); RESULT.add(c);
      
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("class_list",8, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).right;
		Program start_val = (Program)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)).value;
		RESULT = start_val;
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.elementAt(CUP$LibraryParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$LibraryParser$parser.done_parsing();
          return CUP$LibraryParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= class_list 
            {
              Program RESULT =null;
		int clleft = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).left;
		int clright = ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()).right;
		ArrayList<ICClass> cl = (ArrayList<ICClass>)((java_cup.runtime.Symbol) CUP$LibraryParser$stack.peek()).value;
		 RESULT = new Program(cl); 
              CUP$LibraryParser$result = parser.getSymbolFactory().newSymbol("program",7, ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibraryParser$stack.peek()), RESULT);
            }
          return CUP$LibraryParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

