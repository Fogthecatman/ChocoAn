package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.User;

public class ServiceEntryController {

    private StateController sc;

    public TextField serviceIdField;
    public TextArea commentArea;
    public TextField memberIdField;
    public TextField dateServiceField;

    public ServiceEntryController() {
        sc = StateController.getInstance();
    }

    public void submit(ActionEvent actionEvent) {
    }

    public void cancel(ActionEvent actionEvent) {
        //@TODO This call throws an error due to the changes in scenes. Need help fixing.
        sc.setView(View.OPERATOR);
    }

    public void validate(ActionEvent actionEvent) {
    }
}
