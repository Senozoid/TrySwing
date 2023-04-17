package user;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel{

    GridBagConstraints gbc;

    public MenuPanel(){
        setOpaque(false);
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.weightx=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.ipady=8;
        gbc.insets=new Insets(1,0,1,0);
    }

    public void addButton(JButton button){
        button.setBackground(Custom.UI);
        add(button,gbc);
    }

}
