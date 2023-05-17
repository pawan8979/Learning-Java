
import javax.swing.*;

public class NewWindow extends JFrame{
    JLabel label= new JLabel("Hello");
    NewWindow(){

        label.setLayout(null);
        label.setBounds(50,50,200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(350,350);
        this.setVisible(true);
        this.add(label);
    }

  public static void main(String args[]) {
        new NewWindow();
    }
}
