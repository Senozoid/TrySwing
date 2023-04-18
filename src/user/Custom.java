package user;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Custom {
    public final GraphicsEnvironment GRAPHICS_ENV = GraphicsEnvironment.getLocalGraphicsEnvironment();
    public final GraphicsDevice SCREEN = GRAPHICS_ENV.getDefaultScreenDevice();
    public final File CURR_PAGE = new File("curr/currPage");
    public final Icon mainMenuToggleIcon = new ImageIcon("files/uires/m.png");
    public final Icon gameMenuToggleIcon = new ImageIcon("files/uires/g.png");
    public final Color UI = new Color(255,179,0);
    public final Color THEMATIC_DARK = Color.BLACK;
    public final Color THEMATIC_LIGHT = new Color(220,220,220);

    //public Player pc;
    private Font CUSTOM_FONT;
    private boolean FONT_IS_CORRECT = false;

    public Custom(//Player pc
            ){
        //this.pc = pc

        try {
            CUSTOM_FONT = Font.createFont(Font.TRUETYPE_FONT, new File("files/fonts/pelagiad/Pelagiad.ttf")).deriveFont(24F);
            GRAPHICS_ENV.registerFont(CUSTOM_FONT);
            FONT_IS_CORRECT = true;

        } catch (FontFormatException | IOException e) {
            CUSTOM_FONT = new Font(Font.SANS_SERIF,Font.PLAIN,20);
        }

    }

    public Font getTextFont(){
        return CUSTOM_FONT;
    }

    public Font getUIFont(){
        Font uiFont;
        if(FONT_IS_CORRECT) uiFont=CUSTOM_FONT.deriveFont(18F);
        else uiFont=CUSTOM_FONT.deriveFont(Font.BOLD,14);
        return uiFont;
    }

}
