package model;

public class ChessFigure extends FigurePoint {
    private final String name;
    private final int maxSteps;
    private final Move[] possibleMoves;

    public ChessFigure(String name, int x, int y, int maxSteps, Move[] possibleMoves) {
        super(x, y);
        this.name = name;
        this.maxSteps = maxSteps;
        this.possibleMoves = possibleMoves;
    }

    private boolean isValid(int steps) {
        return (0 < steps) && (steps <= maxSteps);
    }

    protected void forward(int steps) {
        if (isValid(steps)) {
            for (int i = 0; i < steps; i++) {
                int y = super.getY();
                y += 1;
                super.setY(y);

            }
        }
    }
    protected void backward(int steps) {
        if (isValid(steps)) {
            for (int i = 0; i < steps; i++) {
                int y = super.getY();
                super.setY(--y);
            }
        }
    }

    protected void toTheRight(int steps) {
        if (isValid(steps)) {
            for (int i = 0; i < steps; i++) {
                int x = super.getX();
                super.setX(++x);
            }
        }
    }

    protected void toTheLeft(int steps) {
        if (isValid(steps)) {
            for (int i = 0; i < steps; i++) {
                int x = super.getX();
                super.setX(--x);
            }
        }
    }
    protected void diagonalUpRight(int steps) {
        forward(steps);
        toTheRight(steps);
    }

    protected void diagonalUpLeft(int steps) {
        forward(steps);
        toTheLeft(steps);
    }

    protected void diagonalDownRight(int steps) {
        backward(steps);
        toTheRight(steps);
    }

    protected void diagonalDownLeft(int steps) {
        backward(steps);
        toTheLeft(steps);
    }

    protected void knightUpRight(int steps) {
        if (isValid(steps)) {
            int x = super.getX();
            int y = super.getY();
            super.setPoint(x + 1, y + 2);
        }
    }

    protected void knightUpLeft(int steps) {
        if (isValid(steps)) {
            int x = super.getX();
            int y = super.getY();
            super.setPoint(x - 1, y + 2);
        }
    }

    protected void knightDownRight(int steps) {
        if (isValid(steps)) {
            int x = super.getX();
            int y = super.getY();
            super.setPoint(x + 1, y - 2);
        }
    }

    protected void knightDownLeft(int steps) {
        if (isValid(steps)) {
            int x = super.getX();
            int y = super.getY();
            super.setPoint(x - 1, y - 2);
        }
    }

    public String getName() {
        return name;
    }

    public int getMaxSteps() {
        return maxSteps;
    }

    public void makeMove(Move pickedMove, int steps) {
        for (Move possibleMove : possibleMoves) {
            if (possibleMove == pickedMove) {
                pickedMove.action(this, steps);
            }
        }
    }

    public Move[] getPossibleMoves() {
        return possibleMoves;
    }
}
