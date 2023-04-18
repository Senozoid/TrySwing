package user;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel{

    Custom cus;
    GridBagConstraints gbc;

    public MenuPanel(Custom cus){
        this.cus = cus;
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
        button.setBackground(cus.UI);
        button.setFont(cus.getUIFont());
        add(button,gbc);
    }

}
