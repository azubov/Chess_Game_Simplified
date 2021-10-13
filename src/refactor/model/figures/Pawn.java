package refactor.model.figures;

// OK

import refactor.model.*;

public class Pawn extends Figure {

    public Pawn(String name, Color color, Point point) {
        super(name, color, point);
    }

    @Override
    public void getPossibleMoves(Board board) {
        System.out.println("pawn");

        int x = super.getPoint().getX();
        int y = super.getPoint().getY();

        checkSteps(board, x, y);

        if (pawnsFirstMove()) {
            y++;
            checkSteps(board, x, y);
        }
    }

    public void checkSteps(Board board, int x, int y) {
        Point point = makePoint(x, y);

        int attackRight = point.getX() + 1;
        Point attackPointRight = makeAttackPoint(attackRight, point.getY());

        int attackLeft = point.getX() - 1;
        Point attackPointLeft = makeAttackPoint(attackLeft, point.getY());

        Figure nextFigure = getNextFigure(board, point);
        Figure attackFigureRight = getNextAttackFigure(board, attackPointRight);
        Figure attackFigureLeft = getNextAttackFigure(board, attackPointLeft);

        if (wayIsClear(nextFigure) && checkCoordinates(point.getX(), point.getY())) {
            addMove(point);
        }
        if (attackIsClear(attackFigureRight)) {
            addMove(attackPointRight);
        }
        if (attackIsClear(attackFigureLeft)) {
            addMove(attackPointLeft);
        }
    }

    public Point makePoint(int x, int y) {
        return super.getColor() == Color.WHITE ? Moves.forward(x, y) : Moves.backward(x,y);
    }

    public Point makeAttackPoint(int x, int y) {
        return checkCoordinates(x, y) ? new Point(x, y) : null;
    }

    public Figure getNextAttackFigure(Board board, Point point) {
        return point != null ? board.getFigure(point) : null;
    }

    public boolean pawnsFirstMove() {
        return super.getPoint().getY() == 1;
    }
}