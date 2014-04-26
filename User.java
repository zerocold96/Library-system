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
public class User {
    private String firstName;
    private String lastName;
    private String pass;
    private String ID;
    private int userCategoryID = 0;
    private String userCategoryName = null;
    private String error = null;
    Connection con;

    public String getError() {
        return error;
    }

    public int getUserCategoryID() {
        return userCategoryID;
    }

    public void setUserCategoryID(int UserCategoryID) {
        this.userCategoryID = UserCategoryID;
    }

    public String getUserCategoryName() {
        return userCategoryName;
    }

    public void setUserCategoryName(String UserCategoryName) {
        this.userCategoryName = UserCategoryName;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void setError(String error) {
        this.error = error;
    }

    //children don't need to retrieve their password.
    private String getPass() {
        return pass;
    }

    //This sets the password passed by the children classes.
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @SuppressWarnings("empty-statement")
    public void findCategoryTable(int userCategoryID){
        try{
        //we run query to find table using the categoryID
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT userCategoryName from category where userCategoryID = '"+getUserCategoryID() +"';");
        set.next();
        setUserCategoryName(set.getString("userCategoryName"));
        
        //we set the userCategoryName to the one found by using the ID  
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private boolean isConnected(){
        try{
            String url =
 "jdbc:mysql://localhost:3306/library";

            setCon(
 DriverManager.getConnection(
 url,"root", "123456"));
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean isClose(){
    
        try{
            getCon().close();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public void setUser(){
        try{
        
        Statement stmt = getCon().createStatement();
        
        //to get the result from query you must run something like this:
        //Result rs = stmt.executeQuery("SELEC* FROM table1");
        //rs will be scrollable and updateble. 
        ResultSet set = stmt.executeQuery("SELECT *, COUNT(*) as 'count' FROM "+ getUserCategoryName() +" WHERE id =" +getID() + " AND pass = '"+getPass()+"';");
        
        //if the query ran and we have more content than an array of 1;
        set.next();
     
        if("0".equals(set.getString("count"))){
            setError("The User and password don't match.!");
        }else{
            setFirstName(set.getString("firstName"));
            setLastName(set.getString("lastName"));
        }
        
        }catch(Exception e){
            e.printStackTrace();
        
        }
    }
    
    
    //If we have no errors then we know we have been loggedin
     public boolean isLoggedin(){
        if(getError() == null){
            return true;
        }else{
            System.out.println(getError());
            return false;
        }
    }
     
    public User(int categoryID, String ID,String pass){
        //Check to make sure all fields are not null
        if(categoryID != 0 && ID != null && pass != null){
            //create connection to database.
            if(isConnected()){
            
            //we need to find out if the user actually exist in the database
            setUserCategoryID(categoryID);
            findCategoryTable(categoryID);
            setPass(pass);
            setID(ID);
            //we need to validate the password.
            
            setUser();
            
            //close the connection to the database
            isClose();
            }else{
            setError("Could not connect to the database.!");
                    
            }
        }
    }
}
