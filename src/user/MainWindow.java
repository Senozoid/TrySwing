package user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener {

    static final double MAIN_MENU_MAX_WIDTH = 0.2;
    static final int MAIN_MENU_MIN_WIDTH = 0;
    static final double GAME_MENU_MAX_WIDTH = 0.75;
    static final int GAME_MENU_MIN_WIDTH = 1;
    static final String OPEN_MAIN_MENU = ">>>";
    static final String CLOSE_MAIN_MENU = "<<<";
    static final String OPEN_GAME_MENU = CLOSE_MAIN_MENU;
    static final String CLOSE_GAME_MENU = OPEN_MAIN_MENU;

    GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    TopPanel topPanel;
    MainPanel mainPanel = new MainPanel();

    JButton mainMenuToggle;
    boolean mainMenuOn;
    JButton gameMenuToggle;
    boolean gameMenuOn;

    public MainWindow(){

        mainPanel.setDividerLocation(MAIN_MENU_MIN_WIDTH);
        mainMenuToggle = new JButton(OPEN_MAIN_MENU);
        mainMenuOn = false;

        mainPanel.gamePanel.setDividerLocation(GAME_MENU_MIN_WIDTH);
        gameMenuToggle = new JButton(OPEN_GAME_MENU);
        gameMenuOn = false;

        mainMenuToggle.addActionListener(this);
        gameMenuToggle.addActionListener(this);
        topPanel =new TopPanel(mainMenuToggle,gameMenuToggle);

        device.setFullScreenWindow(this);
        setTitle("Main Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(topPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent event){

        if(event.getSource()== mainMenuToggle) {
            if (mainMenuOn) {
                mainPanel.setDividerLocation(MAIN_MENU_MIN_WIDTH);
                mainMenuToggle.setText(OPEN_MAIN_MENU);
            } else {
                mainPanel.setDividerLocation(MAIN_MENU_MAX_WIDTH);
                mainMenuToggle.setText(CLOSE_MAIN_MENU);
            }
            //closeGameMenu();
            gameMenuToggle.doClick(); gameMenuToggle.doClick(); //supposed to reset gameMenu size, not working for some reason
            mainMenuOn = !mainMenuOn;
        }

        else if(event.getSource()== gameMenuToggle) {
            if (gameMenuOn) {
                mainPanel.gamePanel.setDividerLocation(GAME_MENU_MIN_WIDTH);
                gameMenuToggle.setText(OPEN_GAME_MENU);
            } else {
                mainPanel.gamePanel.setDividerLocation(GAME_MENU_MAX_WIDTH);
                gameMenuToggle.setText(CLOSE_GAME_MENU);
            }
            gameMenuOn = !gameMenuOn;
        }

    }

    /*
    private void closeGameMenu(){
        mainPanel.gamePanel.setDividerLocation(GAME_MENU_MIN_WIDTH);
        gameMenuToggle.setText(OPEN_GAME_MENU);
        gameMenuOn=false;
    }
    */

}