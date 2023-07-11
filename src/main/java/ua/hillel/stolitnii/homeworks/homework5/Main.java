package hillel.stolitnii.homeworks.homework5;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть назву для першої команди: ");
        String teamOneName = input.nextLine();
        int[] teamOneScores = teamScores(input, teamOneName);

        System.out.print("Введіть назву для другої команди: ");
        String teamTwoName = input.nextLine();
        int[] teamTwoScores = teamScores(input, teamTwoName);

        double teamOneAverage = teamAvg(teamOneScores);
        double teamTwoAverage = teamAvg(teamTwoScores);

        String winner;
        switch (Double.compare(teamOneAverage, teamTwoAverage)) {
            case 1:
                winner = teamOneName;
                break;
            case -1:
                winner = teamTwoName;
                break;
            default:
                winner = "Нічия";
                break;
        }

        System.out.println("Перемогла команда " + winner + ". " + winner + " набрала " +
                (winner.equals(teamOneName) ? teamOneAverage : teamTwoAverage) +
                " очків.");
    }
    private static int[] teamScores(Scanner input, String teamName) {
        int[] scores = new int[5];
        System.out.print("Введіть кількість фрагів для 5 гравців команди " + teamName + ": ");
        for (int i = 0; i < 5; i++) {
            try {
                scores[i] = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Невірне введення. Будь ласка, введіть ціле число.");
                input.nextLine();
                i--;
            }
        }
        input.nextLine();
        return scores;
    }
    private static double teamAvg(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}
