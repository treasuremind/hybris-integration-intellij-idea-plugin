/* The following code was generated by JFlex 1.4.3 on 31/08/14 15:41 */

package com.intellij.idea.plugin.hybris.impex;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.idea.plugin.hybris.impex.psi.ImpexTypes;
import com.intellij.psi.TokenType;
import com.intellij.psi.CustomHighlighterTokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 31/08/14 15:41 from the specification file
 * <tt>/home/sasha/sources/idea/Hybris-Impex-Synax-Highlight/src/com/intellij/idea/plugin/hybris/impex/Impex.flex</tt>
 */
class ImpexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int HEADER_MODE = 8;
  public static final int MACRO_DECLARATION = 6;
  public static final int FIELD_VALUE = 14;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int HEADER_TYPE = 10;
  public static final int WAITING_MACRO_VALUE = 4;
  public static final int WAITING_FOR_FIELD_VALUE = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  1,  1,  5,  5,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\7\1\3\1\1\1\0\1\3\1\2\16\7\4\0\1\31\1\0"+
    "\1\5\1\4\1\10\2\0\1\0\4\0\1\30\3\0\12\7\1\0"+
    "\1\27\1\32\1\6\1\41\2\0\1\22\2\7\1\21\1\14\3\7"+
    "\1\11\3\7\1\24\1\12\1\25\1\20\1\7\1\15\1\13\1\16"+
    "\1\17\1\26\4\7\4\0\1\23\1\0\4\7\1\40\1\7\1\34"+
    "\1\7\1\33\4\7\1\35\1\36\2\7\1\37\10\7\4\0\41\7"+
    "\2\0\4\7\4\0\1\7\2\0\1\7\7\0\1\7\4\0\1\7"+
    "\5\0\27\7\1\0\37\7\1\0\u01ca\7\4\0\14\7\16\0\5\7"+
    "\7\0\1\7\1\0\1\7\21\0\165\7\1\0\2\7\2\0\4\7"+
    "\10\0\1\7\1\0\3\7\1\0\1\7\1\0\24\7\1\0\123\7"+
    "\1\0\213\7\1\0\5\7\2\0\236\7\11\0\46\7\2\0\1\7"+
    "\7\0\47\7\7\0\1\7\1\0\55\7\1\0\1\7\1\0\2\7"+
    "\1\0\2\7\1\0\1\7\10\0\33\7\5\0\3\7\15\0\5\7"+
    "\6\0\1\7\4\0\13\7\5\0\112\7\4\0\146\7\1\0\11\7"+
    "\1\0\12\7\1\0\23\7\2\0\1\7\17\0\74\7\2\0\145\7"+
    "\16\0\66\7\4\0\1\7\5\0\56\7\22\0\34\7\104\0\1\7"+
    "\1\0\13\7\67\0\33\7\1\0\144\7\2\0\12\7\1\0\7\7"+
    "\1\0\7\7\1\0\3\7\1\0\10\7\2\0\2\7\2\0\26\7"+
    "\1\0\7\7\1\0\1\7\3\0\4\7\2\0\11\7\2\0\2\7"+
    "\2\0\4\7\10\0\1\7\4\0\2\7\1\0\5\7\2\0\16\7"+
    "\7\0\1\7\5\0\3\7\1\0\6\7\4\0\2\7\2\0\26\7"+
    "\1\0\7\7\1\0\2\7\1\0\2\7\1\0\2\7\2\0\1\7"+
    "\1\0\5\7\4\0\2\7\2\0\3\7\3\0\1\7\7\0\4\7"+
    "\1\0\1\7\7\0\20\7\13\0\3\7\1\0\11\7\1\0\3\7"+
    "\1\0\26\7\1\0\7\7\1\0\2\7\1\0\5\7\2\0\12\7"+
    "\1\0\3\7\1\0\3\7\2\0\1\7\17\0\4\7\2\0\12\7"+
    "\1\0\1\7\17\0\3\7\1\0\10\7\2\0\2\7\2\0\26\7"+
    "\1\0\7\7\1\0\2\7\1\0\5\7\2\0\11\7\2\0\2\7"+
    "\2\0\3\7\10\0\2\7\4\0\2\7\1\0\5\7\2\0\12\7"+
    "\1\0\1\7\20\0\2\7\1\0\6\7\3\0\3\7\1\0\4\7"+
    "\3\0\2\7\1\0\1\7\1\0\2\7\3\0\2\7\3\0\3\7"+
    "\3\0\14\7\4\0\5\7\3\0\3\7\1\0\4\7\2\0\1\7"+
    "\6\0\1\7\16\0\12\7\11\0\1\7\7\0\3\7\1\0\10\7"+
    "\1\0\3\7\1\0\27\7\1\0\12\7\1\0\5\7\3\0\10\7"+
    "\1\0\3\7\1\0\4\7\7\0\2\7\1\0\2\7\6\0\4\7"+
    "\2\0\12\7\22\0\2\7\1\0\10\7\1\0\3\7\1\0\27\7"+
    "\1\0\12\7\1\0\5\7\2\0\11\7\1\0\3\7\1\0\4\7"+
    "\7\0\2\7\7\0\1\7\1\0\4\7\2\0\12\7\1\0\2\7"+
    "\17\0\2\7\1\0\10\7\1\0\3\7\1\0\51\7\2\0\10\7"+
    "\1\0\3\7\1\0\5\7\10\0\1\7\10\0\4\7\2\0\12\7"+
    "\12\0\6\7\2\0\2\7\1\0\22\7\3\0\30\7\1\0\11\7"+
    "\1\0\1\7\2\0\7\7\3\0\1\7\4\0\6\7\1\0\1\7"+
    "\1\0\10\7\22\0\2\7\15\0\72\7\4\0\20\7\1\0\12\7"+
    "\47\0\2\7\1\0\1\7\2\0\2\7\1\0\1\7\2\0\1\7"+
    "\6\0\4\7\1\0\7\7\1\0\3\7\1\0\1\7\1\0\1\7"+
    "\2\0\2\7\1\0\15\7\1\0\3\7\2\0\5\7\1\0\1\7"+
    "\1\0\6\7\2\0\12\7\2\0\4\7\40\0\1\7\27\0\2\7"+
    "\6\0\12\7\13\0\1\7\1\0\1\7\1\0\1\7\4\0\12\7"+
    "\1\0\44\7\4\0\24\7\1\0\22\7\1\0\44\7\11\0\1\7"+
    "\71\0\112\7\6\0\116\7\2\0\46\7\1\0\1\7\5\0\1\7"+
    "\2\0\53\7\1\0\u014d\7\1\0\4\7\2\0\7\7\1\0\1\7"+
    "\1\0\4\7\2\0\51\7\1\0\4\7\2\0\41\7\1\0\4\7"+
    "\2\0\7\7\1\0\1\7\1\0\4\7\2\0\17\7\1\0\71\7"+
    "\1\0\4\7\2\0\103\7\2\0\3\7\40\0\20\7\20\0\125\7"+
    "\14\0\u026c\7\2\0\21\7\1\0\32\7\5\0\113\7\3\0\3\7"+
    "\17\0\15\7\1\0\7\7\13\0\25\7\13\0\24\7\14\0\15\7"+
    "\1\0\3\7\1\0\2\7\14\0\124\7\3\0\1\7\3\0\3\7"+
    "\2\0\12\7\41\0\3\7\2\0\12\7\6\0\130\7\10\0\53\7"+
    "\5\0\106\7\12\0\35\7\3\0\14\7\4\0\14\7\12\0\50\7"+
    "\2\0\5\7\13\0\54\7\4\0\32\7\6\0\12\7\46\0\34\7"+
    "\4\0\77\7\1\0\35\7\2\0\13\7\6\0\12\7\15\0\1\7"+
    "\130\0\114\7\4\0\12\7\21\0\11\7\14\0\164\7\14\0\70\7"+
    "\10\0\12\7\3\0\61\7\122\0\3\7\1\0\43\7\11\0\347\7"+
    "\25\0\u011a\7\2\0\6\7\2\0\46\7\2\0\6\7\2\0\10\7"+
    "\1\0\1\7\1\0\1\7\1\0\1\7\1\0\37\7\2\0\65\7"+
    "\1\0\7\7\1\0\1\7\3\0\3\7\1\0\7\7\3\0\4\7"+
    "\2\0\6\7\4\0\15\7\5\0\3\7\1\0\7\7\16\0\5\7"+
    "\32\0\5\7\20\0\2\7\23\0\1\7\13\0\5\7\5\0\6\7"+
    "\1\0\1\7\15\0\1\7\20\0\15\7\3\0\33\7\25\0\15\7"+
    "\4\0\1\7\3\0\14\7\21\0\1\7\4\0\1\7\2\0\12\7"+
    "\1\0\1\7\3\0\5\7\6\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\0\4\7\1\0\13\7\2\0\4\7\5\0\5\7\4\0\1\7"+
    "\21\0\51\7\u0a77\0\57\7\1\0\57\7\1\0\205\7\6\0\11\7"+
    "\14\0\46\7\1\0\1\7\5\0\1\7\2\0\70\7\7\0\1\7"+
    "\17\0\30\7\11\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7\1\0\40\7"+
    "\57\0\1\7\u01d5\0\3\7\31\0\17\7\1\0\5\7\2\0\5\7"+
    "\4\0\126\7\2\0\2\7\2\0\3\7\1\0\132\7\1\0\4\7"+
    "\5\0\51\7\3\0\136\7\21\0\33\7\65\0\20\7\u0200\0\u19b6\7"+
    "\112\0\u51cd\7\63\0\u048d\7\103\0\56\7\2\0\u010d\7\3\0\34\7"+
    "\24\0\60\7\4\0\12\7\1\0\31\7\7\0\123\7\45\0\11\7"+
    "\2\0\147\7\2\0\4\7\1\0\4\7\14\0\13\7\115\0\60\7"+
    "\20\0\1\7\7\0\64\7\14\0\105\7\13\0\12\7\6\0\30\7"+
    "\3\0\1\7\4\0\56\7\2\0\44\7\14\0\35\7\3\0\101\7"+
    "\16\0\13\7\46\0\67\7\11\0\16\7\2\0\12\7\6\0\27\7"+
    "\3\0\2\7\4\0\103\7\30\0\3\7\2\0\20\7\2\0\5\7"+
    "\12\0\6\7\2\0\6\7\2\0\6\7\11\0\7\7\1\0\7\7"+
    "\221\0\53\7\1\0\2\7\2\0\12\7\6\0\u2ba4\7\14\0\27\7"+
    "\4\0\61\7\u2104\0\u016e\7\2\0\152\7\46\0\7\7\14\0\5\7"+
    "\5\0\14\7\1\0\15\7\1\0\5\7\1\0\1\7\1\0\2\7"+
    "\1\0\2\7\1\0\154\7\41\0\u016b\7\22\0\100\7\2\0\66\7"+
    "\50\0\15\7\3\0\20\7\20\0\7\7\14\0\2\7\30\0\3\7"+
    "\31\0\1\7\6\0\5\7\1\0\207\7\2\0\1\7\4\0\1\7"+
    "\13\0\12\7\7\0\32\7\4\0\1\7\1\0\32\7\13\0\131\7"+
    "\3\0\6\7\2\0\6\7\2\0\6\7\2\0\3\7\3\0\2\7"+
    "\3\0\2\7\22\0\3\7\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\2\2\1\3\1\4\5\5\1\6\1\7"+
    "\2\10\1\11\1\12\1\3\2\12\1\13\3\5\1\14"+
    "\1\0\1\12\3\5\1\14\1\12\3\5\1\12\3\5"+
    "\1\12\1\15\1\16\1\17\1\12\1\5\1\12\1\5"+
    "\1\20\4\5\1\21";

  private static int [] zzUnpackAction() {
    int [] result = new int[58];
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
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\314\0\314"+
    "\0\356\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba\0\u01dc"+
    "\0\314\0\314\0\u01fe\0\314\0\u0220\0\u0242\0\u0264\0\u0286"+
    "\0\u02a8\0\u0176\0\u02ca\0\u02ec\0\u030e\0\u0330\0\u0352\0\u0374"+
    "\0\u0396\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u0440\0\u0462\0\u0484"+
    "\0\u04a6\0\u04c8\0\u04ea\0\u050c\0\u052e\0\u0550\0\u0154\0\u0154"+
    "\0\u0572\0\u0594\0\u05b6\0\u05d8\0\u0242\0\u05fa\0\u061c\0\u063e"+
    "\0\u0660\0\u0154";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[58];
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
    "\1\7\1\10\1\11\1\12\1\13\2\7\1\14\1\15"+
    "\1\16\3\14\1\17\1\14\1\20\7\14\1\21\1\22"+
    "\1\12\1\7\6\14\2\7\1\10\1\11\1\12\25\7"+
    "\1\12\11\7\1\10\1\11\1\12\3\7\20\23\2\7"+
    "\1\12\1\7\6\23\2\7\1\10\1\11\1\12\2\7"+
    "\1\24\22\7\1\12\11\7\1\10\1\11\1\12\3\7"+
    "\20\25\2\7\1\12\1\7\6\25\1\7\1\26\1\10"+
    "\1\11\1\27\1\26\1\30\21\26\1\21\1\22\1\12"+
    "\1\31\7\26\43\0\1\10\43\0\1\12\25\0\1\12"+
    "\10\0\1\13\2\0\37\13\7\0\20\14\4\0\6\14"+
    "\10\0\20\32\4\0\6\32\10\0\3\14\1\33\14\14"+
    "\4\0\6\14\10\0\5\14\1\34\12\14\4\0\6\14"+
    "\10\0\11\14\1\35\6\14\4\0\6\14\10\0\20\23"+
    "\4\0\6\23\10\0\20\25\4\0\6\25\1\0\1\26"+
    "\2\0\24\26\3\0\11\26\2\0\1\27\23\26\2\0"+
    "\1\12\10\26\1\30\2\0\2\30\1\36\21\30\3\37"+
    "\10\30\1\26\2\0\24\26\3\0\1\26\1\40\6\26"+
    "\7\0\4\14\1\41\13\14\4\0\6\14\10\0\15\14"+
    "\1\42\2\14\4\0\6\14\10\0\12\14\1\43\5\14"+
    "\4\0\6\14\1\0\1\26\2\0\2\26\1\30\21\26"+
    "\3\0\10\26\1\37\2\0\2\37\1\44\34\37\1\26"+
    "\2\0\24\26\3\0\2\26\1\45\5\26\7\0\5\14"+
    "\1\46\12\14\4\0\6\14\10\0\16\14\1\47\1\14"+
    "\4\0\6\14\10\0\13\14\1\50\4\14\4\0\6\14"+
    "\6\0\1\37\34\0\1\26\2\0\24\26\3\0\3\26"+
    "\1\51\4\26\7\0\6\14\1\52\11\14\4\0\6\14"+
    "\10\0\17\14\1\53\4\0\6\14\10\0\7\14\1\54"+
    "\10\14\4\0\6\14\1\0\1\26\2\0\24\26\3\0"+
    "\4\26\1\55\3\26\7\0\7\14\1\56\10\14\4\0"+
    "\6\14\10\0\5\14\1\57\12\14\4\0\6\14\10\0"+
    "\5\14\1\60\12\14\4\0\6\14\1\0\1\26\2\0"+
    "\24\26\3\0\5\26\1\61\2\26\7\0\14\14\1\62"+
    "\3\14\4\0\6\14\1\0\1\26\2\0\24\26\3\0"+
    "\6\26\1\63\1\26\7\0\10\14\1\64\7\14\4\0"+
    "\6\14\1\0\1\26\2\0\24\26\3\0\7\26\1\65"+
    "\7\0\11\14\1\66\6\14\4\0\6\14\10\0\12\14"+
    "\1\67\5\14\4\0\6\14\10\0\13\14\1\70\4\14"+
    "\4\0\6\14\10\0\7\14\1\71\10\14\4\0\6\14"+
    "\10\0\5\14\1\72\12\14\4\0\6\14\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1666];
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
    "\6\0\2\11\10\1\2\11\1\1\1\11\12\1\1\0"+
    "\33\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[58];
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


  ImpexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  ImpexLexer(java.io.InputStream in) {
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
    while (i < 1910) {
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
        return;

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
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
        case 14: 
          { yybegin(HEADER_MODE); return ImpexTypes.HEADER_MODE_REMOVE;
          }
        case 18: break;
        case 4: 
          { yybegin(COMMENT); return ImpexTypes.COMMENT;
          }
        case 19: break;
        case 2: 
          { yybegin(YYINITIAL); return ImpexTypes.CRLF;
          }
        case 20: break;
        case 10: 
          { yybegin(FIELD_VALUE); return ImpexTypes.FIELD_VALUE;
          }
        case 21: break;
        case 5: 
          { yybegin(FIELD_VALUE); return ImpexTypes.VALUE_SUBTYPE;
          }
        case 22: break;
        case 12: 
          { yybegin(FIELD_VALUE); return ImpexTypes.DOUBLE_STRING;
          }
        case 23: break;
        case 9: 
          { yybegin(HEADER_TYPE); return ImpexTypes.HEADER_TYPE;
          }
        case 24: break;
        case 6: 
          { yybegin(WAITING_FOR_FIELD_VALUE); return ImpexTypes.FIELD_VALUE_SEPARATOR;
          }
        case 25: break;
        case 11: 
          { yybegin(MACRO_DECLARATION); return ImpexTypes.MACRO_DECLARATION;
          }
        case 26: break;
        case 13: 
          { yybegin(HEADER_MODE); return ImpexTypes.HEADER_MODE_INSERT;
          }
        case 27: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 28: break;
        case 17: 
          { yybegin(HEADER_MODE); return ImpexTypes.HEADER_MODE_INSERT_UPDATE;
          }
        case 29: break;
        case 3: 
          { return TokenType.WHITE_SPACE;
          }
        case 30: break;
        case 8: 
          { yybegin(WAITING_MACRO_VALUE); return ImpexTypes.ASSIGN_VALUE;
          }
        case 31: break;
        case 16: 
          { yybegin(FIELD_VALUE); return ImpexTypes.FIELD_VALUE_IGNORE;
          }
        case 32: break;
        case 15: 
          { yybegin(HEADER_MODE); return ImpexTypes.HEADER_MODE_UPDATE;
          }
        case 33: break;
        case 7: 
          { yybegin(WAITING_FOR_FIELD_VALUE); return ImpexTypes.FIELD_LIST_ITEM_SEPARATOR;
          }
        case 34: break;
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
