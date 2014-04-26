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

    Movie[] movies;
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean searchByID(String ID) {
         //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM movie WHERE ID = '" + ID + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.movies = new Movie[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.movies[set.getRow() -1 ] = new Movie();
        this.movies[set.getRow() -1].setId(set.getString("ID"));
        this.movies[set.getRow() -1 ].setTitle(set.getString("title"));
        this.movies[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.movies[set.getRow() -1 ].setDirector(set.getString("director"));
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
        ResultSet set = stmt.executeQuery("SELECT * FROM movie WHERE title = '" + title + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.movies = new Movie[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.movies[set.getRow() -1 ] = new Movie();
        this.movies[set.getRow() -1].setId(set.getString("ID"));
        this.movies[set.getRow() -1 ].setTitle(set.getString("title"));
        this.movies[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.movies[set.getRow() -1 ].setDirector(set.getString("director"));
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
        ResultSet set = stmt.executeQuery("SELECT * FROM movie WHERE genre = '" + genre + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.movies = new Movie[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.movies[set.getRow() -1 ] = new Movie();
        this.movies[set.getRow() -1].setId(set.getString("ID"));
        this.movies[set.getRow() -1 ].setTitle(set.getString("title"));
        this.movies[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.movies[set.getRow() -1 ].setDirector(set.getString("director"));
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
    
    public Movie(){
        this.setMediaType(3);
    }
    
}
