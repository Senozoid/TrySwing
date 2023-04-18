package user;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Display extends JPanel implements Themed{

    Custom cus;
    Font customFont;
    JTextArea textArea = new JTextArea();
    OptPanel optPanel;

    public Display(Custom cus){
        this.cus = cus;
        setOpaque(false);

        optPanel = new OptPanel(cus);

        textArea.setFont(cus.getTextFont());
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);

        JScrollPane scroller=new JScrollPane(textArea);
        scroller.getViewport().setOpaque(false);
        scroller.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.fill=GridBagConstraints.BOTH;

        setLayout(new GridBagLayout());
        add(scroller,gbc);
        gbc.weighty=0;
        add(optPanel,gbc);

        refresh();
    }

    public void refresh(){
        refreshText();
        refreshOptions();
    }

    private void refreshText(){
        Scanner textDisplay = null;
        try {
            textDisplay = new Scanner(cus.CURR_PAGE);
            textArea.setText(null);
            while(textDisplay.hasNextLine()) textArea.append(textDisplay.nextLine()+"\n");
        } catch (FileNotFoundException e) {
            textArea.setText("File Not Found: "+cus.CURR_PAGE);
        }
    }

    private void refreshOptions(){
        //to be changed after testing
        optPanel.clear();
        optPanel.addOpt("dummy1","Attempt to pick up the sword");
        optPanel.addOpt("dummy2","Go around the sword and open the door");
    }

    @Override
    public void setTheme(boolean light) {
        if(light){
            textArea.setForeground(cus.THEMATIC_DARK);
        }
        else{
            textArea.setForeground(cus.THEMATIC_LIGHT);
        }
    }

}
