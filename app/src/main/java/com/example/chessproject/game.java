package com.example.chessproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class game extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button square11button = findViewById(R.id.square00);
        Button square12button = findViewById(R.id.square01);
        Button square13button = findViewById(R.id.square02);
        Button square14button = findViewById(R.id.square03);
        Button square15button = findViewById(R.id.square04);
        Button square16button = findViewById(R.id.square05);
        Button square17button = findViewById(R.id.square06);
        Button square18button = findViewById(R.id.square07);

        Button square21button = findViewById(R.id.square10);
        Button square22button = findViewById(R.id.square11);
        Button square23button = findViewById(R.id.square12);
        Button square24button = findViewById(R.id.square13);
        Button square25button = findViewById(R.id.square14);
        Button square26button = findViewById(R.id.square15);
        Button square27button = findViewById(R.id.square16);
        Button square28button = findViewById(R.id.square17);

        Button square31button = findViewById(R.id.square20);
        Button square32button = findViewById(R.id.square21);
        Button square33button = findViewById(R.id.square22);
        Button square34button = findViewById(R.id.square23);
        Button square35button = findViewById(R.id.square24);
        Button square36button = findViewById(R.id.square25);
        Button square37button = findViewById(R.id.square26);
        Button square38button = findViewById(R.id.square27);

        Button square41button = findViewById(R.id.square30);
        Button square42button = findViewById(R.id.square31);
        Button square43button = findViewById(R.id.square32);
        Button square44button = findViewById(R.id.square33);
        Button square45button = findViewById(R.id.square34);
        Button square46button = findViewById(R.id.square35);
        Button square47button = findViewById(R.id.square36);
        Button square48button = findViewById(R.id.square37);

        Button square51button = findViewById(R.id.square40);
        Button square52button = findViewById(R.id.square41);
        Button square53button = findViewById(R.id.square42);
        Button square54button = findViewById(R.id.square43);
        Button square55button = findViewById(R.id.square44);
        Button square56button = findViewById(R.id.square45);
        Button square57button = findViewById(R.id.square46);
        Button square58button = findViewById(R.id.square47);

        Button square61button = findViewById(R.id.square50);
        Button square62button = findViewById(R.id.square51);
        Button square63button = findViewById(R.id.square52);
        Button square64button = findViewById(R.id.square53);
        Button square65button = findViewById(R.id.square54);
        Button square66button = findViewById(R.id.square55);
        Button square67button = findViewById(R.id.square56);
        Button square68button = findViewById(R.id.square57);

        Button square71button = findViewById(R.id.square60);
        Button square72button = findViewById(R.id.square61);
        Button square73button = findViewById(R.id.square62);
        Button square74button = findViewById(R.id.square63);
        Button square75button = findViewById(R.id.square64);
        Button square76button = findViewById(R.id.square65);
        Button square77button = findViewById(R.id.square66);
        Button square78button = findViewById(R.id.square67);

        Button square81button = findViewById(R.id.square70);
        Button square82button = findViewById(R.id.square71);
        Button square83button = findViewById(R.id.square72);
        Button square84button = findViewById(R.id.square73);
        Button square85button = findViewById(R.id.square74);
        Button square86button = findViewById(R.id.square75);
        Button square87button = findViewById(R.id.square76);
        Button square88button = findViewById(R.id.square77);

        square11button.setOnClickListener(this);
        square12button.setOnClickListener(this);
        square13button.setOnClickListener(this);
        square14button.setOnClickListener(this);
        square15button.setOnClickListener(this);
        square16button.setOnClickListener(this);
        square17button.setOnClickListener(this);
        square18button.setOnClickListener(this);

        square21button.setOnClickListener(this);
        square22button.setOnClickListener(this);
        square23button.setOnClickListener(this);
        square24button.setOnClickListener(this);
        square25button.setOnClickListener(this);
        square26button.setOnClickListener(this);
        square27button.setOnClickListener(this);
        square28button.setOnClickListener(this);

        square31button.setOnClickListener(this);
        square32button.setOnClickListener(this);
        square33button.setOnClickListener(this);
        square34button.setOnClickListener(this);
        square35button.setOnClickListener(this);
        square36button.setOnClickListener(this);
        square37button.setOnClickListener(this);
        square38button.setOnClickListener(this);

        square41button.setOnClickListener(this);
        square42button.setOnClickListener(this);
        square43button.setOnClickListener(this);
        square44button.setOnClickListener(this);
        square45button.setOnClickListener(this);
        square46button.setOnClickListener(this);
        square47button.setOnClickListener(this);
        square48button.setOnClickListener(this);

        square51button.setOnClickListener(this);
        square52button.setOnClickListener(this);
        square53button.setOnClickListener(this);
        square54button.setOnClickListener(this);
        square55button.setOnClickListener(this);
        square56button.setOnClickListener(this);
        square57button.setOnClickListener(this);
        square58button.setOnClickListener(this);

        square61button.setOnClickListener(this);
        square62button.setOnClickListener(this);
        square63button.setOnClickListener(this);
        square64button.setOnClickListener(this);
        square65button.setOnClickListener(this);
        square66button.setOnClickListener(this);
        square67button.setOnClickListener(this);
        square68button.setOnClickListener(this);

        square71button.setOnClickListener(this);
        square72button.setOnClickListener(this);
        square73button.setOnClickListener(this);
        square74button.setOnClickListener(this);
        square75button.setOnClickListener(this);
        square76button.setOnClickListener(this);
        square77button.setOnClickListener(this);
        square78button.setOnClickListener(this);

        square81button.setOnClickListener(this);
        square82button.setOnClickListener(this);
        square83button.setOnClickListener(this);
        square84button.setOnClickListener(this);
        square85button.setOnClickListener(this);
        square86button.setOnClickListener(this);
        square87button.setOnClickListener(this);
        square88button.setOnClickListener(this);

    }

    static int kingPositionC = 59; //tracks white king position
    static int kingPositionL = 3; //tracks black king position
    static int kingWMoves = 0; //tracks number of white king moves
    static int kingBMoves = 0; //tracks number of black king moves
    static int BCastleFlag = 0;
    static int WCastleFlag = 0;

    //always keeps track of king position to evaluate check
    public static void main(String[] args) {
        while (!"A".equals(chessBoard[kingPositionC / 8][kingPositionC % 8])) {
            kingPositionC++;
        }
        while (!"a".equals(chessBoard[kingPositionL / 8][kingPositionL % 8])) {
            kingPositionL++;
        }
    }

    static String attemptedMove = "";
    View prev;
    static int moveConstructor = 0;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View v) {
        String moveList = "";
        attemptedMove += v.getResources().getResourceName(v.getId()).substring(34);
        if (moveConstructor == 1) {
            moveList = WpossibleMoves();
            System.out.println("White moves: " + moveList);
            if (moveList.contains(attemptedMove + "U")) {
                attemptedMove += "U";
                WmakeMove(attemptedMove);
                v.setForeground(getResources().getDrawable(R.drawable.white_queen));
                prev.setForeground(getResources().getDrawable(R.drawable.blank2));
                String checkmateCheck = WpossibleMoves();
                if (checkmateCheck.length() == 0) {
                    moveConstructor=0;
                    Intent intent = new Intent(game.this, end_screen.class);
                    startActivity(intent);
                }
                moveConstructor++;
                attemptedMove = "";
            } else if (moveList.contains(attemptedMove)) {
                attemptedMove += " ";
                if ("7371 ".equals(attemptedMove)) { //castle
                    WmakeMove("7371 ");
                    WmakeMove("7072 ");
                    findViewById(R.id.square70).setForeground(getResources().getDrawable(R.drawable.blank2));
                    findViewById(R.id.square71).setForeground(getResources().getDrawable(R.drawable.white_king));
                    findViewById(R.id.square72).setForeground(getResources().getDrawable(R.drawable.white_rook));
                    findViewById(R.id.square73).setForeground(getResources().getDrawable(R.drawable.blank2));
                    WCastleFlag = 1;
                } else {
                    WmakeMove(attemptedMove);
                    if (" ".equals(chessBoard[7][0])) {
                        WCastleFlag = 1;
                    }
                    v.setForeground(prev.getForeground());
                    prev.setForeground(getResources().getDrawable(R.drawable.blank2));
                }
                String checkmateCheck = BpossibleMoves();
                if (checkmateCheck.length() == 0) {
                    moveConstructor=0;
                    Intent intent = new Intent(game.this, end_screen.class);
                    startActivity(intent);
                }
                moveConstructor++;
                attemptedMove = "";
            } else {
                moveConstructor = 0;
                attemptedMove = "";
            }
            attemptedMove = "";
        } else if (moveConstructor == 3) {
            moveList = BpossibleMoves();
            System.out.println("Black moves: " + moveList);
            if (moveList.contains(attemptedMove + "u")){
                attemptedMove += "u";
                BmakeMove(attemptedMove);
                v.setForeground(getResources().getDrawable(R.drawable.black_queen));
                prev.setForeground(getResources().getDrawable(R.drawable.blank2));
                String checkmateCheck = WpossibleMoves();
                if (checkmateCheck.length() == 0) {
                    moveConstructor=0;
                    Intent intent = new Intent(game.this, end_screen.class);
                    startActivity(intent);
                }
                moveConstructor = 0;
                attemptedMove = "";
            } else if (moveList.contains(attemptedMove)) {
                attemptedMove += " ";
                if ("0301 ".equals(attemptedMove)) { //castle
                    BmakeMove("0301 ");
                    BmakeMove("0002 ");
                    findViewById(R.id.square00).setForeground(getResources().getDrawable(R.drawable.blank2));
                    findViewById(R.id.square01).setForeground(getResources().getDrawable(R.drawable.black_king));
                    findViewById(R.id.square02).setForeground(getResources().getDrawable(R.drawable.black_rook));
                    findViewById(R.id.square03).setForeground(getResources().getDrawable(R.drawable.blank2));
                    BCastleFlag = 1;
                } else {
                    BmakeMove(attemptedMove);
                    if (" ".equals(chessBoard[0][0])) {
                        BCastleFlag = 1;
                    }
                    v.setForeground(prev.getForeground());
                    prev.setForeground(getResources().getDrawable(R.drawable.blank2));
                }
                String checkmateCheck = WpossibleMoves();
                if (checkmateCheck.length() == 0) {
                    moveConstructor=0;
                    Intent intent = new Intent(game.this, end_screen.class);
                    startActivity(intent);
                }
                moveConstructor = 0;
                attemptedMove = "";
            } else {
                moveConstructor = 2;
                attemptedMove = "";
            }

        } else {
            moveConstructor++;
            prev = v;
        }
    }



    /* Chess board represented by string matrix
    Uppercase = white pieces
    lowercase = black pieces
    A represents king

     The string board changes with the one displayed to the user
     Using the string board for the actual chess engine and then updating the interface saves a lot of time and annoying code
     */

    static String chessBoard[][]={
            {"r","k","b","a","q","b","k","r"},
            {"p","p","p","p","p","p","p","p"},
            {" "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "},
            {"P","P","P","P","P","P","P","P"},
            {"R","K","B","A","Q","B","K","R"}};

    //makeMove changes the string matrix chessBoard to represent the move made
    //makes move for white pieces
    public void WmakeMove(String move){
        if (move.charAt(4) != 'U') {
            //move format: x1 y1 x2 y2 capturedPiece
            chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))] = chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))];
            chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))] = " ";

            if("A".equals(chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))])) {
                kingPositionC=8*Character.getNumericValue(move.charAt(2))+Character.getNumericValue(move.charAt(3));
                kingWMoves++;
            }
        } else { //if pawn promotion
            chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))] = "Q";
            chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))] = " ";
        }
    }

    //makeMove changes the string matrix chessBoard to represent the move made
    //makes move for black pieces
    public static void BmakeMove(String move){
        if (move.charAt(4) != 'u') {
            //move format: x1 y1 x2 y2 capturedPiece
            chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))] = chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))];
            chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))] = " ";

            if("a".equals(chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))])) {
                kingPositionL=8*Character.getNumericValue(move.charAt(2))+Character.getNumericValue(move.charAt(3));
                kingBMoves++;
            }
        } else { //if pawn promotion
            chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))] = "q";
            chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))] = " ";
        }
    }

    //searches through every square on the board
    //returns a list of strings containing every possible move for the white player
    //move format: row1 col1 row2 col2 pieceCaptured (pieceCaptured is " " if moving to a blank space
    public static String WpossibleMoves() {
        String list="";
        for (int i=0; i<64; i++) {
            switch (chessBoard[i/8][i%8]) {
                case "P": list+=possibleP(i);
                    break;
                case "R": list+=possibleR(i);
                    break;
                case "K": list+=possibleK(i);
                    break;
                case "B": list+=possibleB(i);
                    break;
                case "Q": list+=possibleQ(i);
                    break;
                case "A": list+=possibleA(i);
                    break;
            }
        }
        return list;//x1,y1,x2,y2,captured piece
    }

    //returns all possible moves for the black player
    public static String BpossibleMoves() {
        String list="";
        for (int i=0; i<64; i++) {
            switch (chessBoard[i/8][i%8]) {
                case "p": list+=possiblep(i);
                    break;
                case "r": list+=possibler(i);
                    break;
                case "k": list+=possiblek(i);
                    break;
                case "b": list+=possibleb(i);
                    break;
                case "q": list+=possibleq(i);
                    break;
                case "a": list+=possiblea(i);
                    break;
            }
        }
        return list;//x1,y1,x2,y2,captured piece
    }

    //possible moves for white pawns
    public static String possibleP(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        for (int j=-1; j<=1; j+=2) {
            try {//capture
                if (Character.isLowerCase(chessBoard[r-1][c+j].charAt(0))) {
                    oldPiece=chessBoard[r-1][c+j];
                    chessBoard[r][c]=" ";
                    chessBoard[r-1][c+j]="P";
                    if (WkingSafe()) {
                        list=list+r+c+(r-1)+(c+j);
                        if (r-1 == 0) {
                            list += "U";
                        } else {
                            list += " ";
                        }
                    }
                    chessBoard[r][c]="P";
                    chessBoard[r-1][c+j]=oldPiece;
                }
            } catch (Exception e) {}
        }
        try {//move one up
            if (" ".equals(chessBoard[r-1][c])) {
                oldPiece=chessBoard[r-1][c];
                chessBoard[r][c]=" ";
                chessBoard[r-1][c]="P";
                if (WkingSafe()) {
                    list=list+r+c+(r-1)+c;
                    if (r-1 == 0) {
                        list += "U";
                    } else {
                        list += " ";
                    }
                }
                chessBoard[r][c]="P";
                chessBoard[r-1][c]=oldPiece;
            }
        } catch (Exception e) {}
        try {//move two up
            if (" ".equals(chessBoard[r-1][c]) && " ".equals(chessBoard[r-2][c]) && i>=48) {
                oldPiece=chessBoard[r-2][c];
                chessBoard[r][c]=" ";
                chessBoard[r-2][c]="P";
                if (WkingSafe()) {
                    list=list+r+c+(r-2)+c+oldPiece;
                }
                chessBoard[r][c]="P";
                chessBoard[r-2][c]=oldPiece;
            }
        } catch (Exception e) {}
        return list;
    }

    //possible moves for black pawns
    public static String possiblep(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        for (int j=-1; j<=1; j+=2) {
            try {//capture
                if (Character.isUpperCase(chessBoard[r+1][c+j].charAt(0))) {
                    oldPiece=chessBoard[r+1][c+j];
                    chessBoard[r][c]=" ";
                    chessBoard[r+1][c+j]="p";
                    if (BkingSafe()) {
                        list=list+r+c+(r+1)+(c+j);
                        if (r+1 == 7) {
                            list += "u";
                        } else {
                            list += " ";
                        }
                    }
                    chessBoard[r][c]="p";
                    chessBoard[r+1][c+j]=oldPiece;
                }
            } catch (Exception e) {}
        }
        try {//move one up
            if (" ".equals(chessBoard[r+1][c])) {
                oldPiece=chessBoard[r+1][c];
                chessBoard[r][c]=" ";
                chessBoard[r+1][c]="p";
                if (BkingSafe()) {
                    list=list+r+c+(r+1)+c;
                    if (r+1 == 7) {
                        list += "u";
                    } else {
                        list += " ";
                    }
                }
                chessBoard[r][c]="p";
                chessBoard[r+1][c]=oldPiece;
            }
        } catch (Exception e) {}
        try {//move two up
            if (" ".equals(chessBoard[r+1][c]) && " ".equals(chessBoard[r+2][c]) && i<=15) {
                oldPiece=chessBoard[r+2][c];
                chessBoard[r][c]=" ";
                chessBoard[r+2][c]="p";
                if (BkingSafe()) {
                    list=list+r+c+(r+2)+c+oldPiece;
                }
                chessBoard[r][c]="p";
                chessBoard[r+2][c]=oldPiece;
            }
        } catch (Exception e) {}
        return list;
    }

    //possible moves for white rook
    public static String possibleR(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        int temp=1;
        for (int j=-1; j<=1; j+=2) {
            try {
                while(" ".equals(chessBoard[r][c+temp*j]))
                {
                    oldPiece=chessBoard[r][c+temp*j];
                    chessBoard[r][c]=" ";
                    chessBoard[r][c+temp*j]="R";
                    if (WkingSafe()) {
                        list=list+r+c+r+(c+temp*j)+oldPiece;
                    }
                    chessBoard[r][c]="R";
                    chessBoard[r][c+temp*j]=oldPiece;
                    temp++;
                }
                if (Character.isLowerCase(chessBoard[r][c+temp*j].charAt(0))) {
                    oldPiece=chessBoard[r][c+temp*j];
                    chessBoard[r][c]=" ";
                    chessBoard[r][c+temp*j]="R";
                    if (WkingSafe()) {
                        list=list+r+c+r+(c+temp*j)+oldPiece;
                    }
                    chessBoard[r][c]="R";
                    chessBoard[r][c+temp*j]=oldPiece;
                }
            } catch (Exception e) {}
            temp=1;
            try {
                while(" ".equals(chessBoard[r+temp*j][c]))
                {
                    oldPiece=chessBoard[r+temp*j][c];
                    chessBoard[r][c]=" ";
                    chessBoard[r+temp*j][c]="R";
                    if (WkingSafe()) {
                        list=list+r+c+(r+temp*j)+c+oldPiece;
                    }
                    chessBoard[r][c]="R";
                    chessBoard[r+temp*j][c]=oldPiece;
                    temp++;
                }
                if (Character.isLowerCase(chessBoard[r+temp*j][c].charAt(0))) {
                    oldPiece=chessBoard[r+temp*j][c];
                    chessBoard[r][c]=" ";
                    chessBoard[r+temp*j][c]="R";
                    if (WkingSafe()) {
                        list=list+r+c+(r+temp*j)+c+oldPiece;
                    }
                    chessBoard[r][c]="R";
                    chessBoard[r+temp*j][c]=oldPiece;
                }
            } catch (Exception e) {}
            temp=1;
        }
        return list;
    }

    //possible moves for black rook
    public static String possibler(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        int temp=1;
        for (int j=-1; j<=1; j+=2) {
            try {
                while(" ".equals(chessBoard[r][c+temp*j]))
                {
                    oldPiece=chessBoard[r][c+temp*j];
                    chessBoard[r][c]=" ";
                    chessBoard[r][c+temp*j]="r";
                    if (BkingSafe()) {
                        list=list+r+c+r+(c+temp*j)+oldPiece;
                    }
                    chessBoard[r][c]="r";
                    chessBoard[r][c+temp*j]=oldPiece;
                    temp++;
                }
                if (Character.isUpperCase(chessBoard[r][c+temp*j].charAt(0))) {
                    oldPiece=chessBoard[r][c+temp*j];
                    chessBoard[r][c]=" ";
                    chessBoard[r][c+temp*j]="r";
                    if (BkingSafe()) {
                        list=list+r+c+r+(c+temp*j)+oldPiece;
                    }
                    chessBoard[r][c]="r";
                    chessBoard[r][c+temp*j]=oldPiece;
                }
            } catch (Exception e) {}
            temp=1;
            try {
                while(" ".equals(chessBoard[r+temp*j][c]))
                {
                    oldPiece=chessBoard[r+temp*j][c];
                    chessBoard[r][c]=" ";
                    chessBoard[r+temp*j][c]="r";
                    if (BkingSafe()) {
                        list=list+r+c+(r+temp*j)+c+oldPiece;
                    }
                    chessBoard[r][c]="r";
                    chessBoard[r+temp*j][c]=oldPiece;
                    temp++;
                }
                if (Character.isUpperCase(chessBoard[r+temp*j][c].charAt(0))) {
                    oldPiece=chessBoard[r+temp*j][c];
                    chessBoard[r][c]=" ";
                    chessBoard[r+temp*j][c]="r";
                    if (BkingSafe()) {
                        list=list+r+c+(r+temp*j)+c+oldPiece;
                    }
                    chessBoard[r][c]="r";
                    chessBoard[r+temp*j][c]=oldPiece;
                }
            } catch (Exception e) {}
            temp=1;
        }
        return list;
    }


    //possible moves for white knight
    public static String possibleK(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        for (int j=-1; j<=1; j+=2) {
            for (int k=-1; k<=1; k+=2) {
                try {
                    if (Character.isLowerCase(chessBoard[r+j][c+k*2].charAt(0)) || " ".equals(chessBoard[r+j][c+k*2])) {
                        oldPiece=chessBoard[r+j][c+k*2];
                        chessBoard[r+j][c+k*2] = "K";
                        chessBoard[r][c]=" ";
                        if (WkingSafe()) {
                            list=list+r+c+(r+j)+(c+k*2)+oldPiece;
                        }
                        chessBoard[r][c]="K";
                        chessBoard[r+j][c+k*2]=oldPiece;
                    }
                } catch (Exception e) {}
                try {
                    if (Character.isLowerCase(chessBoard[r+j*2][c+k].charAt(0)) || " ".equals(chessBoard[r+j*2][c+k])) {
                        oldPiece=chessBoard[r+j*2][c+k];
                        chessBoard[r+j*2][c+k] = "K";
                        chessBoard[r][c]=" ";
                        if (WkingSafe()) {
                            list=list+r+c+(r+j*2)+(c+k)+oldPiece;
                        }
                        chessBoard[r][c]="K";
                        chessBoard[r+j*2][c+k]=oldPiece;
                    }
                } catch (Exception e) {}
            }
        }
        return list;
    }

    //possible moves for black knight
    public static String possiblek(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        for (int j=-1; j<=1; j+=2) {
            for (int k=-1; k<=1; k+=2) {
                try {
                    if (Character.isUpperCase(chessBoard[r+j][c+k*2].charAt(0)) || " ".equals(chessBoard[r+j][c+k*2])) {
                        oldPiece=chessBoard[r+j][c+k*2];
                        chessBoard[r+j][c+k*2] = "k";
                        chessBoard[r][c]=" ";
                        if (BkingSafe()) {
                            list=list+r+c+(r+j)+(c+k*2)+oldPiece;
                        }
                        chessBoard[r][c]="k";
                        chessBoard[r+j][c+k*2]=oldPiece;
                    }
                } catch (Exception e) {}
                try {
                    if (Character.isUpperCase(chessBoard[r+j*2][c+k].charAt(0)) || " ".equals(chessBoard[r+j*2][c+k])) {
                        oldPiece=chessBoard[r+j*2][c+k];
                        chessBoard[r+j*2][c+k] = "k";
                        chessBoard[r][c]=" ";
                        if (BkingSafe()) {
                            list=list+r+c+(r+j*2)+(c+k)+oldPiece;
                        }
                        chessBoard[r][c]="k";
                        chessBoard[r+j*2][c+k]=oldPiece;
                    }
                } catch (Exception e) {}
            }
        }
        return list;
    }

    //possible moves for white bishop
    public static String possibleB(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        int temp=1;
        for (int j=-1; j<=1; j+=2) {
            for (int k=-1; k<=1; k+=2) {
                try {
                    while(" ".equals(chessBoard[r+temp*j][c+temp*k]))
                    {
                        oldPiece=chessBoard[r+temp*j][c+temp*k];
                        chessBoard[r][c]=" ";
                        chessBoard[r+temp*j][c+temp*k]="B";
                        if (WkingSafe()) {
                            list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                        }
                        chessBoard[r][c]="B";
                        chessBoard[r+temp*j][c+temp*k]=oldPiece;
                        temp++;
                    }
                    if (Character.isLowerCase(chessBoard[r+temp*j][c+temp*k].charAt(0))) {
                        oldPiece=chessBoard[r+temp*j][c+temp*k];
                        chessBoard[r][c]=" ";
                        chessBoard[r+temp*j][c+temp*k]="B";
                        if (WkingSafe()) {
                            list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                        }
                        chessBoard[r][c]="B";
                        chessBoard[r+temp*j][c+temp*k]=oldPiece;
                    }
                } catch (Exception e) {}
                temp=1;
            }
        }
        return list;
    }

    //possible moves for black bishop
    public static String possibleb(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        int temp=1;
        for (int j=-1; j<=1; j+=2) {
            for (int k=-1; k<=1; k+=2) {
                try {
                    while(" ".equals(chessBoard[r+temp*j][c+temp*k]))
                    {
                        oldPiece=chessBoard[r+temp*j][c+temp*k];
                        chessBoard[r][c]=" ";
                        chessBoard[r+temp*j][c+temp*k]="b";
                        if (BkingSafe()) {
                            list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                        }
                        chessBoard[r][c]="b";
                        chessBoard[r+temp*j][c+temp*k]=oldPiece;
                        temp++;
                    }
                    if (Character.isUpperCase(chessBoard[r+temp*j][c+temp*k].charAt(0))) {
                        oldPiece=chessBoard[r+temp*j][c+temp*k];
                        chessBoard[r][c]=" ";
                        chessBoard[r+temp*j][c+temp*k]="b";
                        if (BkingSafe()) {
                            list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                        }
                        chessBoard[r][c]="b";
                        chessBoard[r+temp*j][c+temp*k]=oldPiece;
                    }
                } catch (Exception e) {}
                temp=1;
            }
        }
        return list;
    }

    //possible moves for white queen
    public static String possibleQ(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        int temp=1;
        for (int j=-1; j<=1; j++) {
            for (int k=-1; k<=1; k++) {
                if (j!=0 || k!=0) {
                    try {
                        while(" ".equals(chessBoard[r+temp*j][c+temp*k]))
                        {
                            oldPiece=chessBoard[r+temp*j][c+temp*k];
                            chessBoard[r][c]=" ";
                            chessBoard[r+temp*j][c+temp*k]="Q";
                            if (WkingSafe()) {
                                list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                            }
                            chessBoard[r][c]="Q";
                            chessBoard[r+temp*j][c+temp*k]=oldPiece;
                            temp++;
                        }
                        if (Character.isLowerCase(chessBoard[r+temp*j][c+temp*k].charAt(0))) {
                            oldPiece=chessBoard[r+temp*j][c+temp*k];
                            chessBoard[r][c]=" ";
                            chessBoard[r+temp*j][c+temp*k]="Q";
                            if (WkingSafe()) {
                                list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                            }
                            chessBoard[r][c]="Q";
                            chessBoard[r+temp*j][c+temp*k]=oldPiece;
                        }
                    } catch (Exception e) {}
                    temp=1;
                }
            }
        }
        return list;
    }

    //possible moves for black queen
    public static String possibleq(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        int temp=1;
        for (int j=-1; j<=1; j++) {
            for (int k=-1; k<=1; k++) {
                if (j!=0 || k!=0) {
                    try {
                        while(" ".equals(chessBoard[r+temp*j][c+temp*k]))
                        {
                            oldPiece=chessBoard[r+temp*j][c+temp*k];
                            chessBoard[r][c]=" ";
                            chessBoard[r+temp*j][c+temp*k]="q";
                            if (BkingSafe()) {
                                list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                            }
                            chessBoard[r][c]="q";
                            chessBoard[r+temp*j][c+temp*k]=oldPiece;
                            temp++;
                        }
                        if (Character.isUpperCase(chessBoard[r+temp*j][c+temp*k].charAt(0))) {
                            oldPiece=chessBoard[r+temp*j][c+temp*k];
                            chessBoard[r][c]=" ";
                            chessBoard[r+temp*j][c+temp*k]="q";
                            if (BkingSafe()) {
                                list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                            }
                            chessBoard[r][c]="q";
                            chessBoard[r+temp*j][c+temp*k]=oldPiece;
                        }
                    } catch (Exception e) {}
                    temp=1;
                }
            }
        }
        return list;
    }

    //possible moves for white king
    public static String possibleA(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        for (int j=0;j<9;j++) {
            if (j!=4) {
                try {
                    if (Character.isLowerCase(chessBoard[r-1+j/3][c-1+j%3].charAt(0)) || " ".equals(chessBoard[r-1+j/3][c-1+j%3])) {
                        oldPiece=chessBoard[r-1+j/3][c-1+j%3];
                        chessBoard[r][c]=" ";
                        chessBoard[r-1+j/3][c-1+j%3]="A";
                        int kingTemp=kingPositionC;
                        kingPositionC=i+(j/3)*8+j%3-9;
                        if (WkingSafe()) {
                            list=list+r+c+(r-1+j/3)+(c-1+j%3)+oldPiece;
                        }
                        chessBoard[r][c]="A";
                        chessBoard[r-1+j/3][c-1+j%3]=oldPiece;
                        kingPositionC=kingTemp;
                    }
                } catch (Exception e) {}
            }
        }
        if (WCastleFlag==0 && kingWMoves==0 && WkingSafe() && " ".equals(chessBoard[7][1]) && " ".equals(chessBoard[7][2])) {
            chessBoard[7][0] = " ";
            chessBoard[7][1] = "A";
            chessBoard[7][2] = "R";
            chessBoard[7][3] = " ";
            kingPositionC = 57;
            if (WkingSafe()) {
                list = list + "7371 ";
            }
            kingPositionC = 59;
            chessBoard[7][0] = "R";
            chessBoard[7][1] = " ";
            chessBoard[7][2] = " ";
            chessBoard[7][3] = "A";
        }
        return list;
    }

    //possible moves for black king
    public static String possiblea(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        for (int j=0;j<9;j++) {
            if (j!=4) {
                try {
                    if (Character.isUpperCase(chessBoard[r-1+j/3][c-1+j%3].charAt(0)) || " ".equals(chessBoard[r-1+j/3][c-1+j%3])) {
                        oldPiece=chessBoard[r-1+j/3][c-1+j%3];
                        chessBoard[r][c]=" ";
                        chessBoard[r-1+j/3][c-1+j%3]="a";
                        int kingTemp=kingPositionL;
                        kingPositionL=i+(j/3)*8+j%3-9;
                        if (BkingSafe()) {
                            list=list+r+c+(r-1+j/3)+(c-1+j%3)+oldPiece;
                        }
                        chessBoard[r][c]="a";
                        chessBoard[r-1+j/3][c-1+j%3]=oldPiece;
                        kingPositionL=kingTemp;
                    }
                } catch (Exception e) {}
            }
        }
        if (BCastleFlag==0 && kingBMoves==0 && BkingSafe() && " ".equals(chessBoard[0][1]) && " ".equals(chessBoard[0][2])) {
            chessBoard[0][0] = " ";
            chessBoard[0][1] = "a";
            chessBoard[0][2] = "r";
            chessBoard[0][3] = " ";
            kingPositionL = 1;
            if (BkingSafe()) {
                list = list + "0301 ";
            }
            kingPositionL = 3;
            chessBoard[0][0] = "r";
            chessBoard[0][1] = " ";
            chessBoard[0][2] = " ";
            chessBoard[0][3] = "a";
        }
        return list;
    }

    //checks whether the white king is safe in the current position
    //important to evaluate which moves are allowed in possible_() functions
    public static boolean WkingSafe() {
        //bishop/queen
        int temp=1;
        for (int i=-1; i<=1; i+=2) {
            for (int j=-1; j<=1; j+=2) {
                try {
                    while(" ".equals(chessBoard[kingPositionC/8+temp*i][kingPositionC%8+temp*j])) {temp++;}
                    if ("b".equals(chessBoard[kingPositionC/8+temp*i][kingPositionC%8+temp*j]) ||
                            "q".equals(chessBoard[kingPositionC/8+temp*i][kingPositionC%8+temp*j])) {
                        return false;
                    }
                } catch (Exception e) {}
                temp=1;
            }
        }
        //rook/queen
        for (int i=-1; i<=1; i+=2) {
            try {
                while(" ".equals(chessBoard[kingPositionC/8][kingPositionC%8+temp*i])) {temp++;}
                if ("r".equals(chessBoard[kingPositionC/8][kingPositionC%8+temp*i]) ||
                        "q".equals(chessBoard[kingPositionC/8][kingPositionC%8+temp*i])) {
                    return false;
                }
            } catch (Exception e) {}
            temp=1;
            try {
                while(" ".equals(chessBoard[kingPositionC/8+temp*i][kingPositionC%8])) {temp++;}
                if ("r".equals(chessBoard[kingPositionC/8+temp*i][kingPositionC%8]) ||
                        "q".equals(chessBoard[kingPositionC/8+temp*i][kingPositionC%8])) {
                    return false;
                }
            } catch (Exception e) {}
            temp=1;
        }
        //knight
        for (int i=-1; i<=1; i+=2) {
            for (int j=-1; j<=1; j+=2) {
                try {
                    if ("k".equals(chessBoard[kingPositionC/8+i][kingPositionC%8+j*2])) {
                        return false;
                    }
                } catch (Exception e) {}
                try {
                    if ("k".equals(chessBoard[kingPositionC/8+i*2][kingPositionC%8+j])) {
                        return false;
                    }
                } catch (Exception e) {}
            }
        }
        //pawn
        if (kingPositionC>=16) {
            try {
                if ("p".equals(chessBoard[kingPositionC/8-1][kingPositionC%8-1])) {
                    return false;
                }
            } catch (Exception e) {}
            try {
                if ("p".equals(chessBoard[kingPositionC/8-1][kingPositionC%8+1])) {
                    return false;
                }
            } catch (Exception e) {}
            //king
            for (int i=-1; i<=1; i++) {
                for (int j=-1; j<=1; j++) {
                    if (i!=0 || j!=0) {
                        try {
                            if ("a".equals(chessBoard[kingPositionC/8+i][kingPositionC%8+j])) {
                                return false;
                            }
                        } catch (Exception e) {}
                    }
                }
            }
        }
        return true;
    }

    //checks if black king is safe
    public static boolean BkingSafe() {
        //bishop/queen
        int temp=1;
        for (int i=-1; i<=1; i+=2) {
            for (int j=-1; j<=1; j+=2) {
                try {
                    while(" ".equals(chessBoard[kingPositionL/8+temp*i][kingPositionL%8+temp*j])) {temp++;}
                    if ("B".equals(chessBoard[kingPositionL/8+temp*i][kingPositionL%8+temp*j]) ||
                            "Q".equals(chessBoard[kingPositionL/8+temp*i][kingPositionL%8+temp*j])) {
                        return false;
                    }
                } catch (Exception e) {}
                temp=1;
            }
        }
        //rook/queen
        for (int i=-1; i<=1; i+=2) {
            try {
                while(" ".equals(chessBoard[kingPositionL/8][kingPositionL%8+temp*i])) {temp++;}
                if ("R".equals(chessBoard[kingPositionL/8][kingPositionL%8+temp*i]) ||
                        "Q".equals(chessBoard[kingPositionL/8][kingPositionL%8+temp*i])) {
                    return false;
                }
            } catch (Exception e) {}
            temp=1;
            try {
                while(" ".equals(chessBoard[kingPositionL/8+temp*i][kingPositionL%8])) {temp++;}
                if ("R".equals(chessBoard[kingPositionL/8+temp*i][kingPositionL%8]) ||
                        "Q".equals(chessBoard[kingPositionL/8+temp*i][kingPositionL%8])) {
                    return false;
                }
            } catch (Exception e) {}
            temp=1;
        }
        //knight
        for (int i=-1; i<=1; i+=2) {
            for (int j=-1; j<=1; j+=2) {
                try {
                    if ("K".equals(chessBoard[kingPositionL/8+i][kingPositionL%8+j*2])) {
                        return false;
                    }
                } catch (Exception e) {}
                try {
                    if ("K".equals(chessBoard[kingPositionL/8+i*2][kingPositionL%8+j])) {
                        return false;
                    }
                } catch (Exception e) {}
            }
        }
        //pawn
        if (kingPositionL<=47) {
            try {
                if ("P".equals(chessBoard[kingPositionL/8+1][kingPositionL%8-1])) {
                    return false;
                }
            } catch (Exception e) {}
            try {
                if ("P".equals(chessBoard[kingPositionL/8+1][kingPositionL%8+1])) {
                    return false;
                }
            } catch (Exception e) {}
            //king
            for (int i=-1; i<=1; i++) {
                for (int j=-1; j<=1; j++) {
                    if (i!=0 || j!=0) {
                        try {
                            if ("A".equals(chessBoard[kingPositionL/8+i][kingPositionL%8+j])) {
                                return false;
                            }
                        } catch (Exception e) {}
                    }
                }
            }
        }
        return true;
    }
}
