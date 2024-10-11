import javax.swing.*;
import java.awt.event.*;

public class KeyMouseEventDemo 
{
    public static void main(String[] args) 
    {
        JFrame window = new JFrame("Key and Mouse Event Example");
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        JLabel keyStatusLabel = new JLabel("Key Pressed: ");
        JLabel mouseStatusLabel = new JLabel("Mouse Event: ");

        window.add(mainPanel);
        mainPanel.add(keyStatusLabel);
        mainPanel.add(mouseStatusLabel);

        window.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e)
            {
                keyStatusLabel.setText("Key Pressed: " + e.getKeyChar());
            }
        });

        window.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e) 
            {
                mouseStatusLabel.setText("Mouse Event: Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        window.setFocusable(true);
        window.requestFocusInWindow();
        window.setVisible(true);
    }
}
