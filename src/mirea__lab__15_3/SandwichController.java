package mirea__lab__15_3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class SandwichController {
    private Kitchen model;
    private SandwichView view;

    public SandwichController(Kitchen model, SandwichView view) {
        this.model = model;
        this.view = view;
        view.addController(this);
    }

    public void placeOrder(String sandwichType) {
        String sandwich = model.makeSandwich(sandwichType);
        view.showSandwich(sandwich);
    }
}




