import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainWindow extends JFrame implements ActionListener {

    static final double MAX_WIDTH = 0.1;
    static final double MIN_WIDTH = 0;

    static JPanel bar = new JPanel();
    static MainPanel mainPanel = new MainPanel();

    static JButton mainMenuToggle = new JButton(">>");
    static boolean mainMenuOn = false;

    public MainWindow(){

        mainPanel.setDividerLocation(MIN_WIDTH);
        mainMenuToggle.addActionListener(this);
        bar.setLayout(new FlowLayout(FlowLayout.LEFT));//learn all layouts
        bar.add(mainMenuToggle);

        setTitle("Main Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(bar, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        setSize(getMaximumSize());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource()== mainMenuToggle) {
            if (mainMenuOn) {
                mainPanel.setDividerLocation(MIN_WIDTH);
                mainMenuToggle.setText(">>");
            } else {
                mainPanel.setDividerLocation(MAX_WIDTH);
                mainMenuToggle.setText("<<");
            }
            mainMenuOn = !mainMenuOn;
        }
    }

}