package user;

import javax.swing.*;

public class GamePanel extends JSplitPane implements Themed{

    //Player pc;
    Custom cus;
    Display display;
    MenuPanel gameMenuPanel;

    public GamePanel(Custom cus
            //Player pc
            ){
        //this.pc=pc;
        this.cus=cus;
        display = new Display(cus
                //pc
                );
        gameMenuPanel = new MenuPanel(cus);
        setOpaque(false);
        setOrientation(HORIZONTAL_SPLIT);
        setDividerSize(0);
        setResizeWeight(1);
        setOneTouchExpandable(false);
        setContinuousLayout(true);

        setLeftComponent(display);
        setRightComponent(gameMenuPanel);
    }


    @Override
    public void setTheme(boolean light) {
        display.setTheme(light);
    }
}
