package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class AddUser extends JPanel
{
	private int userCategoryID;
	private String userID;
	private String userPass;

	private String userFirst;
	private String userLast;

	private JLabel userTypeLabel = new JLabel("USER TYPE");
	private JTextField userTypeText = new JTextField(30);
	private JLabel userIDLabel = new JLabel("User ID");
	private JTextField userIDText = new JTextField(30);
	private JLabel userPassLabel = new JLabel("USER PASSWORD");
	private JTextField userPassText = new JTextField(30);
	private JLabel userFirstLabel = new JLabel("FIRST NAME");
	private JTextField userFirstText = new JTextField(30);
	private JLabel userLastLabel = new JLabel("LAST NAME");
	private JTextField userLastText = new JTextField(30);
	private JButton addUserSubmit = new JButton("ADD USER");

	private JButton backButton = new JButton("BACK");

	private JPanel addUserMenuBar = new JPanel(new GridLayout(1,5));
	private JPanel addUserPanel = new JPanel(new GridLayout(5,2));



AddUser()
{
addUserMenuBar.add(backButton);
backButton.addActionListener(new AddUserListener());

addUserPanel.add(userTypeLabel);
addUserPanel.add(userTypeText);
addUserPanel.add(userIDLabel);
addUserPanel.add(userIDText);
addUserPanel.add(userPassLabel);
addUserPanel.add(userPassText);
addUserPanel.add(userFirstLabel);
addUserPanel.add(userFirstText);
addUserPanel.add(addUserSubmit);
addUserSubmit.addActionListener(new AddUserListener());

//Add Panels To Add User
this.setLayout(new BorderLayout());
this.add(addUserMenuBar,BorderLayout.NORTH);
this.add(addUserPanel,BorderLayout.CENTER);


}
private class AddUserListener implements ActionListener
{
	public void actionPerformed(ActionEvent addUserButtonClicked)
	{
		if (addUserButtonClicked.getSource() == addUserSubmit)
		{

			if (userTypeText.getText().equals("student")||userTypeText.getText().equals ("Student"))
			{
				userCategoryID = 1;
				userID = userIDText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Student newStudent = new Student();
				newStudent.setID(userID);
				newStudent.setFirstName(userFirst);
				newStudent.setLastName(userLast);
				newStudent.setPass(userPass);
				newStudent.add();

			}
			else if(userTypeText.getText().equals ("faculty")||userTypeText.getText().equals("Faculty"))
			{
				userCategoryID = 2;
				userID = userIDText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Faculty newFaculty = new Faculty();
				newFaculty.setID(userID);
				newFaculty.setFirstName(userFirst);
				newFaculty.setLastName(userLast);
				newFaculty.setPass(userPass);
				newFaculty.add();

			}
			else if(userTypeText.getText() == "librarian"||userTypeText.getText().equals( "Librarian"))
			{
				userCategoryID = 3;
				userID = userIDText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Librarian newLibrarian = new Librarian();
				newLibrarian.setID(userID);
				newLibrarian.setFirstName(userFirst);
				newLibrarian.setLastName(userLast);
				newLibrarian.setPass(userPass);
				newLibrarian.add();

			}
			else if(userTypeText.getText().equals ("admin")||userTypeText.getText().equals ("Admin"))
			{
				userCategoryID = 4;
				userID = userIDText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Admin newAdmin = new Admin();
				newAdmin.setID(userID);
				newAdmin.setFirstName(userFirst);
				newAdmin.setLastName(userLast);
				newAdmin.setPass(userPass);
				newAdmin.add();

			}
		}
		else if (addUserButtonClicked.getSource() == backButton)
		{
			AdminPage userAdmin = new AdminPage();

			JFrame addNew = new JFrame(); // creates a new JFrame
			addNew.add(userAdmin); // add the panel to the frame
			addNew.setSize( 950,750 ); // set the desired size
			addNew.setVisible( true ); // show the frame
		}

	}
}
}
