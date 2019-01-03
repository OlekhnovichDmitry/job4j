package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Create tracker
 *
 * @author Dmitry Olekhnovich.
 * @version $id$
 * @since 0.1
 */

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    private static final Random RN = new Random(100);

    /**
     * Метод реализующий добавление заявки в хранилище.
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод реализующий поиск заявки по ID.
     *
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index != this.position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                result = items[index];
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращающий все заявки.
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, this.position);
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     *  Метод редактирования заявок по ID
     */
    public boolean replace(String id, Item item) {
        boolean rightId = false;
        int indexId = findIndexItem(id);
        if (indexId != -1) {
            this.items[indexId] = item;
            item.setId(id);
            rightId = true;
        }
        return rightId;
    }

    /**
     *  Метод public void delete(String id) должен удалить ячейку в массиве this.items.
     *  Для этого необходимо найти ячейку в массиве по id.
     *  Далее сместить все значения справа от удаляемого элемента
     *  - на одну ячейку влево с помощью System.arrayCopy();
     */
    public boolean delete(String id) {
        boolean rightId = false;
        int indexId = findIndexItem(id);
        if (indexId != -1) {
            System.arraycopy(items, indexId + 1, items, indexId, this.position - indexId);
            rightId = true;
            this.position--;
        }
        return rightId;
    }

    /**
     * Метод public Item[] findByName(String key) проверяет в цикле все элементы массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int indexId = 0;
        for (int index = 0; index != this.position; index++) {
            if (items[index].getName().equals(key)) {
                result[indexId] = items[index];
                indexId++;
            }
        }
        return Arrays.copyOf(result, indexId);
    }

    /**
     *  Метод private int findIndexItem(String id)
     *  находит ячейку в массиве по id.
     *  @return index -возвращает индекс ячейки.
     */
    private int findIndexItem(String id) {
        int indexId = -1;
        for (int index = 0; index != this.position; index++) {
            if (items[index].getId().equals(id)) {
                indexId = index;
                break;
            }
        }
        return indexId;
    }

}
