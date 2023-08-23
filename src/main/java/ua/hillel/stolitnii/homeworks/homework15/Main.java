package ua.hillel.stolitnii.homeworks.homework15;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

enum DrinksMachine {
    COFFEE, TEA, LEMONADE, MOHITO, MINERAL_WATER, COKE
}

class Drinks {
    public static final double COFFEE_PRICE = 2.5;
    public static final double TEA_PRICE = 1.8;
    public static final double LEMONADE_PRICE = 2.0;
    public static final double MOHITO_PRICE = 3.5;
    public static final double MINERAL_WATER_PRICE = 1.0;
    public static final double COKE_PRICE = 2.3;
}

class Main {
    static Map<DrinksMachine, Integer> orderedDrinks = new HashMap<>();
    static double totalPrice = 0.0;

    static void makeDrink(DrinksMachine choice, int quantity) {
        switch (choice) {
            case COFFEE:
                totalPrice += quantity * Drinks.COFFEE_PRICE;
                System.out.println("Приготовлено " + quantity + " кави");
                break;
            case TEA:
                totalPrice += quantity * Drinks.TEA_PRICE;
                System.out.println("Приготовлено " + quantity + " чаю");
                break;
            case LEMONADE:
                totalPrice += quantity * Drinks.LEMONADE_PRICE;
                System.out.println("Приготовлено " + quantity + " лимонаду");
                break;
            case MOHITO:
                totalPrice += quantity * Drinks.MOHITO_PRICE;
                System.out.println("Приготовлено " + quantity + " мохіто");
                break;
            case MINERAL_WATER:
                totalPrice += quantity * Drinks.MINERAL_WATER_PRICE;
                System.out.println("Видано " + quantity + " мінеральки");
                break;
            case COKE:
                totalPrice += quantity * Drinks.COKE_PRICE;
                System.out.println("Видано " + quantity + " Кока-Коли");
                break;
            default:
                System.out.println("Обраний напій недоступний");
        }
    }

    /**
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть напій зі списку:");
        for (DrinksMachine drink : DrinksMachine.values()) {
            System.out.println(drink);
        }

        while (true) {
            System.out.println("Введіть назву напою або 'exit' для завершення замовлення:");
            String drinkChoice = scanner.nextLine().toUpperCase();

            if (drinkChoice.equals("EXIT")) {
                break;
            }

            try {
                DrinksMachine selectedDrink = DrinksMachine.valueOf(drinkChoice);

                System.out.println("Введіть кількість:");
                int quantity = Integer.parseInt(scanner.nextLine());

                orderedDrinks.put(selectedDrink, orderedDrinks.getOrDefault(selectedDrink, 0) + quantity);

            } catch (IllegalArgumentException e) {
                System.out.println("Обраний напій недоступний");
            }
        }

        for (Map.Entry<DrinksMachine, Integer> entry : orderedDrinks.entrySet()) {
            makeDrink(entry.getKey(), entry.getValue());
        }

        System.out.println("Загальна вартість: " + totalPrice + " грн");
    }
}
