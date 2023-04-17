package user;

import java.awt.*;
import java.io.File;

public class Custom {
    public static final GraphicsEnvironment GRAPHICS_ENV = GraphicsEnvironment.getLocalGraphicsEnvironment();
    public static final GraphicsDevice SCREEN = GRAPHICS_ENV.getDefaultScreenDevice();
    public static final File currPage = new File("README.md");
    public static final Color UI = Color.GREEN;
    public static final Color THEMATIC_DARK = Color.BLACK;
    public static final Color THEMATIC_LIGHT = new Color(220,220,220);
}
