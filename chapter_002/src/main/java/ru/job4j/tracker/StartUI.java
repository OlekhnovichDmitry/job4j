package ru.job4j.tracker;

/**
 * Create StartUI.
 *
 * @author Dmitry Olekhnovich.
 * @version $id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Constant menu for add new item.
     */
    private static final String ADD = "0";
    /**
     * Constant menu for show all items.
     */
    private static final String SHOW = "1";
    /**
     * Constant menu for edit items.
     */
    private static final String EDIT = "2";
    /**
     * Constant menu for delete items.
     */
    private static final String DELETE = "3";
    /**
     * Constant menu for find item by Id.
     */
    private static final String FINDID = "4";
    /**
     * Constant menu for find item by name.
     */
    private static final String FINDNAME = "5";
    /**
     * Constant for exit in menu
     */
    private static final String EXIT = "6";
    /**
     * Get data from the user.
     */
    private final Input input;
    /**
     * Save application.
     */
    private final Tracker tracker;

    /**
     *  Constructor initializes the fields.
     *  @param input  -  data input
     *  @param tracker - application store.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * The main program loop
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню :");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.findAll();
            } else if (EDIT.equals(answer)) {
                this.replaceItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDID.equals(answer)) {
                this.findIdItem();
            } else if (FINDNAME.equals(answer)) {
                this.findNameItem();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * The metod implements add new item to the repository.
     */
    private void createItem() {
        System.out.println(" ------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки : ");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println(" ------Новая заявка с getId : " + item.getId() + " ------------ ");
    }

    /**
     * metod for show all items.
     */
    private void findAll() {
        System.out.println(" ------------ Вывод всех заявок --------------");
        Item[] item = this.tracker.findAll();
        for (int index = 0; index != item.length; index++) {
            if (item[index] != null) {
                System.out.println(item[index].getId() + "  --  " + item[index].getName() + "  --  " + item[index].getDescription());
            }
        }
    }

    /**
     * metod for replace items.
     */
    private void replaceItem() {
        System.out.println(" ------------ Редактирование заявки --------------");
        String id = this.input.ask("Введите Id редактируемой заявки");
        String name = this.input.ask("Введите новое имя заявки :");
        String desc = this.input.ask("Введите новое описание заявки : ");
        Item item = new Item(name, desc);
        if (this.tracker.replace(id, item)) {
            System.out.println(" ------ заявка отредактирована ------------ ");
        }
    }

    /**
     * metod for delete items.
     */
    private void deleteItem() {
        System.out.println(" ------------ Удаление заявки --------------");
        String id = this.input.ask("Введите Id удаляемой заявки");
        boolean right = this.tracker.delete(id);
        if (right) {
            System.out.println(" ------ заявка удалена ------------ ");
        }
    }

    /**
     * metod for find item by Id.
     */
    private void findIdItem() {
        System.out.println(" ------------ Поиск заявки по ID --------------");
        String id = this.input.ask("Введите Id заявки");
        Item item = this.tracker.findById(id);
            System.out.println(item.getId() + "  --  " + item.getName() + "  --  " + item.getDescription());
    }

    /**
     * metod for find item by name.
     */
    private void findNameItem() {
        System.out.println(" ------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки :");
        Item[] item = this.tracker.findByName(name);
        for (int index = 0; index != item.length; index++) {
            if (item[index] != null) {
                System.out.println(item[index].getId() + "  --  " + item[index].getName() + "  --  " + item[index].getDescription());
            }
        }
    }

    /**
     * metod for show menu.
     */
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("");
        System.out.println("0 - Добавление новой заявки");
        System.out.println("1 - Вывод всех заявок");
        System.out.println("2 - Редактирование заявки");
        System.out.println("3 - Удаление заявки");
        System.out.println("4 - Поиск заявки по ID");
        System.out.println("5 - Поиск заявки по имени");
        System.out.println("6 - Выход");
    }

    /**
     * Run the program.
     *
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
