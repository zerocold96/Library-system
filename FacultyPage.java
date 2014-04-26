import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class FacultyPage extends JFrame {

public static void main(String[] args) {
FacultyPage frameTabel = new FacultyPage();
}

JLabel welcome = new JLabel("Welcome Faculty to a The Library System");
JPanel panel = new JPanel();

FacultyPage(){
super("FacultyPage");
setSize(900,600);
setLocation(26,70);
panel.setLayout (null);

welcome.setBounds(70,50,350,60);

panel.add(welcome);

getContentPane().add(panel);
setVisible(true);
}

}
