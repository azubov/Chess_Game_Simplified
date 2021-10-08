package model.figures;

import model.ChessFigure;

public class King extends ChessFigure {

    private static final int MAX_POSSIBLE_STEPS = 1;

    public King(String name, int x, int y) {
        super(name, x, y, MAX_POSSIBLE_STEPS);
    }

    public void forward(int steps) {
        super.forward(steps);
    }
    
    public void backward(int steps) {
        super.backward(steps);
    }
    
    public void toTheRight(int steps) {
        super.toTheRight(steps);
    }
    
    public void toTheLeft(int steps) {
        super.toTheLeft(steps);
    }
    
    public void diagonalUpRight(int steps) {
        super.diagonalUpRight(steps);
    }
    
    public void diagonalUpLeft(int steps) {
        super.diagonalUpLeft(steps);
    }
    
    public void diagonalDownRight(int steps) {
        super.diagonalDownRight(steps);
    }
    
    public void diagonalDownLeft(int steps) {
        super.diagonalDownLeft(steps);
    }
}
