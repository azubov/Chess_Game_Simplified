package refactor.model.figures;

// OK

import refactor.model.Board;
import refactor.model.Color;
import refactor.model.Figure;
import refactor.model.Point;

public class Bishop extends Figure {

    private boolean thereIsFigure;

    public Bishop(String name, Color color, Point point) {
        super(name, color, point);
    }

    @Override
    public void getPossibleMoves(Board board) {
        System.out.println("bishop");
        checkSteps(board);
    }

    public void checkSteps(Board board) {
        diagonalUpRight(board);
        diagonalUpLeft(board);
        diagonalDownRight(board);
        diagonalDownLeft(board);

    }
}

