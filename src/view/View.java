package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jacob on 11/6/17.
 */
public class View {

    //GUI_TYPE 0 for login and button selection screen
    //GUI_TYPE 1 for screens needing back button, or top bar
    protected int GUI_TYPE = 0;

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
    }

    public void setGuiType(int guiType) { GUI_TYPE = guiType; }

    public JPanel getPanel() {

        if(GUI_TYPE != 0) {
            mainPanel.add(topBarPanel, BorderLayout.NORTH);
        }
        else {
            mainPanel.remove(topBarPanel);
        }

        return mainPanel;
    }
}
