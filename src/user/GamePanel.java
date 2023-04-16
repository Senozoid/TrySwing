package user;

import javax.swing.*;

public class GamePanel extends JSplitPane implements Themed{

    //Player pc;
    Display display;
    MenuPanel gameMenuPanel = new MenuPanel();

    public GamePanel(
            //Player pc
            ){
        //this.pc=pc;
        display = new Display(
                //pc
                );
        setOpaque(false);
        setOrientation(HORIZONTAL_SPLIT);
        setDividerSize(1);
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
