package user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener,Themed{

    //Player pc;
    GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    TopPanel topPanel;
    MainPanel mainPanel;
    GamePanel gamePanel;

    JButton mainMenuToggle = new JButton("Main Menu");
    JButton gameMenuToggle = new JButton("Game Menu");
    JButton themeToggle = new JButton("Theme");
    JButton exitButton = new JButton("Exit");

    boolean light=false;

    public MainWindow(
            //Player pc
            ){
        //this.pc = pc;
        mainPanel = new MainPanel(
                //pc
                );
        gamePanel=mainPanel.gamePanel;

        addAllButtons();

        //setTitle("Main Window");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(topPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setUndecorated(true);
        device.setFullScreenWindow(this);
        setVisible(true);

        setTheme(light);
    }

    @Override
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

        else if(event.getActionCommand().equalsIgnoreCase("Theme")){
            setTheme(!light);
        }

        else if(event.getActionCommand().equalsIgnoreCase("Exit")){
            System.exit(0);
        }

    }

    private void addAllButtons(){
        MenuPanel mainMenu = mainPanel.mainMenuPanel;
        MenuPanel gameMenu = gamePanel.gameMenuPanel;

        //topPanel
        mainMenuToggle.addActionListener(this);
        gameMenuToggle.addActionListener(this);
        topPanel =new TopPanel(//pc,
                mainMenuToggle, gameMenuToggle);

        //mainMenu
        themeToggle.addActionListener(this);
        mainMenu.addButton(themeToggle);
        exitButton.addActionListener(this);
        mainMenu.addButton(exitButton);
        mainMenu.addButton(new JButton("DummyABC"));

        //gameMenu
        gameMenu.addButton(new JButton("DummyXYZ"));
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

    @Override
    public void setTheme(boolean light){
        this.light=light;
        topPanel.setTheme(light);
        mainPanel.setTheme(light);
    }

}
