package hillel.stolitnii.homeworks.homework8;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] first = new int[7];
        int[] second = new int[7];
        for (int i = 0; i < 7; i++) {
            first[i] = (int) (Math.random() * 10);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Спробуйте вгадати 7 чисел від 0 до 9:");
        for (int i = 0; i < 7; i++) {
            int num;
            do {
                System.out.print("Введіть цифру " + (i + 1) + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Помилка! Введіть ціле додатнє число від 0 до 9:");
                    scanner.next();
                }
                num = scanner.nextInt();
                if (num < 0 || num > 9) {
                    System.out.println("Помилка! Число має бути від 0 до 9.");
                }
            } while (num < 0 || num > 9);
            second[i] = num;
        }
        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        int countMatches = 0;
        for (int i = 0; i < 7; i++) {
            if (first[i] == second[i]) {
                countMatches++;
            }
        }

        System.out.println("Кількість збігів: " + countMatches);
    }
}
