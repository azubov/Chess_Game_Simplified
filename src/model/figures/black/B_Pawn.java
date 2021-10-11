package model.figures.black;

import model.ChessFigure;
import model.Move;

// Черная фигура
// Имеет константу максимально возможных шагов
// Имеет массив доступных инвестированных ходов
// Имеет свойственные фигуре методы из родительского класса

public class B_Pawn extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 2;
    public static final Move[] POSSIBLE_MOVES = {Move.B_FORWARD};

    public B_Pawn(String name, int x, int y) {
        super(name, x, y, MAX_POSSIBLE_STEPS, POSSIBLE_MOVES);
    }

    public void forward(int steps) {
        super.forward(steps);
    }



}
