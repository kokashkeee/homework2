import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //написал функцию ввода массива, сам, похвалите пж
        //System.out.print("Введите количество элементов массива: ");
        //Scanner scanner = new Scanner(System.in);
        //int numOfEl = scanner.nextInt();
        //int[] mass = new int[numOfEl];
        //System.out.print("Введите значения элементов массива: ");
        //for (int i = 0; i < numOfEl; i++) {
        //    mass[i] = scanner.nextInt();
        //}

        System.out.println("\nЗадание 1");
        int[] mass = {1, 2, 2, 2, 3};
        int sum = 0;
        for (int i : mass) {
            sum += mass[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("\nЗадание 2");
        int min = mass[0];
        int max = min;
        for (int i = 1; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
        }
        for (int i = 1; i < mass.length; i++) {
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("\nЗадание 3");
        double averagePerWeek = (double) sum / mass.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePerWeek + " рублей");

        System.out.println("\nЗадание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] reversedFullName = new char[reverseFullName.length];
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            reversedFullName[reverseFullName.length - 1 - i] = reverseFullName[i];
        }
        for (int i = 0; i < reversedFullName.length; i++) {
            System.out.print(reversedFullName[i]);
        }
    }
}