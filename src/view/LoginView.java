package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jacob on 11/6/17.
 */
public class LoginView implements View {

    private JPanel myPanel;
    private JTextField username;
    private JPasswordField password;
    private JButton submit;

    public LoginView() {
        init();
    }


    //Deals with implementing JPanel components;
    private void init() {
        myPanel = new JPanel();

        myPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        myPanel.setSize(200,200);


        JLabel usernameLabel = new JLabel("Username");
        c.gridx = 0;
        c.gridy = 0;
        myPanel.add(usernameLabel, c);

        username = new JTextField(20);
        c.gridx = 1;
        myPanel.add(username, c);

        JLabel passwordLabel = new JLabel("Password");
        c.gridx = 0;
        c.gridy = 1;
        myPanel.add(passwordLabel, c);

        password = new JPasswordField(20);
        c.gridx = 1;
        myPanel.add(password, c);

        submit = new JButton("submit");
        c.gridx = 1;
        c.gridy = 2;
        myPanel.add(submit, c);

    }


    public JPanel getPanel() {
        System.out.println("returning panel");
        return myPanel;
    }
}
