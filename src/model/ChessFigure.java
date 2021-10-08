package model;

public class ChessFigure extends Point {
    private String name;
    private final int maxSteps;

    public ChessFigure(String name, int x, int y, int maxSteps) {
        super(x, y);
        this.name = name;
        this.maxSteps = maxSteps;
    }

    private boolean isValid(int steps) {
        return (0 < steps) && (steps <= maxSteps);
    }

    protected void forward(int steps) {
        if (isValid(steps)) {
            for (int i = 0; i < steps; i++) {
                int y = super.getY();
                super.setY(++y);
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
                super.setY(++x);
            }
        }
    }

    protected void toTheLeft(int steps) {
        if (isValid(steps)) {
            for (int i = 0; i < steps; i++) {
                int x = super.getX();
                super.setY(--x);
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
}
