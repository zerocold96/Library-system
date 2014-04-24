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
public class Movie extends Media{

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean searchByID(String ID, Movie[] movie) {
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
        movie = new Movie[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
      
        //do- while loop will work here.
        do{
        movie[set.getRow() -1 ].setId(set.getString("ID"));
        movie[set.getRow() -1 ].setTitle(set.getString("title"));
        movie[set.getRow() -1 ].setGenre(set.getString("genre"));
        movie[set.getRow() -1 ].setDirector(set.getString("director")); 
    
        
        }while(set.next());
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        };
        
        return true;
    }
        return false;
    }

    
    public boolean searchByTitle(String title, Movie[] movie) {
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
        movie = new Movie[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
      
        //do- while loop will work here.
        do{
        movie[set.getRow() -1 ].setId(set.getString("ID"));
        movie[set.getRow() -1 ].setTitle(set.getString("title"));
        movie[set.getRow() -1 ].setGenre(set.getString("genre"));
        movie[set.getRow() -1 ].setDirector(set.getString("director")); 
    
        
        }while(set.next());
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        };
        
        return true;
    }
        return false;
    }

    
    public boolean searchByGenre(String genre, Movie[] movie) {
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
        movie = new Movie[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
      
        //do- while loop will work here.
        do{
        movie[set.getRow() -1 ].setId(set.getString("ID"));
        movie[set.getRow() -1 ].setTitle(set.getString("title"));
        movie[set.getRow() -1 ].setGenre(set.getString("genre"));
        movie[set.getRow() -1 ].setDirector(set.getString("director")); 
    
        
        }while(set.next());
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        };
        
        return true;
    }
        return false;
    }
    
}
