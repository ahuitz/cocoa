/* The following code was generated by JFlex 1.4.3 on 13/10/14 11:17 AM */

package tools;
import tools.Identificador;
import static tools.Identificador.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 13/10/14 11:17 AM from the specification file
 * <tt>src/tools/ER</tt>
 */
class Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ESIGNOS = 10;
  public static final int ERESERV = 8;
  public static final int VARCLASE = 4;
  public static final int YYINITIAL = 0;
  public static final int TODO = 6;
  public static final int EVARIABLES = 12;
  public static final int PROPIEDADES = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6, 6
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\21\1\0\1\34\1\35\22\0\1\33\1\56\1\45\2\0"+
    "\1\22\2\0\1\45\1\45\1\24\1\54\1\44\1\1\1\5\1\23"+
    "\2\4\10\2\1\0\1\43\1\22\1\55\1\22\2\0\1\12\2\26"+
    "\1\14\1\25\6\26\1\52\1\26\1\13\1\17\2\26\1\20\2\26"+
    "\1\51\2\26\1\25\1\26\1\26\1\45\1\0\1\45\3\0\1\7"+
    "\1\40\1\27\1\11\1\32\1\47\1\6\1\50\1\37\2\6\1\30"+
    "\1\42\1\10\1\15\1\36\1\6\1\16\1\31\1\41\1\53\1\46"+
    "\1\6\1\3\1\6\1\6\1\0\1\22\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\2\2\1\3\1\4\2\5\3\6\1\7"+
    "\1\10\1\11\1\12\10\11\2\7\6\11\1\13\3\11"+
    "\2\7\1\2\5\6\1\14\1\15\1\16\1\0\1\17"+
    "\3\0\1\20\1\10\1\0\5\11\1\21\1\11\1\22"+
    "\1\0\2\11\1\21\10\11\7\0\1\6\1\20\1\0"+
    "\5\11\1\22\2\0\10\11\7\0\1\6\2\0\3\11"+
    "\2\0\1\22\6\11\5\0\1\23\1\0\1\10\2\11"+
    "\1\0\6\11\6\0\6\11\1\0\1\24\3\0\3\11"+
    "\1\25\1\21\1\0\1\11\2\0\1\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[172];
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
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\u0149\0\u0178\0\u01a7\0\u0149\0\u0149\0\u01d6\0\u0149\0\u0205"+
    "\0\u0234\0\u0263\0\u0292\0\u02c1\0\u0149\0\u02f0\0\u031f\0\u034e"+
    "\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439\0\u0149\0\u0468\0\u0497"+
    "\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u0582\0\u0149\0\u05b1\0\u05e0"+
    "\0\u060f\0\u063e\0\u066d\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729"+
    "\0\u0758\0\u0149\0\u0149\0\u0787\0\u07b6\0\u0149\0\u07e5\0\u0205"+
    "\0\u0814\0\u0843\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d"+
    "\0\u098c\0\u02c1\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6"+
    "\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e"+
    "\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96"+
    "\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e"+
    "\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028\0\u1057\0\u1086"+
    "\0\u10b5\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0\0\u11cf\0\u11fe"+
    "\0\u122d\0\u125c\0\u0872\0\u128b\0\u12ba\0\u12e9\0\u1318\0\u1347"+
    "\0\u1376\0\u13a5\0\u13d4\0\u1403\0\u1432\0\u1461\0\u1490\0\u14bf"+
    "\0\u14ee\0\u151d\0\u154c\0\u157b\0\u15aa\0\u0149\0\u15d9\0\u128b"+
    "\0\u1608\0\u1637\0\u1666\0\u1695\0\u16c4\0\u16f3\0\u1722\0\u1751"+
    "\0\u1780\0\u17af\0\u17de\0\u180d\0\u183c\0\u186b\0\u189a\0\u18c9"+
    "\0\u18f8\0\u1927\0\u1956\0\u1985\0\u19b4\0\u19e3\0\u0149\0\u1a12"+
    "\0\u1a41\0\u1a70\0\u1a9f\0\u1ace\0\u1afd\0\u0149\0\u0149\0\u1b2c"+
    "\0\u1b5b\0\u1b8a\0\u1bb9\0\u0149";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[172];
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
    "\7\10\1\11\17\10\1\12\3\11\1\13\2\14\21\10"+
    "\21\15\1\14\11\15\1\13\2\14\1\16\20\15\2\17"+
    "\1\20\1\17\1\20\5\17\3\21\2\17\2\21\1\14"+
    "\3\17\2\21\4\17\1\13\2\14\13\17\2\21\4\17"+
    "\1\11\1\22\1\23\1\24\1\23\1\25\1\24\1\26"+
    "\1\27\1\30\1\31\1\32\1\24\1\33\1\34\1\35"+
    "\1\24\1\14\1\36\1\37\1\36\2\24\1\40\1\41"+
    "\1\42\1\43\1\13\2\14\1\24\1\44\2\24\1\45"+
    "\1\46\2\25\1\47\1\50\1\51\3\24\1\52\1\53"+
    "\1\54\11\17\1\55\7\17\1\14\5\17\1\56\2\17"+
    "\1\57\1\13\2\14\2\17\1\60\1\17\1\61\35\17"+
    "\1\14\11\17\1\13\7\17\1\62\1\63\12\17\3\11"+
    "\1\64\2\11\13\64\1\14\3\11\6\64\1\13\2\14"+
    "\5\64\3\11\6\64\3\11\107\0\1\65\61\0\1\66"+
    "\41\0\1\67\42\0\1\70\1\0\1\70\5\0\3\71"+
    "\2\0\2\71\4\0\2\71\22\0\2\71\7\0\1\72"+
    "\2\0\13\72\4\0\6\72\3\0\5\72\3\0\6\72"+
    "\4\0\1\36\57\0\1\73\1\0\1\73\1\74\53\0"+
    "\3\24\1\0\13\24\4\0\6\24\3\0\5\24\3\0"+
    "\6\24\5\0\3\24\1\0\2\24\1\75\10\24\4\0"+
    "\6\24\3\0\5\24\3\0\6\24\5\0\3\24\1\0"+
    "\13\24\4\0\6\24\3\0\5\24\3\0\5\24\1\76"+
    "\5\0\3\24\1\0\13\24\4\0\5\24\1\77\3\0"+
    "\5\24\3\0\6\24\5\0\3\24\1\0\5\24\1\100"+
    "\5\24\4\0\6\24\3\0\5\24\3\0\6\24\5\0"+
    "\3\24\1\0\13\24\4\0\6\24\3\0\5\24\3\0"+
    "\3\24\1\101\2\24\5\0\3\24\1\0\10\24\1\102"+
    "\2\24\4\0\6\24\3\0\5\24\3\0\6\24\5\0"+
    "\3\24\1\0\13\24\4\0\5\24\1\103\3\0\5\24"+
    "\3\0\6\24\5\0\3\24\1\0\12\24\1\102\4\0"+
    "\6\24\3\0\5\24\3\0\6\24\26\0\1\104\1\105"+
    "\34\0\3\24\1\0\13\24\4\0\3\24\1\106\2\24"+
    "\3\0\5\24\3\0\6\24\5\0\3\24\1\0\13\24"+
    "\4\0\5\24\1\107\3\0\5\24\3\0\6\24\5\0"+
    "\3\24\1\0\13\24\4\0\6\24\3\0\1\24\1\110"+
    "\3\24\3\0\6\24\5\0\1\24\1\111\1\24\1\0"+
    "\2\24\1\112\10\24\4\0\4\24\1\113\1\24\3\0"+
    "\5\24\3\0\6\24\5\0\3\24\1\0\2\24\1\114"+
    "\10\24\4\0\6\24\3\0\5\24\3\0\6\24\5\0"+
    "\3\24\1\0\13\24\4\0\6\24\3\0\1\24\1\115"+
    "\3\24\3\0\6\24\5\0\3\24\1\0\13\24\4\0"+
    "\5\24\1\116\3\0\5\24\3\0\6\24\5\0\3\24"+
    "\1\0\1\24\1\117\11\24\4\0\6\24\3\0\5\24"+
    "\3\0\6\24\5\0\3\24\1\0\1\24\1\120\11\24"+
    "\4\0\6\24\3\0\5\24\3\0\6\24\57\0\1\36"+
    "\57\0\1\36\33\0\1\121\33\0\1\122\57\0\1\123"+
    "\63\0\1\124\73\0\1\125\26\0\3\64\1\0\13\64"+
    "\4\0\6\64\3\0\5\64\3\0\6\64\12\0\1\126"+
    "\64\0\1\127\44\0\1\130\2\0\13\130\4\0\6\130"+
    "\3\0\5\130\3\0\6\130\5\0\1\131\1\72\1\131"+
    "\1\0\13\72\4\0\6\72\3\0\5\72\3\0\6\72"+
    "\5\0\1\73\1\0\1\73\54\0\1\132\1\0\1\132"+
    "\54\0\3\24\1\0\3\24\1\102\7\24\4\0\6\24"+
    "\3\0\5\24\3\0\6\24\5\0\3\24\1\0\13\24"+
    "\4\0\3\24\1\133\2\24\3\0\5\24\3\0\6\24"+
    "\5\0\3\24\1\0\13\24\4\0\4\24\1\134\1\24"+
    "\3\0\5\24\3\0\1\135\5\24\5\0\3\24\1\0"+
    "\6\24\1\102\4\24\4\0\6\24\3\0\5\24\3\0"+
    "\6\24\5\0\3\24\1\0\13\24\4\0\6\24\3\0"+
    "\5\24\3\0\4\24\1\136\1\24\5\0\3\24\1\0"+
    "\13\24\4\0\6\24\3\0\3\24\1\137\1\24\3\0"+
    "\6\24\3\0\21\104\1\140\13\104\1\140\21\104\24\141"+
    "\1\142\32\141\2\0\3\24\1\0\1\24\1\143\11\24"+
    "\4\0\6\24\3\0\5\24\3\0\6\24\5\0\3\24"+
    "\1\0\13\24\4\0\5\24\1\33\3\0\5\24\3\0"+
    "\6\24\5\0\3\24\1\0\2\24\1\133\10\24\4\0"+
    "\6\24\3\0\5\24\3\0\6\24\5\0\3\24\1\0"+
    "\13\24\4\0\6\24\3\0\3\24\1\144\1\24\3\0"+
    "\6\24\5\0\3\24\1\0\13\24\4\0\6\24\3\0"+
    "\3\24\1\145\1\24\3\0\6\24\5\0\3\24\1\0"+
    "\13\24\4\0\2\24\1\146\3\24\3\0\5\24\3\0"+
    "\6\24\5\0\3\24\1\0\13\24\4\0\2\24\1\147"+
    "\3\24\3\0\5\24\3\0\6\24\5\0\3\24\1\0"+
    "\13\24\4\0\5\24\1\150\3\0\5\24\3\0\6\24"+
    "\5\0\3\24\1\0\10\24\1\151\2\24\4\0\6\24"+
    "\3\0\5\24\3\0\6\24\5\0\3\24\1\0\13\24"+
    "\4\0\3\24\1\152\2\24\3\0\5\24\3\0\6\24"+
    "\5\0\3\24\1\0\13\24\4\0\2\24\1\107\3\24"+
    "\3\0\5\24\3\0\6\24\32\0\1\153\40\0\1\154"+
    "\106\0\1\155\45\0\1\156\67\0\1\157\46\0\1\160"+
    "\63\0\1\161\22\0\1\162\1\130\1\162\1\0\13\130"+
    "\4\0\6\130\3\0\5\130\3\0\6\130\5\0\1\131"+
    "\1\0\1\131\54\0\1\132\1\163\1\164\20\0\1\163"+
    "\4\0\1\163\26\0\3\24\1\0\7\24\1\102\3\24"+
    "\4\0\6\24\3\0\5\24\3\0\6\24\5\0\3\24"+
    "\1\0\3\24\1\165\7\24\4\0\6\24\3\0\5\24"+
    "\3\0\6\24\5\0\3\24\1\0\7\24\1\166\3\24"+
    "\4\0\6\24\3\0\5\24\3\0\6\24\5\0\3\24"+
    "\1\0\11\24\1\102\1\24\4\0\6\24\3\0\5\24"+
    "\3\0\6\24\5\0\3\24\1\0\7\24\1\167\3\24"+
    "\4\0\6\24\3\0\5\24\3\0\6\24\26\0\1\170"+
    "\33\0\24\141\1\171\32\141\23\0\1\172\1\142\34\0"+
    "\3\24\1\0\13\24\4\0\4\24\1\165\1\24\3\0"+
    "\5\24\3\0\6\24\5\0\3\24\1\0\13\24\4\0"+
    "\6\24\3\0\1\24\1\173\3\24\3\0\6\24\5\0"+
    "\3\24\1\0\7\24\1\174\3\24\4\0\6\24\3\0"+
    "\5\24\3\0\6\24\5\0\3\24\1\0\10\24\1\175"+
    "\2\24\4\0\6\24\3\0\5\24\3\0\6\24\5\0"+
    "\3\24\1\0\10\24\1\176\2\24\4\0\6\24\3\0"+
    "\5\24\3\0\6\24\5\0\3\24\1\0\2\24\1\177"+
    "\10\24\4\0\6\24\3\0\5\24\3\0\6\24\5\0"+
    "\3\24\1\0\3\24\1\200\7\24\4\0\6\24\3\0"+
    "\5\24\3\0\6\24\5\0\3\24\1\0\13\24\4\0"+
    "\4\24\1\133\1\24\3\0\5\24\3\0\6\24\42\0"+
    "\1\201\51\0\1\202\56\0\1\203\56\0\1\204\41\0"+
    "\1\205\73\0\1\206\63\0\1\207\21\0\1\162\1\0"+
    "\1\162\54\0\1\210\1\163\1\210\20\0\1\163\4\0"+
    "\1\163\26\0\3\24\1\0\13\24\4\0\5\24\1\102"+
    "\3\0\5\24\3\0\6\24\5\0\3\24\1\0\13\24"+
    "\4\0\3\24\1\211\2\24\3\0\5\24\3\0\6\24"+
    "\5\0\3\24\1\0\10\24\1\212\2\24\4\0\6\24"+
    "\3\0\5\24\3\0\6\24\26\0\1\104\33\0\23\141"+
    "\1\172\1\171\32\141\23\0\1\213\35\0\3\24\1\0"+
    "\13\24\4\0\5\24\1\214\3\0\5\24\3\0\6\24"+
    "\5\0\3\24\1\0\2\24\1\215\10\24\4\0\6\24"+
    "\3\0\5\24\3\0\6\24\5\0\3\24\1\0\13\24"+
    "\4\0\6\24\3\0\1\24\1\216\3\24\3\0\6\24"+
    "\5\0\3\24\1\0\13\24\4\0\5\24\1\217\3\0"+
    "\5\24\3\0\6\24\5\0\3\24\1\0\13\24\4\0"+
    "\6\24\3\0\3\24\1\220\1\24\3\0\6\24\5\0"+
    "\3\24\1\0\1\24\1\221\11\24\4\0\6\24\3\0"+
    "\5\24\3\0\6\24\45\0\1\222\24\0\1\223\64\0"+
    "\1\224\47\0\1\225\60\0\1\226\77\0\1\227\26\0"+
    "\3\24\1\0\13\24\4\0\6\24\3\0\5\24\3\0"+
    "\1\107\5\24\5\0\3\24\1\0\2\24\1\230\10\24"+
    "\4\0\6\24\3\0\5\24\3\0\6\24\27\0\1\105"+
    "\34\0\3\24\1\0\2\24\1\134\10\24\4\0\6\24"+
    "\3\0\5\24\3\0\6\24\5\0\3\24\1\0\13\24"+
    "\4\0\2\24\1\231\3\24\3\0\5\24\3\0\6\24"+
    "\5\0\3\24\1\0\13\24\4\0\6\24\3\0\2\24"+
    "\1\232\2\24\3\0\6\24\5\0\3\24\1\0\13\24"+
    "\4\0\6\24\3\0\4\24\1\233\3\0\6\24\5\0"+
    "\3\24\1\0\10\24\1\234\2\24\4\0\6\24\3\0"+
    "\5\24\3\0\6\24\5\0\3\24\1\0\3\24\1\235"+
    "\7\24\4\0\6\24\3\0\5\24\3\0\6\24\12\0"+
    "\1\236\56\0\1\237\64\0\1\237\51\0\1\240\63\0"+
    "\1\241\52\0\1\242\47\0\3\24\1\0\1\24\1\33"+
    "\11\24\4\0\6\24\3\0\5\24\3\0\6\24\5\0"+
    "\3\24\1\0\13\24\4\0\5\24\1\243\3\0\5\24"+
    "\3\0\6\24\5\0\3\24\1\0\13\24\4\0\6\24"+
    "\3\0\1\24\1\33\3\24\3\0\6\24\5\0\3\24"+
    "\1\0\13\24\4\0\5\24\1\244\3\0\5\24\3\0"+
    "\6\24\5\0\3\24\1\0\1\24\1\243\11\24\4\0"+
    "\6\24\3\0\5\24\3\0\6\24\5\0\3\24\1\0"+
    "\13\24\4\0\5\24\1\245\3\0\5\24\3\0\6\24"+
    "\33\0\1\237\43\0\1\246\72\0\1\247\34\0\1\250"+
    "\51\0\3\24\1\0\13\24\4\0\4\24\1\102\1\24"+
    "\3\0\5\24\3\0\6\24\5\0\3\24\1\0\2\24"+
    "\1\251\10\24\4\0\6\24\3\0\5\24\3\0\6\24"+
    "\5\0\3\24\1\0\10\24\1\133\2\24\4\0\6\24"+
    "\3\0\5\24\3\0\6\24\14\0\1\252\47\0\3\24"+
    "\1\0\13\24\4\0\6\24\3\0\3\24\1\230\1\24"+
    "\3\0\6\24\35\0\1\253\55\0\1\254\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7144];
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
    "\7\0\2\11\2\1\2\11\1\1\1\11\5\1\1\11"+
    "\10\1\1\11\7\1\1\11\13\1\2\11\1\1\1\0"+
    "\1\11\3\0\2\1\1\0\10\1\1\0\13\1\7\0"+
    "\2\1\1\0\6\1\2\0\10\1\7\0\1\1\2\0"+
    "\3\1\2\0\7\1\5\0\1\11\1\0\3\1\1\0"+
    "\6\1\6\0\6\1\1\0\1\11\3\0\3\1\2\11"+
    "\1\0\1\1\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[172];
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

  /* user code: */
    public String clasif;
    public boolean estado=true;
    public int errorLinea;


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
    while (i < 154) {
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Identificador yylex() throws java.io.IOException {
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
        case 22: 
          { yybegin(ERESERV);clasif=yytext(); return RESERVADA;
          }
        case 23: break;
        case 11: 
          { clasif=yytext(); return FNLINEA;
          }
        case 24: break;
        case 12: 
          { yybegin(ERESERV); clasif=yytext(); return FNLINEA;
          }
        case 25: break;
        case 16: 
          { yybegin(PROPIEDADES); clasif=yytext(); return ID;
          }
        case 26: break;
        case 9: 
          { clasif=yytext(); return ID;
          }
        case 27: break;
        case 19: 
          { yybegin(VARCLASE);
                clasif=yytext();
                return RESERVADA;
          }
        case 28: break;
        case 10: 
          { clasif=yytext(); return ESPECIALES;
          }
        case 29: break;
        case 7: 
          { clasif=yytext(); return OPERADOR;
          }
        case 30: break;
        case 20: 
          { yybegin(EVARIABLES); clasif=yytext(); return RESERVADA;
          }
        case 31: break;
        case 15: 
          { clasif=yytext(); return DOSESPACIOS;
          }
        case 32: break;
        case 8: 
          { clasif=yytext(); return NUMERO;
          }
        case 33: break;
        case 1: 
          { System.out.println(yyline);
                yyclose();
          }
        case 34: break;
        case 13: 
          { yybegin(EVARIABLES); clasif=yytext(); return ESPECIALES;
          }
        case 35: break;
        case 3: 
          { clasif=yytext(); return UNESPACIO;
          }
        case 36: break;
        case 6: 
          { yyclose();
          }
        case 37: break;
        case 2: 
          { yyclose(); return ERROR;
          }
        case 38: break;
        case 17: 
          { clasif=yytext(); return RESERVADA;
          }
        case 39: break;
        case 18: 
          { clasif=yytext(); return COMENTARIOS;
          }
        case 40: break;
        case 5: 
          { System.out.println("Error en la linea--> "+ yyline);
          yyclose();
          }
        case 41: break;
        case 21: 
          { yybegin(EVARIABLES);clasif=yytext(); return RESERVADA;
          }
        case 42: break;
        case 14: 
          { yybegin(ESIGNOS); clasif=yytext(); return ID;
          }
        case 43: break;
        case 4: 
          { 
          }
        case 44: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}