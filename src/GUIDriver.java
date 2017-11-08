import controller.Controller;
import controller.LoginController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jacob on 11/6/17.
 */
public class GUIDriver {

    private Controller[] controls;
    private JFrame main;

    public GUIDriver() {

        controls = new Controller[4]; //Holds references to different controllers
        controls[0] = new LoginController();

        init();
    }

    //Deals with initializations of gui components
    private void init() {

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
        populateView(controls[0]);
        controls[0].run();

        //We want pane visible when it has loaded login view
        main.setVisible(true);

    }

    //Gets view associated with Controller and fills GUI
    private void populateView(Controller c) {
        main.setContentPane(c.getView().getPanel());

    }

}
