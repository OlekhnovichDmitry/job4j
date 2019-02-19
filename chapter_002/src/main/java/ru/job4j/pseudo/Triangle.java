package ru.job4j.pseudo;

import java.util.StringJoiner;

/**
 * @autor Dmitry Olekhnovich
 * @version $id$
 * @since 0.1
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(
                System.lineSeparator(), "","");
        pic.add("  +  ");
        pic.add(" + + ");
        pic.add("+++++");
        return pic.toString();
    }
}
