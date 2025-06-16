import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static int osMessage(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (osType == 1) {
            if (clientDeviceYear < currentYear) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (clientDeviceYear < currentYear) {
                return 3;
            } else {
                return 4;
            }
        }
    }

    public static int deliveryTime(int deliveryDistance) {
        int count = 1;
        if (deliveryDistance > 20) {
            count += 1;
            if (deliveryDistance > 60) {
                count += 1;
                if (deliveryDistance > 100) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год для проверки: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }

        System.out.println("\nЗадание 2");
        int osType = 1;
        int clientDevice = 2025;
        switch (osMessage(osType, clientDevice)) {
            case 1:
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                break;
            case 2:
                System.out.println("Установите новую версию приложения для Android по ссылке");
                break;
            case 3:
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case 4:
                System.out.println("Установите новую версию приложения для iOS по ссылке");
                break;
        }

        System.out.println("\nЗадание 3");
        int deliveryDistance = 95;
        if (deliveryTime(deliveryDistance) == 4) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime(deliveryDistance));
        }

    }
}