public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.printf(i + " ");
        }
        System.out.println("\n\nЗадание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.printf(i + " ");
        }
        System.out.println("\n\nЗадание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.printf(i + " ");
        }
        System.out.println("\n\nЗадание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.printf(i + " ");
        }
        System.out.println("\n\nЗадание 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0) {
                System.out.printf(i + " ");
            }
        }
        System.out.println("\n\nЗадание 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.printf(i + " ");
        }
        System.out.println("\n\nЗадание 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.printf(i + " ");
        }
        System.out.println("\n\nЗадание 8");
        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\nЗадание 9");
        int money1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 *= 1.01;
            total1 += money1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println("\nЗадание 10");
        int x;
        for (int i = 1; i <= 10; i++) {
            x = 2 * i;
            System.out.println("2*" + i + "=" + x);
        }
    }
}