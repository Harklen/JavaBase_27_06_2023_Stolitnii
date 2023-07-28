package hillel.stolitnii.homeworks.homework10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[][] dataList = new String[3][3];
        System.out.println("Вітаємо в нашому довіднику!");
        boolean repeat;
        do {
            printChoice(dataList);
            repeat = checkRepeat();
        } while (repeat);
        if(!repeat) {
            System.out.println("Дякуємо за використання нашого довідника!");
        }
    }

    public static void personInfo(String dataList[][]) {
        dataList[0][0] = "Петро";
        dataList[0][1] = "Київ";
        dataList[0][2] = "0932344211";
        dataList[1][0] = "Іван";
        dataList[1][1] = "Жмеринка";
        dataList[1][2] = "0637334218";
        dataList[2][0] = "Василь";
        dataList[2][1] = "Чернівці";
        dataList[2][2] = "0662547314";
    }

    public static int userChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть користувача, чиї дані хочете отримати:");
        System.out.println("1 - Петро");
        System.out.println("2 - Іван");
        System.out.println("3 - Василь");
        System.out.println("0 - Вивести всіх");

        int value;
        do {
            System.out.print("Ваш вибір: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Оберіть число зі списку!");
                System.out.print("Ваш вибір: ");
                scanner.nextLine();
            }
            value = scanner.nextInt();
            scanner.nextLine();
            if (value < 0 || value >= 4) {
                System.out.println("Оберіть число зі списку!");
            }
        } while (value < 0 || value >= 4);

        return value;
    }
    public static void printChoice(String dataList[][]) {
        personInfo(dataList);
        int choice = userChoice();
        if (choice == 0) {
            for (int i = 0; i < dataList.length; i++) {
                String formattedString = String.format("Зателефонувати громадянинові %s з міста %s можна за телефоном %s", dataList[i][0], dataList[i][1], dataList[i][2]);
                System.out.println(formattedString);
                System.out.println("-------------------------");
            }
        } else if (choice >= 1 && choice <= 3) {
            String formattedString = String.format("Зателефонувати громадянинові %s з міста %s можна за телефоном %s", dataList[choice - 1][0], dataList[choice - 1][1], dataList[choice - 1][2]);
            System.out.println(formattedString);
        }
    }

    public static boolean checkRepeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Бажаєте зробити ще один запит?");

        int value;
        do {
            System.out.println("1 - так, 2 - ні");
            while (!scanner.hasNextInt()) {
                System.out.println("Оберіть число зі списку!");
                System.out.print("Ваш вибір: ");
                scanner.nextLine();
            }
            value = scanner.nextInt();
            scanner.nextLine();
            if (value != 1 && value != 2) {
                System.out.println("Оберіть число зі списку!");
            }
        } while (value != 1 && value != 2);
        return value == 1;
    }
}