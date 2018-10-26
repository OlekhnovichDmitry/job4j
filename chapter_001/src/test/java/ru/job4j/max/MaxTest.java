package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Dmitry
 * @version $Id$
 * @since 0.1
 */

public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondEqualFirst() {
        Max maxim = new Max();
        int result = maxim.max(3, 3);
        assertThat(result, is(3));
    }

    //тестирование с 3-мя числами
    @Test
    public void whenFirstMoreSecondMoreThird() {
        Max maxim = new Max();
        int result = maxim.maxThree(5, 4, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMoreFirstMoreThird() {
        Max maxim = new Max();
        int result = maxim.maxThree(1, 4, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMoreSecondMoreFirst() {
        Max maxim = new Max();
        int result = maxim.maxThree(1, 2, 3);
        assertThat(result, is(3));
    }
}
