package model.figures;

import model.ChessFigure;
import model.Move;

public class Knight extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 1;
    public static final Move[] POSSIBLE_MOVES = {
            Move.KNIGHT_UP_RIGHT,
            Move.KNIGHT_UP_LEFT,
            Move.KNIGHT_DOWN_RIGHT,
            Move.KNIGHT_DOWN_LEFT
    };

    public Knight(String name, int x, int y) {
        super(name, x, y, MAX_POSSIBLE_STEPS, POSSIBLE_MOVES);
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
