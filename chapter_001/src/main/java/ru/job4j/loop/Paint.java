package ru.job4j.loop;
/**
 * Рисуем пирамиду
 *
 * @author Dmitry Olekhnovich
 * @version $Id$
 * @since 0.1
 */

public class Paint {
    // реализуем правосторонний треугольник.
    public String rightTrl(int height) {
        //буфер для результата.
        StringBuilder screen = new StringBuilder();
        // Ширина будет равна высоте.
        int weight = height;
        //Внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // Внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != weight; column++) {
                // если строка равна ячейки, то рисуем галку.
                // в данном случае строка определяем, сколько галок будет на строке.
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        //Получаем результат.
        return screen.toString();
    }
    // реализуем левосторонний треугольник.
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    // конечный вариант пирамиды.
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                    } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}