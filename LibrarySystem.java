/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem;

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
        
        User user1 =  new User(1,"2020", "pass2");
        if(user1.isLoggedin()){
            
        System.out.println("first Name: " + user1.getFirstName());
        }
    }
    
}
