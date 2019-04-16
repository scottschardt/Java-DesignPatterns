public class Classroom{
    public static void main(String args[]){
        EnglishTeacher william = new EnglishTeacher("Will Warnisher", "English", 23);
        william.teach();
        william.performOtherResponsibilities();

        SubstituteTeacher johann = new SubstituteTeacher("Johann", "sub", 22);

        johann.performOtherResponsibilities();
    }
}