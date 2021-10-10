import model.*;
import model.figures.*;

public class Game {
    private final ChessFigure[] whiteFigures = {
            new Rook("W_Rook", 0, 0),
            new Knight("W_Knight", 1, 0),
            new Bishop("W_Bishop", 2, 0),
            new King("W_King", 3,0),
            new Queen("W_Queen", 4,0),
            new Bishop("W_Bishop", 5, 0),
            new Knight("W_Knight", 6, 0),
            new Rook("W_Rook", 7,0),
            new Pawn("W_Pawn", 0,1),
            new Pawn("W_Pawn", 1,1),
            new Pawn("W_Pawn", 2,1),
            new Pawn("W_Pawn", 3,1),
            new Pawn("W_Pawn", 4,1),
            new Pawn("W_Pawn", 5,1),
            new Pawn("W_Pawn", 6,1),
            new Pawn("W_Pawn", 7,1)
    };

    private final ChessFigure[] blackFigures = {
            new Rook("B_Rook", 0,7),
            new Knight("B_Knight", 1, 7),
            new Bishop("B_Bishop", 2, 7),
            new King("B_King", 3,7),
            new Queen("B_Queen", 4,7),
            new Bishop("B_Bishop", 5, 7),
            new Knight("B_Knight", 6, 7),
            new Rook("B_Rook", 7,7),
            new Pawn("B_Pawn", 0,6),
            new Pawn("B_Pawn", 1,6),
            new Pawn("B_Pawn", 2,6),
            new Pawn("B_Pawn", 3,6),
            new Pawn("B_Pawn", 4,6),
            new Pawn("B_Pawn", 5,6),
            new Pawn("B_Pawn", 6,6),
            new Pawn("B_Pawn", 7,6)
    };

    Board board = new Board(whiteFigures, blackFigures);

    public Game() {
        board.printBoard();
    }

    public void start() {

        Player player1 = new Player(whiteFigures);
//        Player player2 = new Player(blackFigures);

        makeMove(player1);
        board.printBoard();

    }

    public void makeMove(Player player) {
        // Получаем список доступных фигур для игрока
        // Игрок выбирает случайную фигуру из списка доступных ему фигур
        // Получает массив возможных движений для этой фигуры
        // Из массива выбирает 1 возможное случайное движение
        // Выбирает случайное значение из возможного количество шагов для этой фигуры
        // У выбранной фигуры вызывает(движение, и шаги)
        // Назначаем координаты фигуры на координаты доски

        ChessFigure[] playerFigures = player.getFigures();
//        ChessFigure pickedFigure = (ChessFigure) player.pickRandom(playerFigures);
        ChessFigure pickedFigure = playerFigures[1];
        board.clearBoardPoint(pickedFigure);
        Move[] possibleMoves = pickedFigure.getPossibleMoves();
        Move pickedMove = (Move) player.pickRandom(possibleMoves);
        int steps = player.pickSteps(pickedFigure);
        pickedFigure.makeMove(pickedMove, steps);

        board.setFigure(pickedFigure);

        //FigureCoordinates
        //Board
        // if FigureCoordinates + someMove != figure && FigureCoordinates + someMove != outOfBoard { makeMove }
    }
}

