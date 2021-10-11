import model.*;
import model.figures.white.*;
import model.figures.black.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    // Доступные фигуры для расстановки на доску
    private final ChessFigure[] whiteFigures = {
            new W_Rook("W_Ro", 0, 0),
            new W_Knight("W_Kn", 1, 0),
            new W_Bishop("W_Bi", 2, 0),
            new W_King("W_Ki", 3,0),
            new W_Queen("W_Qu", 4,0),
            new W_Bishop("W_Bi", 5, 0),
            new W_Knight("W_Kn", 6, 0),
            new W_Rook("W_Ro", 7,0),
            new W_Pawn("W_Pa", 0,1),
            new W_Pawn("W_Pa", 1,1),
            new W_Pawn("W_Pa", 2,1),
            new W_Pawn("W_Pa", 3,1),
            new W_Pawn("W_Pa", 4,1),
            new W_Pawn("W_Pa", 5,1),
            new W_Pawn("W_Pa", 6,1),
            new W_Pawn("W_Pa", 7,1)
    };

    private final ChessFigure[] blackFigures = {
            new B_Rook("B_Ro", 0,7),
            new B_Knight("B_Kn", 1, 7),
            new B_Bishop("B_Bi", 2, 7),
            new B_King("B_Ki", 3,7),
            new B_Queen("B_Qu", 4,7),
            new B_Bishop("B_Bi", 5, 7),
            new B_Knight("B_Kn", 6, 7),
            new B_Rook("B_Ro", 7,7),
            new B_Pawn("B_Pa", 0,6),
            new B_Pawn("B_Pa", 1,6),
            new B_Pawn("B_Pa", 2,6),
            new B_Pawn("B_Pa", 3,6),
            new B_Pawn("B_Pa", 4,6),
            new B_Pawn("B_Pa", 5,6),
            new B_Pawn("B_Pa", 6,6),
            new B_Pawn("B_Pa", 7,6)
    };

    // переменная для обозначения состояния игры
    private boolean gameOver = false;
    // Инициализируем доску фигурами
    Board board = new Board(whiteFigures, blackFigures);

    // Создаем игроков и присваиваем им массивы из фигуры
    // Пока игра не окончена совершать поочередно ход

    public void start() {
        Player player1 = new Player(whiteFigures);
        Player player2 = new Player(blackFigures);
        board.printBoard();

        while (!gameOver) {
            makeMove(player1);
            makeMove(player2);
            board.printBoard();
        }
    }

    // Скопировать массив доступных фигур для игрока в новый ArrayList
    // Пока в списке есть фигуры ->
        // выбрать фигуру
        // выбрать шаги
        // скопировать массив доступных ходов для фигуры в новый ArrayList
        // Пока в списке есть движения ->
            // выбрать случайное движение
            // Если движение возможно ->
                // сделать ход
                // выйти из цикла
            // Если нет
        // убрать движение из массива
    // убрать фигуру из массива
    // если фигур не осталось - игра закончена

    public void makeMove(Player player) {
        List<ChessFigure> figures = new ArrayList<>(Arrays.asList(player.getFigures()));
        while (figures.size() > 0) {
            ChessFigure pickedFigure = (ChessFigure) player.pickRandom(figures);
            int steps = player.pickSteps(pickedFigure);
            List<Move> possibleMoves = new ArrayList<>(Arrays.asList(pickedFigure.getPossibleMoves()));
            while (possibleMoves.size() > 0) {
                Move pickedMove = (Move) player.pickRandom(possibleMoves);
                if (moveIsPossible(pickedFigure, pickedMove, steps)) {
                    move(pickedFigure, pickedMove, steps);
                    return;
                }
                possibleMoves.remove(pickedMove);
            }
            figures.remove(pickedFigure);
        }
        gameOver = true;
    }

    // Если движение возможно
    // Скопировать фигуру через конструктор копирования
    // у копии фигуры выбрать движение на один шаг
        // если путь свободен, т.е. координаты заданы в рамках поля И клетка не имеет фигуру
            // переместиться еще на один шаг
        // в противном случае вернуть false
    // если все шаги пройдены - вернуть true

    public boolean moveIsPossible(ChessFigure figure, Move move, int steps) {
        ChessFigure futureFigure = new ChessFigure(figure);
        int i = 1;
        int oneStep = 1;
        while (i <= steps) {
            futureFigure.makeMove(move, oneStep);
            int x = futureFigure.getX();
            int y = futureFigure.getY();
            if (wayIsClear(x,y)) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    // Путь свободен, т.е. координаты заданы в рамках поля И клетка не имеет фигуру

    public boolean wayIsClear(int x, int y) {
        return board.checkCoordinates(x,y) && board.getFigure(x,y) == null;
    }

    // Ход
    // Убрать с доски фигуру с текущими координатами
    // Совершить ход
    // Клетке доски присвоить фигуру с новыми координатами

    public void move(ChessFigure figure, Move move, int steps) {
        board.clearBoardPoint(figure);
        figure.makeMove(move, steps);
        board.setFigure(figure);
    }
}

