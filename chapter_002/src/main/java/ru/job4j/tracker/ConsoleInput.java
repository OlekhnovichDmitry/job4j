package ru.job4j.tracker;
import java.util.*;
/**
 * Create ConsoleInput
 *
 * @author Dmitry Olekhnovich.
 * @version $id$
 * @since 0.1
 */


public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

}
