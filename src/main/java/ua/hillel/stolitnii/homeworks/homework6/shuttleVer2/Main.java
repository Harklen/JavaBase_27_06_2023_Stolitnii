package hillel.stolitnii.homeworks.homework6.shuttleVer2;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int shuttleNum = 1;

        while (count < 100) {
            boolean nice = true;
            int num = shuttleNum;

            while (num != 0) {
                int check = num % 10;
                if (check == 4 || check == 9) {
                    nice = false;
                    break;
                }
                num /= 10;
            }

            if (nice) {
                System.out.println(shuttleNum);
                count++;
            }

            shuttleNum++;
        }
    }
}
