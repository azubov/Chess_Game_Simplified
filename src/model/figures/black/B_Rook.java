package model.figures.black;

import model.ChessFigure;
import model.Move;

// Черная фигура
// Имеет константу максимально возможных шагов
// Имеет массив доступных инвестированных ходов
// Имеет свойственные фигуре методы из родительского класса

public class B_Rook extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 8;
    public static final Move[] POSSIBLE_MOVES = {
            Move.B_FORWARD,
            Move.B_BACKWARD,
            Move.B_RIGHT,
            Move.B_LEFT
    };

    public B_Rook(String name, int x, int y) {
        super(name, x, y, MAX_POSSIBLE_STEPS, POSSIBLE_MOVES);
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
