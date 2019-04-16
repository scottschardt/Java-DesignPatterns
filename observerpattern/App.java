import java.util.Date;
public class App {
    public static void main(String args[]){

        Observer payroll = new PayrollDepartment();
        Observer hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee scott = new Employee("Scott", new Date(), 35000, true);
        ems.hireNewEmployee(scott);

        ems.modifyEmployeeName(6, "Scotty");



    }
}