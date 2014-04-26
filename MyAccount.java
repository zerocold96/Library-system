import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MyAccount extends JPanel
{
//Variables Passed In To Verify Users
private String userID;
private String userPass;
private int userCategoryID;
/*
//User Objects of Entities
Student student=new Student(userType,userID,userPass);
Admin admin = new Admin(userType,userID,userPass);
Faculty faculty= new Faculty(userType,userID,userPass);
Librarian librarian = new Librarian(userType,userID,userPass);
//Media Objects of Entities
Books book = new Book();
CDs cd= new CDs();
Movies movie = new Movies();
*/
private JButton loginButton = new JButton("LOGIN");
private JPanel loginPanel = new JPanel();
private JTextField loginIDText = new JTextField(15);
private JPasswordField passwordText = new JPasswordField(15);
private JLabel userLabel = new JLabel("LOGIN ID: ");
private JLabel passLabel = new JLabel("PASSWORD: ");

//private String[] users = {"STUDENT","FACULTY","LIBRARIAN","ADMINISTRATOR"};
//private JComboBox category = new JComboBox(users);

private ButtonGroup category= new ButtonGroup();
private JRadioButton studentButton= new JRadioButton("STUDENT");
private JRadioButton facultyButton= new JRadioButton("FACULTY");
private JRadioButton librarianButton= new JRadioButton("LIBRARIAN");
private JRadioButton adminButton= new JRadioButton("ADMINISTRATOR");

MyAccount(){

	loginPanel.add(userLabel);
    loginPanel.add(loginIDText);
    loginPanel.add(passLabel);
    loginPanel.add(passwordText);
	loginPanel.add(loginButton);
	loginButton.addActionListener(new LoginListener());

	studentButton.addActionListener(new RadioButtonListener());
	facultyButton.addActionListener(new RadioButtonListener());
	librarianButton.addActionListener(new RadioButtonListener());
	adminButton.addActionListener(new RadioButtonListener());

	category.add(studentButton);
	category.add(facultyButton);
	category.add(librarianButton);
	category.add(adminButton);


	loginPanel.add(studentButton);
	loginPanel.add(facultyButton);
	loginPanel.add(librarianButton);
	loginPanel.add(adminButton);
    this.add(loginPanel);


}
private class LoginListener implements ActionListener
{
	public void actionPerformed(ActionEvent loginClicked)
	{
		{
		            userID = loginIDText.getText();
		            userPass = passwordText.getText();

		            if(userID.equals("test") && userPass.equals("12345"))
		            {
		                Welcome studentProfile =new Welcome();
		                studentProfile.setVisible(true);
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
private class RadioButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent buttonSelected)
	{
		if (buttonSelected.getSource()== studentButton)
		{
			 Welcome studentProfile =new Welcome();
			 studentProfile.setVisible(true);

		}
	}
}


}




