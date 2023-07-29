package user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener,Themed{

    //Player pc;
    Custom cus;
    public TopPanel topPanel; //needs to be refreshed, may need to be public
    MainPanel mainPanel;
    public GamePanel gamePanel; //needs to be refreshed, may need to be public

    JButton mainMenuToggle;
    JButton gameMenuToggle;

    JButton themeToggle = new JButton("Theme");
    JButton exitButton = new JButton("Exit");

    boolean light=false;

    public MainWindow(Custom cus
            //Player pc
            ){
        //this.pc = pc;
        this.cus = cus;

        mainMenuToggle = new JButton(cus.mainMenuToggleIcon);
        gameMenuToggle = new JButton(cus.gameMenuToggleIcon);

        mainPanel = new MainPanel(cus
                //pc
                );
        gamePanel=mainPanel.gamePanel;

        addAllButtons();

        //setTitle("Main Window");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(topPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setUndecorated(true);
        cus.SCREEN.setFullScreenWindow(this);
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
                cus, mainMenuToggle, gameMenuToggle);

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
