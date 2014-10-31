/* The following code was generated by JFlex 1.4.3 on 30/10/14 08:27 PM */

package tools;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 30/10/14 08:27 PM from the specification file
 * <tt>src/tools/ALexico.flex</tt>
 */
class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\14\1\0\1\44\1\14\22\0\1\43\1\40\3\0\1\15"+
    "\2\0\1\42\1\42\1\17\1\36\1\42\1\1\1\5\1\16\2\4"+
    "\10\2\1\0\1\41\1\15\1\37\1\15\2\0\1\6\2\6\1\6"+
    "\1\20\6\6\1\6\1\6\1\6\1\6\2\6\1\6\2\6\1\6"+
    "\2\6\1\20\1\6\1\6\1\42\1\0\1\42\3\0\1\7\1\27"+
    "\1\21\1\11\1\24\1\33\1\6\1\34\1\26\2\6\1\22\1\31"+
    "\1\10\1\12\1\25\1\6\1\13\1\23\1\30\1\35\1\32\1\6"+
    "\1\3\1\6\1\6\1\0\1\15\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\5\4\1\6"+
    "\2\2\13\4\2\2\1\1\1\7\1\10\1\3\1\0"+
    "\3\4\1\11\1\4\1\12\1\0\3\4\1\11\13\4"+
    "\1\13\1\0\5\4\1\12\2\0\14\4\2\0\4\4"+
    "\2\0\1\12\13\4\1\3\3\4\1\0\27\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[124];
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
    "\0\0\0\45\0\112\0\157\0\224\0\45\0\271\0\336"+
    "\0\u0103\0\u0128\0\u014d\0\45\0\45\0\u0172\0\u0197\0\u01bc"+
    "\0\u01e1\0\u0206\0\u022b\0\u0250\0\u0275\0\u029a\0\u02bf\0\u02e4"+
    "\0\u0309\0\u032e\0\u0353\0\u0353\0\45\0\u0378\0\u039d\0\u03c2"+
    "\0\u03e7\0\u040c\0\u0431\0\224\0\u0456\0\u047b\0\u04a0\0\u04c5"+
    "\0\u04ea\0\u050f\0\u0534\0\u0559\0\u057e\0\u05a3\0\u05c8\0\u05ed"+
    "\0\u0612\0\u0637\0\u065c\0\u0681\0\u06a6\0\u06cb\0\45\0\u06f0"+
    "\0\u0715\0\u073a\0\u075f\0\u0784\0\u07a9\0\u07ce\0\u07f3\0\u0818"+
    "\0\u083d\0\u0862\0\u0887\0\u08ac\0\u08d1\0\u08f6\0\u091b\0\u0940"+
    "\0\u0965\0\u098a\0\u09af\0\u09d4\0\u039d\0\u09f9\0\u0a1e\0\u0a43"+
    "\0\u0a68\0\u0a8d\0\u0ab2\0\u0ad7\0\u0afc\0\u0b21\0\u0b46\0\u0b6b"+
    "\0\u0b90\0\u0bb5\0\u0bda\0\u0bff\0\u0c24\0\u0c49\0\u0c6e\0\u0c93"+
    "\0\u09f9\0\u0cb8\0\u0cdd\0\u0d02\0\u0d27\0\u0d4c\0\u0d71\0\u0d96"+
    "\0\u0dbb\0\u0de0\0\u0e05\0\u0534\0\u0e2a\0\u0e4f\0\u0e74\0\u0e99"+
    "\0\u0ebe\0\u0ee3\0\u0f08\0\u0f2d\0\u0f52\0\u0f77\0\u0f9c\0\u0fc1"+
    "\0\u0fe6\0\u100b\0\u1030\0\u1055";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[124];
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
    "\1\2\1\3\1\4\1\5\1\4\1\6\1\5\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\15"+
    "\1\5\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\5\1\26\1\27\1\30\1\31\1\5\1\32\1\33"+
    "\1\34\1\35\1\6\1\36\1\14\46\0\1\15\45\0"+
    "\1\37\1\0\1\37\1\40\41\0\3\5\1\0\6\5"+
    "\4\0\16\5\11\0\3\5\1\0\2\5\1\41\3\5"+
    "\4\0\16\5\11\0\3\5\1\0\6\5\4\0\15\5"+
    "\1\42\11\0\3\5\1\0\6\5\4\0\4\5\1\43"+
    "\11\5\11\0\3\5\1\0\5\5\1\44\4\0\16\5"+
    "\11\0\3\5\1\0\6\5\4\0\4\5\1\45\11\5"+
    "\25\0\1\46\1\47\27\0\3\5\1\0\1\5\1\50"+
    "\4\5\4\0\2\5\1\51\13\5\11\0\3\5\1\0"+
    "\6\5\4\0\4\5\1\52\11\5\11\0\3\5\1\0"+
    "\6\5\4\0\6\5\1\53\7\5\11\0\1\5\1\54"+
    "\1\5\1\0\2\5\1\55\3\5\4\0\3\5\1\56"+
    "\12\5\11\0\3\5\1\0\5\5\1\57\4\0\16\5"+
    "\11\0\3\5\1\0\2\5\1\60\3\5\4\0\16\5"+
    "\11\0\3\5\1\0\4\5\1\61\1\5\4\0\16\5"+
    "\11\0\3\5\1\0\6\5\4\0\4\5\1\62\1\5"+
    "\1\63\7\5\11\0\3\5\1\0\6\5\4\0\4\5"+
    "\1\64\11\5\11\0\3\5\1\0\1\5\1\65\4\5"+
    "\4\0\16\5\11\0\3\5\1\0\1\5\1\66\4\5"+
    "\4\0\16\5\45\0\1\15\45\0\1\15\50\0\1\67"+
    "\3\0\1\37\1\0\1\37\42\0\1\70\1\0\1\70"+
    "\42\0\3\5\1\0\3\5\1\44\2\5\4\0\16\5"+
    "\11\0\3\5\1\0\6\5\4\0\2\5\1\71\13\5"+
    "\11\0\3\5\1\0\6\5\4\0\1\5\1\72\1\5"+
    "\1\73\6\5\1\74\3\5\11\0\3\5\1\0\6\5"+
    "\4\0\10\5\1\75\5\5\7\0\14\46\1\76\30\46"+
    "\17\77\1\100\25\77\2\0\3\5\1\0\3\5\1\101"+
    "\2\5\4\0\16\5\11\0\3\5\1\0\1\5\1\102"+
    "\4\5\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\4\5\1\12\11\5\11\0\3\5\1\0\2\5\1\71"+
    "\3\5\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\10\5\1\103\5\5\11\0\3\5\1\0\6\5\4\0"+
    "\10\5\1\104\5\5\11\0\3\5\1\0\6\5\4\0"+
    "\1\5\1\105\14\5\11\0\3\5\1\0\4\5\1\106"+
    "\1\5\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\1\5\1\107\14\5\11\0\3\5\1\0\6\5\4\0"+
    "\2\5\1\110\13\5\11\0\3\5\1\0\6\5\4\0"+
    "\10\5\1\111\5\5\11\0\3\5\1\0\6\5\4\0"+
    "\4\5\1\112\11\5\11\0\3\5\1\0\5\5\1\113"+
    "\4\0\16\5\11\0\3\5\1\0\6\5\4\0\2\5"+
    "\1\114\13\5\11\0\3\5\1\0\6\5\4\0\1\5"+
    "\1\52\14\5\11\0\1\70\1\115\1\116\13\0\1\115"+
    "\3\0\1\115\22\0\3\5\1\0\4\5\1\44\1\5"+
    "\4\0\16\5\11\0\3\5\1\0\6\5\4\0\6\5"+
    "\1\117\7\5\11\0\3\5\1\0\3\5\1\120\2\5"+
    "\4\0\16\5\11\0\3\5\1\0\4\5\1\121\1\5"+
    "\4\0\16\5\11\0\3\5\1\0\4\5\1\122\1\5"+
    "\4\0\16\5\25\0\1\123\26\0\17\77\1\124\25\77"+
    "\16\0\1\125\1\100\27\0\3\5\1\0\6\5\4\0"+
    "\4\5\1\126\11\5\11\0\3\5\1\0\6\5\4\0"+
    "\3\5\1\120\12\5\11\0\3\5\1\0\6\5\4\0"+
    "\6\5\1\127\7\5\11\0\3\5\1\0\4\5\1\130"+
    "\1\5\4\0\4\5\1\131\11\5\11\0\3\5\1\0"+
    "\5\5\1\132\4\0\16\5\11\0\3\5\1\0\6\5"+
    "\4\0\5\5\1\133\10\5\11\0\3\5\1\0\5\5"+
    "\1\134\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\4\5\1\135\11\5\11\0\3\5\1\0\4\5\1\136"+
    "\1\5\4\0\16\5\11\0\3\5\1\0\2\5\1\137"+
    "\3\5\4\0\16\5\11\0\3\5\1\0\3\5\1\140"+
    "\2\5\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\3\5\1\71\12\5\11\0\1\141\1\115\1\141\13\0"+
    "\1\115\3\0\1\115\22\0\3\5\1\0\6\5\4\0"+
    "\11\5\1\142\4\5\11\0\3\5\1\0\6\5\4\0"+
    "\4\5\1\44\11\5\11\0\3\5\1\0\6\5\4\0"+
    "\2\5\1\143\13\5\11\0\3\5\1\0\5\5\1\144"+
    "\4\0\16\5\25\0\1\46\26\0\16\77\1\125\1\124"+
    "\25\77\16\0\1\145\30\0\3\5\1\0\2\5\1\146"+
    "\3\5\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\4\5\1\147\11\5\11\0\3\5\1\0\2\5\1\150"+
    "\3\5\4\0\16\5\11\0\3\5\1\0\5\5\1\71"+
    "\4\0\16\5\11\0\3\5\1\0\6\5\4\0\6\5"+
    "\1\151\7\5\11\0\3\5\1\0\6\5\4\0\6\5"+
    "\1\152\7\5\11\0\3\5\1\0\6\5\4\0\4\5"+
    "\1\153\11\5\11\0\3\5\1\0\1\5\1\154\4\5"+
    "\4\0\16\5\11\0\3\5\1\0\3\5\1\155\2\5"+
    "\4\0\16\5\11\0\3\5\1\0\6\5\4\0\10\5"+
    "\1\156\5\5\11\0\3\5\1\0\1\5\1\157\4\5"+
    "\4\0\16\5\11\0\3\5\1\0\1\5\1\160\4\5"+
    "\4\0\16\5\11\0\3\5\1\0\6\5\4\0\12\5"+
    "\1\52\3\5\11\0\3\5\1\0\2\5\1\161\3\5"+
    "\4\0\16\5\26\0\1\47\27\0\3\5\1\0\1\5"+
    "\1\44\4\5\4\0\16\5\11\0\3\5\1\0\2\5"+
    "\1\73\3\5\4\0\16\5\11\0\3\5\1\0\6\5"+
    "\4\0\1\5\1\162\14\5\11\0\3\5\1\0\6\5"+
    "\4\0\7\5\1\163\6\5\11\0\3\5\1\0\6\5"+
    "\4\0\4\5\1\164\11\5\11\0\3\5\1\0\6\5"+
    "\4\0\11\5\1\165\4\5\11\0\3\5\1\0\4\5"+
    "\1\166\1\5\4\0\16\5\11\0\3\5\1\0\5\5"+
    "\1\167\4\0\16\5\11\0\3\5\1\0\3\5\1\170"+
    "\2\5\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\2\5\1\44\13\5\11\0\3\5\1\0\1\5\1\12"+
    "\4\5\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\4\5\1\166\11\5\11\0\3\5\1\0\6\5\4\0"+
    "\6\5\1\12\7\5\11\0\3\5\1\0\3\5\1\171"+
    "\2\5\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\4\5\1\172\11\5\11\0\3\5\1\0\6\5\4\0"+
    "\3\5\1\44\12\5\11\0\3\5\1\0\1\5\1\166"+
    "\4\5\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\4\5\1\131\11\5\11\0\3\5\1\0\1\5\1\173"+
    "\4\5\4\0\16\5\11\0\3\5\1\0\2\5\1\174"+
    "\3\5\4\0\16\5\11\0\3\5\1\0\3\5\1\162"+
    "\2\5\4\0\16\5\11\0\3\5\1\0\6\5\4\0"+
    "\10\5\1\161\5\5\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4218];
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
    "\1\0\1\11\3\1\1\11\5\1\2\11\17\1\1\11"+
    "\2\1\1\0\6\1\1\0\17\1\1\11\1\0\6\1"+
    "\2\0\14\1\2\0\4\1\2\0\20\1\1\0\27\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[124];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
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
    while (i < 152) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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
        case 1: 
          { yyclose(); 
    System.err.println("Caracter Invalido" + yytext() + "["+ yyline + "]");
    return new Symbol(sym.ERROR);
          }
        case 12: break;
        case 5: 
          { return new Symbol(sym.ESPECIALES, new token(yyline, yytext()));
          }
        case 13: break;
        case 2: 
          { return new Symbol(sym.OPERADOR, new token(yyline, yytext()));
          }
        case 14: break;
        case 7: 
          { return new Symbol(sym.FNLINEA, new token(yyline, yytext()));
          }
        case 15: break;
        case 11: 
          { return new Symbol(sym.DOSESPACIOS, new token(yyline, yytext()));
          }
        case 16: break;
        case 9: 
          { return new Symbol(sym.RESERVADA, new token(yyline, yytext()));
          }
        case 17: break;
        case 10: 
          { return new Symbol(sym.COMENTARIOS, new token(yyline, yytext()));
          }
        case 18: break;
        case 8: 
          { return new Symbol(sym.UNESPACIO, new token(yyline, yytext()));
          }
        case 19: break;
        case 3: 
          { return new Symbol(sym.NUMERO, new token(yyline, yytext()));
          }
        case 20: break;
        case 6: 
          { 
          }
        case 21: break;
        case 4: 
          { return new Symbol(sym.ID, new token(yyline, yytext()));
          }
        case 22: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {   System.out.println("Fin de archivo encontrado");
                return new Symbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
