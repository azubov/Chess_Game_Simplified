package model.figures;

import model.ChessFigure;

public class Pawn extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 2;

    public Pawn(String name, int x, int y) {
        super(name, x, y, MAX_POSSIBLE_STEPS);
    }

    public void forward(int steps) {
        super.forward(steps);
    }

}
