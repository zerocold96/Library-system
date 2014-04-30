package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class ChangeUserPassword extends JPanel
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
	private JLabel userPassLabel = new JLabel("CURRENT PASSWORD");
	private JTextField userPassText = new JTextField(30);
	private JLabel newUserPassLabel = new JLabel("NEW PASSWORD");
	private JTextField newUserPassText = new JTextField(30);
	private JButton changePasswordSubmit = new JButton("CHANGE PASSWORD");


	private JButton backButton = new JButton("BACK");
	private JButton retrievePassword = new JButton("FORGOT PASSWORD");

	private JPanel changeMenuBar = new JPanel(new GridLayout(1,5));
	private JPanel changePanel = new JPanel(new GridLayout(5,2));



ChangeUserPassword()
{
changeMenuBar.add(backButton);
backButton.addActionListener(new ChangeUserPasswordListener());
changeMenuBar.add(retrievePassword);
retrievePassword.addActionListener(new ChangeUserPasswordListener());

changePanel.add(userTypeLabel);
changePanel.add(userTypeText);
changePanel.add(userIDLabel);
changePanel.add(userIDText);
changePanel.add(userPassLabel);
changePanel.add(userPassText);
changePanel.add(newUserPassLabel);
changePanel.add(newUserPassText);

changePanel.add(changePasswordSubmit);
changePasswordSubmit.addActionListener(new ChangeUserPasswordListener());

//Add Panels To Change User Password
this.setLayout(new BorderLayout());
this.add(changeMenuBar,BorderLayout.NORTH);
this.add(changePanel,BorderLayout.CENTER);


}
private class ChangeUserPasswordListener implements ActionListener
{
	public void actionPerformed(ActionEvent changePasswordButtonClicked)
	{
		if (changePasswordButtonClicked.getSource() == addUserSubmit)
		{

			if (userTypeText.getText().equals("student")||userTypeText.getText().equals("Student"))
			{
				userCategoryID = 1;
				userID = userIDText.getText();
				userPassText = newUserPassText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Student changePassStudent = new Student(userID,userPass);
				changePassStudent.setID(userID);
				changePassStudent.setFirstName(userFirst);
				changePassStudent.setLastName(userLast);
				changePassStudent.setPass(userPass);

			}
			else if(userTypeText.getText().equals("faculty")||userTypeText.getText().equals("Faculty"))
			{
				userCategoryID = 2;
				userID = userIDText.getText();
				userPassText = newUserPassText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Faculty changePassFaculty = new Faculty(userID,userPass);
				changePassFaculty.setID(userID);
				changePassFaculty.setFirstName(userFirst);
				changePassFaculty.setLastName(userLast);
				changePassFaculty.setPass(userPass);

			}
			else if(userTypeText.getText().equals("librarian")||userTypeText.getText().equals ("Librarian"))
			{
				userCategoryID = 3;
				userID = userIDText.getText();
				userPassText = newUserPassText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Librarian changePassLibrarian = new Librarian(userID,userPass);
				changePassLibrarian.setID(userID);
				changePassLibrarian.setFirstName(userFirst);
				changePassLibrarian.setLastName(userLast);
				changePassLibrarian.setPass(userPass);

			}
			else if(userTypeText.getText().equals("admin")||userTypeText.getText().equals("Admin"))
			{

				userCategoryID = 4;
				userID = userIDText.getText();
				userPassText = newUserPassText.getText();
				userPass = userPassText.getText();
				userFirst = userFirstText.getText();
				userLast = userLastText.getText();

				Admin changePassAdmin = new Admin(userID,userPass);
				changePassAdmin.setID(userID);
				changePassAdmin.setFirstName(userFirst);
				changePassAdmin.setLastName(userLast);
				changePassAdmin.setPass(userPass);

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
		else if (ChangePassowrdButtonClicked.getSource() == retrievePassword)
		{
			ForgotPasswordPage forgot = new ForgotPasswordPage();

			JFrame passwordForgot = new JFrame(); // creates a new JFrame
			passwordForgot.add(forgot); // add the panel to the frame
			passwordForgot.setSize( 500,500 ); // set the desired size
			passwordForgot.setVisible( true ); // show the frame
		}
	}
{
}