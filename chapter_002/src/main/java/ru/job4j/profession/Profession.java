package ru.job4j.profession;
/**
 * Создаем классы профессий.
 *
 * @author Dmitry Olekhnovich.
 * @version $Id$
 * @since 0.1
 */
public class Profession {
    private String name;
    private String professional;

    public Profession() {
    }

    public Profession(String name, String professional) {
        this.name = name;
        this.professional = professional;
    }

    public String getName() {
        return this.name;
    }
    public String getProfessional() {
        return this.professional;
    }
}
