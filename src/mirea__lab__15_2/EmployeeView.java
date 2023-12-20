package mirea__lab__15_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class EmployeeView {
    private JFrame frame;
    private JTextField nameField;
    private JTextField rateField;
    private JTextField hoursField;
    private JTextArea resultArea;

    public EmployeeView() {
        frame = new JFrame("Employee Salary Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField(20);
        JLabel rateLabel = new JLabel("Hourly Rate: ");
        rateField = new JTextField(20);
        JLabel hoursLabel = new JLabel("Hours Worked: ");
        hoursField = new JTextField(20);

        JButton calculateButton = new JButton("Calculate Salary");
        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(rateLabel);
        frame.add(rateField);
        frame.add(hoursLabel);
        frame.add(hoursField);
        frame.add(calculateButton);
        frame.add(resultArea);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // При нажатии кнопки "Calculate Salary" вызывается метод в контроллере
                controller.calculateSalary();
            }
        });
    }

    public void show() {
        frame.setVisible(true);
    }

    public String getName() {
        return nameField.getText();
    }

    public double getHourlyRate() {
        return Double.parseDouble(rateField.getText());
    }

    public int getHoursWorked() {
        return Integer.parseInt(hoursField.getText());
    }

    public void setResult(String result) {
        resultArea.setText(result);
    }

    private EmployeeController controller;

    public void addController(EmployeeController controller) {
        this.controller = controller;
    }
}
