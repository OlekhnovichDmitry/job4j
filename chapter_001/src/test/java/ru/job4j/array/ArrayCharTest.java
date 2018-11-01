package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test строки на сравнение элементов 
 *
 * @version $Id$
 * @autor Dmitry Olekhnovich.
 * @since 0.1
 */
public class ArrayCharTest {
	/**
	 * Test строки на сравнение элементов true 
	 */
	@Test
	public void whenStartWithPrefixThenTrue() {
		ArrayChar word = new ArrayChar("Hello");
		boolean result = word.startWith("He");
		assertThat(result, is(true));
	}
	/**
	 * Test строки на сравнение элементов false 
	 */
	@Test
	public void whenNotStartWithPrefixThenFalse() {
		ArrayChar word = new ArrayChar("Hello");
		boolean result = word.startWith("Hi");
		assertThat(result, is(false));
	}
}
		