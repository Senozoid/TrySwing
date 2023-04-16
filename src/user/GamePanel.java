package user;

import javax.swing.*;

public class GamePanel extends JSplitPane implements Themed{

    JComponent display = new JPanel();
    MenuPanel gameMenuPanel = new MenuPanel();

    public GamePanel(){
        setOpaque(false);
        setOrientation(HORIZONTAL_SPLIT);
        setDividerSize(1);
        setResizeWeight(1);
        setOneTouchExpandable(false);
        setContinuousLayout(true);

        display.add(new JLabel("Area to display page text and option buttons"));

        setLeftComponent(display);
        setRightComponent(gameMenuPanel);
    }


    @Override
    public void setTheme(boolean light) {
        //to be implemented soon
    }
}
