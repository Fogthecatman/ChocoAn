package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.lang.Integer;
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

    //Gets data from UI's text fields, writes values to database
    //@TODO: Need to implement some way to prevent submission if field have invalid data
    public void submit(ActionEvent actionEvent) {
       int serviceID = Integer.parseInt(serviceIdField.getText());
       String comment = commentArea.getText();
       int memberID = Integer.parseInt(memberIdField.getText());
       String date = dateServiceField.getText();

       //Write values to database
        //Display "Submission successful on GUI when completed
    }

    public void cancel(ActionEvent actionEvent) {
        //@TODO This call throws an error due to the changes in scenes. Need help fixing.
        sc.setView(View.OPERATOR);
    }

    public void validate(ActionEvent actionEvent) {
        //Validates Service Code
        int serviceID = Integer.parseInt(serviceIdField.getText());

        //query DB with service ID
        //If it exists, fine, otherwise mark as invalid
    }
}
