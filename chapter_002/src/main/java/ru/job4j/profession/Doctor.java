package ru.job4j.profession;
/**
 * класс профессии Доктор.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
public class Doctor extends Profession {
    private Patient patient;

    public Diagnose diagnoseHeal(Patient patient) {
        return null;
    }
}

class Diagnose {
 private String name = "tor";
}
