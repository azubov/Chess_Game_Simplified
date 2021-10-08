package model.figures;

import model.ChessFigure;

public class Rook extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 8;

    public Rook(String name, int x, int y) {
        super(name, x, y, MAX_POSSIBLE_STEPS);
    }

    public void forward(int steps) {
        super.forward(steps);
    }
    
    public void backward(int steps) {
        super.backward(steps);
    }

    public void toTheRight(int steps) {
        super.toTheRight(steps);
    }

    public void toTheLeft(int steps) {
        super.toTheLeft(steps);
    }

}
