package model;

// Доска
// Состоит из точек

public class Board {
    private static final int BOARD_SIZE = 8;
    BoardPoint[][] board = new BoardPoint[BOARD_SIZE][BOARD_SIZE];

    public Board(ChessFigure[] white, ChessFigure[] black) {
        initBoard();
        initChess(white, black);
    }

    private void initBoard() {
        for (int x = 0; x < BOARD_SIZE; x++) {
            for (int y = 0; y < BOARD_SIZE; y++) {
                board[x][y] = new BoardPoint(x,y);
            }
        }
    }

    private void initChess(ChessFigure[] white, ChessFigure[] black) {
        for (int i = 0; i < white.length; i++) {
            ChessFigure whiteFigure = white[i];
            ChessFigure blackFigure = black[i];
            setFigure(whiteFigure);
            setFigure(blackFigure);
        }
    }

    public void setFigure(ChessFigure chessFigure) {
        int x = chessFigure.getX();
        int y = chessFigure.getY();
        if (checkCoordinates(x, y)) {
            BoardPoint boardPoint = board[x][y];
            boardPoint.setFigure(chessFigure);
        }
    }

    public void clearBoardPoint(ChessFigure figure) {
        int x = figure.getX();
        int y = figure.getY();
        BoardPoint boardPoint = board[x][y];
        boardPoint.setFigure(null);
    }

    private boolean checkCoordinates(int x, int y) {
        return (checkCoordinate(x) && checkCoordinate(y));
    }

    private boolean checkCoordinate(int coordinate) {
        return (0 <= coordinate) && (coordinate <= BOARD_SIZE-1);
    }

    public void printBoard() {
        for (int y = BOARD_SIZE-1; y >= 0; y--) {
            System.out.println();
            for (BoardPoint[] boardPoints : board) {
                BoardPoint boardPoint = boardPoints[y];
                System.out.print(boardPoint.toString() + " | ");
            }
        }
        System.out.println();
    }
}
