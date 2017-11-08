package view;

import javax.swing.*;

public class OperatorView implements View {

    private JPanel panel;

    public OperatorView() {
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
