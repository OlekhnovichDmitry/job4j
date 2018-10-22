package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    /**
     * test Расстояния между точками.
     */
    @Test
    public void PointRasst() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);

        double rasst = a.distanceTo(b);
        double rasstTest = Math.sqrt(
                Math.pow(0 - 2, 2) + Math.pow(1 - 5, 2)
        );

        assertThat(rasst, is(rasstTest));
    }
}
