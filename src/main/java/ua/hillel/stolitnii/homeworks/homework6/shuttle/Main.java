package hillel.stolitnii.homeworks.homework6.shuttle;

public class Main {
    public static void main(String[] args) {
        viewList();
    }

    public static void viewList() {
        int count = 0;
        int number = 1;

        for (; count < 100; number++)
            if (goodNumber(number)) {
                System.out.println(number);
                count++;
            }
    }
    public static boolean badNumber(int number, int... badNumber) {
        String numberString = Integer.toString(number);
        for (int digit : badNumber) {
            if (numberString.contains(Integer.toString(digit))) {
                return true;
            }
        }
        return false;
    }
    public static boolean goodNumber(int number) {
        return !badNumber(number, 4, 9);
    }

}
