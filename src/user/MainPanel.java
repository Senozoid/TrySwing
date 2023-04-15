package user;

import javax.swing.*;

public class MainPanel extends JSplitPane{

    MenuPanel mainMenuPanel = new MenuPanel();
    GamePanel gamePanel = new GamePanel();

    public MainPanel(){
        setOrientation(HORIZONTAL_SPLIT);
        setDividerSize(0);
        setResizeWeight(0);
        setOneTouchExpandable(false);
        setContinuousLayout(true);

        //mainMenuPanel.add(new JLabel("Main Menu Panel"));

        setLeftComponent(mainMenuPanel);
        setRightComponent(gamePanel);
    }

}
