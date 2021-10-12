package refactor;

import refactor.model.Board;
import refactor.model.Color;
import refactor.model.Figure;
import refactor.model.figures.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {
    private List<Figure> whiteFigures = new ArrayList<>(Arrays.asList(
            new Rook("W_Ro", Color.WHITE, new Point(0,0)),
            new Knight("W_Kn", Color.WHITE, new Point(1, 0)),
            new Bishop("W_Bi", Color.WHITE, new Point(2,0)),
            new King("W_Ki", Color.WHITE, new Point(3,0)),
            new Queen("W_Qu", Color.WHITE, new Point(4,0)),
            new Bishop("W_Bi", Color.WHITE, new Point(5, 0)),
            new Knight("W_Kn", Color.WHITE, new Point(6, 0)),
            new Rook("W_Ro", Color.WHITE, new Point(7,0)),
            new Pawn("W_Pa", Color.WHITE, new Point(0,1)),
            new Pawn("W_Pa", Color.WHITE, new Point(1,1)),
            new Pawn("W_Pa", Color.WHITE, new Point(2,1)),
            new Pawn("W_Pa", Color.WHITE, new Point(3,1)),
            new Pawn("W_Pa", Color.WHITE, new Point(4,1)),
            new Pawn("W_Pa", Color.WHITE, new Point(5,1)),
            new Pawn("W_Pa", Color.WHITE, new Point(6,1)),
            new Pawn("W_Pa", Color.WHITE, new Point(7,1))
    ));

    private List<Figure> blackFigures = new ArrayList<>(Arrays.asList(
            new Rook("B_Ro", Color.BLACK, new Point(0,7)),
            new Knight("B_Kn", Color.BLACK, new Point(1, 7)),
            new Bishop("B_Bi", Color.BLACK, new Point(2, 7)),
            new King("B_Ki", Color.BLACK, new Point(3,7)),
            new Queen("B_Qu", Color.BLACK, new Point(4,7)),
            new Bishop("B_Bi", Color.BLACK, new Point(5, 7)),
            new Knight("B_Kn", Color.BLACK, new Point(6, 7)),
            new Rook("B_Ro", Color.BLACK, new Point(7,7)),
            new Pawn("B_Pa", Color.BLACK, new Point(0,6)),
            new Pawn("B_Pa", Color.BLACK, new Point(1,6)),
            new Pawn("B_Pa", Color.BLACK, new Point(2,6)),
            new Pawn("B_Pa", Color.BLACK, new Point(3,6)),
            new Pawn("B_Pa", Color.BLACK, new Point(4,6)),
            new Pawn("B_Pa", Color.BLACK, new Point(5,6)),
            new Pawn("B_Pa", Color.BLACK, new Point(6,6)),
            new Pawn("B_Pa", Color.BLACK, new Point(7,6))
    ));

    private boolean gameOver = false;
    Board board = new Board(whiteFigures, blackFigures);

    public void start() {
        board.printBoard();
        while(!gameOver) {
            play(whiteFigures);
//            play(blackFigures, board);
        }
    }

    public void play(List<Figure> figures) {
        if (figures.size() > 0) {
//            Figure figure = (Figure) getRandom(figures);
            Figure figure = figures.get(8); //Pawn
            figure.calculatePossibleMoves(board);

            if (figure.getPossibleMoves().size() > 0) {
                Point point = (Point) getRandom(figure.getPossibleMoves());

            }
        } else {
            gameOver = true;
        }
    }

    public Object getRandom(List<?> elements) {
        int index = new Random().nextInt(elements.size());
        return elements.get(index);
    }

    public static void main(String[] args) {
        new Game().start();
    }
}
