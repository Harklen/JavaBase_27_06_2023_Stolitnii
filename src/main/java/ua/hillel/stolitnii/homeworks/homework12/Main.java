package hillel.stolitnii.homeworks.homework12;
class FitnessTracker {
    private final String firstName;
    public String lastName;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;
    public double weight;
    public String pressure;
    public int stepsPerDay;
    public int age;
    private String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    private int getDayOfBirth() {
        return dayOfBirth;
    }
    private int getMonthOfBirth() {
        return monthOfBirth;
    }
    private int getYearOfBirth() {
        return yearOfBirth;
    }
    private String getEmail() {
        return email;
    }
    private String getPhone() {
        return phone;
    }
    public double getWeight() {
        return weight;
    }
    public String getPressure() {
        return pressure;
    }
    public int getStepsPerDay() {
        return stepsPerDay;
    }
    public int getAge() {
        return age;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public FitnessTracker(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth,
                          String email, String phone, double weight, String pressure, int stepsPerDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
        this.age = 2020 - this.yearOfBirth;
    }
    public void printAccountInfo() {
        System.out.println("Ім'я: " + firstName + " " + lastName);
        System.out.println("Дата народження: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Вага: " + weight + " кг");
        System.out.println("Тиск: " + pressure);
        System.out.println("Кроків на день: " + stepsPerDay);
        System.out.println("Вік: " + age);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("Вася", "Пупкін", 10, 5, 1990,
                "pupkin@gmail.com", "+123456789", 75.5, "120/70", 5000);
        FitnessTracker user2 = new FitnessTracker("Діма", "Кодзіма", 15, 8, 1985,
                "kodzhima@gmail.com", "+987654321", 62.3, "110/90", 8000);
        FitnessTracker user3 = new FitnessTracker("Акакій", "Марченко", 25, 11, 2000,
                "marchenko@gmail.com", "+555555555", 80.0, "130/80", 3000);

        System.out.println("Вхідні дані користувача:");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setWeight(70.2);
        user1.setPressure("110/90");
        user1.setStepsPerDay(6000);

        user2.setLastName("Блаблакар");
        user2.setPressure("120/80");
        user2.setStepsPerDay(10000);

        System.out.println("Оновлені дані користувача:");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}