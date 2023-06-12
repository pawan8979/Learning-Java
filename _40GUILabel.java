import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
public class _40GUILabel extends JFrame{
    //JLabel= a GUI display area for a string of text, an image, or both
    _40GUILabel(){
        ImageIcon image= new ImageIcon("javaimg.jpg");
        Border border= BorderFactory.createLineBorder(Color.green, 3);//create a border

        JLabel label= new JLabel(); //create a label  
        label.setText("Do you code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of imageicon
        // label.setForeground(Color.green);
        label.setForeground(new Color(110, 80, 100));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(-25); //set gap between text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true);//display background color
        label.setBorder(border); //sets the border
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
        // label.setBounds(100, 100, 250, 250); //left, top, width, height 

        this.setTitle("LABEL"); //set frame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
       
        // this.setSize(420, 420); //sets the x-dimension, and y-dimension of frame
        // this.setLayout(null);
        this.setVisible(true); //make frame visible
        add(label);
        this.pack(); //frame size according to the size of the component. Add pack after adding all components
    } 


public static void main(String arg[]) {
    new _40GUILabel();
}
}


