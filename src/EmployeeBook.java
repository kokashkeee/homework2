public class EmployeeBook {

    private static Employee[] employees = new Employee[11];

    public EmployeeBook() {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 100000);
        employees[1] = new Employee("Иванов Олег Иванович", 1, 150000);
        employees[2] = new Employee("Сидоров Владимир Васильевич", 2, 76500);
        employees[3] = new Employee("Сидоров Радион Васильевич", 2, 126500);
        employees[4] = new Employee("Петров Андрей Геннадьевич", 3, 63450);
        employees[5] = new Employee("Петров Илья Геннадьевич", 3, 113450);
        employees[6] = new Employee("Кравченко Алексей Алексеевич", 4, 124000);
        employees[7] = new Employee("Кравченко Владимир Алексеевич", 4, 174000);
        employees[8] = new Employee("Юсупова Гульчихра Шухратовна", 5, 132000);
        employees[10] = new Employee("Юсупова Машкура Шухратовна", 5, 182000);
    }

    public boolean addEmployee(Employee newEmployee) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                count++;
            }
        }
        return count != 0;
    }

    public void deleteEmployee(int id) {
        int i = 0;
        for (; i < employees.length && employees[i].getId() != id; i++) ;
        employees[i] = null;
    }

    public Employee findEmployee(int id) {
        int i = 0;
        for (; i < employees.length && employees[i].getId() != id; i++) ;
        return employees[i];
    }

    public void allEmploysInf() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public int salarySum() {
        int salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                salarySum += employees[i].getSalary();
            }
        }
        return salarySum;
    }

    public int minSalary() {
        int minSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public int maxSalary() {
        int maxSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public int averageSalary() {
        return (int) ((float) salarySum() / employees.length);
    }

    public void printFullNames() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public void allSalaryIndexing(int index) {
        int newSalary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                newSalary = employees[i].getSalary();
                employees[i].setSalary((int) (newSalary * (1 + ((float) index / 100))));
            }
        }
    }

    public int departmentsMinSalary(int departmentsNumber) {
        int minSalary = maxSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentsNumber && minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public int departmentsMaxSalary(int departmentsNumber) {
        int maxSalary = minSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentsNumber && maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public int departmentsSalarySum(int departmentsNumber) {
        int salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentsNumber) {
                salarySum += employees[i].getSalary();
            }
        }
        return salarySum;
    }

    public int departmentsAverageSalary(int departmentsNumber) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentsNumber) {
                count++;
            }
        }
        return (int) ((float) departmentsSalarySum(departmentsNumber) / count);
    }

    public void departmentsSalaryIndexing(int departmentsNumber, int index) {
        int newSalary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentsNumber) {
                newSalary = employees[i].getSalary();
                employees[i].setSalary((int) (newSalary * (1 + ((float) index / 100))));
            }
        }
    }

    public void departmentsEmploysInf(int departmentsNumber) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == departmentsNumber) {
                System.out.println(employees[i].toStringWithoutId());
            }
        }
    }

    public void employeesSalaryLessThan(int salaryLess) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < salaryLess) {
                System.out.println(employees[i].toString());
            }
        }
    }
}