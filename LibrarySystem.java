/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem;

import javax.swing.JFrame;

/**
 *
 * @author zero
 */
public class LibrarySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create one of each
        /*
        Student student = new Student("ID", "pass");
        if(student.isLoggedin()){
            System.out.println("Welcome");
        }
        
        Faculty faculty = new Faculty("ID", "pass");
        if(faculty.isLoggedin()){
            System.out.println("Welcome");
        }
        
        Librarian librarian = new Librarian("ID", "pass");
        if(librarian.isLoggedin()){
            System.out.println("Welcome");
        }
        
        Admin admin = new Admin("ID", "pass");
        if(admin.isLoggedin()){
            System.out.println("Welcome");
        }
        */
        
        User user1 =  new User(1,"2020", "pass2");
        if(user1.isLoggedin()){
            
        System.out.println(" First Name: " + user1.getFirstName() +"\n Last Name: " + user1.getLastName());      
        
        Book book1 = new Book();
        
        if(book1.searchByGenre("Fiction")){
        
        //WHen we do a search the array of books belonging to that class gets populated.
        System.out.println("Title: "+ book1.books[0].getAuthor() + " Author: " + book1.books[0].getAuthor() + " Genre: " + book1.books[0].getGenre() );
        System.out.println("Title: "+ book1.books[1].getTitle() + " Author: " + book1.books[1].getAuthor() + " Genre: " + book1.books[1].getGenre() );
        }
        
        Login panel = new Login( );

	JFrame librarySystem = new JFrame(); // creates a new JFrame
	librarySystem.getContentPane().add( panel); // add the panel to the frame
	librarySystem.setSize( 900,600 ); // set the desired size
	librarySystem.setVisible( true ); // show the frame
	librarySystem.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        }
    }
    
}
