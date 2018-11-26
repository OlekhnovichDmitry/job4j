package ru.job4j.array;
import java.util.Arrays;
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
        int arrFirstCount = 0;
        int arrSecondCount = 0;
        for (int i = 0; i < len; i++) {
            if (arrFirstCount < first.length && arrSecondCount < second.length) {
                if (first[arrFirstCount] < second[arrSecondCount]) {
                    third[i] = first[arrFirstCount];
                    arrFirstCount++;
                } else {
                    third[i] = second[arrSecondCount];
                    arrSecondCount++;
                }
            } else {
                if (arrFirstCount < first.length) {
                    third[i] = first[arrFirstCount];
                    arrFirstCount++;
                } else {
                    third[i] = second[arrSecondCount];
                    arrSecondCount++;
                }
            }
        }
        return third;
    }

    /**
     * Входящий массив сортируем по убыванию делим пополам
     * и возвращаем двумерный массив с примерно равными половинами.
     *
     * //@param array - массив который надо поделить.
     *
     * @return arr - возвращаем двумерный массив.
     */
    public int[][] arrayDivideTwo(int[] array) {

        for (int index = 0; index != array.length; index++) {
            for (int j = 0; j != array.length - index - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        int[] arrLeft = new int[array.length - 1];
        int arrLeftCount = 0;
        int arrLeftSum = array[0];

        int[] arrRight = new int[array.length - 1];
        int arrRightCount = 0;
        int arrRightSum = array[1];

        arrLeft[0] = array[0];
        arrRight[0] = array[1];

        for (int i = 2; i != array.length; i++) {
            if (arrLeftSum < arrRightSum) {
                arrLeftCount++;
                arrLeft[arrLeftCount] = array[i];
                arrLeftSum += array[i];

            } else {
                arrRightCount++;
                arrRight[arrRightCount] = array[i];
                arrRightSum += array[i];
            }
        }
        int[][] arr = new int[2][];
        arr[0] = Arrays.copyOf(arrLeft, arrLeftCount + 1);
        arr[1] = Arrays.copyOf(arrRight, arrRightCount + 1);
        return arr;
    }
}
