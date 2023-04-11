package user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener {

    GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    TopPanel topPanel;
    MainPanel mainPanel = new MainPanel();
    GamePanel gamePanel = mainPanel.gamePanel;

    JButton mainMenuToggle = new JButton("Main Menu");
    JButton gameMenuToggle = new JButton("Game Menu");

    public MainWindow(){

        mainMenuToggle.addActionListener(this);
        gameMenuToggle.addActionListener(this);
        topPanel =new TopPanel(mainMenuToggle,gameMenuToggle);

        setTitle("Main Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(topPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        this.setUndecorated(true);
        device.setFullScreenWindow(this);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent event){

        if(event.getSource()== mainMenuToggle) {
            if (isMainMenuOn()) {
                mainPanel.setDividerLocation(getMainMenuMin());
            } else {
                mainPanel.setDividerLocation(getMainMenuMax());
            }
        }

        else if(event.getSource()== gameMenuToggle) {
            if (isGameMenuOn()) {
                gamePanel.setDividerLocation(getGameMenuMin());
            } else {
                gamePanel.setDividerLocation(getGameMenuMax());
            }
        }

    }

    private int getMainMenuMax(){
        return mainPanel.getMinimumDividerLocation();
    }

    private double getMainMenuMin(){
        return 0;
    }

    private boolean isMainMenuOn(){
        return mainPanel.getDividerLocation() >= getMainMenuMax();
    }

    private int getGameMenuMax(){
        return gamePanel.getMaximumDividerLocation();
    }

    private double getGameMenuMin(){
        return 1;
    }

    private boolean isGameMenuOn(){
        return gamePanel.getDividerLocation() <= getGameMenuMax();
    }

}