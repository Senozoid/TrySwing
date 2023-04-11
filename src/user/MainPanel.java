package user;

import javax.swing.*;
//import java.awt.*;

public class MainPanel extends JSplitPane{

    JComponent mainMenuPanel = new JPanel();
    GamePanel gamePanel = new GamePanel();

    public MainPanel(){
        setOrientation(HORIZONTAL_SPLIT);
        setDividerSize(1);
        setResizeWeight(0);
        setOneTouchExpandable(false);
        setContinuousLayout(true);

        mainMenuPanel.add(new JLabel("Main Menu Panel"));

        setLeftComponent(mainMenuPanel);
        setRightComponent(gamePanel);
    }

}
