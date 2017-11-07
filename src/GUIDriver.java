import controller.Controller;
import controller.LoginController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jacob on 11/6/17.
 */
public class GUIDriver extends JFrame {

    private JFrame main;

    private Controller[] controls;

    public GUIDriver() {

        controls = new Controller[4]; //Holds references to different controllers
        controls[0] = new LoginController();

        init();
    }

    //Deals with initializations of gui components
    private void init() {
        this.setTitle("ChocoAn Application");

        this.setSize(500,500);

        //Creates JFrame in the middle of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run() {

        //Login Step
        populateGui(controls[0]);
        controls[0].run();

        //We want pane visible when it has loaded login view
        this.setVisible(true);

    }

    //Gets view associated with Controller and fills GUI
    private void populateGui(Controller c) {
        this.setContentPane(c.getView().getPanel());

    }

}
