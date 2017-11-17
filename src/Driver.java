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
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/login.fxml"));
        Scene scene = new Scene(root, 300, 275);
        scene.getStylesheets().add(getClass().getResource("view/css/app.css").toExternalForm());
        primaryStage.setTitle("ChocoAn Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String args[]){
        launch(args);
    }

}
