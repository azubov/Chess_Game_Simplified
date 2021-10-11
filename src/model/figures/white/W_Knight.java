package model.figures.white;

import model.ChessFigure;
import model.Move;

// Белая фигура
// Имеет константу максимально возможных шагов
// Имеет массив доступных ходов
// Имеет свойственные фигуре методы из родительского класса

public class W_Knight extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 1;
    public static final Move[] POSSIBLE_MOVES = {
            Move.W_KNIGHT_UP_RIGHT,
            Move.W_KNIGHT_UP_LEFT,
            Move.W_KNIGHT_DOWN_RIGHT,
            Move.W_KNIGHT_DOWN_LEFT
    };

    public W_Knight(String name, int x, int y) {
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
