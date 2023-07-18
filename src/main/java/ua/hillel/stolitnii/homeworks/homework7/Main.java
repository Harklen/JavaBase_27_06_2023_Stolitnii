public class Main {
    public static void main(String[] args) {
        int numberOfPlayers = 25;

        int[] team1 = new int[numberOfPlayers];
        int[] team2 = new int[numberOfPlayers];

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        System.out.print("Вік гравців команди 1: ");
        for (int i = 0; i < numberOfPlayers; i++) {
            int age = (int) (Math.random() * 23) + 18; // Випадковий вік в діапазоні 18-40
            team1[i] = age;
            sumTeam1 += age;
            System.out.print(age + " ");
        }

        System.out.println("\nСередній вік команди 1: " + (double) sumTeam1 / numberOfPlayers);

        System.out.print("\nВік гравців команди 2: ");
        for (int i = 0; i < numberOfPlayers; i++) {
            int age = (int) (Math.random() * 23) + 18; // Випадковий вік в діапазоні 18-40
            team2[i] = age;
            sumTeam2 += age;
            System.out.print(age + " ");
        }

        System.out.println("\nСередній вік команди 2: " + (double) sumTeam2 / numberOfPlayers);
    }
}
