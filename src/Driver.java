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
        Parent login = (Parent) FXMLLoader.load(getClass().getResource("view/login.fxml"));
        //Parent login = FXMLLoader.load(getClass().getResource("view/service_entry.fxml"));
        //Parent login = FXMLLoader.load(getClass().getResource("view/operator.fxml"));
        Scene scene = new Scene(login, 600, 700);
        scene.getStylesheets().add(getClass().getResource("view/css/app.css").toExternalForm());
        primaryStage.setTitle("ChocoAn Login");
        primaryStage.setScene(scene);
        primaryStage.show();


        //Parent serviceEntry = FXMLLoader.load(getClass().getResource("view/service_entry.fxml"));
        //Scene serviceEntryScene = new Scene(serviceEntry, 300, 275);
        //primaryStage.setScene(serviceEntryScene);
        //primaryStage.show();
    }


    public static void main(String args[]){
        launch(args);
    }

}
