//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Задача №1
        System.out.println("Задача №1");
        int year = 2000;
        /* Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        year = in.nextInt();
        in.close(); */
        checkYear(year);

        // Задача №2
        System.out.println("Задача №2");
        establishOS(1, 2010);

        // Задача №3
        System.out.println("Задача №3");
        System.out.println(calculateDistance(101));
    }

    public static void checkYear(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void establishOS(int clientOS, int clientDeviceYear){
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static byte calculateDistance(int deliveryDistance) {
        byte days = 0;               // Количество дней доставки
        if (deliveryDistance >= 0 && deliveryDistance <= 20) days = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) days = 2;
        if (deliveryDistance > 60 && deliveryDistance <= 100) days = 3;
        return days;
        //if (deliveryDistance > 100) return "Доставки нет";
        //    else return "Потребуется дней: " + days;
    }
}