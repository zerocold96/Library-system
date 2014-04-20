package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Welcome extends JFrame {

public static void main(String[] args) {
Welcome frameTabel = new Welcome();
}

JLabel welcome = new JLabel("Welcome to a The Library System");
JPanel panel = new JPanel();

Welcome(){
super("Welcome");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null);

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}