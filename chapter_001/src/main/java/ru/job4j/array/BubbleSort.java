package ru.job4j.array;
/**
 * работа с массивом. Сортировка методом пузырька.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
 public class BubbleSort {
	 /**
	  * Сортировка методом пузырька.
	  */
	 public int[] sort(int[] array) {
		for (int index = 0; index != array.length; index++) {
			for (int j = 0; j != array.length - index - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	 }
 }
