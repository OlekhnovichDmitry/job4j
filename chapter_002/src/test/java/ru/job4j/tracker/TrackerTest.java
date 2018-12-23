package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerTest {
    /**
     * проверяем возвращение заявок
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "123");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    /**
     * проверяем поиск по ID.
     * Не проходит, так как ID генерируется автоматически.
     * Если убрать авто генерацию то пройдет.
     */
    @Test
    public void whenFindItemThenTrackerToId() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "123");
        tracker.add(item);
        assertThat(tracker.findById("123"), is(item));
    }

    /**
     * проверяем замену заявки по ID.
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "TestDescription", "123");
        tracker.add(previous);

        Item next = new Item("test2", "TestDescription2", "1234");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);

        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * проверяем удаление заявки по ID.
     */
    @Test
    public void whenDeleteItemThenReturnNewTracker() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "TestDescription", "123");
        Item item2 = new Item("test2", "TestDescription2", "1234");
        Item item3 = new Item("test3", "TestDescription3", "12345");
        Item item4 = new Item("test4", "TestDescription4", "123456");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);

        tracker.delete(item2.getId());
        assertThat(tracker.findAll()[2].getName(), is(item4.getName()));
    }

    /**
     * проверяем поиск по name.
     */
    @Test
    public void whenFindByNameItemThenReturnNewTracker() {
        Tracker tracker = new Tracker();
        Item item11 = new Item("test1", "TestDescription", "123");
        Item item21 = new Item("test2", "TestDescription2", "1234");
        Item item31 = new Item("test1", "TestDescription3", "12345");

        tracker.add(item11);
        tracker.add(item21);
        tracker.add(item31);

        String findKey = "test1";

        assertThat(tracker.findByName(findKey)[0].getName(), is(findKey));
        assertThat(tracker.findByName(findKey)[1].getName(), is(findKey));
    }



}
