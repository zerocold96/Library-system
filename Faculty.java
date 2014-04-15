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
public class Faculty extends User{
    private String[] courseReserves;

    public String[] getCourseReserves() {
        return courseReserves;
    }

    public void setCourseReserves(String[] courseReserves) {
        this.courseReserves = courseReserves;
    }
    
    //We can need a method to create reservers.
    public void createReserves(int mediaID){
    //we need to edit to fit the media table
    }
    
    
public Faculty(String facultyID, String facultyPass){
        super(2, facultyID, facultyPass);
        
        String[] mediaArray = {"book","DVD"};
        //We set the Reservers that are part of the Faculty
        setCourseReserves(mediaArray);
        
        
    }
    
}
