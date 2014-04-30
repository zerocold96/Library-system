package librarysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AddInventory extends JPanel
{
	private String mediaIDNumber;
	private String mediaType;
	private String mediaAuthor;
	private String mediaTitle;
	private String mediaGenre;
	private String mediaISBN;

	private JPanel manageAddInventory=new JPanel(new GridLayout(6,2));

	private JLabel inventoryTypeLabel = new JLabel("MEDIA TYPE");
	private JTextField inventoryTypeText= new JTextField(30);
	private JLabel inventoryDCPILabel= new JLabel("MEDIA IDENTIFICATION #");
	private JTextField inventoryDCPIText= new JTextField(30);
	private JLabel inventoryTitleLabel = new JLabel("TITLE");
	private JTextField inventoryTitleText = new JTextField(60);
	private JLabel inventoryAuthorLabel = new JLabel("AUTHOR-ARTIST");
	private JTextField inventoryAuthorText = new JTextField(60);
	private JLabel inventoryGenreLabel = new JLabel("GENRE");
	private JTextField inventoryGenreText = new JTextField(30);
	private JLabel inventoryISBNLabel = new JLabel("ISBN IF APPLICABLE");
	private JTextField inventoryISBNText = new JTextField(30);

	private JButton addInventoryButton = new JButton("ADD INVENTORY");


	AddInventory()
	{
		manageAddInventory.add(inventoryTypeLabel);
		manageAddInventory.add(inventoryTypeText);
		manageAddInventory.add(inventoryDCPILabel);
		manageAddInventory.add(inventoryDCPIText);
		manageAddInventory.add(inventoryTitleLabel);
		manageAddInventory.add(inventoryTitleText);
		manageAddInventory.add(inventoryAuthorLabel);
		manageAddInventory.add(inventoryAuthorText);
		manageAddInventory.add(inventoryGenreLabel);
		manageAddInventory.add(inventoryGenreText);
		manageAddInventory.add(inventoryISBNLabel);
		manageAddInventory.add(inventoryISBNText);

		manageAddInventory.add(addInventoryButton);
		addInventoryButton.addActionListener(new AddInventoryListener());


                this.setLayout(new BorderLayout());
                  this.add(manageAddInventory, BorderLayout.CENTER);

	}
	private class AddInventoryListener implements ActionListener
	{
		public void actionPerformed(ActionEvent addInventoryButtonClicked)
		{
			if (addInventoryButtonClicked.getSource() == addInventoryButton)
			{
				if("book".equals(inventoryTypeText.getText())||"Book".equals(inventoryTypeText.getText()))
				{
				mediaTitle = inventoryTitleText.getText();
				mediaAuthor = inventoryAuthorText.getText();
				mediaGenre = inventoryGenreText.getText();
				mediaISBN = inventoryISBNText.getText();
				mediaIDNumber = inventoryDCPIText.getText();

				ManageInventory manage = new ManageInventory();
				Book aBook = new Book();
				manage.addToInventory(aBook,mediaIDNumber,mediaTitle,mediaAuthor,mediaGenre,mediaISBN);
                                System.out.println("the book should have been added");
				}
				else if("cd".equals(inventoryTypeText.getText())||"Cd".equals(inventoryTypeText.getText()))
				{
				mediaTitle = inventoryTitleText.getText();
				mediaAuthor = inventoryAuthorText.getText();
				mediaGenre = inventoryGenreText.getText();
				mediaISBN = inventoryISBNText.getText();
				mediaIDNumber = inventoryDCPIText.getText();

				ManageInventory manage = new ManageInventory();
				Cd aCd = new Cd();
				manage.addToInventory(aCd,mediaIDNumber,mediaTitle,mediaAuthor,mediaGenre);
				}
				else if("movie".equals(inventoryTypeText.getText())||"Movie".equals(inventoryTypeText.getText()))
				{
				mediaTitle = inventoryTitleText.getText();
				mediaAuthor = inventoryAuthorText.getText();
				mediaGenre = inventoryGenreText.getText();
				mediaISBN = inventoryISBNText.getText();
				mediaIDNumber = inventoryDCPIText.getText();

				ManageInventory manage = new ManageInventory();
				Movie aMovie = new Movie();
				manage.addToInventory(aMovie,mediaIDNumber,mediaTitle,mediaAuthor,mediaGenre);
				}
			}
		}
	}
}

