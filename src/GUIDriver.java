import controller.LoginController;
import controller.OperatorController;
import controller.ServiceEntryController;
import controller.ViewController;
import model.User;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jacob on 11/6/17.
 */
public class GUIDriver {

    private ViewController[] controls;
    private JFrame main;
    private User login;

    public GUIDriver() {

        login = new User("Operator");

        controls = new ViewController[4]; //Holds references to different controllers
        controls[0] = new LoginController(login);
        controls[1] = new OperatorController(login);
        controls[2] = new ServiceEntryController(login);

        login = null; //@TODO This is null until a user has logged in

        init();
    }

    //Deals with initializations of gui components
    private void init() {

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { e.printStackTrace(); }

        main = new JFrame();

        main.setTitle("ChocoAn Application");

        main.setSize(500,500);

        //Creates JFrame in the middle of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        main.setLocation(dim.width/2 - main.getSize().width/2, dim.height/2 - main.getSize().height/2);

        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run() {

        //Login Step
        populateView(controls[2]);
        controls[2].run();

        //We want pane visible when it has loaded login view
        main.setVisible(true);
        
    }

    //Gets view associated with Controller and fills GUI
    private void populateView(ViewController c) {
        main.setContentPane(c.getView().getPanel());
    }

}