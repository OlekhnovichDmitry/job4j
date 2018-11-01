package ru.job4j.array;
/**
 * работа со строками. Сравнение элементов.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
public class ArrayChar {
	private char[] data;
	
	public ArrayChar(String line) {
		this.data = line.toCharArray();
	}
	
	/**
	 * Проверяет. Что слово начинается с префикса.
	 * @param prefix префикс.
	 * @return если слово начинается с префикса.
	 */
	public boolean startWith(String prefix) {
		boolean result = true;
		char[] value = prefix.toCharArray();
		// проверить что массив дата имеет первые элементы одинаковые с валуе.
		for (int index = 0; index != value.length; index++) {
			if (value[index] != data[index]) {
				result = false;
			}
		}
		return result;
	}
}