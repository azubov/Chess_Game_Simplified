package model;

import java.util.Random;

public class Player {

    private final ChessFigure[] figures;

    public Player(ChessFigure[] figures) {
        this.figures = figures;
    }

    public Object pickRandom(Object[] objects) {
        int index = new Random().nextInt(objects.length);
        return objects[index];
    }

    public int pickSteps(ChessFigure figure) {
        int figureMaxSteps = figure.getMaxSteps();
        return new Random().nextInt(figureMaxSteps)+1;
    }

    public ChessFigure[] getFigures() {
        return figures;
    }
}

