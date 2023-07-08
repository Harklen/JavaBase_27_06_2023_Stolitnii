package hillel.stolitnii.trainings.cycle.biggestnum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxValue;
        int tryCount;
        boolean repeat = true;

        while (repeat) {
            try {
                System.out.print("Введіть рядок чисел, для завершення вводу напишіть 0 ");
                int value = input.nextInt();
                maxValue = value;
                for (tryCount = 0; value != 0; tryCount++) {
                    if (value % 2 == 0) {

                        if (value > maxValue) {
                            maxValue = value;
                        }
                    }
                    value = input.nextInt();
                }

                System.out.println("Всього введено: " + tryCount + " чисел");
                if (maxValue != 0) {
                    System.out.println("Найбільше з них: " + maxValue);
                } else {
                    System.out.println("Але ви не ввели ні одного парного числа, скотиняка");
                }
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("Невірне введення. Введіть число.");
                input.nextLine();
            }
        }
    }
}
