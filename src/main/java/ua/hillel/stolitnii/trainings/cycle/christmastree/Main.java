package hillel.stolitnii.trainings.cycle.christmastree;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean repeat = true;
        while (repeat) {
            try {
                System.out.print("Введіть бажану висоту для ялинки: ");
                int height = input.nextInt();

                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print(" ");
                    }

                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = 1; i <= height - 1; i++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Невірне введення. Введіть число.");
                input.nextLine();
            }
        }
    }
}
