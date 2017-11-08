package view;

import javax.swing.*;

public class ServiceEntryView implements View {

    private JPanel panel;

    public ServiceEntryView() {
        init();
    }

    //Implementing panel objects
    private void init() {
        panel = new JPanel();
    }

    public JPanel getPanel() {
        return panel;
    }

}
