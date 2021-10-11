package model;

// Список доступных ходов для перебора

public enum Move{
    W_FORWARD {
        public void action(ChessFigure figure, int steps){
            figure.forward(steps);
        }
    },
    W_BACKWARD{
        public void action(ChessFigure figure, int steps){
            figure.backward(steps);
        }
    },
    W_RIGHT{
        public void action(ChessFigure figure, int steps){
            figure.toTheRight(steps);
        }
    },
    W_LEFT {
        public void action(ChessFigure figure, int steps){
            figure.toTheLeft(steps);
        }
    },
    W_DIAGONAL_UP_RIGHT {
        public void action(ChessFigure figure, int steps){
            figure.diagonalUpRight(steps);
        }
    },
    W_DIAGONAL_UP_LEFT {
        public void action(ChessFigure figure, int steps){
            figure.diagonalUpLeft(steps);
        }
    },
    W_DIAGONAL_DOWN_RIGHT {
        public void action(ChessFigure figure, int steps){
            figure.diagonalUpLeft(steps);
        }
    },
    W_DIAGONAL_DOWN_LEFT {
        public void action(ChessFigure figure, int steps){
            figure.diagonalDownLeft(steps);
        }
    },
    W_KNIGHT_UP_RIGHT {
        public void action(ChessFigure figure, int steps){
            figure.knightUpRight(steps);
        }
    },
    W_KNIGHT_UP_LEFT {
        public void action(ChessFigure figure, int steps){
            figure.knightUpLeft(steps);
        }
    },
    W_KNIGHT_DOWN_RIGHT {
        public void action(ChessFigure figure, int steps){
            figure.knightDownRight(steps);
        }
    },
    W_KNIGHT_DOWN_LEFT {
        public void action(ChessFigure figure, int steps){
            figure.knightDownLeft(steps);
        }
    },

    B_FORWARD {
        public void action(ChessFigure figure, int steps){
            figure.backward(steps);
        }
    },
    B_BACKWARD{
        public void action(ChessFigure figure, int steps){
            figure.forward(steps);
        }
    },
    B_RIGHT{
        public void action(ChessFigure figure, int steps){
            figure.toTheLeft(steps);
        }
    },
    B_LEFT {
        public void action(ChessFigure figure, int steps){
            figure.toTheRight(steps);
        }
    },
    B_DIAGONAL_UP_RIGHT {
        public void action(ChessFigure figure, int steps){
            figure.diagonalDownLeft(steps);
        }
    },
    B_DIAGONAL_UP_LEFT {
        public void action(ChessFigure figure, int steps){
            figure.diagonalDownRight(steps);
        }
    },
    B_DIAGONAL_DOWN_RIGHT {
        public void action(ChessFigure figure, int steps){
            figure.diagonalUpLeft(steps);
        }
    },
    B_DIAGONAL_DOWN_LEFT {
        public void action(ChessFigure figure, int steps){
            figure.diagonalUpRight(steps);
        }
    },
    B_KNIGHT_UP_RIGHT {
        public void action(ChessFigure figure, int steps){
            figure.knightDownLeft(steps);
        }
    },
    B_KNIGHT_UP_LEFT {
        public void action(ChessFigure figure, int steps){
            figure.knightDownRight(steps);
        }
    },
    B_KNIGHT_DOWN_RIGHT {
        public void action(ChessFigure figure, int steps){
            figure.knightUpLeft(steps);
        }
    },
    B_KNIGHT_DOWN_LEFT {
        public void action(ChessFigure figure, int steps){
            figure.knightUpRight(steps);
        }
    };

    public abstract void action(ChessFigure figure, int steps);
}