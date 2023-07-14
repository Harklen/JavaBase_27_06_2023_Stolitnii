package hillel.stolitnii.homeworks.homework6.number;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int attempts = 0;
        int attempt = 1;
        final int maxAttempts = 3;
        int randomNum = (int) (Math.random() * 11);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Треба вгадати число від 0 до 10, в тебе три спроби");

        while (attempts < maxAttempts) {
            System.out.print("Спроба: " + attempt);
            System.out.println();
            int guess;

            while (true) {
                System.out.print("Введіть число: ");
                String input = scanner.nextLine();

                try {
                    guess = Integer.parseInt(input);
                    if (guess >= 0 && guess <= 10) {
                        break;
                    } else {
                        System.out.println("Введене число повинно бути від 0 до 10.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Введено неправильне число. Спробуйте ще раз.");
                }
            }

            if (guess == randomNum) {
                System.out.println("Красавчик, вгадав!");
                break;
            } else {
                System.out.println("Не вгадав!");
                attempt++;
                if (attempts < maxAttempts - 1) {
                    System.out.println("Спроба: " + attempt);
                    System.out.println();
                } else {
                    System.out.println("Всьо потєряно, я загадував: " + randomNum);
                }
            }

            attempts++;
        }

        scanner.close();
        System.out.println("Дякую за гру!.");
    }
}
