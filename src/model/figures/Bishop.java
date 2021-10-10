package model.figures;

import model.ChessFigure;
import model.Move;

public class Bishop extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 8;
    public static final Move[] POSSIBLE_MOVES = {Move.FORWARD};

    public Bishop(String name, int x, int y) {
        super(name, x, y, MAX_POSSIBLE_STEPS, POSSIBLE_MOVES);
    }

    public void diagonalUpRight(int steps) {
        super.diagonalUpRight(steps);
    }

    public void diagonalUpLeft(int steps) {
        super.diagonalUpLeft(steps);
    }

    public void diagonalDownRight(int steps) {
        super.diagonalDownRight(steps);
    }

    public void diagonalDownLeft(int steps) {
        super.diagonalDownLeft(steps);
    }
}
