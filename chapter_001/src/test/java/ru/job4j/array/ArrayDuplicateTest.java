package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test работа с  массивами. Удаляем дубликаты.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicateTest {
/**
 * Test работа с  массивами. Удаляем 2 дубликатa.
 */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = duplicate.remove(input);
        String[] expect = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result,is(expect));

    }
    /**
     * Test работа с  массивами. Удаляем 3 дубликатa.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateTwo() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир", "Год", "Мир", "Лорд"};
        String[] result = duplicate.remove(input);
        String[] expect = new String[] {"Привет", "Мир", "Лорд", "Супер", "Год"};
        assertThat(result,is(expect));
    }

}
