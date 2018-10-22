package ru.job4j.condition;

/**
 * Программа расчета расстояния между точками.
 * @author Dmitry
 * @version $Id$
 * @since 0.1
 */
public class Point {
    private int x;
    private int y;


    /**
     * Координаты точки.
     * @param x координата х.
     * @param y координата у.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * нужно передать координаты двух точек для расчета расстояния.
     * @param that координата у.
     */
    public double distanceTo(Point that) {
        // Точка А - это текущая точка. К ней мы обращаемся через оператор this.
        // Точка В - это входящая точка. К ней мы можем обратиться напрямую через имя переменной that.

        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}