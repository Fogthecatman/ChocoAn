import controller.StateController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Jacob on 11/6/2017.
 */
public class Driver extends Application{

    @Override
    public void start(Stage primaryStage) {

        StateController sc = StateController.getInstance();
        sc.run(primaryStage);

    }


    public static void main(String args[]){
        launch(args);
    }

}
