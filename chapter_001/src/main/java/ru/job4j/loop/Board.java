package ru.job4j.loop;
/**
 * Рисуем
 *
 * @author Dmitry Olekhnovich
 * @version $Id$
 * @since 0.1
 */

public class Board {
    /**
     * Рисуем шахматную доску
     * @param width ширина доски.
     * @param height высота доски
     * @return доска.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = width; i > 0; i--) {
            for (int j = height; j > 0; j--) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}