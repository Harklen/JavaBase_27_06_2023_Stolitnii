package hillel.stolitnii.homeworks.homework10;

public class Person {
    public static void main(String[] args) {
        String[][] dataList = new String[3][4];
        dataList[0][0] = "Петро";
        dataList[0][1] = "Корж";
        dataList[0][2] = "Київ";
        dataList[0][3] = "0932344211";
        dataList[1][0] = "Іван";
        dataList[1][1] = "Зібров";
        dataList[1][2] = "Жмеринка";
        dataList[1][3] = "0637334218";
        dataList[2][0] = "Василь";
        dataList[2][1] = "Яремій";
        dataList[2][2] = "Чернівці";
        dataList[2][3] = "0662547314";

        for (int i = 0; i < 3; i++) {
            String firstName = dataList[i][0];
            String lastName = dataList[i][1];
            String city = dataList[i][2];
            String phone = dataList[i][3];
            personInfo(firstName, lastName, city, phone);
        }
    }
    public static void personInfo(String firstName, String lastName, String city, String phone) {
        String formattedString = String.format("Зателефонувати громадянинові %s %s з міста %s можна за телефоном %s", firstName, lastName, city, phone);
        System.out.println(formattedString);
    }
}

