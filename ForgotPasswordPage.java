package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class ForgotPasswordPage extends JPanel
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

	private JLabel userFirstLabel = new JLabel("FIRST NAME");
	private JTextField userFirstText = new JTextField(30);
	private JLabel userLastLabel = new JLabel("LAST NAME");
	private JTextField userLastText = new JTextField(30);
	private JButton changePasswordSubmit = new JButton("CHANGE PASSWORD");


	private JButton backButton = new JButton("BACK");
	private JButton retrievePassword = new JButton("FORGOT PASSWORD");

	private JPanel changeMenuBar = new JPanel(new GridLayout(1,5));
	private JPanel changePanel = new JPanel(new GridLayout(2,5));
        
        



ForgotPasswordPage()
{
changeMenuBar.add(backButton);
backButton.addActionListener(new ChangeUserPasswordListener());
changeMenuBar.add(retrievePassword);
retrievePassword.addActionListener(new ChangeUserPasswordListener());

changePanel.add(userTypeLabel);
changePanel.add(userTypeText);
changePanel.add(userIDLabel);
changePanel.add(userIDText);

changePanel.add(userFirstLabel);
changePanel.add(userFirstText);
changePanel.add(addUserSubmit);
changePasswordSubmit.addActionListener(new ChangeUserPasswordListener());

//Add Panels To Add User
this.setLayout(new BorderLayout());
this.add(changeMenuBar,BorderLayout.NORTH);
this.add(changePanel,BorderLayout.SOUTH);


}
private class ChangeUserPasswordListener implements ActionListener
{
	public void actionPerformed(ActionEvent changePasswordButtonClicked)
	{
		if (changePasswordButtonClicked.getSource() == changePasswordSubmit)
		{
			User changePasswordYes = new User(userCategoryID,userID,userPass);
			if (userTypeText == "student"||userTypeText == "Student")
			{
				Student studentForgot = new Student(userID,userPass);

				if (userID == student.userID
				userCategoryID = 1;

				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Student studentForgot = new Student(userID,userPass);
				newStudent.setID(userID);
				newStudent.setFirstName(userFirst);
				newStudent.setLastName(userLast);
				newStudent.setPass(userPass);

			}
			else if(userTypeText == "faculty"||userTypeText == "Faculty")
			{
				userCategoryID = 2;
				userID = userIDText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Faculty newFaculty = new Faculty(userID,userPass);
				newFaculty.setID(userID);
				newFaculty.setFirstName(userFirst);
				newFaculty.setLastName(userLast);
				newFaculty.setPass(userPass);

			}
			else if(userTypeText == "librarian"||userTypeText == "Librarian")
			{
				userCategoryID = 3;
				userID = userIDText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Librarian newLibrarian = new Librarian(userID,userPass);
				newLibrarian.setID(userID);
				newLibrarian.setFirstName(userFirst);
				newLibrarian.setLastName(userLast);
				newLibrarian.setPass(userPass);

			}
			else if(userTypeText == "admin"||userTypeText == "Admin")
			{
				userCategoryID = 4;
				userID = userIDText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Admin changeAdmin = new Admin(userID,userPass);
				changeAdmin.setID(userID);
				newAdmin.setFirstName(userFirst);
				newAdmin.setLastName(userLast);
				newAdmin.setPass(userPass);

			}
		}
		else if (ChangePasswordButtonClicked.getSource() == backButton)
		{
			AdminPage userAdmin = new AdminPage();

			JFrame addNew = new JFrame(); // creates a new JFrame
			addNew.add(userAdmin); // add the panel to the frame
			addNew.setSize( 950,750 ); // set the desired size
			addNew.setVisible( true ); // show the frame
		}

	}
{
}