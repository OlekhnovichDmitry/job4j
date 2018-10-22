package ru.job4j.calculate;

/**
 * Вывод строки в консоль.
 *
 * @author Dmitry Olekhnovich
 * @version $Id$
 * @since 0.1
 */

public class Calculator {
    double result;

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void subtraction(double first, double second) {
        this.result = first - second;
    }

    public void div(double first, double second) {
        this.result = first / second;
    }

    public void multiplication(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;

    }
}
