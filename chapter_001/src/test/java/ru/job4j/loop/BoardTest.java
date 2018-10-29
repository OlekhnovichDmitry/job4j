package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    @Test
    public void when3x3() {
        Board board = new Board();
        String rs1 = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rs1, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
        ));
    }
}
