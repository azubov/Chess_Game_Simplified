package refactor.model.figures;

import refactor.model.Board;
import refactor.model.Color;
import refactor.model.Figure;
import refactor.model.Point;

public class Knight extends Figure {

    public Knight(String name, Color color, Point point) {
        super(name, color, point);
    }

    @Override
    public void getPossibleMoves(Board board) {
        System.out.println("knight");
        checkSteps(board);
    }

    public void checkSteps(Board board) {
        knightVerticalUpRight(board);
        knightVerticalUpLeft(board);
        knightVerticalDownRight(board);
        knightVerticalDownLeft(board);
        knightHorizontalUpRight(board);
        knightHorizontalUpLeft(board);
        knightHorizontalDownRight(board);
        knightHorizontalDownLeft(board);
    }



}