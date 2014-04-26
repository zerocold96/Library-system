import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AdminPage extends JFrame {

public static void main(String[] args) {
AdminPage frameTabel = new AdminPage();
}

JLabel welcome = new JLabel("Welcome Admin to a The Library System");
JPanel panel = new JPanel();

AdminPage(){
super("AdminPage");
setSize(900,600);
setLocation(26,70);
panel.setLayout (null);

welcome.setBounds(70,50,350,60);

panel.add(welcome);

getContentPane().add(panel);
setVisible(true);
}

}
