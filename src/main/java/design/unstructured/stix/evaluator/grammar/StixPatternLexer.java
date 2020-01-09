/*
 * stix-pattern-evaluator
 * Copyright (C) 2020 - Unstructured Design
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package design.unstructured.stix.evaluator.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StixPatternLexer extends Lexer {

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache
            = new PredictionContextCache();
    public static final int IntNegLiteral = 1, IntPosLiteral = 2, FloatNegLiteral = 3, FloatPosLiteral = 4,
            HexLiteral = 5, BinaryLiteral = 6, StringLiteral = 7, BoolLiteral = 8, TimestampLiteral = 9,
            AND = 10, OR = 11, NOT = 12, FOLLOWEDBY = 13, LIKE = 14, MATCHES = 15, ISSUPERSET = 16,
            ISSUBSET = 17, EXISTS = 18, LAST = 19, IN = 20, START = 21, STOP = 22, SECONDS = 23,
            TRUE = 24, FALSE = 25, WITHIN = 26, REPEATS = 27, TIMES = 28, IdentifierWithoutHyphen = 29,
            IdentifierWithHyphen = 30, EQ = 31, NEQ = 32, LT = 33, LE = 34, GT = 35, GE = 36, QUOTE = 37,
            COLON = 38, DOT = 39, COMMA = 40, RPAREN = 41, LPAREN = 42, RBRACK = 43, LBRACK = 44,
            PLUS = 45, HYPHEN = 46, MINUS = 47, POWER_OP = 48, DIVIDE = 49, ASTERISK = 50, WS = 51,
            COMMENT = 52, LINE_COMMENT = 53, InvalidCharacter = 54;
    public static String[] channelNames = {
        "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
        "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
            "IntNegLiteral", "IntPosLiteral", "FloatNegLiteral", "FloatPosLiteral",
            "HexLiteral", "BinaryLiteral", "StringLiteral", "BoolLiteral", "TimestampLiteral",
            "AND", "OR", "NOT", "FOLLOWEDBY", "LIKE", "MATCHES", "ISSUPERSET", "ISSUBSET",
            "EXISTS", "LAST", "IN", "START", "STOP", "SECONDS", "TRUE", "FALSE",
            "WITHIN", "REPEATS", "TIMES", "IdentifierWithoutHyphen", "IdentifierWithHyphen",
            "EQ", "NEQ", "LT", "LE", "GT", "GE", "QUOTE", "COLON", "DOT", "COMMA",
            "RPAREN", "LPAREN", "RBRACK", "LBRACK", "PLUS", "HYPHEN", "MINUS", "POWER_OP",
            "DIVIDE", "ASTERISK", "HexDigit", "TwoHexDigits", "Base64Char", "WS",
            "COMMENT", "LINE_COMMENT", "InvalidCharacter"
        };
    }
    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
            null, null, null, null, null, null, null, null, null, null, "'AND'",
            "'OR'", "'NOT'", "'FOLLOWEDBY'", "'LIKE'", "'MATCHES'", "'ISSUPERSET'",
            "'ISSUBSET'", "'EXISTS'", "'LAST'", "'IN'", "'START'", "'STOP'", "'SECONDS'",
            "'true'", "'false'", "'WITHIN'", "'REPEATS'", "'TIMES'", null, null,
            null, null, "'<'", "'<='", "'>'", "'>='", "'''", "':'", "'.'", "','",
            "')'", "'('", "']'", "'['", "'+'", null, "'-'", "'^'", "'/'", "'*'"
        };
    }
    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
            null, "IntNegLiteral", "IntPosLiteral", "FloatNegLiteral", "FloatPosLiteral",
            "HexLiteral", "BinaryLiteral", "StringLiteral", "BoolLiteral", "TimestampLiteral",
            "AND", "OR", "NOT", "FOLLOWEDBY", "LIKE", "MATCHES", "ISSUPERSET", "ISSUBSET",
            "EXISTS", "LAST", "IN", "START", "STOP", "SECONDS", "TRUE", "FALSE",
            "WITHIN", "REPEATS", "TIMES", "IdentifierWithoutHyphen", "IdentifierWithHyphen",
            "EQ", "NEQ", "LT", "LE", "GT", "GE", "QUOTE", "COLON", "DOT", "COMMA",
            "RPAREN", "LPAREN", "RBRACK", "LBRACK", "PLUS", "HYPHEN", "MINUS", "POWER_OP",
            "DIVIDE", "ASTERISK", "WS", "COMMENT", "LINE_COMMENT", "InvalidCharacter"
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

    public StixPatternLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "StixPattern.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN
            = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01f8\b\1\4\2\t"
            + "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
            + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
            + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
            + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
            + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
            + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\7"
            + "\2z\n\2\f\2\16\2}\13\2\5\2\177\n\2\3\3\5\3\u0082\n\3\3\3\3\3\3\3\7\3\u0087"
            + "\n\3\f\3\16\3\u008a\13\3\5\3\u008c\n\3\3\4\3\4\7\4\u0090\n\4\f\4\16\4"
            + "\u0093\13\4\3\4\3\4\6\4\u0097\n\4\r\4\16\4\u0098\3\5\5\5\u009c\n\5\3\5"
            + "\7\5\u009f\n\5\f\5\16\5\u00a2\13\5\3\5\3\5\6\5\u00a6\n\5\r\5\16\5\u00a7"
            + "\3\6\3\6\3\6\7\6\u00ad\n\6\f\6\16\6\u00b0\13\6\3\6\3\6\3\7\3\7\3\7\3\7"
            + "\3\7\3\7\3\7\7\7\u00bb\n\7\f\7\16\7\u00be\13\7\3\7\3\7\3\7\3\7\3\7\3\7"
            + "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d1\n\7\3\7\3\7\3\b"
            + "\3\b\3\b\3\b\3\b\3\b\7\b\u00db\n\b\f\b\16\b\u00de\13\b\3\b\3\b\3\t\3\t"
            + "\5\t\u00e4\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f1\n"
            + "\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00fa\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0101"
            + "\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u010b\n\n\3\n\3\n\6\n\u010f\n"
            + "\n\r\n\16\n\u0110\5\n\u0113\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"
            + "\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"
            + "\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"
            + "\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"
            + "\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"
            + "\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"
            + "\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"
            + "\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"
            + "\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"
            + "\35\3\35\3\35\3\36\3\36\7\36\u0193\n\36\f\36\16\36\u0196\13\36\3\37\3"
            + "\37\7\37\u019a\n\37\f\37\16\37\u019d\13\37\3 \3 \3 \5 \u01a2\n \3!\3!"
            + "\3!\3!\5!\u01a8\n!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3"
            + "(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"
            + "\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\6\67\u01d8\n\67"
            + "\r\67\16\67\u01d9\3\67\3\67\38\38\38\38\78\u01e2\n8\f8\168\u01e5\138\3"
            + "8\38\38\38\38\39\39\39\39\79\u01f0\n9\f9\169\u01f3\139\39\39\3:\3:\3\u01e3"
            + "\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"
            + "\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"
            + ";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\65"
            + "o\66q\67s8\3\2\21\3\2\63;\3\2\62;\4\2))^^\3\2\62\64\3\2\63\64\3\2\62\63"
            + "\3\2\62\65\3\2\62\67\5\2C\\aac|\6\2\62;C\\aac|\7\2//\62;C\\aac|\5\2\62"
            + ";CHch\6\2--\61;C\\c|\f\2\13\17\"\"\u0087\u0087\u00a2\u00a2\u1682\u1682"
            + "\u2002\u200c\u202a\u202b\u2031\u2031\u2061\u2061\u3002\u3002\4\2\f\f\17"
            + "\17\2\u0214\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"
            + "\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"
            + "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"
            + "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"
            + "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"
            + "\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"
            + "\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"
            + "\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"
            + "\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"
            + "\2s\3\2\2\2\3u\3\2\2\2\5\u0081\3\2\2\2\7\u008d\3\2\2\2\t\u009b\3\2\2\2"
            + "\13\u00a9\3\2\2\2\r\u00b3\3\2\2\2\17\u00d4\3\2\2\2\21\u00e3\3\2\2\2\23"
            + "\u00e5\3\2\2\2\25\u0117\3\2\2\2\27\u011b\3\2\2\2\31\u011e\3\2\2\2\33\u0122"
            + "\3\2\2\2\35\u012d\3\2\2\2\37\u0132\3\2\2\2!\u013a\3\2\2\2#\u0145\3\2\2"
            + "\2%\u014e\3\2\2\2\'\u0155\3\2\2\2)\u015a\3\2\2\2+\u015d\3\2\2\2-\u0163"
            + "\3\2\2\2/\u0168\3\2\2\2\61\u0170\3\2\2\2\63\u0175\3\2\2\2\65\u017b\3\2"
            + "\2\2\67\u0182\3\2\2\29\u018a\3\2\2\2;\u0190\3\2\2\2=\u0197\3\2\2\2?\u01a1"
            + "\3\2\2\2A\u01a7\3\2\2\2C\u01a9\3\2\2\2E\u01ab\3\2\2\2G\u01ae\3\2\2\2I"
            + "\u01b0\3\2\2\2K\u01b3\3\2\2\2M\u01b5\3\2\2\2O\u01b7\3\2\2\2Q\u01b9\3\2"
            + "\2\2S\u01bb\3\2\2\2U\u01bd\3\2\2\2W\u01bf\3\2\2\2Y\u01c1\3\2\2\2[\u01c3"
            + "\3\2\2\2]\u01c5\3\2\2\2_\u01c7\3\2\2\2a\u01c9\3\2\2\2c\u01cb\3\2\2\2e"
            + "\u01cd\3\2\2\2g\u01cf\3\2\2\2i\u01d1\3\2\2\2k\u01d4\3\2\2\2m\u01d7\3\2"
            + "\2\2o\u01dd\3\2\2\2q\u01eb\3\2\2\2s\u01f6\3\2\2\2u~\7/\2\2v\177\7\62\2"
            + "\2w{\t\2\2\2xz\t\3\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3"
            + "\2\2\2}{\3\2\2\2~v\3\2\2\2~w\3\2\2\2\177\4\3\2\2\2\u0080\u0082\7-\2\2"
            + "\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u008b\3\2\2\2\u0083\u008c"
            + "\7\62\2\2\u0084\u0088\t\2\2\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2"
            + "\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c"
            + "\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0084\3\2\2\2\u008c"
            + "\6\3\2\2\2\u008d\u0091\7/\2\2\u008e\u0090\t\3\2\2\u008f\u008e\3\2\2\2"
            + "\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094"
            + "\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\7\60\2\2\u0095\u0097\t\3\2\2"
            + "\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"
            + "\3\2\2\2\u0099\b\3\2\2\2\u009a\u009c\7-\2\2\u009b\u009a\3\2\2\2\u009b"
            + "\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\t\3\2\2\u009e\u009d\3\2"
            + "\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"
            + "\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\60\2\2\u00a4\u00a6\t"
            + "\3\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"
            + "\u00a8\3\2\2\2\u00a8\n\3\2\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ae\5K&\2\u00ab"
            + "\u00ad\5i\65\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"
            + "\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"
            + "\u00b2\5K&\2\u00b2\f\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4\u00bc\5K&\2\u00b5"
            + "\u00b6\5k\66\2\u00b6\u00b7\5k\66\2\u00b7\u00b8\5k\66\2\u00b8\u00b9\5k"
            + "\66\2\u00b9\u00bb\3\2\2\2\u00ba\u00b5\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"
            + "\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00d0\3\2\2\2\u00be\u00bc\3\2"
            + "\2\2\u00bf\u00c0\5k\66\2\u00c0\u00c1\5k\66\2\u00c1\u00c2\5k\66\2\u00c2"
            + "\u00c3\5k\66\2\u00c3\u00d1\3\2\2\2\u00c4\u00c5\5k\66\2\u00c5\u00c6\5k"
            + "\66\2\u00c6\u00c7\5k\66\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9"
            + "\u00d1\3\2\2\2\u00ca\u00cb\5k\66\2\u00cb\u00cc\5k\66\2\u00cc\u00cd\3\2"
            + "\2\2\u00cd\u00ce\7?\2\2\u00ce\u00cf\7?\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00bf"
            + "\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"
            + "\u00d3\5K&\2\u00d3\16\3\2\2\2\u00d4\u00dc\5K&\2\u00d5\u00db\n\4\2\2\u00d6"
            + "\u00d7\7^\2\2\u00d7\u00db\7)\2\2\u00d8\u00d9\7^\2\2\u00d9\u00db\7^\2\2"
            + "\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00de"
            + "\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"
            + "\u00dc\3\2\2\2\u00df\u00e0\5K&\2\u00e0\20\3\2\2\2\u00e1\u00e4\5\61\31"
            + "\2\u00e2\u00e4\5\63\32\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"
            + "\22\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\5K&\2\u00e7\u00e8\t\3\2\2\u00e8"
            + "\u00e9\t\3\2\2\u00e9\u00ea\t\3\2\2\u00ea\u00eb\t\3\2\2\u00eb\u00f0\5]"
            + "/\2\u00ec\u00ed\7\62\2\2\u00ed\u00f1\t\2\2\2\u00ee\u00ef\7\63\2\2\u00ef"
            + "\u00f1\t\5\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\3\2"
            + "\2\2\u00f2\u00f9\5]/\2\u00f3\u00f4\7\62\2\2\u00f4\u00fa\t\2\2\2\u00f5"
            + "\u00f6\t\6\2\2\u00f6\u00fa\t\3\2\2\u00f7\u00f8\7\65\2\2\u00f8\u00fa\t"
            + "\7\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"
            + "\u00fb\3\2\2\2\u00fb\u0100\7V\2\2\u00fc\u00fd\t\7\2\2\u00fd\u0101\t\3"
            + "\2\2\u00fe\u00ff\7\64\2\2\u00ff\u0101\t\b\2\2\u0100\u00fc\3\2\2\2\u0100"
            + "\u00fe\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\5M\'\2\u0103\u0104\t\t"
            + "\2\2\u0104\u0105\t\3\2\2\u0105\u010a\5M\'\2\u0106\u0107\t\t\2\2\u0107"
            + "\u010b\t\3\2\2\u0108\u0109\78\2\2\u0109\u010b\7\62\2\2\u010a\u0106\3\2"
            + "\2\2\u010a\u0108\3\2\2\2\u010b\u0112\3\2\2\2\u010c\u010e\5O(\2\u010d\u010f"
            + "\t\3\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110"
            + "\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u0113\3\2"
            + "\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\\\2\2\u0115\u0116\5K&\2\u0116\24"
            + "\3\2\2\2\u0117\u0118\7C\2\2\u0118\u0119\7P\2\2\u0119\u011a\7F\2\2\u011a"
            + "\26\3\2\2\2\u011b\u011c\7Q\2\2\u011c\u011d\7T\2\2\u011d\30\3\2\2\2\u011e"
            + "\u011f\7P\2\2\u011f\u0120\7Q\2\2\u0120\u0121\7V\2\2\u0121\32\3\2\2\2\u0122"
            + "\u0123\7H\2\2\u0123\u0124\7Q\2\2\u0124\u0125\7N\2\2\u0125\u0126\7N\2\2"
            + "\u0126\u0127\7Q\2\2\u0127\u0128\7Y\2\2\u0128\u0129\7G\2\2\u0129\u012a"
            + "\7F\2\2\u012a\u012b\7D\2\2\u012b\u012c\7[\2\2\u012c\34\3\2\2\2\u012d\u012e"
            + "\7N\2\2\u012e\u012f\7K\2\2\u012f\u0130\7M\2\2\u0130\u0131\7G\2\2\u0131"
            + "\36\3\2\2\2\u0132\u0133\7O\2\2\u0133\u0134\7C\2\2\u0134\u0135\7V\2\2\u0135"
            + "\u0136\7E\2\2\u0136\u0137\7J\2\2\u0137\u0138\7G\2\2\u0138\u0139\7U\2\2"
            + "\u0139 \3\2\2\2\u013a\u013b\7K\2\2\u013b\u013c\7U\2\2\u013c\u013d\7U\2"
            + "\2\u013d\u013e\7W\2\2\u013e\u013f\7R\2\2\u013f\u0140\7G\2\2\u0140\u0141"
            + "\7T\2\2\u0141\u0142\7U\2\2\u0142\u0143\7G\2\2\u0143\u0144\7V\2\2\u0144"
            + "\"\3\2\2\2\u0145\u0146\7K\2\2\u0146\u0147\7U\2\2\u0147\u0148\7U\2\2\u0148"
            + "\u0149\7W\2\2\u0149\u014a\7D\2\2\u014a\u014b\7U\2\2\u014b\u014c\7G\2\2"
            + "\u014c\u014d\7V\2\2\u014d$\3\2\2\2\u014e\u014f\7G\2\2\u014f\u0150\7Z\2"
            + "\2\u0150\u0151\7K\2\2\u0151\u0152\7U\2\2\u0152\u0153\7V\2\2\u0153\u0154"
            + "\7U\2\2\u0154&\3\2\2\2\u0155\u0156\7N\2\2\u0156\u0157\7C\2\2\u0157\u0158"
            + "\7U\2\2\u0158\u0159\7V\2\2\u0159(\3\2\2\2\u015a\u015b\7K\2\2\u015b\u015c"
            + "\7P\2\2\u015c*\3\2\2\2\u015d\u015e\7U\2\2\u015e\u015f\7V\2\2\u015f\u0160"
            + "\7C\2\2\u0160\u0161\7T\2\2\u0161\u0162\7V\2\2\u0162,\3\2\2\2\u0163\u0164"
            + "\7U\2\2\u0164\u0165\7V\2\2\u0165\u0166\7Q\2\2\u0166\u0167\7R\2\2\u0167"
            + ".\3\2\2\2\u0168\u0169\7U\2\2\u0169\u016a\7G\2\2\u016a\u016b\7E\2\2\u016b"
            + "\u016c\7Q\2\2\u016c\u016d\7P\2\2\u016d\u016e\7F\2\2\u016e\u016f\7U\2\2"
            + "\u016f\60\3\2\2\2\u0170\u0171\7v\2\2\u0171\u0172\7t\2\2\u0172\u0173\7"
            + "w\2\2\u0173\u0174\7g\2\2\u0174\62\3\2\2\2\u0175\u0176\7h\2\2\u0176\u0177"
            + "\7c\2\2\u0177\u0178\7n\2\2\u0178\u0179\7u\2\2\u0179\u017a\7g\2\2\u017a"
            + "\64\3\2\2\2\u017b\u017c\7Y\2\2\u017c\u017d\7K\2\2\u017d\u017e\7V\2\2\u017e"
            + "\u017f\7J\2\2\u017f\u0180\7K\2\2\u0180\u0181\7P\2\2\u0181\66\3\2\2\2\u0182"
            + "\u0183\7T\2\2\u0183\u0184\7G\2\2\u0184\u0185\7R\2\2\u0185\u0186\7G\2\2"
            + "\u0186\u0187\7C\2\2\u0187\u0188\7V\2\2\u0188\u0189\7U\2\2\u01898\3\2\2"
            + "\2\u018a\u018b\7V\2\2\u018b\u018c\7K\2\2\u018c\u018d\7O\2\2\u018d\u018e"
            + "\7G\2\2\u018e\u018f\7U\2\2\u018f:\3\2\2\2\u0190\u0194\t\n\2\2\u0191\u0193"
            + "\t\13\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2"
            + "\u0194\u0195\3\2\2\2\u0195<\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019b\t"
            + "\n\2\2\u0198\u019a\t\f\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b"
            + "\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c>\3\2\2\2\u019d\u019b\3\2\2\2"
            + "\u019e\u01a2\7?\2\2\u019f\u01a0\7?\2\2\u01a0\u01a2\7?\2\2\u01a1\u019e"
            + "\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2@\3\2\2\2\u01a3\u01a4\7#\2\2\u01a4\u01a8"
            + "\7?\2\2\u01a5\u01a6\7>\2\2\u01a6\u01a8\7@\2\2\u01a7\u01a3\3\2\2\2\u01a7"
            + "\u01a5\3\2\2\2\u01a8B\3\2\2\2\u01a9\u01aa\7>\2\2\u01aaD\3\2\2\2\u01ab"
            + "\u01ac\7>\2\2\u01ac\u01ad\7?\2\2\u01adF\3\2\2\2\u01ae\u01af\7@\2\2\u01af"
            + "H\3\2\2\2\u01b0\u01b1\7@\2\2\u01b1\u01b2\7?\2\2\u01b2J\3\2\2\2\u01b3\u01b4"
            + "\7)\2\2\u01b4L\3\2\2\2\u01b5\u01b6\7<\2\2\u01b6N\3\2\2\2\u01b7\u01b8\7"
            + "\60\2\2\u01b8P\3\2\2\2\u01b9\u01ba\7.\2\2\u01baR\3\2\2\2\u01bb\u01bc\7"
            + "+\2\2\u01bcT\3\2\2\2\u01bd\u01be\7*\2\2\u01beV\3\2\2\2\u01bf\u01c0\7_"
            + "\2\2\u01c0X\3\2\2\2\u01c1\u01c2\7]\2\2\u01c2Z\3\2\2\2\u01c3\u01c4\7-\2"
            + "\2\u01c4\\\3\2\2\2\u01c5\u01c6\5_\60\2\u01c6^\3\2\2\2\u01c7\u01c8\7/\2"
            + "\2\u01c8`\3\2\2\2\u01c9\u01ca\7`\2\2\u01cab\3\2\2\2\u01cb\u01cc\7\61\2"
            + "\2\u01ccd\3\2\2\2\u01cd\u01ce\7,\2\2\u01cef\3\2\2\2\u01cf\u01d0\t\r\2"
            + "\2\u01d0h\3\2\2\2\u01d1\u01d2\5g\64\2\u01d2\u01d3\5g\64\2\u01d3j\3\2\2"
            + "\2\u01d4\u01d5\t\16\2\2\u01d5l\3\2\2\2\u01d6\u01d8\t\17\2\2\u01d7\u01d6"
            + "\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"
            + "\u01db\3\2\2\2\u01db\u01dc\b\67\2\2\u01dcn\3\2\2\2\u01dd\u01de\7\61\2"
            + "\2\u01de\u01df\7,\2\2\u01df\u01e3\3\2\2\2\u01e0\u01e2\13\2\2\2\u01e1\u01e0"
            + "\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4"
            + "\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7,\2\2\u01e7\u01e8\7\61"
            + "\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\b8\2\2\u01eap\3\2\2\2\u01eb\u01ec"
            + "\7\61\2\2\u01ec\u01ed\7\61\2\2\u01ed\u01f1\3\2\2\2\u01ee\u01f0\n\20\2"
            + "\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2"
            + "\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\b9\2\2\u01f5"
            + "r\3\2\2\2\u01f6\u01f7\13\2\2\2\u01f7t\3\2\2\2 \2{~\u0081\u0088\u008b\u0091"
            + "\u0098\u009b\u00a0\u00a7\u00ae\u00bc\u00d0\u00da\u00dc\u00e3\u00f0\u00f9"
            + "\u0100\u010a\u0110\u0112\u0194\u019b\u01a1\u01a7\u01d9\u01e3\u01f1\3\b"
            + "\2\2";
    public static final ATN _ATN
            = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
