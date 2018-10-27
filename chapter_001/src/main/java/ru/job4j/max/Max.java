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
     * @return Ответ.
     */
    public int max(int first, int second) {

        return (first > second) ? first : second;

    }
    /**
     * Max из трех чисел.
     * @param first первое число.
     * @param second второе число.
     * @param third второе число.
     * @return Вызов метода в методе.
     */
    public int maxThree(int first, int second, int third) {
    return max(max(first, second), max(second, third));
    }
}
