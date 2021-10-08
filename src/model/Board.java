package model;

import model.figures.*;

public class Board {
    private static final int BOARD_SIZE = 8;
    Point[][] board = new Point[BOARD_SIZE][BOARD_SIZE];

    private ChessFigure[] white = {
            new Rook("Rook", 0, 0),
            new Knight("Knight", 1, 0),
            new Bishop("Bishop", 2, 0),
            new King("King", 3,0),
            new Queen("Queen", 4,0),
            new Bishop("Bishop", 5, 0),
            new Knight("Knight", 6, 0),
            new Rook("Rook", 7,0),
            new Pawn("Pawn", 0,1),
            new Pawn("Pawn", 1,1),
            new Pawn("Pawn", 2,1),
            new Pawn("Pawn", 3,1),
            new Pawn("Pawn", 4,1),
            new Pawn("Pawn", 5,1),
            new Pawn("Pawn", 6,1),
            new Pawn("Pawn", 7,1)
    };

    private ChessFigure[] black = {
            new Rook("Rook", 0,7),
            new Knight("Knight", 1, 7),
            new Bishop("Bishop", 2, 7),
            new King("King", 3,7),
            new Queen("Queen", 4,7),
            new Bishop("Bishop", 5, 7),
            new Knight("Knight", 6, 7),
            new Rook("Rook", 7,7),
            new Pawn("Pawn", 0,6),
            new Pawn("Pawn", 1,6),
            new Pawn("Pawn", 2,6),
            new Pawn("Pawn", 3,6),
            new Pawn("Pawn", 4,6),
            new Pawn("Pawn", 5,6),
            new Pawn("Pawn", 6,6),
            new Pawn("Pawn", 7,6)
    };

    public Board() {
        initBoard();
//        initChess();
    }

    private void initBoard() {
        for (int x = 0; x < BOARD_SIZE; x++) {
            for (int y = 0; y < BOARD_SIZE; y++) {
                board[x][y] = new Point(x,y);
            }
        }
    }

    private void initChess() {
        for (int i = 0; i < white.length; i++) {
            ChessFigure whiteFigure = white[i];
            ChessFigure blackFigure = black[i];
            setFigure(whiteFigure);
            setFigure(blackFigure);
        }
    }

    private void setFigure(ChessFigure chessFigure) {
        int x = chessFigure.getX();
        int y = chessFigure.getY();

        if (checkCoordinates(x, y)) {
            board[x][y] = chessFigure;
        }
    }

    private boolean checkCoordinates(int x, int y) {
        return (checkCoordinate(x) && checkCoordinate(y));
    }

    private boolean checkCoordinate(int coordinate) {
        return (0 <= coordinate) && (coordinate <= BOARD_SIZE-1);
    }

    public void printBoard() {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board.length; y++) {
                Point point = board[x][y];
                System.out.println(point.toString());
            }
        }
    }

    //model.Board of points

}
