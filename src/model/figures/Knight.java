package model.figures;

import model.ChessFigure;

public class Knight extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 1;

    public Knight(String name, int x, int y) {
        super(name, x, y, MAX_POSSIBLE_STEPS);
    }
    
    public void knightUpRight(int steps) {
        super.knightUpRight(steps);
    }
    
    public void knightUpLeft(int steps) {
        super.knightUpLeft(steps);
    }
    
    public void knightDownRight(int steps) {
        super.knightDownRight(steps);
    }
    
    public void knightDownLeft(int steps) {
        super.knightDownLeft(steps);
    }
}
