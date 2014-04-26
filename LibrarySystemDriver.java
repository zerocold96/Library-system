// HangMan Driver Class
package librarysystem;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class LibrarySystemDriver
{

public static void main( String[] args )
{

  	LibrarySystemFrontPage panel = new LibrarySystemFrontPage( );

	JFrame library = new JFrame(); // creates a new JFrame
	library.add( panel); // add the panel to the frame
	library.setSize( 950,750 ); // set the desired size
	library.setVisible( true ); // show the frame
	library.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	} // end main
	} // end class LibrarySystemDriver