package ru.job4j.array;
/**
 * merge massive. объединяем и разделяем массивы.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
public class ArrayMerge {
    /**
     * Из двух массивов делаем один отсортированный по возрастанию, с учетом что у массивов
     * может различаться порядок и количество элементов.
     *
     * @param first - первый массив.
     * @param second - Второй массив.
     *
     * @return third - возращаем два массива в одном отсортированные по возрастанию.
     */
    public int[] arrayMerge(int[] first, int[] second) {
        int len = first.length + second.length;
        int[] third = new int[len];
        int arr1 = 0;
        int arr2 = 0;
        for (int i = 0; i < len; i++) {
            if (arr1 < first.length && arr2 < second.length) {
                if (first[arr1] < second[arr2]) {
                    third[i] = first[arr1];
                    arr1++;
                } else {
                    third[i] = second[arr2];
                    arr2++;
                }
            } else {
                if (arr1 < first.length) {
                    third[i] = first[arr1];
                    arr1++;
                } else {
                    third[i] = second[arr2];
                    arr2++;
                }
            }
        }
        return third;
    }

    /**
     * Входящий массив делим пополам и возвращаем двумерный массив с примерно равными половинами.
     *
     * @param array - массив который надо поделить.
     *
     * @return arrFrst - возвращаем двумерный массив.
     */

    public int[][] arrayDivideTwo(int[] array) {
        int[][] arrFrst = new int[2][array.length - 1];
        int arr1 = 0;
        int arr1Sum = array[array.length - 1];

        int arr2 = 0;
        int arr2Sum = array[array.length - 2];

        arrFrst[0][0] = array[array.length - 1];
        arrFrst[1][0] = array[array.length - 2];

        for (int i = array.length - 3; i >= 0; i--) {
            if (arr1Sum < arr2Sum) {
                arr1++;
                arrFrst[0][arr1] = array[i];
                arr1Sum += array[i];
            } else {
                arr2++;
                arrFrst[1][arr2] = array[i];
                arr2Sum += array[i];
            }
        }
        return arrFrst;
    }
}
