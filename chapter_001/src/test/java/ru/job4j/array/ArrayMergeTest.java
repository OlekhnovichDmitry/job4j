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
     *  TEST из одного отсортированного массива возвращаем два массива с примерно равными суммами
     */
    @Test
    public void whenArray10ElemDivideTwoArr() {
        ArrayMerge arrDivide = new ArrayMerge();
        int[] arrFirst = new int[] {50, 4, 30, 6, 8, 11, 12, 20, 9, 3};
        Pair result = arrDivide.arrayDivideTwo(arrFirst);

        Pair expect = new Pair();
        expect.left =new int[] {3, 4, 9, 11, 20, 30};
        expect.right = new int[] {6, 8, 12, 50};
        assertThat(result.left, is(expect.left));
        assertThat(result.right, is(expect.right));
    }
}