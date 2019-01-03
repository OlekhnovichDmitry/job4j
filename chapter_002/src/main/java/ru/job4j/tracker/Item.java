package ru.job4j.tracker;
/**
 * Create Item
 *
 * @author Dmitry Olekhnovich.
 * @version $id$
 * @since 0.1
 */
public class Item {
    private String created;
    private String description;
    private String name;
    private String[] comments;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return this.created;
    }
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(String id) {
        this.created = id;
    }

    // переопределение метода
    @Override
    public String toString() {
        return "ID заявки: " + created + " . Имя заявки: " + name + " . Описание заявки " + description;
    }

}
