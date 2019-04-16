public class ScienceTeacher extends SchoolStaff implements CourseInstructor{
    public ScienceTeacher(String name, String department, int age){
        super(name, department, age);
    }
    public void teach(){
        System.out.println("Teaching science");
    }
}