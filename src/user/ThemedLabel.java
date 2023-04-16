package user;

import javax.swing.*;
import java.awt.*;

public class ThemedLabel extends JLabel implements Themed{

    public ThemedLabel(Icon icon){
        super(icon);
        setOpaque(false);
    }

    public ThemedLabel(String text) {
        super(text);
        setOpaque(false);
    }

    public ThemedLabel(Icon icon, String text){
        super(icon); setText(text);
        setOpaque(false);
    }

    @Override
    public void setTheme(boolean light){
        if(light){
            setForeground(Color.BLACK);
        }
        else{
            setForeground(Color.WHITE);
        }
    }

}
