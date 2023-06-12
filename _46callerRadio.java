import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.*;

class calling extends JFrame
{
    JButton b = new JButton("Open Form");
    calling()
    {
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                new radio();
                dispose();
            }
        });

        setVisible(true);
    }
}

public class _46callerRadio {
   public static void main(String[] args) {
    new calling();
   } 
}
