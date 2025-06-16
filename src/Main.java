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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String firstName = scanner.next();
        System.out.println("Введите фамилию: ");
        String middleName = scanner.next();
        System.out.println("Введите отчество: ");
        String lastName = scanner.next();
        String fullName = middleName + ' ' + firstName + ' ' + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("\nЗадание 2");
        fullName = fullName.toUpperCase();
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("\nЗадание 3");
        fullName = fullName.replace('Ё', 'Е');
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    }
}