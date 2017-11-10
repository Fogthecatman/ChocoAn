package view;

import javafx.scene.control.DatePicker;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ServiceEntryView extends View {

    private JButton serviceCodesBtn, submit;

    private JTextArea commentField;

    private JTextField dateOfService;

    private JLabel dateLabel, commentLabel;

    public ServiceEntryView() {
        super();
        init();
    }

    //Implementing panel objects
    private void init() {
        panel = new JPanel();

        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();


        /*serviceCodesBtn = new JButton("Service Codes");
        c.gridx = 0;
        c.gridy = 0;
        panel.add(serviceCodesBtn, c); */

        commentLabel = new JLabel("Add a Comment (Optional)");
        c.gridx = 0;
        c.gridy = 2;
        panel.add(commentLabel);


        commentField = new JTextArea(20, 20);
        commentField.setLineWrap(true);
        commentField.setWrapStyleWord(true);
        commentField.setMargin(new Insets(5, 5, 5, 5));
        JScrollPane scroll = new JScrollPane(commentField);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(scroll, c);

        dateOfService = new JTextField("Date of Service", 20);
        c.gridx = 0;
        c.gridy = 3;
        panel.add(dateOfService, c);

        submit = new JButton("Submit");
        c.gridx = 1;
        c.gridy = 4;
        panel.add(submit, c);

        mainPanel.add(panel, BorderLayout.CENTER);
    }

}
