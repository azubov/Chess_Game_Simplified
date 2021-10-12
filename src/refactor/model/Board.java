package refactor.model;

import refactor.Point;

import java.util.List;

public class Board {
    private static final int BOARD_SIZE = 8;
    Figure[][] board = new Figure[BOARD_SIZE][BOARD_SIZE];

    public Board(List<Figure> white, List<Figure> black) {
        initChess(white, black);
    }

    // Инициализируем точки фигурами

    private void initChess(List<Figure> white, List<Figure> black) {
        for (int i = 0; i < white.size(); i++) {
            Figure whiteFigure = white.get(i);
            Figure blackFigure = black.get(i);
            setFigure(whiteFigure);
            setFigure(blackFigure);
        }
    }

    public void setFigure(Figure figure) {
        int x = figure.getPoint().getX();
        int y = figure.getPoint().getY();
        board[x][y] = figure;
    }

    public Figure getFigure(Point point) {
        int x = point.getX();
        int y = point.getY();
        return board[x][y];
    }

    public void printBoard() {
        for (int y = BOARD_SIZE-1; y >= 0; y--) {
            System.out.println();
            for (int x = 0; x < BOARD_SIZE; x++) {
                if (board[x][y] != null) {
                    Figure figure = board[x][y];
                    System.out.print(figure.getName() + " | ");
                } else {
                    System.out.print( "____" + " | ");
                }
            }
        }
        System.out.println();
    }

}
