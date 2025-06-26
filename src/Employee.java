import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private int salary;
    private int[] departments = {1, 2, 3, 4, 5};
    private int departmentEmployee;
    private int id;
    private String fullName;
    private static int idEmployeeNext = 1;

    public Employee(String fullName, int departmentsNumber, int salary) {
        this.fullName = fullName;
        this.id = idEmployeeNext++;
        this.departmentEmployee = departments[departmentsNumber - 1];
        this.salary = salary;
    }

    public String toString() {
        return "|\u001B[1mФИО\u001B[0m: " + fullName + "| |\u001B[1mотдел\u001B[0m: " + departmentEmployee + "| |\u001B[1mid\u001B[0m: " + id + "| |\u001B[1mЗП\u001B[0m: " + salary + "|";
    }

    public String toStringWithoutId() {
        return "|\u001B[1mФИО\u001B[0m: " + fullName + "| |\u001B[1mотдел\u001B[0m: " + departmentEmployee + "| |\u001B[1mЗП\u001B[0m: " + salary + "|";
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return this.departmentEmployee;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.departments == ((Employee) other).departments && this.salary == ((Employee) other).salary && this.fullName.equals(((Employee) other).fullName) && this.id == ((Employee) other).id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departmentEmployee, salary, id);
    }
}
