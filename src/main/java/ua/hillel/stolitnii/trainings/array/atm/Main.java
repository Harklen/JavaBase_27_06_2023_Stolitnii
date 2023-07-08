package hillel.stolitnii.trainings.array.atm;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cardBalance[] = {-123, 33, 0, 4500, -611, 44, 0, 0, -1, -85};
        int deposit = 1;
        int withdraw = 2;
        int operat;
        int limit = 1000;
        Scanner input = new Scanner(System.in);

        boolean repeat = true;
        while (repeat) {
            System.out.println("Оберіть тип операції: 1 - покласти, 2 - зняти");
            try {
                operat = input.nextInt();
                input.nextLine();
                if (operat != deposit && operat != withdraw) {
                    System.out.println("Невірний тип операції. Введіть 1 або 2.");
                    continue;
                }

                if (operat == deposit) {
                    System.out.println("Оберіть карту від 1 до 10");
                    int card = input.nextInt() - 1;
                    input.nextLine();

                    System.out.println("Введіть суму депозиту. Ліміт на одну операцію - 1000");
                    int sum = input.nextInt();
                    input.nextLine();

                    if (sum > 0 && sum <= limit) {
                        cardBalance[card] += sum;
                    } else {
                        System.out.println("Невірна сума або перевищено ліміт");
                    }
                } else if (operat == withdraw) {
                    System.out.println("Оберіть карту від 1 до 10");
                    int card = input.nextInt() - 1;
                    input.nextLine();

                    System.out.println("Введіть суму яку хочете зняти. Ліміт на одну операцію - 1000");
                    int sum = input.nextInt();
                    input.nextLine();

                    if (sum <= cardBalance[card] && sum <= limit && cardBalance[card] > 0 && sum > 0) {
                        cardBalance[card] -= sum;
                    } else {
                        System.out.println("Невірна сума або перевищено ліміт");
                        cardBalance[card] = 0;
                    }
                }

                System.out.println("Стан рахунків:");
                printCardBalances(cardBalance);

                System.out.println("Бажаєте продовжити? 1 - Так, Інше - завершити роботу");
                int choice = input.nextInt();
                input.nextLine();
                repeat = (choice == 1);
            } catch (InputMismatchException e) {
                System.out.println("Невірне введення. Будь ласка, спробуйте знову.");
                input.nextLine();
            }
        }

        System.out.println("Дякую за використання програми. До побачення!");
    }

    public static void printCardBalances(int[] cardBalance) {
        for (int i = 0; i < cardBalance.length; i++) {
            System.out.println("Карта " + (i + 1) + ": " + cardBalance[i]);
        }
        System.out.println("Загальний баланс: " + Arrays.stream(cardBalance).sum());
    }
}
