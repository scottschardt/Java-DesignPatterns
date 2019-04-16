import java.util.ArrayList;


public class EmployeeDAO {
    Employee emp1 = new Employee("Mike", null, 5000, false);
    Employee emp2 = new Employee("Scott", null, 3000, false);
    Employee emp3 = new Employee("Pat", null, 8000, false);
    Employee emp4 = new Employee("Hans", null, 4000, false);
    Employee emp5 = new Employee("William", null, 1000, false);

    ArrayList<Employee> employees;

    public ArrayList<Employee> generateEmployees(){
        employees = new ArrayList<Employee>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        return employees;
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }
}