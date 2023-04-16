package user;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel implements Themed{

    GridBagConstraints gbc;

    ThemedLabel titleLabel;
    HGrid quickStatsBar;

    public TopPanel(JComponent mainMenuToggle,
                    //JComponent quickStatsBar,
                    JComponent gameMenuToggle
                    ){
        mainMenuToggle.setBackground(Custom.UI);
        gameMenuToggle.setBackground(Custom.UI);

        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridy=0;//starts at first row

        gbc.gridx=0;//starts at first column
        gbc.anchor=GridBagConstraints.LINE_START;//aligns to left of allotted space

        add(mainMenuToggle,gbc);//button that opens or closes main menu

        gbc.gridx=GridBagConstraints.RELATIVE;//starts at column next to previous component
        gbc.anchor=GridBagConstraints.CENTER;//aligns to center of allotted space
        gbc.weightx=1;//allots a portion of any unused space to component

        titleLabel=new ThemedLabel("TITLE GOES HERE");
        add(titleLabel,gbc);

        gbc.anchor=GridBagConstraints.LINE_END;//aligns to right of allotted space
        gbc.weightx=0;//takes away any unused space from component
        gbc.gridwidth=GridBagConstraints.RELATIVE;//ends at column before final component

        quickStatsBar=new HGrid();
        quickStatsBar.add(new ThemedLabel("money xxx"));
        quickStatsBar.add(new ThemedLabel("arcana yyy"));
        quickStatsBar.add(new ThemedLabel("health zzz"));
        add(quickStatsBar,gbc);

        add(gameMenuToggle,gbc);

    }

    @Override
    public void setTheme(boolean light){
        if(light){
            setBackground(Custom.THEMATIC_LIGHT);
        }
        else{
            setBackground(Custom.THEMATIC_DARK);
        }
        titleLabel.setTheme(light);
        quickStatsBar.setTheme(light);
    }

}
