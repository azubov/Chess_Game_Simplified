package refactor.model.figures;

import refactor.Point;
import refactor.model.Board;
import refactor.model.Color;
import refactor.model.Figure;

import java.util.List;

public class Bishop extends Figure {

    public Bishop(String name, Color color, Point point) {
        super(name, color, point);
    }

    @Override
    public void calculatePossibleMoves(Board board) {
        System.out.println("bishop");

        // текущая позиция
        int x = super.getPoint().getX();
        int y = super.getPoint().getY();

        // путь движения фигуры
        Point point = super.diagonalUpRight(x, y);

        // проверить фигуру по расчитаной точке
        Figure checkFigure = board.getFigure(point);

        // если цвет не совпадает или null, то добавить Point в массив возможных ходов
        if (!isSameColor(checkFigure)) {
            possibleMoves.add(point);
            System.out.println(possibleMoves);
        }

    }

    public boolean isSameColor(Figure figure) {
        return figure.getColor() == this.getColor() || figure.getColor() == null;
    }

    @Override
    public List<Point> getPossibleMoves() {
        return super.getPossibleMoves();
    }
}

