package ua.hillel.stolitnii.homeworks.homework16;
public class Main {

    public double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив пустий або null");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Матриця в null");
        }

        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row == null || row.length != rows) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main main = new Main();

        int[] array = {1, 2, 3, 4, 5};
        double average = main.calculateAverage(array);
        System.out.println("Середне арефметичне по масиву: " + average);

        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean isSquare = main.isSquareMatrix(squareMatrix);
        System.out.println("Результат тесту чи квадратна матриця: " + isSquare);
    }
}
