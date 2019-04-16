import java.util.Date;

public class Employee {
    String name;
    Date date;
    int salary;
    boolean working;
    public int employeeID;
    
    private static int COUNTER;

    public Employee(String name, Date date, int salary, boolean working){
        this.name = name;
        this.date = date;
        this.salary = salary;
        this.working = working;

        employeeID = ++COUNTER;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return this.employeeID;
    }

}