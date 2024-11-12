package src;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutFrame extends JFrame {
    public BorderLayoutFrame() {
        super("Demo LayoutFrame");
        
        BorderLayout layout = new BorderLayout(5, 5);
        setLayout(layout);
        add(new JButton("Norte"), BorderLayout.NORTH);
        add(new JButton("Sul"), BorderLayout.SOUTH);
        add(new JButton("Leste"), BorderLayout.EAST);
        add(new JButton("Oeste"), BorderLayout.WEST);
        add(new JButton("Centro"), BorderLayout.CENTER);
        setSize(400, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
    BorderLayoutFrame frame = new BorderLayoutFrame();
    }
}
