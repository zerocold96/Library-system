// LibrarySystemMain
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class LibrarySystemMain
{

public static void main( String[] args )
{
	Login panel = new Login( );

	JFrame librarySystem = new JFrame(); // creates a new JFrame
	librarySystem.add( panel); // add the panel to the frame
	librarySystem.setSize( 900,600 ); // set the desired size
	librarySystem.setVisible( true ); // show the frame
	librarySystem.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	} // end main
	} // end class LibrarySystemMain