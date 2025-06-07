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
        int[] mass = new int[3];
        mass[0] = 1;
        mass[1] = 2;
        mass[2] = 3;
        System.out.print(mass[0] + " ");
        System.out.print(mass[1] + " ");
        System.out.println(mass[2]);
        double[] array = {1.57, 7.654, 9.986};
        System.out.print(array[0] + " ");
        System.out.print(array[1] + " ");
        System.out.println(array[2]);
        int[] yachmo = {4, 5};
        System.out.print(yachmo[0] + " ");
        System.out.println(yachmo[1]);

        System.out.println("\nЗадание 2");
        System.out.print("Введите количество элементов массива: ");
        Scanner scanner = new Scanner(System.in);
        int numOfEl = scanner.nextInt();
        int[] mass1 = new int[numOfEl];
        System.out.print("Введите значения элементов массива: ");
        for (int i = 0; i < numOfEl; i++) {
            mass1[i] = scanner.nextInt();
        }
        for (int i = 0; i < numOfEl; i++) {
            System.out.print(mass1[i] + " ");
        }

        System.out.println("\n\nЗадание 3");
        //распечатал в обратном порядке массив из третьей задачи
        for (int i = numOfEl - 1; i >= 0; i--) {
            System.out.print(mass1[i] + " ");
        }

        System.out.println("\n\nЗадание 4");
        for (int i = 0; i < 3; i++) {
            if (mass[i] % 2 != 0) {
                mass[i] += 1;
            }
            System.out.print(mass[i] + " ");
        }
    }
}