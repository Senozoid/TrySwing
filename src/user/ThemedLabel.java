package user;

import javax.swing.*;

public class ThemedLabel extends JLabel implements Themed{

    Custom cus;

    public ThemedLabel(Custom cus,String text) {
        super(text);
        mandate(cus);
    }

    public ThemedLabel(Custom cus, Icon icon, String text){
        super(icon); setText(text);
        mandate(cus);
    }

    private void mandate(Custom cus){
        this.cus=cus;
        setFont(cus.getUIFont());
        setOpaque(false);
    }

    @Override
    public void setTheme(boolean light){
        if(light){
            setForeground(cus.THEMATIC_DARK);
        }
        else{
            setForeground(cus.THEMATIC_LIGHT);
        }
    }

}
