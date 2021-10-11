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

    // Инициализируем доску точками

    private void initBoard() {
        for (int x = 0; x < BOARD_SIZE; x++) {
            for (int y = 0; y < BOARD_SIZE; y++) {
                board[x][y] = new BoardPoint(x,y);
            }
        }
    }

    // Инициализируем точки фигурами

    private void initChess(ChessFigure[] white, ChessFigure[] black) {
        for (int i = 0; i < white.length; i++) {
            ChessFigure whiteFigure = white[i];
            ChessFigure blackFigure = black[i];
            setFigure(whiteFigure);
            setFigure(blackFigure);
        }
    }

    // Через координаты получить фигуру

    public ChessFigure getFigure(int x, int y) {
        return getBoardPoint(x,y).getFigure();
    }

    // Назначить фигуру на поле доски согласно координатам фигуры

    public void setFigure(ChessFigure chessFigure) {
        int x = chessFigure.getX();
        int y = chessFigure.getY();
        getBoardPoint(x,y).setFigure(chessFigure);
    }

    // Убрать фигуру с поля доски согласно координатам фигуры

    public void clearBoardPoint(ChessFigure figure) {
        int x = figure.getX();
        int y = figure.getY();
        getBoardPoint(x,y).setFigure(null);
    }

    public BoardPoint getBoardPoint(int x, int y) {
        return board[x][y];
    }

    // Проверить каждую координату, на нахождение в пределах доски

    public boolean checkCoordinates(int x, int y) {
        return (checkCoordinate(x) && checkCoordinate(y));
    }

    private boolean checkCoordinate(int coordinate) {
        return (0 <= coordinate) && (coordinate < BOARD_SIZE);
    }

    // Вывести в консоль доску

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
