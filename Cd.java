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
    private int mediaType = 3;
    private String artist = null;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    public boolean searchByID(String ID, Cd[] cd) {
    //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM cd WHERE id = '" + ID + "';");
        
        //We close the connection.
        this.isClose();
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        cd = new Cd[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
      
        //do- while loop will work here.
        do{
        cd[set.getRow() -1 ].setId(set.getString("ID"));
        cd[set.getRow() -1 ].setTitle(set.getString("title"));
        cd[set.getRow() -1 ].setGenre(set.getString("genre"));
        cd[set.getRow() -1 ].setArtist(set.getString("artist")); 
    
        
        }while(set.next());
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        };
        
        return true;
    }
        return false;
    }

  
    public boolean searchByTitle(String title, Cd[] cd) {
       //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM cd WHERE id = '" + title + "';");
        
        //We close the connection.
        this.isClose();
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        cd = new Cd[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
      
        //do- while loop will work here.
        do{
        cd[set.getRow() -1 ].setId(set.getString("ID"));
        cd[set.getRow() -1 ].setTitle(set.getString("title"));
        cd[set.getRow() -1 ].setGenre(set.getString("genre"));
        cd[set.getRow() -1 ].setArtist(set.getString("artist")); 
    
        
        }while(set.next());
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        };
        
        return true;
    }
        return false;
    }


    public boolean searchByGenre(String genre, Cd[] cd) {
       //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM cd WHERE id = '" + genre + "';");
        
        //We close the connection.
        this.isClose();
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        cd = new Cd[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
      
        //do- while loop will work here.
        do{
        cd[set.getRow() -1 ].setId(set.getString("ID"));
        cd[set.getRow() -1 ].setTitle(set.getString("title"));
        cd[set.getRow() -1 ].setGenre(set.getString("genre"));
        cd[set.getRow() -1 ].setArtist(set.getString("artist")); 
    
        
        }while(set.next());
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        };
        
        return true;
    }
        return false; }
    
}
