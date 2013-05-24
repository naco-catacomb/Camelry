/* The following code was generated by JFlex 1.4.3 on 25/05/13 00:25 */

/**
 * The Lexing definition for the Apache Camel Simple Language
 * The lexer scans through a document and returns a stream of tokens which match
 * the production rules.
 *
 * This file uses the JFlex notation.
*/
package me.alanfoster.intellij.camel.simple.language.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

import me.alanfoster.intellij.camel.simple.language.psi.SimpleTypes;

/**
 * Below are the options and declarations which the lexer will use
 */

public class SimpleLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int FUNCTION_STATE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\10\1\6\1\0\1\10\1\7\16\0\4\0\1\10\1\0"+
    "\1\34\1\0\1\1\2\0\1\33\2\0\1\27\1\24\1\0\1\25"+
    "\1\32\1\26\12\5\2\0\1\23\1\21\1\22\2\0\32\3\1\30"+
    "\1\0\1\31\1\0\1\3\1\0\1\16\3\3\1\14\1\15\5\3"+
    "\1\17\5\3\1\12\1\20\1\11\1\13\5\3\1\2\1\0\1\4"+
    "\1\0\41\0\2\0\4\3\4\0\1\3\2\0\1\0\7\0\1\3"+
    "\4\0\1\3\5\0\27\3\1\0\37\3\1\0\u01ca\3\4\0\14\3"+
    "\16\0\5\3\7\0\1\3\1\0\1\3\21\0\160\0\5\3\1\0"+
    "\2\3\2\0\4\3\10\0\1\3\1\0\3\3\1\0\1\3\1\0"+
    "\24\3\1\0\123\3\1\0\213\3\1\0\5\0\2\0\236\3\11\0"+
    "\46\3\2\0\1\3\7\0\47\3\11\0\55\0\1\0\1\0\1\0"+
    "\2\0\1\0\2\0\1\0\1\0\10\0\33\3\5\0\3\3\15\0"+
    "\4\0\7\0\1\3\4\0\13\0\5\0\53\3\37\0\4\0\2\3"+
    "\1\0\143\3\1\0\1\3\10\0\1\0\6\0\2\3\2\0\1\0"+
    "\4\0\2\3\12\0\3\3\2\0\1\3\17\0\1\0\1\3\1\0"+
    "\36\3\33\0\2\0\131\3\13\0\1\3\16\0\12\0\41\3\11\0"+
    "\2\3\4\0\1\3\5\0\26\3\4\0\1\3\11\0\1\3\3\0"+
    "\1\3\5\0\22\0\31\3\3\0\244\0\4\0\66\3\3\0\1\3"+
    "\22\0\1\3\7\0\12\3\2\0\2\0\12\0\1\0\7\3\1\0"+
    "\7\3\1\0\3\0\1\0\10\3\2\0\2\3\2\0\26\3\1\0"+
    "\7\3\1\0\1\3\3\0\4\3\2\0\1\0\1\3\7\0\2\0"+
    "\2\0\2\0\3\0\1\3\10\0\1\0\4\0\2\3\1\0\3\3"+
    "\2\0\2\0\12\0\4\3\7\0\1\3\5\0\3\0\1\0\6\3"+
    "\4\0\2\3\2\0\26\3\1\0\7\3\1\0\2\3\1\0\2\3"+
    "\1\0\2\3\2\0\1\0\1\0\5\0\4\0\2\0\2\0\3\0"+
    "\3\0\1\0\7\0\4\3\1\0\1\3\7\0\14\0\3\3\1\0"+
    "\13\0\3\0\1\0\11\3\1\0\3\3\1\0\26\3\1\0\7\3"+
    "\1\0\2\3\1\0\5\3\2\0\1\0\1\3\10\0\1\0\3\0"+
    "\1\0\3\0\2\0\1\3\17\0\2\3\2\0\2\0\12\0\1\0"+
    "\1\3\17\0\3\0\1\0\10\3\2\0\2\3\2\0\26\3\1\0"+
    "\7\3\1\0\2\3\1\0\5\3\2\0\1\0\1\3\7\0\2\0"+
    "\2\0\2\0\3\0\10\0\2\0\4\0\2\3\1\0\3\3\2\0"+
    "\2\0\12\0\1\0\1\3\20\0\1\0\1\3\1\0\6\3\3\0"+
    "\3\3\1\0\4\3\3\0\2\3\1\0\1\3\1\0\2\3\3\0"+
    "\2\3\3\0\3\3\3\0\14\3\4\0\5\0\3\0\3\0\1\0"+
    "\4\0\2\0\1\3\6\0\1\0\16\0\12\0\11\0\1\3\7\0"+
    "\3\0\1\0\10\3\1\0\3\3\1\0\27\3\1\0\12\3\1\0"+
    "\5\3\3\0\1\3\7\0\1\0\3\0\1\0\4\0\7\0\2\0"+
    "\1\0\2\3\6\0\2\3\2\0\2\0\12\0\22\0\2\0\1\0"+
    "\10\3\1\0\3\3\1\0\27\3\1\0\12\3\1\0\5\3\2\0"+
    "\1\0\1\3\7\0\1\0\3\0\1\0\4\0\7\0\2\0\7\0"+
    "\1\3\1\0\2\3\2\0\2\0\12\0\1\0\2\3\17\0\2\0"+
    "\1\0\10\3\1\0\3\3\1\0\51\3\2\0\1\3\7\0\1\0"+
    "\3\0\1\0\4\0\1\3\10\0\1\0\10\0\2\3\2\0\2\0"+
    "\12\0\12\0\6\3\2\0\2\0\1\0\22\3\3\0\30\3\1\0"+
    "\11\3\1\0\1\3\2\0\7\3\3\0\1\0\4\0\6\0\1\0"+
    "\1\0\1\0\10\0\22\0\2\0\15\0\60\3\1\0\2\3\7\0"+
    "\4\0\10\3\10\0\1\0\12\0\47\0\2\3\1\0\1\3\2\0"+
    "\2\3\1\0\1\3\2\0\1\3\6\0\4\3\1\0\7\3\1\0"+
    "\3\3\1\0\1\3\1\0\1\3\2\0\2\3\1\0\4\3\1\0"+
    "\2\3\6\0\1\0\2\0\1\3\2\0\5\3\1\0\1\3\1\0"+
    "\6\0\2\0\12\0\2\0\2\3\42\0\1\3\27\0\2\0\6\0"+
    "\12\0\13\0\1\0\1\0\1\0\1\0\1\0\4\0\2\0\10\3"+
    "\1\0\44\3\4\0\24\0\1\0\2\0\5\3\13\0\1\0\44\0"+
    "\11\0\1\0\71\0\53\3\24\0\1\3\12\0\6\0\6\3\4\0"+
    "\4\3\3\0\1\3\3\0\2\3\7\0\3\3\4\0\15\3\14\0"+
    "\1\3\17\0\2\0\46\3\12\0\53\3\1\0\1\3\3\0\u0149\3"+
    "\1\0\4\3\2\0\7\3\1\0\1\3\1\0\4\3\2\0\51\3"+
    "\1\0\4\3\2\0\41\3\1\0\4\3\2\0\7\3\1\0\1\3"+
    "\1\0\4\3\2\0\17\3\1\0\71\3\1\0\4\3\2\0\103\3"+
    "\2\0\3\0\40\0\20\3\20\0\125\3\14\0\u026c\3\2\0\21\3"+
    "\1\0\32\3\5\0\113\3\3\0\3\3\17\0\15\3\1\0\4\3"+
    "\3\0\13\0\22\3\3\0\13\0\22\3\2\0\14\0\15\3\1\0"+
    "\3\3\1\0\2\0\14\0\64\3\40\0\3\0\1\3\3\0\2\3"+
    "\1\0\2\0\12\0\41\0\3\0\2\0\12\0\6\0\130\3\10\0"+
    "\51\3\1\0\1\3\5\0\106\3\12\0\35\3\3\0\14\0\4\0"+
    "\14\0\12\0\12\0\36\3\2\0\5\3\13\0\54\3\4\0\21\0"+
    "\7\3\2\0\6\0\12\0\46\0\27\3\5\0\4\0\65\3\12\0"+
    "\1\0\35\0\2\0\13\0\6\0\12\0\15\0\1\3\130\0\5\0"+
    "\57\3\21\0\7\3\4\0\12\0\21\0\11\0\14\0\3\0\36\3"+
    "\12\0\3\0\2\3\12\0\6\0\46\3\16\0\14\0\44\3\24\0"+
    "\10\0\12\0\3\0\3\3\12\0\44\3\122\0\3\0\1\0\25\0"+
    "\4\3\1\0\4\3\1\0\15\0\300\3\47\0\25\0\4\0\u0116\3"+
    "\2\0\6\3\2\0\46\3\2\0\6\3\2\0\10\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\3\1\0\37\3\2\0\65\3\1\0\7\3"+
    "\1\0\1\3\3\0\3\3\1\0\7\3\3\0\4\3\2\0\6\3"+
    "\4\0\15\3\5\0\3\3\1\0\7\3\16\0\5\0\32\0\5\0"+
    "\20\0\2\3\23\0\1\3\13\0\5\0\5\0\6\0\1\0\1\3"+
    "\15\0\1\3\20\0\15\3\3\0\32\3\26\0\15\0\4\0\1\0"+
    "\3\0\14\0\21\0\1\3\4\0\1\3\2\0\12\3\1\0\1\3"+
    "\3\0\5\3\6\0\1\3\1\0\1\3\1\0\1\3\1\0\4\3"+
    "\1\0\13\3\2\0\4\3\5\0\5\3\4\0\1\3\21\0\51\3"+
    "\u0a77\0\57\3\1\0\57\3\1\0\205\3\6\0\4\3\3\0\16\0"+
    "\46\3\12\0\66\3\11\0\1\3\17\0\1\0\27\3\11\0\7\3"+
    "\1\0\7\3\1\0\7\3\1\0\7\3\1\0\7\3\1\0\7\3"+
    "\1\0\7\3\1\0\7\3\1\0\40\0\57\0\1\3\u01d5\0\3\3"+
    "\31\0\11\3\6\0\1\0\5\3\2\0\5\3\4\0\126\3\2\0"+
    "\2\0\2\0\3\3\1\0\132\3\1\0\4\3\5\0\51\3\3\0"+
    "\136\3\21\0\33\3\65\0\20\3\u0200\0\u19b6\3\112\0\u51cc\3\64\0"+
    "\u048d\3\103\0\56\3\2\0\u010d\3\3\0\20\3\12\0\2\3\24\0"+
    "\57\3\1\0\14\0\2\0\1\0\31\3\10\0\120\3\2\0\45\0"+
    "\11\3\2\0\147\3\2\0\4\3\1\0\2\3\16\0\12\3\120\0"+
    "\10\3\1\0\3\3\1\0\4\3\1\0\27\3\5\0\20\0\1\3"+
    "\7\0\64\3\14\0\2\0\62\3\21\0\13\0\12\0\6\0\22\0"+
    "\6\3\3\0\1\3\4\0\12\0\34\3\10\0\2\0\27\3\15\0"+
    "\14\0\35\3\3\0\4\0\57\3\16\0\16\0\1\3\12\0\46\0"+
    "\51\3\16\0\11\0\3\3\1\0\10\3\2\0\2\0\12\0\6\0"+
    "\27\3\3\0\1\3\1\0\4\0\60\3\1\0\1\3\3\0\2\3"+
    "\2\0\5\3\2\0\1\3\1\0\1\3\30\0\3\3\43\0\6\3"+
    "\2\0\6\3\2\0\6\3\11\0\7\3\1\0\7\3\221\0\43\3"+
    "\10\0\1\0\2\0\2\0\12\0\6\0\u2ba4\3\14\0\27\3\4\0"+
    "\61\3\u2104\0\u012e\3\2\0\76\3\2\0\152\3\46\0\7\3\14\0"+
    "\5\3\5\0\1\3\1\0\12\3\1\0\15\3\1\0\5\3\1\0"+
    "\1\3\1\0\2\3\1\0\2\3\1\0\154\3\41\0\u016b\3\22\0"+
    "\100\3\2\0\66\3\50\0\15\3\3\0\20\0\20\0\7\0\14\0"+
    "\2\3\30\0\3\3\31\0\1\3\6\0\5\3\1\0\207\3\2\0"+
    "\1\0\4\0\1\3\13\0\12\0\7\0\32\3\4\0\1\3\1\0"+
    "\32\3\13\0\131\3\3\0\6\3\2\0\6\3\2\0\6\3\2\0"+
    "\3\3\3\0\2\3\3\0\2\3\22\0\3\0\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\2\5\1\6\2\2"+
    "\1\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\2\0\1\23\1\24"+
    "\1\25\2\0\1\26\1\0\1\27";

  private static int [] zzUnpackAction() {
    int [] result = new int[35];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\35\0\72\0\127\0\72\0\72\0\164\0\72"+
    "\0\221\0\256\0\313\0\350\0\u0105\0\u0122\0\u013f\0\72"+
    "\0\72\0\72\0\72\0\72\0\72\0\72\0\72\0\72"+
    "\0\72\0\u015c\0\u0179\0\72\0\72\0\72\0\u0196\0\u01b3"+
    "\0\72\0\u01d0\0\72";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[35];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\3\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\3\5\1\14\3\5\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\6\3\1\10\1\11\1\12\24\3\37\0\1\31"+
    "\37\0\1\7\35\0\1\10\36\0\1\12\36\0\1\32"+
    "\40\0\1\33\37\0\1\34\34\0\1\35\34\0\1\36"+
    "\26\0\1\37\40\0\1\40\31\0\1\41\40\0\1\42"+
    "\30\0\1\43\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[493];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\2\11\1\1\1\11\7\1\12\11"+
    "\2\0\3\11\2\0\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[35];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  public SimpleLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public SimpleLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2176) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return SimpleTypes.LESS;
          }
        case 24: break;
        case 23: 
          { return SimpleTypes.FALSE;
          }
        case 25: break;
        case 10: 
          { return SimpleTypes.MINUS;
          }
        case 26: break;
        case 11: 
          { return SimpleTypes.DIVIDE;
          }
        case 27: break;
        case 12: 
          { return SimpleTypes.MULTIPLY;
          }
        case 28: break;
        case 15: 
          { return SimpleTypes.DOT;
          }
        case 29: break;
        case 5: 
          { return SimpleTypes.CRLF;
          }
        case 30: break;
        case 19: 
          { return SimpleTypes.EQUALS_EQUALS;
          }
        case 31: break;
        case 14: 
          { return SimpleTypes.RIGHTSQUARE;
          }
        case 32: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 33: break;
        case 2: 
          { return SimpleTypes.SINGLE_CHARACTER;
          }
        case 34: break;
        case 21: 
          { return SimpleTypes.LESS_OR_EQUAL;
          }
        case 35: break;
        case 22: 
          { return SimpleTypes.TRUE;
          }
        case 36: break;
        case 18: 
          { return SimpleTypes.FUNCTION_START;
          }
        case 37: break;
        case 7: 
          { return SimpleTypes.GREATER;
          }
        case 38: break;
        case 6: 
          { return TokenType.WHITE_SPACE;
          }
        case 39: break;
        case 3: 
          { return SimpleTypes.FUNCTION_END;
          }
        case 40: break;
        case 20: 
          { return SimpleTypes.GREATER_OR_EQUAL;
          }
        case 41: break;
        case 17: 
          { return SimpleTypes.SPEECHMARK;
          }
        case 42: break;
        case 9: 
          { return SimpleTypes.PLUS;
          }
        case 43: break;
        case 16: 
          { return SimpleTypes.APOSTROPHE;
          }
        case 44: break;
        case 13: 
          { return SimpleTypes.LEFTSQUARE;
          }
        case 45: break;
        case 4: 
          { return SimpleTypes.NUMBER;
          }
        case 46: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
