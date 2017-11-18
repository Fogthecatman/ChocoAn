package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Jacob on 11/17/17.
 *
 * This class is a Singleton for switching views
 *
 */

enum View { LOGIN, SERVICE_ENTRY, OPERATOR }

public class StateController {

    private static StateController sc;

    private Parent login, service, operator;
    private Scene current;
    private Stage primaryStage;


    protected StateController() {
        //This is only here to stop compilation errors
    }


    public static StateController getInstance() {

        if(sc == null) {
            sc = new StateController();
        }

        return sc;
    }

    public void run(Stage primaryStage) {

        this.primaryStage = primaryStage;

        try {

            login = FXMLLoader.load(getClass().getResource("../view/login.fxml"));
            service = FXMLLoader.load(getClass().getResource("../view/service_entry.fxml"));
            operator = FXMLLoader.load(getClass().getResource("../view/operator.fxml"));

            current = new Scene(login, 600, 700);

            //Set stylesheet for current
            current.getStylesheets().add(getClass().getResource("../view/css/app.css").toExternalForm());

        } catch (Exception e) {
            e.printStackTrace();
        }


        //Main event
        primaryStage.setTitle("ChocoAn Login");
        primaryStage.setScene(current);
        primaryStage.show();
    }


    public void setView(View v) {

        if(v == View.LOGIN)
            current = new Scene(login, 600, 700);
        else if(v == View.SERVICE_ENTRY)
            current = new Scene(service, 600, 700);
        else if(v == View.OPERATOR)
            current = new Scene(operator, 600, 700);

        //Set stylesheet for current
        current.getStylesheets().add(getClass().getResource("../view/css/app.css").toExternalForm());

        primaryStage.setScene(current);
        primaryStage.show();
    }

}