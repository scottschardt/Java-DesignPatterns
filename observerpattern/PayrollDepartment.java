public class PayrollDepartment implements Observer {
    
    
    public void callMe(Employee emp, String msg){
        System.out.print(" Payroll Department notified! ");
        System.out.print(msg + " " + emp.getName());
    }
}