package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

/**
 * Created by Jacob on 11/6/17.
 */
public class LoginController {

    public TextField userField;
    public TextField passwordField;

    public LoginController() {

    }

    //Validates id/password user enters in LoginView
    public boolean validate(int id, String password){
        //Query database with id
        //See if password matches
        //set User.id
        //return true or false

        return true;
    }

    //Queries DB to get role corresponding with User
    //Returns string (subject to change) with role, to populate GUI with proper View
    public String getRole(){
        //Query roleDB with user's id
        //Get role as String
        //return role to *********** to populate GUI w/ proper view

        return null; //Null til we implement properly
    }

    public void run() {

    }

    //@TODO regex validation for passing values
    public void submit(ActionEvent actionEvent) {
        validate(Integer.parseInt(userField.getText()), passwordField.getText());
    }
}
