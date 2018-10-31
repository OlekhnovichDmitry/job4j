package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test массивы на поиск элементов.
 *
 * @version $Id$
 * @autor Dmitry Olekhnovich.
 * @since 0.1
 */
public class FindLoopTest {
	/**
	* Test поиск первого элемента.
	*/
	@Test
	public void whenArrayHasLength5Then0() {
		FindLoop find = new FindLoop();
		int[] input = new int[] {5, 10, 3};
		int value = 5;
		int result = find.indexOf(input, value);
		int expect = 0;
		assertThat(result, is(expect));
	}
	/**
	 * Test поиск последнего элемента.
	 */
	@Test
	public void whenArrayHasLenght9Then8() {
		FindLoop find = new FindLoop();
		int[] input = new int[] {5, 6, 5, 3, 4, 7, 1, 2, 9};
		int value = 9;
		int result = find.indexOf(input, value);
		int expect = 8;
		assertThat(result, is(expect));
	}
	/**
	 * Test поиск несуществующего элемента.
	 */
	@Test
	public void whenArrayHasNotFound() {
		FindLoop find = new FindLoop();
		int[] input = new int[] {1, 2, 3, 4};
		int value = 5;
		int result = find.indexOf(input, value);
		int expect = -1;
		assertThat(result, is(expect));
	}
}