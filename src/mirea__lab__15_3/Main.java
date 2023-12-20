package mirea__lab__15_3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Kitchen model = new Kitchen();
        SandwichView view = new SandwichView();
        SandwichController controller = new SandwichController(model, view);

        view.show();
    }
}
