public class MathTeacher extends SchoolStaff implements CourseInstructor{
    public MathTeacher(String name, String department, int age){
        super(name, department, age);
    }
    public void teach(){
        System.out.println("Teaching math");
    }
}