package hillel.stolitnii.trainings.array.centeredthing;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //додаєм сканер
        ArrayList<Integer> nums = new ArrayList<>();//робимо масив куда запихаємо циферки
        int entered; //робимо змінну для введеного
        boolean repeat = true; //додаєм змінну щоб робити перевірку на цифри
        while (repeat) { //запускаємо цикл перевірок
            try {//пробуємо
                System.out.println("Введіть до 20 чисел (0 - щоб завершити введення):");//видаємо завдання юзеру
                int i = 20; //робимо змінну для обмеження цифр
                do {//виконуємо заповнення
                    i--;//мінусуємо цифру від ліміту
                    entered = input.nextInt(); //зчитуємо цифру
                    if (entered % 2 != 0) { //перевіряємо чи не парна
                        nums.add(entered); //записуємо
                    }
                } while (entered != 0 && i > 0);// виконуємо цикл поки не введуть нуль або не закінчиться ліміт в 20 цифр
            } catch (InputMismatchException e) {//ловимо невідповідність на цифру
                System.out.println("Невірне введення. Будь ласка, спробуйте знову.");//даємо звіздюлей і "хуйня перероблюй"
                input.nextLine();//очищаємо введення
            }
            System.out.println("Ось шо вийшло:");//motd крч
            printShtuka(nums);//виводимо результат
            break;//вбиваємо цикл перевірок
        }
    }

    public static int getMaxNum(ArrayList<Integer> list) { //робимо функцію для відлову найбільшого з введених чисел
        int maxNum = Integer.MIN_VALUE; //робимо для цього змінну

        for (int num : list) {//запускаємо цикл перевірки по списку
            if (num % 2 != 0 && num > maxNum) { // якщо не парне і більше ніж минуле
                maxNum = num;//переписуємо
            }
        }

        return maxNum;//повертаємо результат
    }
    public static void printShtuka(ArrayList<Integer> list) {//робим функцію для нашої основної задачі - виводу
        int maxNum = getMaxNum(list); //робим для цього змінну з минулої функції

        for (int num : list) { //запускаєм цикл по списку
            if (num % 2 == 0) { //перевіряємо на парність
                continue;
            }

            int space = (maxNum - num) / 2; //робимо змінну для пробільчиків
            int nums = num; //записуємо

            for (int i = 0; i < space; i++) {//робим цикл для виводу цих пробільчиків
                System.out.print(" ");//малюєм пробіли
            }

            for (int i = 0; i < nums; i++) {//робим цикл для зірочок які малюють всяку штуку нам
                System.out.print("*"); //виводимо
            }
            System.out.println();//переходим на некст рядок
        }
    }

}
