package model.figures.black;

import model.ChessFigure;
import model.Move;

// Черная фигура
// Имеет константу максимально возможных шагов
// Имеет массив доступных инвестированных ходов
// Имеет свойственные фигуре методы из родительского класса

public class B_Knight extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 1;
    public static final Move[] POSSIBLE_MOVES = {
            Move.B_KNIGHT_UP_RIGHT,
            Move.B_KNIGHT_UP_LEFT,
            Move.B_KNIGHT_DOWN_RIGHT,
            Move.B_KNIGHT_DOWN_LEFT
    };

    public B_Knight(String name, int x, int y) {
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
