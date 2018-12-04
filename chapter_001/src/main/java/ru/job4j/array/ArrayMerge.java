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
     * Входящий массив сортируем по возрастанию и делим пополам
     * и возвращаем два массив с примерно равными половинами.
     * Их опять сортируем по возрастанию и возвращаем два массива
     *
     * @param array - массив который надо поделить.
     *
     * @return pair - возвращаем двa массива.
     */
    public Pair arrayDivideTwo(int[] array) {
        BubbleSort arrSort = new BubbleSort();
        array = arrSort.sort(array);

        int[] arrLeft = new int[array.length - 1];
        int arrLeftCount = -1;
        int arrLeftSum = 0;

        int[] arrRight = new int[array.length - 1];
        int arrRightCount = -1;
        int arrRightSum = 0;

        for (int i = array.length - 1; i >= 0; i--) {
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
        Pair pair = new Pair();
        pair.left  = arrSort.sort(Arrays.copyOf(arrLeft, arrLeftCount + 1));
        pair.right = arrSort.sort(Arrays.copyOf(arrRight, arrRightCount + 1));
        return pair;
    }
}

class Pair {
    int[] left;
    int[] right;
        }