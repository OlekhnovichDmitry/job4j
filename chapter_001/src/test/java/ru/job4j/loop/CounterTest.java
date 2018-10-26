package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test для подсчета чисел
 *
 * @version $Id$
 * @autor Dmitry
 * @since 0.1
 */

public class CounterTest {
    /**
     * Проверка подсчета четных чисел.
     */
    @Test
    public void count10() {
        Counter count = new Counter();
        int result = count.add(1, 10);
        assertThat(result, is(30));

    }
}
