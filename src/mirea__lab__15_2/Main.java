package mirea__lab__15_2;

public class Main {
    public static void main(String[] args) {
        Employee model = new Employee("", 0, 0);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        view.show();
    }
}
