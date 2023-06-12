import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.*;

class radio extends JFrame implements ActionListener{
    JTextField t1 = new JTextField(10);
    JRadioButton r1 = new JRadioButton("Male");
    JRadioButton r2 = new JRadioButton("Female");
    JButton b = new JButton("Submit");
    JCheckBox c1 = new JCheckBox("Dancer");
    JCheckBox c2 = new JCheckBox("Singer");
    JLabel l = new JLabel("Greeting");
    ButtonGroup bg = new ButtonGroup();
    radio()
    {
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        bg.add(r1);
        bg.add(r2);
        add(t1);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(b);
        add(l);
        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e)
            {
                System.out.println("Checkbox checked");
            }
        });
        b.addActionListener(this);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae)
     {
        String name = t1.getText();
        if(r1.isSelected()){
            name="Mr." + name;
        }
        else
        {
            name="Ms." + name;
        }
        if(c1.isSelected())
        {
            name = name + " Dancer";
        }
        if(c2.isSelected())
        {
            name = name + " Singer";
        }

        l.setText(name);
     }
}

public class _45radioButton {
    public static void main(String[] args) {
        new radio();
    }
}
