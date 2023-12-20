package mirea__lab__15_1;

public class MVCPatternDemo{
    public static void main(String[] args){
        Student model = retriveCourseFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.setStudentName("Sasha");
        controller.setStudentRollNo("101");
        controller.updateView();
    }

    public static Student retriveCourseFromDatabase(){
        Student student = new Student();
        student.setName("Max");
        student.setRollNo("102");
        return student;
    }
}
