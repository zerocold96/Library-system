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
public class Student extends User {
    //variables
    private String books[];
    private String reserves[];
    private String holds[];
    
    //methods prototypes
    public boolean hasHolds(){return false;};
    public boolean hasReserves(){return false;};
    
    public void viewHolds(){}
    
    //view the student information
    public void viewInformation(){}
    
    //constructor
    public Student(String studentID, String studentPass){
        super(1, studentID, studentPass);
    }
    public Student(){
    super();
    this.setUserCategoryID(1);
    this.isConnected();
    this.findCategoryTable(this.getUserCategoryID());
    this.isClose();
    }

    public String[] getReserves() {
        return reserves;
    }

    public void setReserves(String[] reserves) {
        this.reserves = reserves;
    }

    public String[] getHolds() {
        return holds;
    }

    public void setHolds(String[] holds) {
        this.holds = holds;
    }
    
    
    
}
