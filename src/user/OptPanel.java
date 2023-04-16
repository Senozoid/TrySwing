package user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OptPanel extends JPanel implements ActionListener,Themed{

    //Player pc;
    boolean light = false;
    GridBagConstraints gbc;
    ArrayList<JButton> optButtonList;

    public OptPanel(
            //Player pc
            ){
        //this.pc = pc;
        setOpaque(false);
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.weighty=0;
        gbc.ipady=5;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=GridBagConstraints.RELATIVE;
        optButtonList=new ArrayList<>();
    }

    public void addOpt(String pgName, String text){
        JButton opt = new JButton(text);
        opt.setActionCommand(pgName);
        opt.addActionListener(this);

        optButtonList.add(opt);
        setTheme(light);
        add(opt,gbc);
    }

    public void clear(){
        removeAll();
        revalidate();
        repaint();
        optButtonList=new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        //pc.setChoice(event.getActionCommand());
        clear();
    }

    @Override
    public void setTheme(boolean light) {
        if (light) {
            for (JButton button : optButtonList) {
                button.setBackground(Custom.THEMATIC_LIGHT);
                button.setForeground(Custom.THEMATIC_DARK);
            }
        } else {
            for (JButton button : optButtonList) {
                button.setBackground(Custom.THEMATIC_DARK);
                button.setForeground(Custom.THEMATIC_LIGHT);
            }
        }
        this.light=light;
    }

}
