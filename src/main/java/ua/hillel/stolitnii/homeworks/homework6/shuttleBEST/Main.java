package hillel.stolitnii.homeworks.homework6.shuttleBEST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        viewList();
    }

    public static void viewList() {
        int count = 0;
        int number = 1;
        int input = 0;

        Scanner scanner = new Scanner(System.in);

        while (input <= 0) {
            System.out.print("Введіть кількість шатлів: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input <= 0) {
                    System.out.println("Число повинно бути додатнім!");
                }
            } else {
                String invalidInput = scanner.nextLine();
                System.out.println("Введено неправильне значення: " + invalidInput);
            }
        }

        scanner.close();

        for (; count < input; number++) {
            if (goodNumber(number)) {
                System.out.println(number);
                count++;
            }
        }
    }

    public static boolean badNumber(int number, int... badNumber) {
        String numberString = Integer.toString(number);
        for (int digit : badNumber) {
            if (numberString.contains(Integer.toString(digit))) {
                return true;
            }
        }
        return false;
    }

    public static boolean goodNumber(int number) {
        return !badNumber(number, 4, 9);
    }
}
