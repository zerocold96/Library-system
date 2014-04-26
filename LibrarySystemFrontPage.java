package librarysystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class LibrarySystemFrontPage extends JPanel
{
	private ImageIcon image = new ImageIcon(getClass().getResource("librarysystemimage.jpg"));
	private ImageIcon nsearchimage = new ImageIcon(getClass().getResource("nsearchimage.jpg"));
	private ImageIcon asearchimage = new ImageIcon(getClass().getResource("asearchimage.jpg"));
	private ImageIcon askalibrarianimage = new ImageIcon(getClass().getResource("askalibrarianimage.jpg"));
	private ImageIcon searchhistoryimage = new ImageIcon(getClass().getResource("searchhistoryimage.jpg"));
	private ImageIcon myaccountimage = new ImageIcon(getClass().getResource("myaccountimage.jpg"));
	private ImageIcon coursesreservedimage = new ImageIcon(getClass().getResource("coursesreservedimage.jpg"));


   	private JPanel frontpage = new JPanel(new BorderLayout());
	private JPanel menubar = new JPanel(new GridLayout(1,6));
	private JPanel searchbar = new JPanel(new GridLayout(1,2));
	private JPanel sidemenu = new JPanel(new GridLayout (3,1));
	private JPanel imageholder= new JPanel(new BorderLayout());




	private JButton imageButton=new JButton(image);

	private JButton searchButton=new JButton("SEARCH");
	private JTextField searchText=new JTextField(30);
	private JButton loginButton = new JButton("LOGIN");
	private JPanel panel = new JPanel();
	private JTextField loginIDText = new JTextField(15);
	private JTextField passwordText = new JPasswordField(15);
	private JLabel userLabel = new JLabel("LOGIN ID: ");
	private JLabel passLabel = new JLabel("PASSWORD: ");



	private JButton nSearch = new JButton(nsearchimage);
    private JButton aSearch = new JButton(asearchimage);
    private JButton reserved = new JButton(coursesreservedimage);
    private JButton history = new JButton(searchhistoryimage);
    private JButton ask = new JButton(askalibrarianimage);
    private JButton myAccount = new JButton(myaccountimage);


	// Class LibrarySystemFrontPage Constructor

	public LibrarySystemFrontPage ()
	{
				//Menu Bar
				menubar.add(nSearch);
				nSearch.addActionListener(new MenuListener());
  				menubar.add(aSearch);
  				aSearch.addActionListener(new MenuListener());
  				menubar.add(reserved);
  				reserved.addActionListener(new MenuListener());
  				menubar.add(history);
  				history.addActionListener(new MenuListener());
  				menubar.add(ask);
  				ask.addActionListener(new MenuListener());
  				menubar.add(myAccount);
  				myAccount.addActionListener(new MenuListener());

  				//Search Bar
  				searchbar.add(searchText);
  				searchbar.add(searchButton);

				//Background Image
  				imageholder.add(imageButton, BorderLayout.NORTH);

				//Add Panels To Front Page
  				frontpage.add(searchbar, BorderLayout.SOUTH);
  				frontpage.add(menubar,BorderLayout.CENTER);

				//Add Panels To Main Panel
				this.setLayout(new BorderLayout());
				this.add(frontpage,BorderLayout.NORTH);
				this.add(imageholder,BorderLayout.SOUTH);

	}

private class MenuListener implements ActionListener
{
   	public void actionPerformed(ActionEvent buttonClicked)
   	{
   		// New Search Clicked
   		if (buttonClicked.getSource() == nSearch)
   		{
			return;
			/*NewSearch newSearch = new AskALibrarian();

			JFrame libraryNew = new JFrame(); // creates a new JFrame
			libraryNew.add(newSearch); // add the panel to the frame
			libraryNew.setSize( 900,600 ); // set the desired size
			libraryNew.setVisible( true ); // show the frame
			*/
		}

		// Advanced Search Clicked
		else if (buttonClicked.getSource() == aSearch)
   		{
			return;
			/*AdvancedSearch advanced = new AskALibrarian();

			JFrame libraryAdvanced = new JFrame(); // creates a new JFrame
			libraryAdvanced.add(advanced); // add the panel to the frame
			libraryAdvanced.setSize( 900,600 ); // set the desired size
			libraryAdvanced.setVisible( true ); // show the frame
			*/
		}

		// Courses Reserved Clicked
		else if (buttonClicked.getSource() == reserved)
   		{
			return;
			/*CoursesReserved reserve = new AskALibrarian();

			JFrame libraryReserve = new JFrame(); // creates a new JFrame
			libraryReserve.add(reserve); // add the panel to the frame
			libraryReserve.setSize( 900,600 ); // set the desired size
			libraryReserve.setVisible( true ); // show the frame
			*/
		}

		// Search History Clicked
		else if (buttonClicked.getSource() == history)
   		{
			return;
			/*SearchHistory history = new AskALibrarian();

			JFrame libraryHistory = new JFrame(); // creates a new JFrame
			libraryHistory.add(history); // add the panel to the frame
			libraryHistory.setSize( 900,600 ); // set the desired size
			libraryHistory.setVisible( true ); // show the frame
			*/
		}
		// Ask A Librarian
		else if (buttonClicked.getSource() == ask)
   		{
			return;
			/*AskALibrarian ask = new AskALibrarian();

			//JFrame libraryAsk = new JFrame(); // creates a new JFrame
			//libraryAsk.add(ask); // add the panel to the frame
			//libraryAsk.setSize( 900,600 ); // set the desired size
			//libraryAsk.setVisible( true ); // show the frame
			*/
		}
		// Login Clicked
		else if (buttonClicked.getSource() == myAccount)
   		{

			MyAccount account=new MyAccount();

			JFrame libraryAccount = new JFrame(); // creates a new JFrame
			libraryAccount.add(account); // add the panel to the frame
			libraryAccount.setSize( 955,500 ); // set the desired size
			libraryAccount.setLocation(0,100);
			libraryAccount.setVisible( true ); // show the frame


		}

   	}
}
private class SearchListener implements ActionListener
{
	public void actionPerformed(ActionEvent search)
	{


	}
}


}























