
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
    
    public boolean removeHolds(Holds holds){
    
        return true;
    }
    
    public void viewHolds(){
    
        
    }
    
    public Member(int categoryID,String memberID, String memberPass){
        super(categoryID, memberID, memberPass);
    }
    
}
