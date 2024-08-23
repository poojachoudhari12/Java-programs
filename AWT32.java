import java.awt.*;
import java.awt.event.*;

public class AWT32 extends Frame implements KeyListener {
    TextArea ta;
    Label l1;

    AWT32() {
        super("KeyListener");
        ta = new TextArea();
        l1 = new Label("Message");
        
        // Add key listener to the TextArea
        ta.addKeyListener(this); 
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        setLayout(null);
        l1.setBounds(80, 50, 100, 20);
        ta.setBounds(80, 70, 100, 100); // Adjust the bounds of the TextArea
        
        add(l1);
        add(ta);
        
        setSize(400, 400);
        setVisible(true);
        
        ta.requestFocus(); // Request focus for the TextArea
    }

    public void keyPressed(KeyEvent e) {
        l1.setText("KeyPressed");
    }

    public void keyReleased(KeyEvent e) {
        l1.setText("KeyReleased");
    }

    public void keyTyped(KeyEvent e) {
        l1.setText("KeyTyped");
    }

    public static void main(String[] args) {
        AWT32 a = new AWT32();
    }
}
