package user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OptPanel extends JPanel implements ActionListener{

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
        gbc.gridx=0;
        gbc.weightx=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.ipady=8;
        gbc.insets=new Insets(1,0,1,0);
        optButtonList=new ArrayList<>();
    }

    public void addOpt(String pgName, String text){
        JButton opt = new JButton(text);
        opt.setActionCommand(pgName);
        opt.addActionListener(this);

        optButtonList.add(opt);
        opt.setBackground(Color.RED);
        opt.setForeground(Color.WHITE);
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

}
