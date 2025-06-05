public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        System.out.println("'в банку'");
        int money = 15000;
        int total = 0;
        int i = 1;
        while (total <= 2459000) {
            total += money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i += 1;
        }
        System.out.println("'в банк'");
        total = 0;
        i = 1;
        while (total <= 2459000) {
            total *= 1.01;
            total += money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i += 1;
        }
        System.out.println("\nЗадание 2");
        int x = 0;
        while (x < 10) {
            x += 1;
            System.out.print(x + " ");
        }
        System.out.print("\n");
        for (; x >= 1; ) {
            System.out.print(x + " ");
            x -= 1;
        }
        System.out.println("\n\nЗадание 3");
        int population = 12000000;
        double birthRate = (double) 17 / 1000;
        double mortality = (double) 8 / 1000;
        System.out.println(birthRate);
        for (int g = 1; g <= 10; g++) {
            population = (int) (population + population * birthRate);
            population = (int) (population - population * mortality);
            System.out.println("Год " + g + ", численность населения составляет " + population);
        }
        System.out.println("\nЗадание 4");
        int deposit = 15000;
        for (int g = 1; deposit <= 12000000; g++) {
            deposit *= 1.07;
            System.out.println("Месяц " + g + ", сумма накоплений " + deposit);
        }
        System.out.println("\nЗадание 5");
        deposit = 15000;
        for (int g = 1; deposit <= 12000000; g++) {
            deposit *= 1.07;
            if (g % 6 == 0) {
                System.out.println("Месяц " + g + ", сумма накоплений " + deposit);
            }
        }
        System.out.println("\nЗадание 6");
        deposit = 15000;
        for (int g = 1; g <= 12 * 9; g++) {
            deposit *= 1.07;
            if (g % 6 == 0) {
                System.out.println("Месяц " + g + ", сумма накоплений " + deposit);
            }
        }
        System.out.println("\nЗадание 7");
        int friday = 4;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е чисо. Необходимо подготовить отчет");
        }
        System.out.println("\nЗадание 8");
        int year = 2025;
        int beforeYear = year - 200;
        int afterYear = year + 100;
        for (int g = 0; g <= afterYear; g += 79) {
            if (g >= 1825) {
                System.out.println(g);
            }
        }
    }
}