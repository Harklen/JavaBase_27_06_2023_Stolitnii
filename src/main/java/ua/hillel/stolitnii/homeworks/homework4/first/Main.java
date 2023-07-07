package hillel.stolitnii.homeworks.homework4.first;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length, width, height, volume, lenghtSum;

        System.out.println("Вводь довжину, ширину і висоту, а я порахую об'ємчик");
        do {
            try {
                length = Double.parseDouble(input.nextLine());
                width = Double.parseDouble(input.nextLine());
                height = Double.parseDouble(input.nextLine());
                volume = length * width * height;
                lenghtSum = length + width + height;

                System.out.println(String.format("Твої параметри такі - Довжина: %s Ширина: %s Висота: %s", length, width, height));
                System.out.println("Об'єм паралелепіпеда - " + volume);
                System.out.println("Сумарна довжина сторін - " + lenghtSum);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Да введи цифри господі боже не мороч голову мені");
            }
        } while (true);
    }
}