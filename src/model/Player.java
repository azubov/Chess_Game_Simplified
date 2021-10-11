package model;

import java.util.List;
import java.util.Random;

// Игрок
// Получает список доступных фигур через конструктор
// Выбирает случайную фигуру или движение
// Выбирает случайное значение из возможного количество шагов для переданной фигуры

public class Player {
    private final ChessFigure[] figures;

    public Player(ChessFigure[] figures) {
        this.figures = figures;
    }

    public Object pickRandom(List<?> objects) {
        int index = new Random().nextInt(objects.size());
        return objects.get(index);
    }

    public int pickSteps(ChessFigure figure) {
        int figureMaxSteps = figure.getMaxSteps();
        return new Random().nextInt(figureMaxSteps)+1;
    }

    public ChessFigure[] getFigures() {
        return figures;
    }

}

