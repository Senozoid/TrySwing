package user;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel{

    GridBagConstraints gbc;

    public TopPanel(JComponent mainMenuToggle,
                    //JComponent quickStatsPanel,
                    JComponent gameMenuToggle
                    ){
        mainMenuToggle.setBackground(Color.ORANGE);
        gameMenuToggle.setBackground(Color.ORANGE);

        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridy=0;//starts at first row

        gbc.gridx=0;//starts at first column
        gbc.anchor=GridBagConstraints.LINE_START;//aligns to left of allotted space

        add(mainMenuToggle,gbc);//button that opens or closes main menu

        gbc.gridx=GridBagConstraints.RELATIVE;//starts at column next to previous component
        gbc.anchor=GridBagConstraints.CENTER;//aligns to center of allotted space
        gbc.weightx=1;//allots a portion of any unused space to component

        JLabel titleLabel=new JLabel("TITLE GOES HERE");
        add(titleLabel,gbc);

        gbc.anchor=GridBagConstraints.LINE_END;//aligns to right of allotted space
        gbc.weightx=0;//takes away any unused space from component
        gbc.gridwidth=GridBagConstraints.RELATIVE;//ends at column before final component

        JComponent quickStatsPanel=new JLabel("money xxx arcana yyy health zzz");
        add(quickStatsPanel,gbc);

        add(gameMenuToggle,gbc);

    }

}
