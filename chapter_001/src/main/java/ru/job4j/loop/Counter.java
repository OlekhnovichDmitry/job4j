package ru.job4j.loop;
/**
 * Считаем числа.
 *
 * @author Dmitry Olekhnovich
 * @version $Id$
 * @since 0.1
 */

public class Counter {

    /**
     * Конвертируем рубли в евро.
     * @param start начало счета.
     * @param finish конец счета
     * @return сумма четных чисел.
     */
    public int add(int start, int finish) {
        int count = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                count += i;
            }
        }
        return count;
    }
}
