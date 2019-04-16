public class EnglishTeacher extends SchoolStaff implements CourseInstructor {
    public EnglishTeacher(String name, String department, int age){
        super(name, department, age);
    }

    public void teach(){
        System.out.println("Teaching english");
    }
}