package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * merge massive. объединяем и разделяем массивы.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */

public class ArrayMergeTest {
    /**
     *  TEST из двух отсортированных массивов делаем один отсортированный
     */
    @Test
    public void whenArrFrst7MergeArrScd3ThenArrThr8() {
        ArrayMerge arrMerge = new ArrayMerge();
        int[] arrFrst = new int[] {3, 4, 6, 8, 9, 11, 12};
        int[] arrScd = new int[] {1, 5, 10};
        int[] result = arrMerge.arrayMerge(arrFrst, arrScd);
        int[] expect = new int[] {1, 3, 4, 5, 6, 8, 9, 10, 11, 12};
        assertThat(result, is(expect));

    }
    /**
     *  TEST из одного отсортированного массива возвращаем двумерный массив с примерно равной суммой
     *  в правой и левой его части.
     */
    @Test
    public void whenArray10ElemDivideTwoArr() {
        ArrayMerge arrDivide = new ArrayMerge();
        int[] arrFrst = new int[] {3, 4, 6, 8, 9, 11, 12, 20, 30, 50};
        int[][] result = arrDivide.arrayDivideTwo(arrFrst);
        int[][] expect = new int[][] {{50, 11, 9, 4, 3, 0, 0, 0, 0}, {30, 20, 12, 8, 6, 0, 0, 0, 0}};
        assertThat(result, is(expect));

    }

}
