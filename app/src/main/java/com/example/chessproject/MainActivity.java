package com.example.chessproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Chess board represented by string matrix
    Uppercase = white pieces
    lowercase = black pieces
    A represents king
     */

    static String chessBoard[][] = {
            {"r", "k", "b", "q", "a", "b", "k", "r"},
            {"p", "p", "p", "p", "p", "p", "p", "p"},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {"P", "P", "P", "P", "P", "P", "P", "P"},
            {"R", "K", "B", "Q", "A", "B", "K", "R"}};

    static int kingPositionC, kingPositionL; //always keeps track of king position to evaluate check
    public static void main(String[] args) {
        while (!"A".equals(chessBoard[kingPositionC / 8][kingPositionC % 8])) {
            kingPositionC++;
        }
        while (!"a".equals(chessBoard[kingPositionL / 8][kingPositionL % 8])) {
            kingPositionL++;
        }
    }

    //flipBoard is used between turns, so that the functions don't need to be written from the lowercase perspective
    public static void flipBoard(){
        String temp;
        for (int i=0; i<32; i++) {
            int r = i/8;
            int c = i%8;
            if (Character.isUpperCase(chessBoard[r][c].charAt(0))) {
                temp = chessBoard[r][c].toLowerCase();
            } else {
                temp = chessBoard[r][c].toUpperCase();
            }
            if (Character.isUpperCase(chessBoard[7-r][7-c].charAt(0))) {
                chessBoard[r][c] = chessBoard[7-r][7-c].toLowerCase();
            } else {
                chessBoard[r][c] = chessBoard[7-r][7-c].toUpperCase();
            }
            chessBoard[7-r][7-c] = temp;
        }
        int kingTemp = kingPositionC;
        kingPositionC = 63-kingPositionL;
        kingPositionL = 63-kingTemp;
    }

    //makeMove changes the string matrix chessBoard to represent the move made
    public static void makeMove(String move){
        if (move.charAt(4) != 'P') {
            //move format: x1 y1 x2 y2 capturedPiece
            chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))] = chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))];
            chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))] = " ";
            //line below for flipBoard()
            if("A".equals(chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))])) {
                kingPositionC=8*Character.getNumericValue(move.charAt(2))+Character.getNumericValue(move.charAt(3));
            }
        } else { //if pawn promotion
            //column1 column2 capturedPiece newPiece P
            chessBoard[1][Character.getNumericValue(move.charAt(0))] = " ";
            chessBoard[0][Character.getNumericValue(move.charAt(1))] = String.valueOf(move.charAt(3));
        }
    }

    //not sure if we'll need this but it doesn't hurt to have
    public static void undoMove(String move){
        if (move.charAt(4) != 'P') {
            chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))] = chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))];
            chessBoard[Character.getNumericValue(move.charAt(2))][Character.getNumericValue(move.charAt(3))] = String.valueOf(move.charAt(3));
            if("A".equals(chessBoard[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))])) {
                kingPositionC=8*Character.getNumericValue(move.charAt(0))+Character.getNumericValue(move.charAt(1));
            }
        } else {
            //column1 column2 capturedPiece newPiece P
            chessBoard[1][Character.getNumericValue(move.charAt(0))] = "P";
            chessBoard[0][Character.getNumericValue(move.charAt(1))] = String.valueOf(move.charAt(2));
        }
    }

    //searches through every square on the board
    //returns a list of strings containing every possible move for the player
    //move format: x1 y1 x2 y2 pieceCaptured (pieceCaptured is " " if moving to a blank space
    public static String possibleMoves(){
        String list = "";
        for (int i=0; i<64; i++) {
            switch (chessBoard[i/8][i%8]) {
                case "P": list+=possibleP(i);
                    break;
                case "R" : list+=possibleR(i);
                    break;
                case "K" : list+=possibleK(i);
                    break;
                case "B" : list+=possibleB(i);
                    break;
                case "Q" : list+=possibleQ(i);
                    break;
                case "A" : list+=possibleA(i);
                    break;
            }
        }
        return list; //x1 y1 x2 y2 captured piece
    }

    //possible moves for pawns
    public static String possibleP(int i) {
        String list = "", oldPiece;
        int r = i / 8;
        int c = i % 8;
        for (int j = -1; j <= 1; j += 2) {
            try { //capture
                if (Character.isLowerCase(chessBoard[r-1][c+j].charAt(0)) && i>=16) {
                    oldPiece=chessBoard[r-1][c+j];
                    chessBoard[r][c]=" ";
                    chessBoard[r][c+j] = "P";
                    if (kingSafe()) {
                        list = list+r+c+(r-1)+(c+j)+oldPiece;
                    }
                    chessBoard[r][c] = "P";
                    chessBoard[r-1][c+j] = oldPiece;
                }
            } catch (Exception e) {}
            try { //promotion and capture
                if (Character.isLowerCase(chessBoard[r-1][c+j].charAt(0)) && i<16) {
                    String[] temp = {"Q", "R", "B", "K"};
                    for (int k = 0; k < 4; k++) {
                        oldPiece = chessBoard[r - 1][c + j];
                        chessBoard[r][c] = " ";
                        chessBoard[r][c + j] = temp[k];
                        if (kingSafe()) {
                            //column1, column2, captured-piece, new-piece, P
                            list = list+c+(c+j)+oldPiece+temp[k]+"P";
                        }
                        chessBoard[r][c] = "P";
                        chessBoard[r - 1][c + j] = oldPiece;
                    }
                }
            } catch (Exception e) {}
        }
        try { //move one up
            if (" ".equals(chessBoard[r-1][c]) && i>=16)  {
                oldPiece=chessBoard[r-1][c];
                chessBoard[r][c]=" ";
                chessBoard[r-1][c] = "P";
                if (kingSafe()) {
                    list = list+r+c+(r-1)+c+oldPiece;
                }
                chessBoard[r][c] = "P";
                chessBoard[r-1][c] = oldPiece;
            }
        } catch (Exception e) {}
        try { //promotion no capture
            if (" ".equals(chessBoard[r-1][c]) && i<16)  {
                String[] temp = {"Q", "R", "B", "K"};
                for (int k = 0; k < 4; k++) {
                    oldPiece = chessBoard[r - 1][c];
                    chessBoard[r][c] = " ";
                    chessBoard[r-1][c] = temp[k];
                    if (kingSafe()) {
                        //column1, column2, captured-piece, new-piece, P
                        list = list+c+c+oldPiece+temp[k]+"P";
                    }
                    chessBoard[r][c] = "P";
                    chessBoard[r - 1][c] = oldPiece;
                }
            }
        } catch (Exception e) {}
        try { //move two up
            if (" ".equals(chessBoard[r-1][c]) && " ".equals(chessBoard[r-2][c]) && i>=48)  {
                oldPiece=chessBoard[r-2][c];
                chessBoard[r][c]=" ";
                chessBoard[r-2][c] = "P";
                if (kingSafe()) {
                    list = list+r+c+(r-2)+c+oldPiece;
                }
                chessBoard[r][c] = "P";
                chessBoard[r-2][c] = oldPiece;
            }
        } catch (Exception e) {}
        return list;
    }

    //possible moves for rook
    public static String possibleR(int i) {
        String list = "", oldPiece;
        int r = i/8;
        int c = i%8;
        int temp = 1;
        for (int j=-1; j<=1; j+=2) {
            try {
                while (" ".equals(chessBoard[r][c+temp*j])) {
                    oldPiece = chessBoard[r][c+temp*j];
                    chessBoard[r][c] = " ";
                    chessBoard[r][c+temp*j] = "R";
                    if (kingSafe()) {
                        list = list+r+c+r+(c+temp*j)+oldPiece;
                    }
                    chessBoard[r][c] = "R";
                    chessBoard[r][c+temp*j] = oldPiece;
                    temp++;
                }
                if (Character.isLowerCase(chessBoard[r][c+temp*j].charAt(0))){
                    oldPiece = chessBoard[r][c+temp*j];
                    chessBoard[r][c] = " ";
                    chessBoard[r][c+temp*j] = "R";
                    if (kingSafe()) {
                        list = list+r+c+r+(c+temp*j)+oldPiece;
                    }
                    chessBoard[r][c] = "R";
                    chessBoard[r][c+temp*j] = oldPiece;
                }
            } catch (Exception e) {}
            temp = 1;
            try {
                while (" ".equals(chessBoard[r+temp*j][c])) {
                    oldPiece = chessBoard[r+temp*j][c];
                    chessBoard[r][c] = " ";
                    chessBoard[r+temp*j][c] = "R";
                    if (kingSafe()) {
                        list = list+r+c+(r+temp*j)+c+oldPiece;
                    }
                    chessBoard[r][c] = "R";
                    chessBoard[r+temp*j][c] = oldPiece;
                    temp++;
                }
                if (Character.isLowerCase(chessBoard[r+temp*j][c].charAt(0))){
                    oldPiece = chessBoard[r][c+temp*j];
                    chessBoard[r][c] = " ";
                    chessBoard[r+temp*j][c] = "R";
                    if (kingSafe()) {
                        list = list+r+c+(r+temp*j)+c+oldPiece;
                    }
                    chessBoard[r][c] = "R";
                    chessBoard[r+temp*j][c] = oldPiece;
                }
            } catch (Exception e) {}
            temp = 1;
        }
        return list;
    }

    //possible moves for knight
    public static String possibleK(int i) {
        String list = "", oldPiece;
        int r = i/8;
        int c = i%8;
        int temp = 1;
        for (int j=-1; j<=1; j+=2) {
            for (int k=-1; k<=1; k+=2) {
                try {
                    if (Character.isLowerCase(chessBoard[r+j][c+k*2].charAt(0)) || "".equals(chessBoard[r+j][c+k*2])) {
                        oldPiece = chessBoard[r+j][c+k*2];
                        chessBoard[r][c] = " ";
                        chessBoard[r+j][c+k*2] = "K";
                        if (kingSafe()) {
                            list = list+r+c+(r+j)+(c+k*2)+oldPiece;
                        }
                        chessBoard[r][c] = "K";
                        chessBoard[r+j][c+k*2] = oldPiece;
                    }
                } catch (Exception e) {}
                try {
                    if (Character.isLowerCase(chessBoard[r+j*2][c+k].charAt(0)) || "".equals(chessBoard[r+j*2][c+k])) {
                        oldPiece = chessBoard[r+j*2][c+k];
                        chessBoard[r][c] = " ";
                        chessBoard[r+j*2][c+k] = "K";
                        if (kingSafe()) {
                            list = list+r+c+(r+j*2)+(c+k)+oldPiece;
                        }
                        chessBoard[r][c] = "K";
                        chessBoard[r+j*2][c+k] = oldPiece;
                    }
                } catch (Exception e) {}
            }
        }
        return list;
    }

    //possible moves for bishop
    public static String possibleB(int i) {
        String list = "", oldPiece;
        int r = i/8;
        int c = i%8;
        int temp = 1;
        for (int j=-1; j<=1; j+=2) {
            for (int k=-1; k<=1; k+=2) {
                    try {
                        while ("".equals(chessBoard[r+temp*j][c+temp*k])) {
                            oldPiece = chessBoard[r+temp*j][c+temp*k];
                            chessBoard[r][c] = " ";
                            chessBoard[r+temp*j][c+temp*k] = "B";
                            if (kingSafe()) {
                                list = list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                            }
                            chessBoard[r][c] = "B";
                            chessBoard[r+temp*j][c+temp*k] = oldPiece;
                            temp++;
                        }
                        if (Character.isLowerCase(chessBoard[r+temp*j][c+temp*k].charAt(0))) {
                            oldPiece = chessBoard[r+temp*j][c+temp*k];
                            chessBoard[r][c] = " ";
                            chessBoard[r+temp*j][c+temp*k] = "B";
                            if (kingSafe()) {
                                list = list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                            }
                            chessBoard[r][c] = "B";
                            chessBoard[r+temp*j][c+temp*k] = oldPiece;
                        }
                    } catch (Exception e) {
                    }
                    temp = 1;
            }
        }
        return list;
    }

    //possible moves for queen
    public static String possibleQ(int i) {
        String list = "", oldPiece;
        int r = i/8;
        int c = i%8;
        int temp = 1;
        for (int j=-1; j<=1; j++){
            for (int k=-1; k<=1; k++){
                if (j!=0 || k!=0) {
                    try {
                        while ("".equals(chessBoard[r+temp*j][c+temp*k])) {
                            oldPiece = chessBoard[r+temp*j][c+temp*k];
                            chessBoard[r][c] = " ";
                            chessBoard[r+temp*j][c+temp*k] = "Q";
                            if (kingSafe()) {
                                list = list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                            }
                            chessBoard[r][c] = "Q";
                            chessBoard[r+temp*j][c+temp*k] = oldPiece;
                            temp++;
                        }
                        if (Character.isLowerCase(chessBoard[r+temp*j][c+temp*k].charAt(0))) {
                            oldPiece = chessBoard[r+temp*j][c+temp*k];
                            chessBoard[r][c] = " ";
                            chessBoard[r+temp*j][c+temp*k] = "Q";
                            if (kingSafe()) {
                                list = list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                            }
                            chessBoard[r][c] = "Q";
                            chessBoard[r+temp*j][c+temp*k] = oldPiece;
                        }
                    } catch (Exception e) {}
                    temp = 1;
                }
            }
        }
        return list;
    }

    //possible moves for king
    public static String possibleA(int i) {
        String list = "", oldPiece;
        int r = i/8;
        int c = i%8;
        for (int j=0; j<9; j++){
            if (j!=4) {
                try {
                    if (Character.isLowerCase(chessBoard[r-1+j/3][c-1+j%3].charAt(0)) || " ".equals(chessBoard[r-1+j/3][c-1+j%3])) {
                        oldPiece = chessBoard[r-1+j/3][c-1+j%3];
                        chessBoard[r][c] = " ";
                        chessBoard[r-1+j/3][c-1+j%3] = "A";
                        int kingTemp = kingPositionC;
                        kingPositionC = i+(j/3)*8+j%3-9;
                        if (kingSafe()) {
                            list = list+r+c+(r-1+j/3)+(c-1+j%3)+oldPiece;
                        }
                        chessBoard[r][c] = "A";
                        chessBoard[r-1+j/3][c-1+j%3] = "oldPiece";
                        kingPositionC = kingTemp;
                    }
                } catch (Exception e) {}
            }
        }
        return list;
    }

    //checks whether the king is safe in the current position
    //important to evaluate which moves are allowed in possible_() functions
    public static boolean kingSafe(){
        //checks bishop and queens diagonals
        int temp = 1;
        for (int i=-1; i<=1; i+=2) {
            for (int j=-1; j<=1; j+=2) {
                try {
                    while ("".equals(chessBoard[kingPositionC/8+temp*i][kingPositionC%8+temp*j])) {temp++;}
                    if ("b".equals(chessBoard[kingPositionC/8+temp*i][kingPositionC%8+temp*j]) ||
                            "q".equals(chessBoard[kingPositionC/8+temp*i][kingPositionC%8+temp*j])) {
                        return false;
                    }
                } catch (Exception e) {}
                temp = 1;
            }
        }
        //checks rook and queens horizontal/vertical
        for (int i=-1; i<=1; i+=2) {
            try {
                while ("".equals(chessBoard[kingPositionC/8][kingPositionC%8+temp*i])) {temp++;}
                if ("b".equals(chessBoard[kingPositionC/8][kingPositionC%8+temp*i]) ||
                        "q".equals(chessBoard[kingPositionC/8][kingPositionC%8+temp*i])) {
                    return false;
                }
            } catch (Exception e) {}
            temp = 1;
        }
        //checks knight
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
        //checks pawn
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
        }
        //checks king
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
        return true;
    }
}

