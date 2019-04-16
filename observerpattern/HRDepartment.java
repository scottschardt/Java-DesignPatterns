public class HRDepartment implements Observer {
    
    
    public void callMe(Employee emp, String msg){
        System.out.print(" HR Department notified! ");
        System.out.print(msg + " " + emp.getName());
    }
}