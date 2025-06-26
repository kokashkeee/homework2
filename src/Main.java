public class Main {

    public static void allEmploysInf(Employee[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i].toString());
        }
    }

    public static int salarySum(Employee[] mass) {
        int salarySum = 0;
        for (int i = 0; i < mass.length; i++) {
            salarySum += mass[i].getSalary();
        }
        return salarySum;
    }

    public static int minSalary(Employee[] mass) {
        int minSalary = mass[0].getSalary();
        for (int i = 1; i < mass.length; i++) {
            if (minSalary > mass[i].getSalary()) {
                minSalary = mass[i].getSalary();
            }
        }
        return minSalary;
    }

    public static int maxSalary(Employee[] mass) {
        int maxSalary = mass[0].getSalary();
        for (int i = 1; i < mass.length; i++) {
            if (maxSalary < mass[i].getSalary()) {
                maxSalary = mass[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static int averageSalary(Employee[] mass) {
        return (int) ((float) salarySum(mass) / mass.length);
    }

    public static void printFullNames(Employee[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i].getFullName());
        }
    }

    public static void allSalaryIndexing(int index, Employee[] mass) {
        int newSalary;
        for (int i = 0; i < mass.length; i++) {
            newSalary = mass[i].getSalary();
            mass[i].setSalary((int) (newSalary * (1 + ((float) index / 100))));
        }
    }

    public static int departmentsMinSalary(int departmentsNumber, Employee[] mass) {
        int minSalary = maxSalary(mass);
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getDepartment() == departmentsNumber && minSalary > mass[i].getSalary()) {
                minSalary = mass[i].getSalary();
            }
        }
        return minSalary;
    }

    public static int departmentsMaxSalary(int departmentsNumber, Employee[] mass) {
        int maxSalary = minSalary(mass);
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getDepartment() == departmentsNumber && maxSalary < mass[i].getSalary()) {
                maxSalary = mass[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static int departmentsSalarySum(int departmentsNumber, Employee[] mass) {
        int salarySum = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getDepartment() == departmentsNumber) {
                salarySum += mass[i].getSalary();
            }
        }
        return salarySum;
    }

    public static int departmentsAverageSalary(int departmentsNumber, Employee[] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getDepartment() == departmentsNumber) {
                count++;
            }
        }
        return (int) ((float) departmentsSalarySum(departmentsNumber, mass) / count);
    }

    public static void departmentsSalaryIndexing(int departmentsNumber, int index, Employee[] mass) {
        int newSalary;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getDepartment() == departmentsNumber) {
                newSalary = mass[i].getSalary();
                mass[i].setSalary((int) (newSalary * (1 + ((float) index / 100))));
            }
        }
    }

    public static void departmentsEmploysInf(int departmentsNumber, Employee[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getDepartment() == departmentsNumber) {
                System.out.println(mass[i].toStringWithoutId());
            }
        }
    }

    public static void employeesSalaryLessThan(int salaryLess, Employee[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getSalary() < salaryLess) {
                System.out.println(mass[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 100000);
        employees[1] = new Employee("Иванов Олег Иванович", 1, 150000);
        employees[2] = new Employee("Сидоров Владимир Васильевич", 2, 76500);
        employees[3] = new Employee("Сидоров Радион Васильевич", 2, 126500);
        employees[4] = new Employee("Петров Андрей Геннадьевич", 3, 63450);
        employees[5] = new Employee("Петров Илья Геннадьевич", 3, 113450);
        employees[6] = new Employee("Кравченко Алексей Алексеевич", 4, 124000);
        employees[7] = new Employee("Кравченко Владимир Алексеевич", 4, 174000);
        employees[8] = new Employee("Юсупова Гульчихра Шухратовна", 5, 132000);
        employees[9] = new Employee("Юсупова Машкура Шухратовна", 5, 182000);
        System.out.println("\n\u001B[1mИнформация о сотрудниках:\u001B[0m");
        allEmploysInf(employees);
        System.out.print("\n");
        System.out.println("\u001B[1mСумма затрат на ЗП в месяц:\u001B[0m " + salarySum(employees) + "\n");
        System.out.println("\u001B[1mСредняя ЗП:\u001B[0m " + averageSalary(employees) + "\n");
        System.out.println("\u001B[1mМинимальная ЗП:\u001B[0m " + minSalary(employees) + "\n");
        System.out.println("\u001B[1mМаксимальная ЗП:\u001B[0m " + maxSalary(employees) + "\n");
        System.out.println("\u001B[1mФИО сотрудников:\u001B[0m");
        printFullNames(employees);
        System.out.print("\n");
        int index = 10;
        int departmentsNumber = 2;
        int salaryLess = 100000;
        allSalaryIndexing(index, employees);
        System.out.println("\u001B[1mЗарплаты после индексирования:\u001B[0m");
        allEmploysInf(employees);
        System.out.println("");
        System.out.println("\u001B[1mМинимальная ЗП в " + departmentsNumber + " отделе:\u001B[0m " + departmentsMinSalary(departmentsNumber, employees) + "\n");
        System.out.println("\u001B[1mМаксимальная ЗП в " + departmentsNumber + " отделе:\u001B[0m " + departmentsMaxSalary(departmentsNumber, employees) + "\n");
        System.out.println("\u001B[1mСумма затрат на ЗП по " + departmentsNumber + " отделу:\u001B[0m " + departmentsSalarySum(departmentsNumber, employees) + "\n");
        System.out.println("\u001B[1mСредняя ЗП по " + departmentsNumber + " отделу:\u001B[0m " + departmentsAverageSalary(departmentsNumber, employees) + "\n");
        departmentsSalaryIndexing(departmentsNumber, index, employees);
        System.out.println("\u001B[1mЗарплаты в " + departmentsNumber + " отделе после индексирования:\u001B[0m");
        departmentsEmploysInf(departmentsNumber, employees);
        System.out.println("\n\u001B[1mСотрудники с ЗП меньше " + salaryLess + "\u001B[0m");
        employeesSalaryLessThan(salaryLess, employees);
    }
}