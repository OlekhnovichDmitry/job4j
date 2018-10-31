package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test массивы на количество.
 *
 * @version $Id$
 * @autor Dmitry Olekhnovich.
 * @since 0.1
 */
public class SquareTest {
	@Test

	//проверка массива на 3 числа.

	public void whenBound3Then149() {
		int bound = 3;
		Square square = new Square();
		int[] rst = square.calculate(bound);
		int[] expect = new int[]{1, 4, 9};
		assertThat(rst, is(expect));
	}

	//проверка массива на 5 чисел.

	@Test
	public void whenBound5Then1491625() {
		int bound = 5;
		Square square = new Square();
		int[] rst = square.calculate(bound);
		int[] expect = new int[]{1, 4, 9, 16, 25};
		assertThat(rst, is(expect));
	}
}
