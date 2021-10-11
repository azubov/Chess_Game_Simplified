package model.figures.white;

import model.ChessFigure;
import model.Move;

// Белая фигура
// Имеет константу максимально возможных шагов
// Имеет массив доступных ходов
// Имеет свойственные фигуре методы из родительского класса

public class W_Rook extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 8;
    public static final Move[] POSSIBLE_MOVES = {
            Move.W_FORWARD,
            Move.W_BACKWARD,
            Move.W_RIGHT,
            Move.W_LEFT
    };

    public W_Rook(String name, int x, int y) {
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
