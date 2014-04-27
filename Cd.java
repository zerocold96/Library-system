/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author zero
 */
public class Cd extends Media{
   // private int mediaType = 3;
    private String artist = null;
    Cd[] cds;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    public boolean searchByID(String ID) {
    //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM CD WHERE ID = '" + ID + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.cds = new Cd[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.cds[set.getRow() -1 ] = new Cd();
        this.cds[set.getRow() -1].setId(set.getString("ID"));
        this.cds[set.getRow() -1 ].setTitle(set.getString("title"));
        this.cds[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.cds[set.getRow() -1 ].setArtist(set.getString("artist"));
        //book[set.getRow() -1 ].setIsbn(set.getString("ISBN"));
        
        }while(set.next());
        
        //We close the connection.
        this.isClose();
        
        }catch(Exception e){
            
            System.out.println("the exception in searchByGenre was called.");
            e.printStackTrace();
            //We close the connection.
            this.isClose();
            return false;
        };
        
        return true;
    }
        return false;
    }

  
    public boolean searchByTitle(String title) {
       //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM CD WHERE title = '" + title + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.cds = new Cd[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.cds[set.getRow() -1 ] = new Cd();
        this.cds[set.getRow() -1].setId(set.getString("ID"));
        this.cds[set.getRow() -1 ].setTitle(set.getString("title"));
        this.cds[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.cds[set.getRow() -1 ].setArtist(set.getString("artist"));
        //book[set.getRow() -1 ].setIsbn(set.getString("ISBN"));
        
        }while(set.next());
        
        //We close the connection.
        this.isClose();
        
        }catch(Exception e){
            
            System.out.println("the exception in searchByGenre was called.");
            e.printStackTrace();
            //We close the connection.
            this.isClose();
            return false;
        };
        
        return true;
    }
        return false;
    }


    public boolean searchByGenre(String genre) {
       //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM CD WHERE genre = '" + genre + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.cds = new Cd[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.cds[set.getRow() -1 ] = new Cd();
        this.cds[set.getRow() -1].setId(set.getString("ID"));
        this.cds[set.getRow() -1 ].setTitle(set.getString("title"));
        this.cds[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.cds[set.getRow() -1 ].setArtist(set.getString("artist"));
        //book[set.getRow() -1 ].setIsbn(set.getString("ISBN"));
        
        }while(set.next());
        
        //We close the connection.
        this.isClose();
        
        }catch(Exception e){
            
            System.out.println("the exception in searchByGenre was called.");
            e.printStackTrace();
            //We close the connection.
            this.isClose();
            return false;
        };
        
        return true;
    }
        return false;
    }
    
    public boolean updateArtist(String artist){
    if(this.isConnected()){
        try{
            //we create the statement 
             Statement stmt = getCon().createStatement();
        
            //we query the category table
             stmt.executeUpdate("UPDATE TABLE " + getMediaCategory() + " SET artist = '" + artist + "' WHERE ID = " + this.getId() + ";");
            
            this.isClose();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
        
        return false;
    }
    
    //constructor
    public Cd(){
        super(3);
    }
    
}
