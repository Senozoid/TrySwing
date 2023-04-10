package user;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel{

    GridBagConstraints gbc;

    public TopPanel(JComponent mainMenuToggle,
                    //JComponent quickStatsPanel,
                    JComponent gameMenuToggle
                    ){
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.weightx=1;

        //gbc.gridx=0;
        gbc.anchor=GridBagConstraints.NORTHWEST;
        //gbc.anchor=GridBagConstraints.LINE_START;
        add(mainMenuToggle,gbc);
        gbc.anchor=GridBagConstraints.CENTER;

        JLabel titleLabel=new JLabel("TITLE GOES HERE");
        //gbc.gridx=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        add(titleLabel,gbc);
        gbc.fill=GridBagConstraints.NONE;

        /*
        //gbc.gridx=2;
        gbc.gridwidth=GridBagConstraints.RELATIVE;
        add(quickStatsPanel,gbc);
        */

        //gbc.gridx=3;
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        gbc.anchor=GridBagConstraints.NORTHEAST;
        add(gameMenuToggle,gbc);

    }

}
