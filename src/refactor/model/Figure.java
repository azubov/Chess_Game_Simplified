package refactor.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
    private final String name;
    private final Color color;
    protected List<Point> possibleMoves = new ArrayList<>();
    private Point point;
    protected boolean thereIsFigure;

    public Figure(String name, Color color, Point point) {
        this.name = name;
        this.color = color;
        this.point = point;
    }

    public void getPossibleMoves(Board board) {
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

    protected void forward(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.forward(x, y);
        thereIsFigure = false;
        while (checkCoordinates(point.getX(), point.getY()) && !thereIsFigure) {
            calculatePossibleMove(board, point);
            point = Moves.forward(x, ++y);
        }
    }

    protected void backward(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.backward(x, y);
        thereIsFigure = false;
        while (checkCoordinates(point.getX(), point.getY()) && !thereIsFigure) {
            calculatePossibleMove(board, point);
            point = Moves.backward(x, --y);
        }
    }

    protected void toTheRight(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.toTheRight(x, y);
        thereIsFigure = false;
        while (checkCoordinates(point.getX(), point.getY()) && !thereIsFigure) {
            calculatePossibleMove(board, point);
            point = Moves.toTheRight(++x, y);
        }
    }

    protected void toTheLeft(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.toTheLeft(x, y);
        thereIsFigure = false;
        while (checkCoordinates(point.getX(), point.getY()) && !thereIsFigure) {
            calculatePossibleMove(board, point);
            point = Moves.toTheLeft(--x, y);
        }
    }

    protected void diagonalUpRight(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.diagonalUpRight(x, y);
        thereIsFigure = false;
        while (checkCoordinates(point.getX(), point.getY()) && !thereIsFigure) {
            calculatePossibleMove(board, point);
            point = Moves.diagonalUpRight(++x, ++y);
        }
    }

    protected void diagonalUpLeft(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.diagonalUpLeft(x, y);
        thereIsFigure = false;
        while (checkCoordinates(point.getX(), point.getY()) && !thereIsFigure) {
            calculatePossibleMove(board, point);
            point = Moves.diagonalUpLeft(--x, ++y);
        }
    }

    protected void diagonalDownRight(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.diagonalDownRight(x, y);
        thereIsFigure = false;
        while (checkCoordinates(point.getX(), point.getY()) && !thereIsFigure) {
            calculatePossibleMove(board, point);
            point = Moves.diagonalDownRight(++x, --y);
        }
    }

    protected void diagonalDownLeft(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.diagonalDownLeft(x, y);
        thereIsFigure = false;
        while (checkCoordinates(point.getX(), point.getY()) && !thereIsFigure) {
            calculatePossibleMove(board, point);
            point = Moves.diagonalDownLeft(--x, --y);
        }
    }

    protected void knightVerticalUpRight(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.knightVerticalUpRight(x, y);
        this.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !this.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    protected void knightVerticalUpLeft(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.knightVerticalUpLeft(x, y);
        this.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !this.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    protected void knightVerticalDownRight(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.knightVerticalDownRight(x, y);
        this.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !this.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    protected void knightVerticalDownLeft(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.knightVerticalDownLeft(x, y);
        this.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !this.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    protected void knightHorizontalUpRight(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.knightHorizontalUpRight(x, y);
        this.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !this.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    protected void knightHorizontalUpLeft(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.knightHorizontalUpLeft(x, y);
        this.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !this.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    protected void knightHorizontalDownRight(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.knightHorizontalDownRight(x, y);
        this.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !this.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    protected void knightHorizontalDownLeft(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.knightHorizontalDownLeft(x, y);
        this.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !this.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    protected void calculatePossibleMove(Board board, Point point) {

        Figure nextFigure = getNextFigure(board, point);

        if (attackIsClear(nextFigure)) {
            addMove(point);
            thereIsFigure = true;
            return;
        }

        if (isFriendly(nextFigure)) {
            thereIsFigure = true;
            return;
        }

        if (wayIsClear(nextFigure) && checkCoordinates(point.getX(), point.getY())) {
            addMove(point);
        }
    }

    protected Figure getNextFigure(Board board, Point point) {
        return checkCoordinates(point.getX(), point.getY()) ? board.getFigure(point) : null;
    }

    protected void addMove(Point point) {
        this.possibleMoves.add(point);
    }

    protected boolean wayIsClear(Figure figure) {
        return figure == null;
    }

    protected boolean checkCoordinates(int x, int y) {
        return onTheField(x) && onTheField(y);
    }

    protected boolean onTheField(int point) {
        return point >= 0 && point < Board.BOARD_SIZE;
    }

    protected boolean attackIsClear(Figure figure) {
        return figure != null && figure.getColor() != this.getColor();
    }

    protected boolean isFriendly(Figure figure)  {
        return figure != null && figure.getColor() == this.getColor();
    }

    @Override
    public String toString() {
        return name;
    }
}


