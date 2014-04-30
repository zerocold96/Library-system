/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem;
import java.sql.*;

/**
 *
 * @author zero
 */
public class Admin extends Member{
    User[] users;
 
    
    //add new user query here
    public boolean addUser(User user){
    
        return true;
    }
    

    
    public boolean changeUserPassword(User user){
    
        return true;
    }
    
    public Admin(String adminID, String adminPass){
        super(4, adminID, adminPass);
        
    }
    public Admin(){
    this.setUserCategoryID(4);
    this.isConnected();
    this.findCategoryTable(this.getUserCategoryID());
    this.isClose();
    }
    
}
