package hillel.stolitnii.trainings.array.centeredthing;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int entered;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.println("Введіть до 20 чисел (0 - щоб завершити введення):");
                int i = 20;
                do {
                    i--;
                    entered = input.nextInt();
                    if (entered % 2 != 0) {
                        nums.add(entered);
                    }
                } while (entered != 0 && i > 0);
            } catch (InputMismatchException e) {
                System.out.println("Невірне введення. Будь ласка, спробуйте знову.");
                input.nextLine();
            }
            System.out.println("Ось шо вийшло:");
            printShtuka(nums);
            break;
        }
    }

    public static int getMaxNum(ArrayList<Integer> list) {
        int maxNum = Integer.MIN_VALUE;

        for (int num : list) {
            if (num % 2 != 0 && num > maxNum) {
                maxNum = num;
            }
        }

        return maxNum;
    }
    public static void printShtuka(ArrayList<Integer> list) {
        int maxNum = getMaxNum(list);

        for (int num : list) {
            if (num % 2 == 0) {
                continue;
            }

            int space = (maxNum - num) / 2;
            int nums = num;

            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < nums; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
