
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
public class Member extends User{
    //menber should have overall controll of the inventory system
    //fines in the system
    private String[] fines;
    
    //Media inventory
    private String[] checkedOutBooks;
    private String[] checkedOutDvds;
    private String[] checkedOutCds;
    
    //flag status or issues; these issues will be late fees or returns in general
    private String[] issues;
    private Holds allHolds;
    
    public boolean removeHolds(User user, Holds holds){
        //we need to fix this so we can remove holds without calling a object
        return holds.removeHolds(user, holds);
    }
    
    public void viewHolds(){
    
        
    }
    /* We don't need to give the menber class access to the inventory management. 
    We can call the inventory manage by using a actionListener.
    
    
    public void removeFromInventory(Book book){
        ManageInventory inventory = new ManageInventory();
        inventory.removeFromInventory(book);
    }
    public void removeFromInventory(Cd cd){
        ManageInventory inventory = new ManageInventory();
        inventory.removeFromInventory(cd);
    }
    
    public void removeFromInventory(Movie movie){
        ManageInventory inventory = new ManageInventory();
        inventory.removeFromInventory(movie);
    }
    */
    public Member(int categoryID,String memberID, String memberPass){
        super(categoryID, memberID, memberPass);
    }
    
    public Member(){
    super();
    }
    
}
