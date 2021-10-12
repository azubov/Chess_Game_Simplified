package refactor.model;

import refactor.Point;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
    private final String name;
    private final Color color;
    protected List<Point> possibleMoves = new ArrayList<>();
    private Point point;

    public Figure(String name, Color color, Point point) {
        this.name = name;
        this.color = color;
        this.point = point;
    }

    public void calculatePossibleMoves(Board board) {
        System.out.println("super");;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public List<Point> getPossibleMoves() {
        return possibleMoves;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    // Варианты доступных ходов для всех фигур

    protected Point forward(int x, int y) {
        y += 1;
        return new Point(x, y);
    }
    protected Point backward(int x, int y) {
        y -= 1;
        return new Point(x, y);
    }

    protected Point toTheRight(int x, int y) {
        x += 1;
        return new Point(x, y);
    }

    protected Point toTheLeft(int x, int y) {
        x -= 1;
        return new Point(x, y);
    }
    protected Point diagonalUpRight(int x, int y) {
        y += 1;
        x += 1;
        return new Point(x, y);
    }

    protected Point diagonalUpLeft(int x, int y) {
        y += 1;
        x -= 1;
        return new Point(x, y);
    }

    protected Point diagonalDownRight(int x, int y) {
        y -= 1;
        x += 1;
        return new Point(x, y);
    }

    protected Point diagonalDownLeft(int x, int y) {
        y -= 1;
        x -= 1;
        return new Point(x, y);
    }

    protected Point knightVerticalUpRight(int x, int y) {
        y += 2;
        x += 1;
        return new Point(x, y);
    }

    protected Point knightVerticalUpLeft(int x, int y) {
        y += 2;
        x -= 1;
        return new Point(x, y);
    }

    protected Point knightVerticalDownRight(int x, int y) {
        y -= 2;
        x += 1;
        return new Point(x, y);
    }

    protected Point knightVerticalDownLeft(int x, int y) {
        y -= 2;
        x -= 1;
        return new Point(x, y);
    }

    protected Point knightHorizontalUpRight(int x, int y) {
        x += 2;
        y += 1;
        return new Point(x, y);
    }

    protected Point knightHorizontalUpLeft(int x, int y) {
        x += 2;
        y -= 1;
        return new Point(x, y);
    }

    protected Point knightHorizontalDownRight(int x, int y) {
        x -= 2;
        y += 1;
        return new Point(x, y);
    }

    protected Point knightHorizontalDownLeft(int x, int y) {
        x -= 2;
        y -= 1;
        return new Point(x, y);
    }
}


