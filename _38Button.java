import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class _38Button extends JFrame implements ActionListener{
    //JPanel= a GUI component that functions as a container to hold other components
    JButton button= new JButton();
    JLabel label= new JLabel();
    _38Button(){
        
        ImageIcon icon= new ImageIcon("emoji.png");
        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        button.setText("Click me "); //set button name
        button.setFocusable(false); //remove focus borderline around the button
        button.setForeground(Color.CYAN); //set button name color
        button.setBackground(Color.BLACK);//set Background color
        button.setBorder(BorderFactory.createEtchedBorder()); //sets border
        // button.setEnabled(false); //disable button
        

        this.setTitle("BUtton"); //set frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setLayout(null);
        this.setSize(750, 750); //sets the x-dimension, and y-dimension of frame
        
        this.setVisible(true); //make frame visible

        this.add(button);
        this.add(label);
    } 

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button){
            label.setVisible(true);
           
        }
    }


public static void main(String arg[]) {
    new _38Button();
}


}


