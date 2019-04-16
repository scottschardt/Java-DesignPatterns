public class SchoolStaff{
    
    String name;
    String department;
    int age;
    public SchoolStaff(String name, String department, int age){
        this.name = name;
        this.department = department;
        this.age = age;
    }
    
    private void makeAnnouncements(){
        System.out.println("Announcements being made!");
    }
    private void takeAttendence(){
        System.out.println("Taking Attendence!");
    }
    private void collectPaperWork(){
        System.out.println("collecting Paper Work!");
    }
    private void conductHallwayDuties(){
        System.out.println("Conducting hallway duties!");
    }

    public void performOtherResponsibilities(){
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conductHallwayDuties();
    }
}