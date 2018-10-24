package ru.job4j.max;
/**
 * @autor Dmitry.
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Max из двух чисел.
     * @param first первое число.
     * @param second второе число.
     * @max Ответ.
     */
    public int max(int first, int second) {

        int max = (first > second) ? first : second;
        return max;
    }
}
