package ru.job4j.profession;
/**
 * класс профессии Доктор.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
public class Doctor extends Profession {
    Patient patient;

    public Diagnose DiagnoseHeal(Patient patient) {
        return null;
    }
}

class Diagnose {
 public String name = "tor";
}
