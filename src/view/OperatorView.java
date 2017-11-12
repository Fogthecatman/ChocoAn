package view;

import model.User;

import javax.swing.*;
import java.awt.*;

public class OperatorView extends View {

    private JButton records, serviceEntry, reports;

    public OperatorView(User u) {
        init(u);
    }

    //Implementing panel objects
    private void init(User u) {
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 0)); //@TODO I don't like this, but will change later

        records = new JButton("Update Records");
        serviceEntry = new JButton("Service Entry");
        reports = new JButton("Write Report");

        fillButtons(u);

        setGuiType(0);
        mainPanel.add(panel, BorderLayout.CENTER);
    }

    //Generate buttons from user permissions
    private void fillButtons(User u) {
        if(u.getPermissionLevel().equals("Operator")) { //@TODO Get updated database for permission levels

            panel.add(records);
            panel.add(reports);

        }

        panel.add(serviceEntry);
    }


}
