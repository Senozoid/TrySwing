package user;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel implements Themed{

    Custom cus;
    GridBagConstraints gbc;

    JLabel titleLabel = new JLabel("Zenerian Chronicles: Shadow of Doom");
    HGrid quickStatsBar;

    public TopPanel(Custom cus, JButton mainMenuToggle, JButton gameMenuToggle){
        this.cus=cus;
        mainMenuToggle.setContentAreaFilled(false);
        mainMenuToggle.setBorderPainted(false);
        gameMenuToggle.setContentAreaFilled(false);
        gameMenuToggle.setBorderPainted(false);

        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridy=0;//starts at first row

        gbc.anchor=GridBagConstraints.LINE_START;//aligns to left of allotted space
        add(mainMenuToggle,gbc);//button that opens or closes main menu

        gbc.anchor=GridBagConstraints.CENTER;//aligns to center of allotted space
        gbc.weightx=1;//allots a portion of any unused space to component
        titleLabel.setOpaque(false);
        titleLabel.setForeground(Color.RED);
        titleLabel.setFont(cus.getUIFont());
        add(titleLabel,gbc);

        gbc.anchor=GridBagConstraints.LINE_END;//aligns to right of allotted space
        gbc.weightx=0;//takes away any unused space from component
        gbc.gridwidth=GridBagConstraints.RELATIVE;//ends at column before final component

        quickStatsBar=new HGrid();
        quickStatsBar.add(new ThemedLabel(cus,"money xxx"));
        quickStatsBar.add(new ThemedLabel(cus,"arcana yyy"));
        quickStatsBar.add(new ThemedLabel(cus,"health zzz"));
        add(quickStatsBar,gbc);

        add(gameMenuToggle,gbc);

    }

    @Override
    public void setTheme(boolean light){
        if(light){
            setBackground(cus.THEMATIC_LIGHT);
        }
        else{
            setBackground(cus.THEMATIC_DARK);
        }
        quickStatsBar.setTheme(light);
    }

}
