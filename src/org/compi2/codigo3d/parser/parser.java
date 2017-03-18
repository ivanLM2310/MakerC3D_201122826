
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Mar 17 22:58:59 CST 2017
//----------------------------------------------------

package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Mar 17 22:58:59 CST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\007\002\000\002\002" +
    "\004\000\002\010\002\000\002\005\006\000\002\011\002" +
    "\000\002\005\006\000\002\005\004\000\002\005\003\000" +
    "\002\004\005\000\002\004\003\000\002\006\003\000\002" +
    "\006\003\000\002\006\003\000\002\006\003\000\002\006" +
    "\003\000\002\006\003\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\003\005\000" +
    "\002\003\004\000\002\003\005\000\002\003\003\000\002" +
    "\003\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\051\000\016\004\000\005\000\006\000\010\000\014" +
    "\000\027\000\001\002\000\016\004\016\005\012\006\007" +
    "\010\010\014\011\027\013\001\002\000\004\002\006\001" +
    "\002\000\004\002\001\001\002\000\040\002\uffe7\007\uffe7" +
    "\010\uffe7\011\uffe7\012\uffe7\013\uffe7\015\uffe7\016\uffe7\017" +
    "\uffe7\020\uffe7\021\uffe7\022\uffe7\023\uffe7\024\uffe7\025\uffe7" +
    "\001\002\000\014\004\016\005\012\006\007\010\010\014" +
    "\011\001\002\000\014\004\016\005\012\006\007\010\010" +
    "\014\011\001\002\000\040\002\uffe8\007\uffe8\010\uffe8\011" +
    "\uffe8\012\uffe8\013\uffe8\015\uffe8\016\uffe8\017\uffe8\020\uffe8" +
    "\021\uffe8\022\uffe8\023\uffe8\024\uffe8\025\uffe8\001\002\000" +
    "\016\004\016\005\012\006\007\010\010\014\011\027\013" +
    "\001\002\000\010\002\ufff9\024\ufff9\025\ufff9\001\002\000" +
    "\036\002\ufff7\007\034\010\027\011\032\012\036\013\031" +
    "\016\033\017\037\020\026\021\035\022\030\023\040\024" +
    "\ufff7\025\ufff7\001\002\000\040\002\uffe9\007\uffe9\010\uffe9" +
    "\011\uffe9\012\uffe9\013\uffe9\015\uffe9\016\uffe9\017\uffe9\020" +
    "\uffe9\021\uffe9\022\uffe9\023\uffe9\024\uffe9\025\uffe9\001\002" +
    "\000\010\002\uffff\024\021\025\020\001\002\000\016\004" +
    "\ufffc\005\ufffc\006\ufffc\010\ufffc\014\ufffc\027\ufffc\001\002" +
    "\000\016\004\ufffe\005\ufffe\006\ufffe\010\ufffe\014\ufffe\027" +
    "\ufffe\001\002\000\016\004\016\005\012\006\007\010\010" +
    "\014\011\027\013\001\002\000\010\002\ufffd\024\ufffd\025" +
    "\020\001\002\000\016\004\016\005\012\006\007\010\010" +
    "\014\011\027\013\001\002\000\010\002\ufffb\024\ufffb\025" +
    "\ufffb\001\002\000\014\004\ufff4\005\ufff4\006\ufff4\010\ufff4" +
    "\014\ufff4\001\002\000\014\004\016\005\012\006\007\010" +
    "\010\014\011\001\002\000\014\004\ufff2\005\ufff2\006\ufff2" +
    "\010\ufff2\014\ufff2\001\002\000\014\004\016\005\012\006" +
    "\007\010\010\014\011\001\002\000\014\004\016\005\012" +
    "\006\007\010\010\014\011\001\002\000\014\004\ufff6\005" +
    "\ufff6\006\ufff6\010\ufff6\014\ufff6\001\002\000\014\004\016" +
    "\005\012\006\007\010\010\014\011\001\002\000\014\004" +
    "\ufff3\005\ufff3\006\ufff3\010\ufff3\014\ufff3\001\002\000\014" +
    "\004\016\005\012\006\007\010\010\014\011\001\002\000" +
    "\014\004\ufff5\005\ufff5\006\ufff5\010\ufff5\014\ufff5\001\002" +
    "\000\014\004\ufff1\005\ufff1\006\ufff1\010\ufff1\014\ufff1\001" +
    "\002\000\014\004\016\005\012\006\007\010\010\014\011" +
    "\001\002\000\022\002\ufff8\007\034\010\027\011\032\012" +
    "\036\013\031\024\ufff8\025\ufff8\001\002\000\040\002\uffed" +
    "\007\uffed\010\uffed\011\uffed\012\uffed\013\031\015\uffed\016" +
    "\uffed\017\uffed\020\uffed\021\uffed\022\uffed\023\uffed\024\uffed" +
    "\025\uffed\001\002\000\040\002\ufff0\007\ufff0\010\ufff0\011" +
    "\032\012\036\013\031\015\ufff0\016\ufff0\017\ufff0\020\ufff0" +
    "\021\ufff0\022\ufff0\023\ufff0\024\ufff0\025\ufff0\001\002\000" +
    "\040\002\uffee\007\uffee\010\uffee\011\uffee\012\uffee\013\031" +
    "\015\uffee\016\uffee\017\uffee\020\uffee\021\uffee\022\uffee\023" +
    "\uffee\024\uffee\025\uffee\001\002\000\040\002\uffec\007\uffec" +
    "\010\uffec\011\uffec\012\uffec\013\031\015\uffec\016\uffec\017" +
    "\uffec\020\uffec\021\uffec\022\uffec\023\uffec\024\uffec\025\uffec" +
    "\001\002\000\040\002\uffef\007\uffef\010\uffef\011\032\012" +
    "\036\013\031\015\uffef\016\uffef\017\uffef\020\uffef\021\uffef" +
    "\022\uffef\023\uffef\024\uffef\025\uffef\001\002\000\010\002" +
    "\ufffa\024\ufffa\025\ufffa\001\002\000\016\007\034\010\027" +
    "\011\032\012\036\013\031\015\052\001\002\000\040\002" +
    "\uffea\007\uffea\010\uffea\011\uffea\012\uffea\013\uffea\015\uffea" +
    "\016\uffea\017\uffea\020\uffea\021\uffea\022\uffea\023\uffea\024" +
    "\uffea\025\uffea\001\002\000\040\002\uffeb\007\uffeb\010\uffeb" +
    "\011\032\012\036\013\031\015\uffeb\016\uffeb\017\uffeb\020" +
    "\uffeb\021\uffeb\022\uffeb\023\uffeb\024\uffeb\025\uffeb\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\051\000\006\002\004\007\003\001\001\000\010\003" +
    "\014\004\013\005\016\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\052\001\001\000" +
    "\004\003\050\001\001\000\002\001\001\000\010\003\014" +
    "\004\013\005\047\001\001\000\002\001\001\000\004\006" +
    "\040\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\011\023\001\001\000\004\010\021\001\001\000\010\003" +
    "\014\004\013\005\022\001\001\000\002\001\001\000\010" +
    "\003\014\004\013\005\024\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\003\046\001\001\000\002\001\001" +
    "\000\004\003\045\001\001\000\004\003\044\001\001\000" +
    "\002\001\001\000\004\003\043\001\001\000\002\001\001" +
    "\000\004\003\042\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\041\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible

    public void syntax_error(Symbol s){
        System.err.println(s);
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.err.println("T.T");
        System.err.println(s);
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

//Codigo de acciones
      

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expresion ::= DECIMAL 
            {
              NodoC3D RESULT =null;
		int decimalleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int decimalright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String decimal = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(decimal); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expresion ::= ENTERO 
            {
              NodoC3D RESULT =null;
		int enteroleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int enteroright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String entero = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(entero); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expresion ::= ID 
            {
              NodoC3D RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(id); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion ::= PAR_IZQ expresion PAR_DER 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = exp; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= MENOS expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = - " + exp.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= expresion POT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " ^ " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= expresion DIV expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " / " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= expresion MULT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " * " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion ::= expresion MENOS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " - " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion ::= expresion MAS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " + " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // rel ::= DIFERENTE 
            {
              String RESULT =null;
		
		RESULT = "!="; 
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // rel ::= IGUAL_IGUAL 
            {
              String RESULT =null;
		
		RESULT = "=="; 
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // rel ::= MENOR_IGUAL_Q 
            {
              String RESULT =null;
		
		RESULT = "<="; 
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // rel ::= MAYOR_IGUAL_Q 
            {
              String RESULT =null;
		
		RESULT = ">="; 
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // rel ::= MENOR_Q 
            {
              String RESULT =null;
		
		RESULT = "<"; 
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // rel ::= MAYOR_Q 
            {
              String RESULT =null;
		
		RESULT = ">"; 
	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("rel",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // op_rel ::= expresion 
            {
              NodoC3D RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D e = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
			RESULT= e;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_rel",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // op_rel ::= expresion rel expresion 
            {
              NodoC3D RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D i = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String op = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D d = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
			String lv =ControlC3D.generaEtq();
            String lf =ControlC3D.generaEtq();
            String c3d="if("+i.getCad() + " " +op  + " " +  d.getCad() + ") goto " + lv + " \n"+ "goto " + lf + " \n";
            ControlC3D.agregarC3D(c3d);
            RESULT = new NodoC3D(lv,lf); 
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_rel",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // op_logicas ::= op_rel 
            {
              NodoC3D RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D op = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
				RESULT = op;
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_logicas",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // op_logicas ::= OP_NOT op_logicas 
            {
              NodoC3D RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D d = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
				String lv =d.getEtiquetaF();
                String lf =d.getEtiquetaV();
                RESULT = new NodoC3D(lv,lf);
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_logicas",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // op_logicas ::= op_logicas OP_AND NT$2 op_logicas 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		NodoC3D i = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D d = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
																String lv = d.getEtiquetaV();
										                        String lf =i.getEtiquetaF() + " , " +d.getEtiquetaF() + " ";
										                        RESULT = new NodoC3D(lv,lf); 
															
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_logicas",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$2 ::= 
            {
              NodoC3D RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D i = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

				String c3d=i.getEtiquetaV() + ":" + "\n";
				ControlC3D.agregarC3D(c3d);  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // op_logicas ::= op_logicas OP_OR NT$1 op_logicas 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		NodoC3D i = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D d = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
															String lv =i.getEtiquetaV() + " , " + d.getEtiquetaV() + " ";
									                        String lf =d.getEtiquetaF();
									                        RESULT = new NodoC3D(lv,lf); 
															
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_logicas",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$1 ::= 
            {
              NodoC3D RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D i = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 
				String c3d=i.getEtiquetaF() + ":" + "\n"; 
				ControlC3D.agregarC3D(c3d); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicial ::= NT$0 op_logicas 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        RESULT = exp;
                         if(exp.getEtiquetaV().equals("")){
                            ControlC3D.agregarC3D("//Último valor: " + exp.getCad());
                        }else{
                            ControlC3D.agregarC3D("//Etiqueta de salida verdaderas: " + exp.getEtiquetaV() + "\n");
                            ControlC3D.agregarC3D("//Etiqueta de salida falsas: " + exp.getEtiquetaF() + "\n");
                        }
                        
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicial",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              NodoC3D RESULT =null;
 ControlC3D.reiniciar(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D start_val = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

