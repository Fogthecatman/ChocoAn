package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jacob on 11/6/17.
 */
public class View {

    protected JPanel mainPanel;
    private JPanel topBarPanel;

    private JButton backBtn;

    protected JPanel panel;

    public View() {
        init();
    }

    private void init() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        topBarPanel = new JPanel();
        topBarPanel.setLayout(new GridLayout(0, 3));

        backBtn = new JButton("<--- Back");
        topBarPanel.add(backBtn);

        mainPanel.add(topBarPanel, BorderLayout.NORTH);

    }

    public JPanel getPanel() {
        return mainPanel;
    }
}
