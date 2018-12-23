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
        Item item = new Item("test1", "testDescription");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    /**
     * проверяем поиск по ID.
     *
     */
    @Test
    public void whenFindItemThenTrackerToId() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription");
        item = tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }

    /**
     * проверяем замену заявки по ID.
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous1 = new Item("test1", "TestDescription");
        Item previous = new Item("test1", "TestDescription");
        Item previous2 = new Item("test1", "TestDescription");
        tracker.add(previous1);
        tracker.add(previous);
        tracker.add(previous2);

        Item next = new Item("test2", "TestDescription2");
        next.setId(previous.getId());
        boolean right = tracker.replace(previous.getId(), next);

        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
        assertThat(right, is(true));
    }

    /**
     * проверяем удаление заявки по ID.
     */
    @Test
    public void whenDeleteItemThenReturnNewTracker() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "TestDescription");
        Item item2 = new Item("test2", "TestDescription2");
        Item item3 = new Item("test3", "TestDescription3");
        Item item4 = new Item("test4", "TestDescription4");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);

        boolean right = tracker.delete(item2.getId());
        assertThat(tracker.findAll()[2].getName(), is(item4.getName()));
        assertThat(right, is(true));
    }

    /**
     * проверяем поиск по name.
     */
    @Test
    public void whenFindByNameItemThenReturnNewTracker() {
        Tracker tracker = new Tracker();
        Item item11 = new Item("test1", "TestDescription");
        Item item21 = new Item("test2", "TestDescription2");
        Item item31 = new Item("test1", "TestDescription3");

        tracker.add(item11);
        tracker.add(item21);
        tracker.add(item31);

        String findKey = "test1";

        assertThat(tracker.findByName(findKey)[0].getName(), is(findKey));
        assertThat(tracker.findByName(findKey)[1].getName(), is(findKey));
    }



}
