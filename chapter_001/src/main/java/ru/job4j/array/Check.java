package ru.job4j.array;
/**
 * работа с массивом. Сравнение элементов массива.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
public class Check {
	/**
	 *Сравнение полного соответствия массива.
	 *
	 */
	public boolean mono(boolean[] data) {
		boolean result = true;
		for (int index = 1; index != data.length; index++) {
			if (data[index] != data[index - 1]) {
				result = false;
				break;
			}
		}
		return result;
	}
}