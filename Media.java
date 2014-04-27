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

/**
 *
 * @author zero
 */

//do the generalized queries such as searchByID, searhcByTitle, searchBy
public class Media {
    private Connection con;
    private String id;
    private String title;
    private int mediaType = 0;
    private String mediaCategory;

    public String getMediaCategory() {
        return mediaCategory;
    }

    public void setMediaCategory(String mediaCategory) {
        this.mediaCategory = mediaCategory;
    }

    public int getMediaType() {
        return mediaType;
    }

    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    private String genre;
   
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    //connection to the database is setup
    public boolean isConnected(){
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
    
    //the connection is close.
    public boolean isClose(){
    
        try{
            getCon().close();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public void findCategoryTable(int mediaType){
        try{
        //we run query to find table using the categoryID
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * from mediatype WHERE mediaID = '"+getMediaType() +"';");
        set.next();
        setMediaCategory(set.getString("mediaTypeName"));
        
        //we set the userCategoryName to the one found by using the ID  
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //update title
    public boolean updateTitle(String title){
    if(this.isConnected()){
        try{
            //we create the statement 
             Statement stmt = getCon().createStatement();
        
            //we query the category table
             stmt.executeUpdate("UPDATE TABLE " + getMediaCategory() + " SET title = '" + title + "' WHERE title = " + this.getTitle() + ";");
            
            this.isClose();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
        
        return false;
    }
    
    public boolean updateID(String ID){
    if(this.isConnected()){
        try{
            //we create the statement 
             Statement stmt = getCon().createStatement();
        
            //we query the category table
             stmt.executeUpdate("UPDATE TABLE " + getMediaCategory() + " SET ID = '" + ID + "' WHERE ID = " + this.getId() + ";");
            
            this.isClose();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
        
        return false;
    }
    
    public boolean updateGenre(String genre){
    if(this.isConnected()){
        try{
            //we create the statement 
             Statement stmt = getCon().createStatement();
        
            //we query the category table
             stmt.executeUpdate("UPDATE TABLE " + getMediaCategory() + " SET genre = '" + genre + "' WHERE ID = " + this.getId() + ";");
            
            this.isClose();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
        
        return false;
    }
    
    public Media(int mediaType){
    //we need to setup a category type
        this.setMediaType(mediaType);
        if(this.isConnected()){
        this.findCategoryTable(this.getMediaType());
        this.isClose();
        }else{
            System.out.println("Error, the connection failed.");
        }
    
    };
}
