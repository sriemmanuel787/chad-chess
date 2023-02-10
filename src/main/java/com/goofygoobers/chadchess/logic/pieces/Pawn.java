package com.goofygoobers.chadchess.logic.pieces;

import com.goofygoobers.chadchess.logic.Color;
import com.goofygoobers.chadchess.logic.V2;

import java.util.ArrayList;

public class Pawn extends Piece{

    public Pawn(Color color) {
        super(color);
    }

    public ArrayList<V2> getValidMoves() {
        ArrayList<V2> moves = new ArrayList<>();
        moves.add( new V2(0, 1) );

        return moves;
    }

    public ArrayList<V2> getValidAttackMoves() {
        ArrayList<V2> moves = new ArrayList<>();
        moves.add( new V2(1, 1) );
        moves.add( new V2(-1, 1) );

        return moves;
    }

    public boolean goesStraigt() {
        return false;
    }

    public boolean goesDiagonally() {
        return false;
    }

    @Override
    public String toString() {
        if(COLOR == Color.WHITE) {
            return "♙︎";
        } else {
            return "♟︎";
        }
    }
}