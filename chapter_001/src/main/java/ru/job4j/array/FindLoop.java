package ru.job4j.array;
/**
 * работа с массивом. Поиск по элементам массива.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {
	public int indexOf(int[] data, int el) {
		int rst = -1; // если элемента нет в массиве то возв -1.
		for (int index = 0; index != data.length; index++) {
			if (data[index] == el) {
				rst = index;
				break;
			}
		}
		return rst;
	}
}