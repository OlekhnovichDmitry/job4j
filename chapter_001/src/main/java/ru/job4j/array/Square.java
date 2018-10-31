package ru.job4j.array;
/**
 * работа с массивом. Возводим каждый элемент в квадрат.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
public class Square {
	public int[] calculate(int bound) {
		int[] rst = new int[bound];
		for (int i = 0; i != bound; i++) {
			rst[i] = (i + 1) * (i + 1);
		}
		return rst;
	}
}
