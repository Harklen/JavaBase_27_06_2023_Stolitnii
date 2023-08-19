package hillel.stolitnii.homeworks.homework14;
interface Smartphones {
    void call();
    void sms();
    void internet();
}

class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Телефонуємо з Андроїда");
    }

    @Override
    public void sms() {
        System.out.println("Відправляємо смс з Андроїда");
    }

    @Override
    public void internet() {
        System.out.println("Заходимо в інтернет з Андроїда");
    }

    @Override
    public void runLinuxCommands() {
        System.out.println("Виконуємо команди Linux на Андроїді");
    }
}

class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Звонимо з айфона");
    }

    @Override
    public void sms() {
        System.out.println("Відправляємо смс з айфона");
    }

    @Override
    public void internet() {
        System.out.println("Заходимо в інтернет з айфона");
    }

    @Override
    public void useApplePay() {
        System.out.println("Розплачуємось Apple Pay з айфона");
    }
}

interface LinuxOS {
    void runLinuxCommands();
}

interface iOS {
    void useApplePay();
}

public class Main {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        iPhones iPhone = new iPhones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.runLinuxCommands();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.useApplePay();
    }
}
