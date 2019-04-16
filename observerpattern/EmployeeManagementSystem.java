import java.util.ArrayList;


public class EmployeeManagementSystem implements Subject {
    private Employee employee;
    private String msg;
    private EmployeeDAO employeeDAO;
    private ArrayList<Employee> employees;
    private ArrayList<Observer> observers;
    

public EmployeeManagementSystem(){
    observers = new ArrayList<Observer>();
    employeeDAO = new EmployeeDAO();
    employees = employeeDAO.generateEmployees();
}
   

    public void registerObserver(Observer anObserver){
        observers.add(anObserver);
    }
    public void removeObserver(Observer anObserver){
        observers.remove(anObserver);
    }
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.callMe(employee, msg);
        }
    }

    public void hireNewEmployee(Employee emp){
        employee = emp;
        msg = "New Hire: ";
        notifyObservers();
        employees.add(emp);
        System.out.println(employee + " is hired!");
    }

    public void modifyEmployeeName(int id, String newName){
        boolean notify = false;

        for(Employee emp : employees){
            if(id == emp.employeeID){
                emp.setName(newName);
                this.employee = emp;
                this.msg = "Employee name has been modified";
                notify = true;
            }
        }
        if(notify){
            notifyObservers();
        }
    }



}