package ru.job4j.array;
/**
 * работа с многомерными массивами. Сверяем диогональ.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * Многомерные массивы. Проверяем соответствие диогонали.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
            for (int row = 0; row != data.length - 1; row++) {
               int column = row;
                    if (data[row][column] != data[row + 1][column + 1]) {
                        result = false;
                        break;
                    }
                    if (data[data.length - 1 - row][column] != data[data.length - 2 - row][column + 1]) {
                        result = false;
                        break;

                }
            }
        return result;
    }
}
