package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class StudentPage extends JPanel
{
private String userID;
private String userPass;


//Student Entity Classes
Student studentStudent = new Student(userID,userPass);
Book bookStudent = new Book();
Cd cdStudent = new Cd();
Movie movieStudent = new Movie();

private ImageIcon studentImage = new ImageIcon(getClass().getResource("studentProfileimage.jpg"));

//Student Profile Display
private JLabel studentNameLabel = new JLabel(studentStudent.getFirstName());

private JLabel welcome = new JLabel("Welcome " +(studentNameLabel)+" to a The Library System");
private JPanel studentPagePanel = new JPanel(new BorderLayout());
private JPanel studentMenuBar = new JPanel(new GridLayout(1,6));
private JPanel imagePanel = new JPanel();

//Student Menu Bar Buttons
private JButton payFinesButton = new JButton("PAY FINES");
private JButton searchHistory = new JButton("SEARCH HISTORY");
private JButton savedSearches = new JButton("SAVED SEARCHES");
private JButton booksOnLoan = new JButton("BOOKS ON LOAN");
private JButton studentPageImage = new JButton(studentImage);



StudentPage()
{
studentMenuBar.add(payFinesButton);
studentMenuBar.add(searchHistory);
studentMenuBar.add(savedSearches);
studentMenuBar.add(booksOnLoan);

imagePanel.add(studentPageImage);


studentPagePanel.add(welcome,BorderLayout.NORTH);
studentPagePanel.add(studentMenuBar,BorderLayout.CENTER);


this.setLayout(new BorderLayout());
this.add(studentPagePanel,BorderLayout.NORTH);
this.add(imagePanel,BorderLayout.SOUTH);


}

}
