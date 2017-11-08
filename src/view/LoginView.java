package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jacob on 11/6/17.
 */
public class LoginView implements View {

    private JPanel panel;
    private JTextField username;
    private JPasswordField password;
    private JButton submit;

    public LoginView() {
        init();
    }


    //Implementing panel objects
    private void init() {
        panel = new JPanel();

        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        panel.setSize(200,200);


        JLabel usernameLabel = new JLabel("Username");
        c.gridx = 0;
        c.gridy = 0;
        panel.add(usernameLabel, c);

        username = new JTextField(20);
        c.gridx = 1;
        panel.add(username, c);

        JLabel passwordLabel = new JLabel("Password");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(passwordLabel, c);

        password = new JPasswordField(20);
        c.gridx = 1;
        panel.add(password, c);

        submit = new JButton("submit");
        c.gridx = 1;
        c.gridy = 2;
        panel.add(submit, c);

    }


    public JPanel getPanel() {
        System.out.println("returning panel");
        return panel;
    }
}
