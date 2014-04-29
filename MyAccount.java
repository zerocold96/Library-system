package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MyAccount extends JPanel
{
//Profile Frames
private JFrame studentFrame= new JFrame();
private JFrame facultyFrame= new JFrame();
private JFrame librarianFrame= new JFrame();
private JFrame adminFrame = new JFrame();

//Variables Passed In To Verify Users
private String userID;
private String userPass;
private int userCategoryID;



//Media Objects of Entities
Book book = new Book();
Cd cd= new Cd();
Movie movie = new Movie();

//Login Variables
private JButton loginButton = new JButton("LOGIN");
private JPanel loginPanel = new JPanel();
private JTextField loginIDText = new JTextField(15);
private JPasswordField passwordText = new JPasswordField(15);
private JLabel userLabel = new JLabel("LOGIN ID: ");
private JLabel passLabel = new JLabel("PASSWORD: ");

MyAccount(){

	loginPanel.add(userLabel);
    loginPanel.add(loginIDText);
    loginPanel.add(passLabel);
    loginPanel.add(passwordText);
	loginPanel.add(loginButton);
	loginButton.addActionListener(new LoginListener());

	//loginPanel.add(category);
    this.add(loginPanel);


}
private class LoginListener implements ActionListener
{
	public void actionPerformed(ActionEvent loginClicked)
	{
		{
		            userID = loginIDText.getText();
		            userPass = passwordText.getText();
                                
                            //User Objects of Entities
                            Student student=new Student(userID,userPass);
                            Admin admin = new Admin(userID,userPass);
                            Faculty faculty= new Faculty(userID,userPass);
                            Librarian librarian = new Librarian(userID,userPass);
                            
				  if(student.isLoggedin())
		            {
						StudentPage studentProfile=new StudentPage();

						studentFrame.add(studentProfile); //Add the student Page Panel
						studentFrame.setSize( 955,500 ); // Set studentFrame Size
						studentFrame.setLocation(0,100);
						studentFrame.setVisible( true ); // Show studentFrame

					}
				  else if(faculty.isLoggedin())
					{
						FacultyPage facultyProfile=new FacultyPage();
						facultyProfile.setVisible(true);
					}
				  else if(librarian.isLoggedin())
					{
						LibrarianPage librarianProfile=new LibrarianPage();
						librarianProfile.setVisible(true);
					}
				  else if(admin.isLoggedin())
					{
						AdminPage adminProfile=new AdminPage();
						adminProfile.setVisible(true);
					}


				  else
		            {
						JOptionPane.showMessageDialog(null,"Invalid LoginID or Password");
		                loginIDText.setText("");
		                passwordText.setText("");
		                loginIDText.requestFocus();
		            }

        }
	}
}



}