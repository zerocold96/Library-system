package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class FacultyPage extends JPanel
{
private String userID;
private String userPass;

//Faculty Entity Classes
Faculty facultyFaculty = new Faculty(userID,userPass);
Book bookFaculty = new Book();
Cd cdFaculty = new Cd();
Movie movieFaculty = new Movie();

private ImageIcon facultyImage = new ImageIcon(getClass().getResource("facultyProfileimage.jpg"));

//Faculty Profile Display
private JLabel facultyNameLabel = new JLabel(facultyFaculty.getFirstName());

private JLabel welcome = new JLabel("Welcome " +(facultyNameLabel)+" to a The Library System");
private JPanel facultyPagePanel = new JPanel(new BorderLayout());
private JPanel facultyMenuBar = new JPanel(new GridLayout(1,6));
private JPanel imagePanel = new JPanel();

//Faculty Menu Bar Buttons
private JButton payFinesButton = new JButton("PAY FINES");
private JButton searchHistory = new JButton("SEARCH HISTORY");
private JButton savedSearches = new JButton("SAVED SEARCHES");
private JButton booksOnLoan = new JButton("BOOKS ON LOAN");
private JButton facultyPageImage = new JButton(facultyImage);



FacultyPage()
{
facultyMenuBar.add(payFinesButton);
facultyMenuBar.add(searchHistory);
facultyMenuBar.add(savedSearches);
facultyMenuBar.add(booksOnLoan);

imagePanel.add(facultyPageImage);


facultyPagePanel.add(welcome,BorderLayout.NORTH);
facultyPagePanel.add(facultyMenuBar,BorderLayout.CENTER);


this.setLayout(new BorderLayout());
this.add(facultyPagePanel,BorderLayout.NORTH);
this.add(imagePanel,BorderLayout.SOUTH);


}

}
