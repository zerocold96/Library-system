/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author zero
 */


class Holds extends Object {
    ArrayList<String> holds = new ArrayList<String>();
    Connection con;
    

    public ArrayList<String> getHolds() {
        return holds;
    }

    public void setHolds(ArrayList<String> holds) {
        this.holds = holds;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
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
    
    //this functions will return the holds for a user
    public ArrayList<String> getHolds(User user){
        //we check to see if the connection to the database worked.
        if(isConnected()){
            try{
       
        //we create the statement
        Statement stmt = getCon().createStatement();
        //we query the database and we get the result set
        ResultSet set = stmt.executeQuery("SELECT * from holds where ID = '" + user.getID() + "';");
        
        
        do{ 
        set.next();
        this.holds.add(set.getString("hold"));
        }while(set.next());
        //we close the connection to the database here.
         isClose();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        return holds;
    }
    
    //we give a string array and feed it with the query results.
    public  ResultSet getAllHolds(){
        //we check to see if the connection to the database worked.
        ResultSet set = null;
        if(isConnected()){
            try{
       
        //we create the statement
        Statement stmt = getCon().createStatement();
        //we query the database and we get the result set
        set = stmt.executeQuery("SELECT * from holds;");
        
        
        
        //we close the connection to the database here.
         isClose();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        //here we return all the holds and the id associated with it.
        return set;
    
    }
    
    public boolean removeHolds(User user, Holds hold){
    //we check to see if the connection to the database worked.
        if(isConnected()){
            try{
       
        //we create the statement
        Statement stmt = getCon().createStatement();
        //we query the database and we get the result set
        stmt.executeQuery("DELETE from holds where ID = " + user.getID() + " AND hold= " + hold + ";");
        
        //we close the connection to the database here.
         isClose();
         return true;
         
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    
}
