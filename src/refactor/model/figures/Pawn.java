package refactor.model.figures;

import refactor.Point;
import refactor.model.Board;
import refactor.model.Color;
import refactor.model.Figure;

public class Pawn extends Figure {

    public Pawn(String name, Color color, Point point) {
        super(name, color, point);
    }

    @Override
    public void calculatePossibleMoves(Board board) {
        System.out.println("pawn");

        // текущая позиция
        int x = super.getPoint().getX();
        int y = super.getPoint().getY();

        // путь движения фигуры
        Point point = super.forward(x, y);

        // проверить фигуру по расчитаной точке
        Figure checkFigure = board.getFigure(point);

        // если цвет не совпадает или null, то добавить Point в массив возможных ходов
        if (wayIsClear(checkFigure)) {
            super.possibleMoves.add(point);
            System.out.println(super.possibleMoves);
        }
    }

    public boolean wayIsClear(Figure figure) {
        return figure == null || figure.getColor() != this.getColor();
    }
}