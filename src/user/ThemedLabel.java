package user;

import javax.swing.*;

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
            setForeground(Custom.THEMATIC_DARK);
        }
        else{
            setForeground(Custom.THEMATIC_LIGHT);
        }
    }

}
