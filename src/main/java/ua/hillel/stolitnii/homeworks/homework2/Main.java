package hillel.stolitnii.homeworks.homework2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char deg = '\u00B0'; // Символ градуса (°) в Unicode
        char min = '\u2032'; // Символ хвилини (′) в Unicode
        char sec = '\u2033'; // Символ секунд (″) в Unicode

        String louvre = "Лувр"; // 002°20'15.5416996458801
        byte louvreD = 48;
        byte louvreD2 = 51;
        double louvreD3 = 37.9232227123476;
        String louvreS = "002";
        byte louvreS2 = 20;
        double louvreS3 = 37.9232227123476;

        String statueFreedom = "Статуя свободи";
        byte statueD = 40;
        byte statueD2 = 41;
        double statueD3 = 21.0906231519083;
        String statueS = "-074";
        String statueS2 = "02";
        double statueS3 = 40.3446699940491;

        String eiffel = "Ейфелева вежа";
        byte eiffelD = 48;
        byte eiffelD2 = 51;
        double eiffelD3 = 30.0529274024707;
        String eiffelS = "002";
        byte eiffelS2 = 17;
        double eiffelS3 = 40.1135413644667;


        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;

        while (true) {
            System.out.println("Оберіть і введіть місце зі списку: 1 - Лувр, 2 - Статуя свободи, 3 - Ейфелева вежа");

            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();
            } else {
                System.out.println("Не намагайся зламати мій код розбійник!");
                scanner.nextLine();
            }
                if (userChoice == 1) {
                System.out.println(louvre + " має такі координати: ");
                System.out.println("(" + louvreD + deg + ", " + louvreD2 + min + ", " + louvreD3 + sec +")");
                System.out.println("(" + louvreS + deg + ", " + louvreS2 + min + ", " + louvreS3 + sec +")");
                break;
                } else if (userChoice == 2) {
                    System.out.println(statueFreedom + " має такі координати: ");
                    System.out.println("(" + statueD + deg + ", " + statueD2 + min + ", " + statueD3 + sec +")");
                    System.out.println("(" + statueS + deg + ", " + statueS2 + min + ", " + statueS3 + sec +")");
                    break;
                } else if (userChoice == 3) {
                    System.out.println(eiffel + " має такі координати: ");
                    System.out.println("(" + eiffelD + deg + ", " + eiffelD2 + min + ", " + eiffelD3 + sec +")");
                    System.out.println("(" + eiffelS + deg + ", " + eiffelS2 + min + ", " + eiffelS3 + sec +")");
                    break;
                } else {
                    System.out.println("Такого вибору не існує.");
            }
        }
        scanner.close();
    }
}