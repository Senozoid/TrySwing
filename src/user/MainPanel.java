package user;

import javax.swing.*;

public class MainPanel extends JSplitPane implements Themed{

    //Player pc;
    Custom cus;
    MenuPanel mainMenuPanel;
    GamePanel gamePanel;

    public MainPanel(Custom cus
            //Player pc
            ){
        //this.pc=pc;
        this.cus=cus;
        mainMenuPanel = new MenuPanel(cus);
        gamePanel = new GamePanel(cus
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
            setBackground(cus.THEMATIC_LIGHT);
        }
        else{
            setBackground(cus.THEMATIC_DARK);
        }
        gamePanel.setTheme(light);
    }

}
