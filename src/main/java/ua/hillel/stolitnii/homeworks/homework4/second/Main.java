package hillel.stolitnii.homeworks.homework4.second;

public class Main {
    public static void main(String[] args) {
        int warriorLee = 13;
        int archerLee = 24;
        int horsemanLee = 46;
        int armyLee = 860;
        int warriorMin = 9;
        int archerMin = 35;
        int horsemanMin = 12;
        double armyMin = 1.5 * armyLee;
        int attackLee = (warriorLee + archerLee + horsemanLee) * armyLee;
        int attackMin = (warriorMin + archerMin + horsemanMin) * (int)armyMin;
        System.out.println(String.format("Загальна сила атаки Лі - %s, а у Мінь - %d", attackLee, attackMin));
        System.out.println("Мінь сильніші!");
    }
}
