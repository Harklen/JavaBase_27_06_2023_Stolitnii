package hillel.stolitnii.homeworks.homework9;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = getValidPositiveInteger("Введіть кількість рядків (M): ", scanner);
        int n = getValidPositiveInteger("Введіть кількість стовпців (N): ", scanner);
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) ( Math.random() * 50 );
            }
        }
        System.out.println("Згенерована матриця:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        System.out.println();
        System.out.println("Транспонована матриця:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static int getValidPositiveInteger(String message, Scanner scanner) {
        int value;

        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.println("Помилка! Введіть ціле додатнє число.");
                System.out.print(message);
                scanner.next();
            }
            value = scanner.nextInt();
        } while (value <= 0);

        return value;
    }
}
