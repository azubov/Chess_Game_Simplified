package model.figures;

import model.ChessFigure;
import model.Move;

public class Pawn extends ChessFigure {

    public static final int MAX_POSSIBLE_STEPS = 2;
    public static final Move[] POSSIBLE_MOVES = {Move.FORWARD};

    public Pawn(String name, int x, int y) {
        super(name, x, y, MAX_POSSIBLE_STEPS, POSSIBLE_MOVES);
    }

//    public Pawn(Point point) {
//        point.setFigure(this);
//    }

//    public void moveTo(Point destinationPoint) {
//        Point currentPoint = this.getPoint();
//        currentPoint.setFigure(null);
//        destinationPoint.setFigure(this);
//    }

    public void forward(int steps) {
        super.forward(steps);
    }



}
