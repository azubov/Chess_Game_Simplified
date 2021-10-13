package refactor.model;

public class Moves {

    // Варианты доступных ходов для всех фигур

    public static Point forward(int x, int y) {
        y += 1;
        return new Point(x, y);
    }
    public static Point backward(int x, int y) {
        y -= 1;
        return new Point(x, y);
    }

    public static Point toTheRight(int x, int y) {
        x += 1;
        return new Point(x, y);
    }

    public static Point toTheLeft(int x, int y) {
        x -= 1;
        return new Point(x, y);
    }
    public static Point diagonalUpRight(int x, int y) {
        y += 1;
        x += 1;
        return new Point(x, y);
    }

    public static Point diagonalUpLeft(int x, int y) {
        y += 1;
        x -= 1;
        return new Point(x, y);
    }

    public static Point diagonalDownRight(int x, int y) {
        y -= 1;
        x += 1;
        return new Point(x, y);
    }

    public static Point diagonalDownLeft(int x, int y) {
        y -= 1;
        x -= 1;
        return new Point(x, y);
    }

    public static Point knightVerticalUpRight(int x, int y) {
        y += 2;
        x += 1;
        return new Point(x, y);
    }

    public static Point knightVerticalUpLeft(int x, int y) {
        y += 2;
        x -= 1;
        return new Point(x, y);
    }

    public static Point knightVerticalDownRight(int x, int y) {
        y -= 2;
        x += 1;
        return new Point(x, y);
    }

    public static Point knightVerticalDownLeft(int x, int y) {
        y -= 2;
        x -= 1;
        return new Point(x, y);
    }

    public static Point knightHorizontalUpRight(int x, int y) {
        x += 2;
        y += 1;
        return new Point(x, y);
    }

    public static Point knightHorizontalUpLeft(int x, int y) {
        x += 2;
        y -= 1;
        return new Point(x, y);
    }

    public static Point knightHorizontalDownRight(int x, int y) {
        x -= 2;
        y += 1;
        return new Point(x, y);
    }

    public static Point knightHorizontalDownLeft(int x, int y) {
        x -= 2;
        y -= 1;
        return new Point(x, y);
    }
}
