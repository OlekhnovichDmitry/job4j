package ru.job4j.loop;
/**
 * Для подсчета факториала чисел
 *
 * @version $Id$
 * @autor Dmitry
 * @since 0.1
 */
public class Factorial {
    /**
     * подсчета факториала числа
     * @param n посчитать факториал числа
     * @return факториал
     *
     */
    public int calc(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
