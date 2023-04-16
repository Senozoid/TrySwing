package user;

import javax.swing.*;

public class MainPanel extends JSplitPane implements Themed{

    //Player pc;
    MenuPanel mainMenuPanel = new MenuPanel();
    GamePanel gamePanel;

    public MainPanel(
            //Player pc
            ){
        //this.pc=pc;
        gamePanel = new GamePanel(
                //pc
                );
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
            setBackground(Custom.THEMATIC_LIGHT);
        }
        else{
            setBackground(Custom.THEMATIC_DARK);
        }
        gamePanel.setTheme(light);
    }

}
