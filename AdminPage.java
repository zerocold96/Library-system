package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AdminPage extends JPanel
{
private String userID;
private String userPass;
private String newUser;


//Admin Entity Classes
Admin adminAdmin = new Admin(userID,userPass);
Book bookAdmin = new Book();
Cd cdAdmin = new Cd();
Movie movieAdmin = new Movie();

private ImageIcon adminImage = new ImageIcon(getClass().getResource("adminProfileimage.jpg"));

//Admin Profile Display
private JLabel adminNameLabel = new JLabel(adminAdmin.getFirstName());
private JLabel welcome = new JLabel("Welcome " +(adminNameLabel)+" to a The Library System");


private JPanel adminPagePanel = new JPanel(new BorderLayout());
private JPanel adminMenuBar = new JPanel(new GridLayout(1,3));
private JPanel adminimagePanel = new JPanel();

//Admin Menu Bar Buttons
private JButton addUser = new JButton("ADD USER");
private JButton removeUser = new JButton("REMOVE USER");
private JButton changeUserPassword = new JButton("CHANGE USER PASSWORD");
private JButton adminImageButton = new JButton(adminImage);



AdminPage()
{
adminMenuBar.add(addUser);
addUser.addActionListener(new AdminMenuListener());
adminMenuBar.add(removeUser);
removeUser.addActionListener(new AdminMenuListener());
adminMenuBar.add(changeUserPassword);
changeUserPassword.addActionListener(new AdminMenuListener());


adminimagePanel.add(adminImageButton);


adminPagePanel.add(welcome,BorderLayout.NORTH);
adminPagePanel.add(adminMenuBar,BorderLayout.CENTER);


this.setLayout(new BorderLayout());
this.add(adminPagePanel,BorderLayout.NORTH);
this.add(adminimagePanel,BorderLayout.SOUTH);


}
private class AdminMenuListener implements ActionListener
{
	public void actionPerformed (ActionEvent buttonClicked)
	{
		if (buttonClicked.getSource() == addUser)
		{
			AddUser addUserAdmin = new AddUser();

			JFrame addNewAdmin = new JFrame(); // creates a new JFrame
			addNewAdmin.add(addUserAdmin); // add the panel to the frame
			addNewAdmin.setSize( 950,750 ); // set the desired size
			addNewAdmin.setVisible( true ); // show the frame

		}
		else if (buttonClicked.getSource() == removeUser)
		{
				RemoveUser removeUserAdmin = new RemoveUser();

				JFrame removeAdmin = new JFrame(); // creates a new JFrame
				removeAdmin.add(removeUserAdmin); // add the panel to the frame
				removeAdmin.setSize( 950,750 ); // set the desired size
				removeAdmin.setVisible( true ); // show the frame
		}
		else if (buttonClicked.getSource() == changeUserPassword)
		{
				ChangeUserPassword changePass = new ChangeUserPassword();

				JFrame change = new JFrame(); // creates a new JFrame
				change.add(changePass); // add the panel to the frame
				change.setSize( 950,750 ); // set the desired size
				change.setVisible( true ); // show the frame
		}
	}
}

}

