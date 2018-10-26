package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test для подсчета факториала чисел
 *
 * @version $Id$
 * @autor Dmitry
 * @since 0.1
 */

public class FactorialTest {
    /**
     * Test для подсчета факториала 5 числа
     */
    @Test
    public void factorialFife() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }
    /**
     * Test для подсчета факториала 0 числа
     */
    @Test
    public void factorialZero() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }
}
