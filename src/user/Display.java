package user;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Display extends JPanel implements Themed {

    Font customFont;
    JTextArea textArea = new JTextArea();
    OptPanel optPanel = new OptPanel();

    public Display(){
        setOpaque(false);

        try {
            customFont=Font.createFont(Font.TRUETYPE_FONT, new File("fonts/pelagiad/Pelagiad.ttf")).deriveFont(24F);
            Custom.GRAPHICS_ENV.registerFont(customFont);
            textArea.setFont(customFont);
        } catch (FontFormatException | IOException e) {
            textArea.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        }

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scroller=new JScrollPane(textArea);
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
        optPanel.addOpt("dummy1","Go through the door");
        optPanel.addOpt("dummy2","Pick up the sword");
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
    }

}
