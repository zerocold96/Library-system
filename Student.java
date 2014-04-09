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
    
    //Need to override so we know what we giving as a input
    public void searchMedia(String name){}
    
    public void viewHolds(){}
    
    //view the student information
    public void viewInformation(){}
    
    //constructor
    public Student(String studentID, String studentPass){
        super(1, studentID, studentPass);
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
