package ru.job4j.loop;
import java.util.function.BiPredicate;
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
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }
    // реализуем левосторонний треугольник.
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }
    // конечный вариант пирамиды.
    public String pyramid(int height) {
       return this.loopBy(
               height,
               2 * height - 1,
               (row, column) -> row >= height - column - 1 && row + height - 1 >= column
       );
    }

    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
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