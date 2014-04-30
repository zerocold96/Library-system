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
public class Librarian extends Member{
    
//All Manage inventory belong to the ManageInvenotory Class 
    
    public Librarian(String librarianID, String librarianPass){
        super(3, librarianID, librarianPass);
    }
    public Librarian(){
    this.setUserCategoryID(3);
    this.isConnected();
    this.findCategoryTable(this.getUserCategoryID());
    this.isClose();
    }
    
}
