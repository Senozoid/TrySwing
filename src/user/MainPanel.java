package user;

import javax.swing.*;
//import java.awt.*;

public class MainPanel extends JSplitPane{

    static JComponent mainMenuPanel = new JPanel();
    static JComponent gamePanel = new JPanel();

    public MainPanel(){
        setOrientation(HORIZONTAL_SPLIT);
        setDividerSize(1);
        setResizeWeight(1);
        setOneTouchExpandable(false);
        setContinuousLayout(true);

        mainMenuPanel.add(new JLabel("Menu Panel"));
        gamePanel.add(new JLabel("Game Panel"));

        setLeftComponent(mainMenuPanel);
        setRightComponent(gamePanel);
    }

}
