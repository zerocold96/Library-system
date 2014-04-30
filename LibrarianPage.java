package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class LibrarianPage extends JPanel
{
private String userID;
private String userPass;

//Librarian Entity Classes
Librarian librarianLibrarian = new Librarian(userID,userPass);
Book bookLibrarian = new Book();
Cd cdLibrarian = new Cd();
Movie movieLibrarian = new Movie();

private ImageIcon librarianImage = new ImageIcon(getClass().getResource("librarianProfileimage.jpg"));

//Librarian Profile Display
private JLabel librarianNameLabel = new JLabel(librarianLibrarian.getFirstName());

private JLabel welcome = new JLabel("Welcome " +(librarianNameLabel)+" to a The Library System");
private JPanel librarianPagePanel = new JPanel(new BorderLayout());
private JPanel librarianMenuBar = new JPanel(new GridLayout(1,6));
private JPanel imagePanel = new JPanel();

//Librarian Menu Bar Buttons
private JButton checkoutMenuButton = new JButton("CHECKOUT");
private JButton returnBooksMenuButton = new JButton("RETURNS");
private JButton manageAccountsButton = new JButton("MANAGE ACCOUNTS");
private JButton manageInventoryAddButton = new JButton("ADD INVENTORY");
private JButton manageInventoryRemoveButton = new JButton("REMOVE INVENTORY");
private JButton booksOnLoan=new JButton("Books ON LOAN");
private JButton librarianPageImage = new JButton(librarianImage);

LibrarianPage()
{
librarianMenuBar.add(checkoutMenuButton);
librarianMenuBar.add(returnBooksMenuButton);
librarianMenuBar.add(manageInventoryAddButton);
manageInventoryAddButton.addActionListener(new LibrarianButtonListener());
librarianMenuBar.add(manageInventoryRemoveButton);
librarianMenuBar.add(manageAccountsButton);
librarianMenuBar.add(booksOnLoan);

imagePanel.add(librarianPageImage);


librarianPagePanel.add(welcome,BorderLayout.NORTH);
librarianPagePanel.add(librarianMenuBar,BorderLayout.CENTER);


this.setLayout(new BorderLayout());
this.add(librarianPagePanel,BorderLayout.NORTH);
this.add(imagePanel,BorderLayout.SOUTH);


}
private class LibrarianButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent librarianButtonClicked)
	{
		if(librarianButtonClicked.getSource()==checkoutMenuButton)
		{
		}
		else if(librarianButtonClicked.getSource()==returnBooksMenuButton)
		{
		}
		else if(librarianButtonClicked.getSource()==manageInventoryAddButton)
		{
			AddInventory addInv = new AddInventory();

			JFrame manageAddInventory = new JFrame(); // creates a new JFrame
			manageAddInventory.add(addInv); // add the panel to the frame
			manageAddInventory.setSize( 500,500 ); // set the desired size
			manageAddInventory.setVisible( true ); // show the frame
		}
		else if(librarianButtonClicked.getSource()==manageInventoryRemoveButton)
		{
			/*RemoveInventory removeInv = new Management();

			JFrame manageRemoveInventory = new JFrame(); // creates a new JFrame
			manageRemoveInventory.add(removeInv); // add the panel to the frame
			manageRemoveInventory.setSize( 600,600 ); // set the desired size
			manageRemoveInventory.setVisible( true ); // show the frame*/
		}
		else if(librarianButtonClicked.getSource()==manageAccountsButton)
		{
			return;
		}
	}
}

}
