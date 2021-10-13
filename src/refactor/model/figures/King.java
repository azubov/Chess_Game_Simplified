package refactor.model.figures;

// OK

import refactor.model.*;

public class King extends Figure {

    public King(String name, Color color, Point point) {
        super(name, color, point);
    }

    @Override
    public void getPossibleMoves(Board board) {
        System.out.println("king");
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

    public void forward(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.forward(x, y);
        super.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !super.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    public void backward(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.backward(x, y);
        super.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !super.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    public void toTheRight(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.toTheRight(x, y);
        super.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !super.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    public void toTheLeft(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.toTheLeft(x, y);
        super.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !super.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    public void diagonalUpRight(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.diagonalUpRight(x, y);
        super.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !super.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    public void diagonalUpLeft(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.diagonalUpLeft(x, y);
        super.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !super.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    public void diagonalDownRight(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.diagonalDownRight(x, y);
        super.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !super.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }

    public void diagonalDownLeft(Board board) {
        Point point = null;
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        point = Moves.diagonalDownLeft(x, y);
        super.thereIsFigure = false;
        if (checkCoordinates(point.getX(), point.getY()) && !super.thereIsFigure) {
            calculatePossibleMove(board, point);
        }
    }
    
    
}