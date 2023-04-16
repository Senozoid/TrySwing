package user;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HGrid extends JPanel implements Themed{

    ArrayList<ThemedLabel> labelList;
    GridBagConstraints gbc;

    public HGrid(){
        setOpaque(false);
        labelList = new ArrayList<>();
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.weightx=0;
        gbc.ipadx=5;
        gbc.gridy=0;
        gbc.gridx=GridBagConstraints.RELATIVE;
    }

    public void add(ThemedLabel label){
        super.add(label,gbc);
        labelList.add(label);
    }

    @Override
    public void setTheme(boolean light){
        for (ThemedLabel label : labelList) {
            label.setTheme(light);
        }
    }
}
