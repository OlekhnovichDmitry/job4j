package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        //создаем трекер
        Tracker tracker = new Tracker();
        // создаем стабинпут с последовательнстью действий
        Input input = new StubInput( new String[]{"0", "test name", "desc", "6"});
        // Создаем СтартЮАЙ и вызываем метод ИНИТ()
        new StartUI(input, tracker).init();
        //проверяем что нулевой элемент массива содержит имя, введеное при эмуляции
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        //создаем трекер
        Tracker tracker = new Tracker();
        // Напрямую добавляем заявку
        Item item= tracker.add(new Item("Test name", "Desc"));
        // Создаем стабИнпут с последовательность действий( производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "Заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }
    @Test
    public void whenDeleteThenTrackerHasDeleteItem() {
        Tracker tracker = new Tracker();
        Item item= tracker.add(new Item("Test name", "Desc"));
        Item item1= tracker.add(new Item("Test name1", "Desc1"));
        Item item2= tracker.add(new Item("Test name2", "Desc2"));

        Input input = new StubInput(new String[]{"3", item1.getId(), "6"});

        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[1].getName(), is("Test name2"));
    }

}
