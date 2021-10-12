package refactor.model.figures;

import refactor.Point;
import refactor.model.Board;
import refactor.model.Color;
import refactor.model.Figure;

public class King extends Figure {

    public King(String name, Color color, Point point) {
        super(name, color, point);
    }

    @Override
    public void calculatePossibleMoves(Board board) {
        System.out.println("king");
    }
}