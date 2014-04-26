package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Welcome extends JFrame {

public static void main(String[] args) {
Welcome frameTabel = new Welcome();
}

JLabel welcome = new JLabel("Welcome to a The Library System");
JPanel panel = new JPanel();

Welcome(){
super("Welcome");
setSize(900,600);
setLocation(26,70);
panel.setLayout (null);

welcome.setBounds(70,50,350,60);

panel.add(welcome);

getContentPane().add(panel);
setVisible(true);
}

}
