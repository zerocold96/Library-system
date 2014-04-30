package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class RemoveUser extends JPanel
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

	private JButton removeUserSubmit=new JButton("REMOVE USER");

	private JButton backButton = new JButton("BACK");

	private JPanel removeUserMenuBar = new JPanel(new GridLayout(1,5));
	private JPanel removeUserPanel = new JPanel(new GridLayout(5,2));



RemoveUser()
{
removeUserMenuBar.add(backButton);
backButton.addActionListener(new RemoveUserListener());

removeUserPanel.add(userTypeLabel);
removeUserPanel.add(userTypeText);
removeUserPanel.add(userIDLabel);
removeUserPanel.add(userIDText);
removeUserPanel.add(userPassLabel);
removeUserPanel.add(userPassText);

removeUserSubmit.addActionListener(new RemoveUserListener());

//Add Panels To Remove User
this.setLayout(new BorderLayout());
this.add(removeUserMenuBar,BorderLayout.NORTH);
this.add(removeUserPanel,BorderLayout.CENTER);


}
private class RemoveUserListener implements ActionListener
{
	public void actionPerformed(ActionEvent removeUserButtonClicked)
	{
		if (removeUserButtonClicked.getSource() == removeUserSubmit)
		{

			if (userTypeText.getText().equals("student")||userTypeText.getText().equals("Student"))
			{
				userID = userIDText.getText();
				userPass = userPassText.getText();

				Student oldStudent = new Student(userID,userPass);

				oldStudent.remove();


			}
			else if(userTypeText.getText().equals("faculty")||userTypeText.getText().equals("Faculty"))
			{
				userID = userIDText.getText();
				userPass = userPassText.getText();

				Faculty oldFaculty = new Faculty(userID,userPass);

				oldFaculty.remove();

			}
			else if(userTypeText.getText().equals("librarian")||userTypeText.getText().equals ("Librarian"))
			{
				userID = userIDText.getText();
				userPass = userPassText.getText();

				Librarian oldLibrarian = new Librarian(userID,userPass);

				oldLibrarian.remove();

			}
			else if(userTypeText.getText().equals("admin")||userTypeText.getText().equals("Admin"))
			{
				userID = userIDText.getText();
				userPass = userPassText.getText();

				Admin oldAdmin = new Admin(userID,userPass);

				oldAdmin.remove();

			}
		}
		else if (removeUserButtonClicked.getSource() == backButton)
		{
			AdminPage userAdmin = new AdminPage();

			JFrame addNew = new JFrame(); // creates a new JFrame
			addNew.add(userAdmin); // add the panel to the frame
			addNew.setSize( 950,750 ); // set the desired size
			addNew.setVisible( true ); // show the frame
		}

	}
}}
