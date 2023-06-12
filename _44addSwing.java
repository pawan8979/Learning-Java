import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class AddSub extends JFrame implements ActionListener{
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JButton b1 = new JButton("Add");
        JButton b2 = new JButton("Substract");
        JLabel l = new JLabel("Result");
        AddSub() {
        setLayout(new FlowLayout()); // Specify the alignment if needed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int result;
        if(ae.getSource() == b1)
        {
            result = num1 + num2;
        }
        else
            result = num1 - num2;
        l.setText(result + "");
    }
}
public class _44addSwing {
    public static void main(String[] args) {
        new AddSub();
    }
}
