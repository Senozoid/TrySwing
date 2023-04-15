package user;

import javax.swing.*;

public class GamePanel extends JSplitPane {

    JComponent display = new JPanel();
    MenuPanel gameMenuPanel = new MenuPanel();

    public GamePanel(){
        setOrientation(HORIZONTAL_SPLIT);
        setDividerSize(1);
        setResizeWeight(1);
        setOneTouchExpandable(false);
        setContinuousLayout(true);

        display.add(new JLabel("Area to display page text and option buttons"));
        gameMenuPanel.add(new JLabel("Game Menu Panel"));

        setLeftComponent(display);
        setRightComponent(gameMenuPanel);
    }

}
