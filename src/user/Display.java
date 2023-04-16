package user;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Display extends JPanel implements Themed {

    JTextArea textArea = new JTextArea(20,120);
    OptPanel optPanel = new OptPanel();

    public Display(){
        setOpaque(false);

        textArea.setFont(new Font("Consolas",Font.PLAIN,19));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scroller=new JScrollPane(textArea);
        scroller.setOpaque(false);

        add(scroller, BorderLayout.CENTER);
        add(optPanel, BorderLayout.SOUTH);

        refresh();
    }

    public void refresh(){
        refreshText();
        refreshOptions();
    }

    private void refreshText(){
        Scanner textDisplay = null;
        try {
            textDisplay = new Scanner(Custom.currPage);
            textArea.setText(null);
            while(textDisplay.hasNextLine()) textArea.append(textDisplay.nextLine()+"\n");
        } catch (FileNotFoundException e) {
            textArea.setText("File Not Found: "+Custom.currPage);
        }
    }

    private void refreshOptions(){
        //to be changed after testing
        optPanel.clear();
        optPanel.addOpt("intro","Go to intro page");
    }

    @Override
    public void setTheme(boolean light) {
        if(light){
            textArea.setBackground(Custom.THEMATIC_LIGHT);
            textArea.setForeground(Custom.THEMATIC_DARK);
        }
        else{
            textArea.setBackground(Custom.THEMATIC_DARK);
            textArea.setForeground(Custom.THEMATIC_LIGHT);
        }
        optPanel.setTheme(light);
    }

}
