package hillel.stolitnii.homeworks.homework11;

class Burger {
    private String title;
    private String bun;
    private String meat;
    private String cheese;
    private String veggies;
    private String sauce;

    public Burger(String title, String bun, String meat, String cheese, String veggies, String sauce) {
        this.title = title;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.sauce = sauce;
        displayBurgerIngredients();
    }

    public Burger(String title, String bun, String meat, String cheese, String veggies) {
        this(title, bun, meat, cheese, veggies, "Без майонезу");
    }


    public void displayBurgerIngredients() {
        System.out.println(title);
        System.out.println("Склад бургера:");
        System.out.println("Булка: " + bun);
        System.out.println("Котлета: " + meat);
        System.out.println("Сир: " + cheese);
        System.out.println("Зелень: " + veggies);
        System.out.println("Соус: " + sauce);
        System.out.println();
    }
}

public class BurgerMain {
    public static void main(String[] args) {
        Burger standartBurger = new Burger("Звичайний", "Біла з кунжутом", "Котлета теляча", "Сир", "Салат, томат, огірок", "майонез");
        Burger dietBurger = new Burger("Дієтичний","Житня", "Котлета куряча", "Сир", "Салат, томат, огірок");
        Burger doubleMeatBurger = new Burger("Подвійний","Житня", "Котлета теляча x2", "Сир", "Салат, томат, огірок", "майонез");
    }
}