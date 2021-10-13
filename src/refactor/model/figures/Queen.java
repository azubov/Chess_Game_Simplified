package refactor.model.figures;

// OK


import refactor.model.Board;
import refactor.model.Color;
import refactor.model.Figure;
import refactor.model.Point;

public class Queen extends Figure {

    public Queen(String name, Color color, Point point) {
        super(name, color, point);
    }

    @Override
    public void getPossibleMoves(Board board) {
        System.out.println("queen");
        checkSteps(board);
    }

    public void checkSteps(Board board) {
        forward(board);
        backward(board);
        toTheRight(board);
        toTheLeft(board);
        diagonalUpRight(board);
        diagonalUpLeft(board);
        diagonalDownRight(board);
        diagonalDownLeft(board);

    }
}
