package user;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JSplitPane implements Themed{

    MenuPanel mainMenuPanel = new MenuPanel();
    GamePanel gamePanel = new GamePanel();

    public MainPanel(){
        setOrientation(HORIZONTAL_SPLIT);
        setDividerSize(0);
        setResizeWeight(0);
        setOneTouchExpandable(false);
        setContinuousLayout(true);

        setLeftComponent(mainMenuPanel);
        setRightComponent(gamePanel);
    }

    @Override
    public void setTheme(boolean light){
        if(light){
            setBackground(Color.WHITE);
        }
        else{
            setBackground(Color.BLACK);
        }
        gamePanel.setTheme(light);
    }

}
