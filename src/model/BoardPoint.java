package model;

// Точка на поле доски
// есть координаты
// можно присвоить фигуру

public class BoardPoint {
    private final int x;
    private final int y;
    private ChessFigure figure;

    public BoardPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ChessFigure getFigure() {
        return figure;
    }

    public void setFigure(ChessFigure figure) {
        this.figure = figure;
    }

    @Override
    public String toString() {
        return this.figure != null ? figure.getName() : "null";
    }
}
