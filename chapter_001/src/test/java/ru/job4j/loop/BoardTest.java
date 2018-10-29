package ru.job4j.loop;
/**
 * Test рисунка.
 *
 * @version $Id$
 * @autor Dmitry
 * @since 0.1
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    /**
     * Проверка рисунка доски 3x3.
     */
    @Test
    public void whenPaintBoardWithWidthThreeAdnThreeThenStringWidthThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X X%s X %sX X%s", line, line, line);
        assertThat(result, is(expected));
    }
    /**
     * Проверка рисунка доски 4x5.
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(4, 5);
        final String line = System.getProperty("line.separator");
        String expected = String.format(" X X %sX X X%s X X %sX X X%s", line, line, line, line);
        assertThat(result, is(expected));
    }
}
