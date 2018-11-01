package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test массивы на сравнение элементов true and false.
 *
 * @version $Id$
 * @autor Dmitry Olekhnovich.
 * @since 0.1
 */
public class CheckTest {
	/**
	* Test сравнение элементов все одинаковые.
	*/
	@Test
	public void whenDataMonoByTrueThenTrue() {
		Check check = new Check();
		boolean[] input = new boolean[] {true, true, true};
		boolean result = check.mono(input);
		assertThat(result, is(true));
	}
	/**
	* Test сравнение элементов есть разные.
	*/
	@Test
	public void whenDataNotMonoByTrueThenFalse() {
		Check check = new Check();
		boolean[] input = new boolean[] {true, false, true};
		boolean result = check.mono(input);
		assertThat(result, is(false));
	}
	/**
	* Test сравнение элементов есть разные(4 элемента)false.
	*/
	@Test
	public void whenDataNotMonoByTrueThenFalseFour() {
		Check check = new Check();
		boolean[] input = new boolean[] {true, false, true, true};
		boolean result = check.mono(input);
		assertThat(result, is(false));
	}
	/**
	* Test сравнение элементов есть разные(4 элемента)true.
	*/
		@Test
	public void whenDataMonoByTrueThenFalseFour() {
		Check check = new Check();
		boolean[] input = new boolean[] {false, false, false, false};
		boolean result = check.mono(input);
		assertThat(result, is(true));
	}
}