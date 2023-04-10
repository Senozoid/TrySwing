package user;

import user.MainPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener {

    static final double MAX_WIDTH = 0.1;
    static final double MIN_WIDTH = 0;
    static final String OPEN_MAIN_MENU = ">>>";
    static final String CLOSE_MAIN_MENU = "<<<";

    GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    JPanel bar = new JPanel();
    MainPanel mainPanel = new MainPanel();
    JButton mainMenuToggle;
    boolean mainMenuOn;

    public MainWindow(){
        mainPanel.setDividerLocation(MIN_WIDTH);
        mainMenuToggle = new JButton(OPEN_MAIN_MENU);
        mainMenuOn = false;

        mainMenuToggle.addActionListener(this);
        bar.setLayout(new FlowLayout(FlowLayout.LEFT));//learn all layouts
        bar.add(mainMenuToggle);

        device.setFullScreenWindow(this);
        setTitle("Main Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(bar, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource()== mainMenuToggle) {
            if (mainMenuOn) {
                mainPanel.setDividerLocation(MIN_WIDTH);
                mainMenuToggle.setText(OPEN_MAIN_MENU);
            } else {
                mainPanel.setDividerLocation(MAX_WIDTH);
                mainMenuToggle.setText(CLOSE_MAIN_MENU);
            }
            mainMenuOn = !mainMenuOn;
        }
    }

}