// $ANTLR ${project.version} ${buildNumber}

	package org.reuseware.air.language.abstractsyntax.resource.as.mopp;


import org.antlr.runtime3_2_0.*;

public class AsLexer extends Lexer {
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=8;
    public static final int TEXT=4;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int QNAME=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int QUOTED_60_62=5;
    public static final int COMMENT=7;
    public static final int LINEBREAK=9;

    	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
    	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
    	
    	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public AsLexer() {;} 
    public AsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "As.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:16:7: ( 'ABSTRACTSYNTAX' )
            // As.g:16:9: 'ABSTRACTSYNTAX'
            {
            match("ABSTRACTSYNTAX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:17:7: ( 'URI' )
            // As.g:17:9: 'URI'
            {
            match("URI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:18:7: ( 'PREFIX' )
            // As.g:18:9: 'PREFIX'
            {
            match("PREFIX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:19:7: ( 'IMPORT' )
            // As.g:19:9: 'IMPORT'
            {
            match("IMPORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:20:7: ( ',' )
            // As.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:21:7: ( 'AS' )
            // As.g:21:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:22:7: ( '==>' )
            // As.g:22:9: '==>'
            {
            match("==>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:23:7: ( '=' )
            // As.g:23:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:24:7: ( ';' )
            // As.g:24:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:25:7: ( '|' )
            // As.g:25:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:26:7: ( '@' )
            // As.g:26:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:27:7: ( ':' )
            // As.g:27:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:28:7: ( '::' )
            // As.g:28:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:29:7: ( '->' )
            // As.g:29:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:30:7: ( '+' )
            // As.g:30:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:31:7: ( '*' )
            // As.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:32:7: ( '?' )
            // As.g:32:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:2131:8: ( '%' (~ ( '\\n' | '\\r' ) )* )
            // As.g:2132:2: '%' (~ ( '\\n' | '\\r' ) )*
            {
            match('%'); 
            // As.g:2132:5: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // As.g:2132:6: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:2134:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )* )
            // As.g:2135:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // As.g:2135:25: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // As.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "QNAME"
    public final void mQNAME() throws RecognitionException {
        try {
            int _type = QNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:2136:6: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' )+ ( '.' ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '0' .. '9' )+ )+ )
            // As.g:2137:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )+ ( '.' ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '0' .. '9' )+ )+
            {
            // As.g:2137:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // As.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // As.g:2137:26: ( '.' ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '0' .. '9' )+ )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // As.g:2137:27: '.' ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '0' .. '9' )+
            	    {
            	    match('.'); 
            	    // As.g:2137:30: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '0' .. '9' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // As.g:
            	    	    {
            	    	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QNAME"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:2138:11: ( ( ' ' | '\\t' | '\\f' ) )
            // As.g:2139:2: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:2142:10: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // As.g:2143:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // As.g:2143:2: ( '\\r\\n' | '\\r' | '\\n' )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='\n') ) {
                    alt6=1;
                }
                else {
                    alt6=2;}
            }
            else if ( (LA6_0=='\n') ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // As.g:2143:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // As.g:2143:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // As.g:2143:15: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "QUOTED_60_62"
    public final void mQUOTED_60_62() throws RecognitionException {
        try {
            int _type = QUOTED_60_62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // As.g:2146:13: ( ( '<' ) (~ ( '>' ) )* ( '>' ) )
            // As.g:2147:2: ( '<' ) (~ ( '>' ) )* ( '>' )
            {
            // As.g:2147:2: ( '<' )
            // As.g:2147:3: '<'
            {
            match('<'); 

            }

            // As.g:2147:7: (~ ( '>' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='=')||(LA7_0>='?' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // As.g:2147:8: ~ ( '>' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // As.g:2147:16: ( '>' )
            // As.g:2147:17: '>'
            {
            match('>'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_60_62"

    public void mTokens() throws RecognitionException {
        // As.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | COMMENT | TEXT | QNAME | WHITESPACE | LINEBREAK | QUOTED_60_62 )
        int alt8=23;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // As.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // As.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // As.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // As.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // As.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // As.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // As.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // As.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // As.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // As.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // As.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // As.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // As.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // As.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // As.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // As.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // As.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // As.g:1:112: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 19 :
                // As.g:1:120: TEXT
                {
                mTEXT(); 

                }
                break;
            case 20 :
                // As.g:1:125: QNAME
                {
                mQNAME(); 

                }
                break;
            case 21 :
                // As.g:1:131: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 22 :
                // As.g:1:142: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 23 :
                // As.g:1:152: QUOTED_60_62
                {
                mQUOTED_60_62(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\4\30\1\uffff\1\35\3\uffff\1\37\5\uffff\1\30\3\uffff\1"+
        "\30\1\41\1\uffff\1\30\1\uffff\3\30\4\uffff\1\30\1\uffff\1\46\3\30"+
        "\1\uffff\6\30\1\60\1\61\1\30\2\uffff\6\30\1\71\1\uffff";
    static final String DFA8_eofS =
        "\72\uffff";
    static final String DFA8_minS =
        "\1\11\4\56\1\uffff\1\75\3\uffff\1\72\5\uffff\1\56\3\uffff\2\56"+
        "\1\uffff\1\56\1\uffff\3\56\4\uffff\1\56\1\uffff\4\56\1\uffff\11"+
        "\56\2\uffff\7\56\1\uffff";
    static final String DFA8_maxS =
        "\1\174\4\172\1\uffff\1\75\3\uffff\1\72\5\uffff\1\172\3\uffff\2"+
        "\172\1\uffff\1\172\1\uffff\3\172\4\uffff\1\172\1\uffff\4\172\1\uffff"+
        "\11\172\2\uffff\7\172\1\uffff";
    static final String DFA8_acceptS =
        "\5\uffff\1\5\1\uffff\1\11\1\12\1\13\1\uffff\1\16\1\17\1\20\1\21"+
        "\1\22\1\uffff\1\25\1\26\1\27\2\uffff\1\24\1\uffff\1\23\3\uffff\1"+
        "\7\1\10\1\15\1\14\1\uffff\1\6\4\uffff\1\2\11\uffff\1\3\1\4\7\uffff"+
        "\1\1";
    static final String DFA8_specialS =
        "\72\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\21\1\22\1\uffff\1\21\1\22\22\uffff\1\21\4\uffff\1\17\4\uffff"+
            "\1\15\1\14\1\5\1\13\14\uffff\1\12\1\7\1\23\1\6\1\uffff\1\16"+
            "\1\11\1\1\7\20\1\4\6\20\1\3\4\20\1\2\5\20\4\uffff\1\20\1\uffff"+
            "\32\20\1\uffff\1\10",
            "\1\26\22\uffff\1\27\1\24\20\27\1\25\7\27\4\uffff\1\27\1\uffff"+
            "\32\27",
            "\1\26\22\uffff\21\27\1\31\10\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\21\27\1\32\10\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\14\27\1\33\15\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\34",
            "",
            "",
            "",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "\1\26\22\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\1\26\22\uffff\22\27\1\40\7\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\1\uffff\12\30\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "\1\26\22\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\26\22\uffff\10\27\1\42\21\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\4\27\1\43\25\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\17\27\1\44\12\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "\1\26\22\uffff\23\27\1\45\6\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\26\1\uffff\12\30\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\26\22\uffff\5\27\1\47\24\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\16\27\1\50\13\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\21\27\1\51\10\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\26\22\uffff\10\27\1\52\21\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\21\27\1\53\10\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\1\54\31\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\27\27\1\55\2\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\23\27\1\56\6\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\2\27\1\57\27\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\1\uffff\12\30\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\26\1\uffff\12\30\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\26\22\uffff\23\27\1\62\6\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\26\22\uffff\22\27\1\63\7\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\30\27\1\64\1\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\15\27\1\65\14\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\23\27\1\66\6\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\1\67\31\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\22\uffff\27\27\1\70\2\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\1\uffff\12\30\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | COMMENT | TEXT | QNAME | WHITESPACE | LINEBREAK | QUOTED_60_62 );";
        }
    }
 

}