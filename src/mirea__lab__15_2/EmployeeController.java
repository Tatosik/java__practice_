package mirea__lab__15_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
        view.addController(this);
    }

    public void calculateSalary() {
        model = new Employee(view.getName(), view.getHourlyRate(), view.getHoursWorked());
        double salary = model.calculateSalary();
        view.setResult("Salary for " + model.getName() + ": $" + salary);
    }
}
