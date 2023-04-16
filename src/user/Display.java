package user;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements Themed {

    JScrollPane textViewer;
    JTextArea textArea;
    JPanel optionPanel;

    public Display(){
        setOpaque(false);
        textArea=new JTextArea();
        textViewer=new JScrollPane(textArea);
        optionPanel=new JPanel();
        refresh();
    }

    private void refresh() {
        //to be implemented
    }

    @Override
    public void setTheme(boolean light) {
        if(light){
            setForeground(Color.BLACK);
        }
        else{
            setForeground(Color.WHITE);
        }
    }

}
