package ru.job4j.tracker;
/**
 * Create Item
 *
 * @author Dmitry Olekhnovich.
 * @version $id$
 * @since 0.1
 */
public class Item {
    private String id;
    private String description;
    private String name;

    public Item(String name, String description, String id){
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
