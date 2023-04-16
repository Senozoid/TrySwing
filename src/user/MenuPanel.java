package user;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MenuPanel extends JPanel{

    GridBagConstraints gbc;

    public MenuPanel(){
        setOpaque(false);
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.weighty=0;
        gbc.ipady=5;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=GridBagConstraints.RELATIVE;
    }

    public void addButton(JButton button){
        button.setBackground(Color.ORANGE);
        add(button,gbc);
    }

}
