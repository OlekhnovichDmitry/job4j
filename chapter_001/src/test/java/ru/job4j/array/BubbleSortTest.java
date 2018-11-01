package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test работа с массивами. Сортировка.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
public class BubbleSortTest {
	/**
	* test работа с массивами. Сортировка методом пузырька.
	*/
	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort sorting = new BubbleSort();
		int[] input = new int[] {6, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] result = sorting.sort(input);
		int[] expect = new int[] {0, 1, 2, 3, 4, 5, 5, 6, 7, 8};
		assertThat(result, is(expect));
	}
}