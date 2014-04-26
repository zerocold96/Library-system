package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class LibrarianPage extends JFrame {

public static void main(String[] args) {
LibrarianPage frameTabel = new LibrarianPage();
}

JLabel welcome = new JLabel("Welcome Librarian to a The Library System");
JPanel panel = new JPanel();

LibrarianPage(){
super("LibrarianPage");
setSize(900,600);
setLocation(26,70);
panel.setLayout (null);

welcome.setBounds(70,50,350,60);

panel.add(welcome);

getContentPane().add(panel);
setVisible(true);
}

}
