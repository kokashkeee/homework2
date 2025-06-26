public class Main {

    public static void main(String[] args) {
        int index = 10;
        int departmentsNumber = 2;
        int salaryLess = 100000;
        EmployeeBook employeeBook = new EmployeeBook();
        Employee newEmployee = new Employee("Школа Савелий Романович", 1, 113000);
        System.out.println("\n\u001B[1mИнформация о сотрудниках:\u001B[0m");
        employeeBook.allEmploysInf();
        System.out.print("\n");
        System.out.println("\u001B[1mСумма затрат на ЗП в месяц:\u001B[0m " + employeeBook.salarySum() + "\n");
        System.out.println("\u001B[1mСредняя ЗП:\u001B[0m " + employeeBook.averageSalary() + "\n");
        System.out.println("\u001B[1mМинимальная ЗП:\u001B[0m " + employeeBook.minSalary() + "\n");
        System.out.println("\u001B[1mМаксимальная ЗП:\u001B[0m " + employeeBook.maxSalary() + "\n");
        System.out.println("\u001B[1mФИО сотрудников:\u001B[0m");
        employeeBook.printFullNames();
        System.out.print("\n");
        employeeBook.allSalaryIndexing(index);
        System.out.println("\u001B[1mЗарплаты после индексирования:\u001B[0m");
        employeeBook.allEmploysInf();
        System.out.println("");
        System.out.println("\u001B[1mМинимальная ЗП в " + departmentsNumber + " отделе:\u001B[0m " + employeeBook.departmentsMinSalary(departmentsNumber) + "\n");
        System.out.println("\u001B[1mМаксимальная ЗП в " + departmentsNumber + " отделе:\u001B[0m " + employeeBook.departmentsMaxSalary(departmentsNumber) + "\n");
        System.out.println("\u001B[1mСумма затрат на ЗП по " + departmentsNumber + " отделу:\u001B[0m " + employeeBook.departmentsSalarySum(departmentsNumber) + "\n");
        System.out.println("\u001B[1mСредняя ЗП по " + departmentsNumber + " отделу:\u001B[0m " + employeeBook.departmentsAverageSalary(departmentsNumber) + "\n");
        employeeBook.departmentsSalaryIndexing(departmentsNumber, index);
        System.out.println("\u001B[1mЗарплаты в " + departmentsNumber + " отделе после индексирования:\u001B[0m");
        employeeBook.departmentsEmploysInf(departmentsNumber);
        System.out.println("\n\u001B[1mСотрудники с ЗП меньше " + salaryLess + "\u001B[0m");
        employeeBook.employeesSalaryLessThan(salaryLess);
        employeeBook.addEmployee(newEmployee);
        System.out.println("\n\u001B[1m+1сотрудник:\u001B[0m ");
        employeeBook.allEmploysInf();
        int idDel = 5;
        int id = 11;
        employeeBook.deleteEmployee(idDel);
        System.out.println("\n\u001B[1m-1 сотрудник\u001B[0m");
        employeeBook.allEmploysInf();
        System.out.println("\n\u001B[1mСотрудник с id: " + id + "\u001B[0m\n" + employeeBook.findEmployee(id).toString());
    }
}