import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class StudentPage extends JFrame {

public static void main(String[] args) {
StudentPage frameTabel = new StudentPage();
}

private JLabel welcome = new JLabel("Welcome Student to a The Library System");
private JPanel panel = new JPanel();



StudentPage()
{
super("StudentPage");
setSize(900,600);
setLocation(26,70);
panel.setLayout (null);

welcome.setBounds(70,50,350,60);

panel.add(welcome);

getContentPane().add(panel);
setVisible(true);
}

}
