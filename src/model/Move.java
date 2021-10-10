package model;

public enum Move{
    FORWARD{
        public void action(ChessFigure figure, int steps){
            figure.forward(steps);
        }
    },
    BACKWARD{
        public void action(ChessFigure figure, int steps){
            figure.backward(steps);
        }
    },
    RIGHT{
        public void action(ChessFigure figure, int steps){
            figure.toTheRight(steps);
        }
    },
    LEFT{
        public void action(ChessFigure figure, int steps){
            figure.toTheLeft(steps);
        }
    },
    DIAGONAL_UP_RIGHT{
        public void action(ChessFigure figure, int steps){
            figure.diagonalUpRight(steps);
        }
    },
    DIAGONAL_UP_LEFT{
        public void action(ChessFigure figure, int steps){
            figure.diagonalUpLeft(steps);
        }
    },
    DIAGONAL_DOWN_RIGHT{
        public void action(ChessFigure figure, int steps){
            figure.diagonalUpLeft(steps);
        }
    },
    DIAGONAL_DOWN_LEFT{
        public void action(ChessFigure figure, int steps){
            figure.diagonalDownLeft(steps);
        }
    },
    KNIGHT_UP_RIGHT{
        public void action(ChessFigure figure, int steps){
            figure.knightUpRight(steps);
        }
    },
    KNIGHT_UP_LEFT{
        public void action(ChessFigure figure, int steps){
            figure.knightUpLeft(steps);
        }
    },
    KNIGHT_DOWN_RIGHT{
        public void action(ChessFigure figure, int steps){
            figure.knightDownRight(steps);
        }
    },
    KNIGHT_DOWN_LEFT{
        public void action(ChessFigure figure, int steps){
            figure.knightDownLeft(steps);
        }
    };

    public abstract void action(ChessFigure figure, int steps);
}