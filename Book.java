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
public class Book extends Media{

    private String author;
    private String isbn;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String Author) {
        this.author = Author;
    }
    
    public boolean searchByID(String ID, Book[] book) {
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
        book = new Book[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
      
        //do- while loop will work here.
        do{
        book[set.getRow() -1 ].setId(set.getString("ID"));
        book[set.getRow() -1 ].setTitle(set.getString("title"));
        book[set.getRow() -1 ].setGenre(set.getString("genre"));
        book[set.getRow() -1 ].setAuthor(set.getString("author"));
        book[set.getRow() -1 ].setIsbn(set.getString("ISBN"));
    
        
        }while(set.next());
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        };
        
        return true;
    }
        return false;
    }

    
    public boolean searchByTitle(String title, Book[] book) {
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
        book = new Book[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
      
        //do- while loop will work here.
        do{
        book[set.getRow() -1 ].setId(set.getString("ID"));
        book[set.getRow() -1 ].setTitle(set.getString("title"));
        book[set.getRow() -1 ].setGenre(set.getString("genre"));
        book[set.getRow() -1 ].setAuthor(set.getString("author")); 
        book[set.getRow() -1 ].setIsbn(set.getString("ISBN")); 
    
        
        }while(set.next());
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        };
        
        return true;
    }
        return false;}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    
    public boolean searchByGenre(String genre, Book[] book) {
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
        book = new Book[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
      
        //do- while loop will work here.
        do{
        book[set.getRow() -1 ].setId(set.getString("ID"));
        book[set.getRow() -1 ].setTitle(set.getString("title"));
        book[set.getRow() -1 ].setGenre(set.getString("genre"));
        book[set.getRow() -1 ].setAuthor(set.getString("author"));
        book[set.getRow() -1 ].setIsbn(set.getString("ISBN"));
    
        
        }while(set.next());
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        };
        
        return true;
    }
        return false;
    }
    
    public boolean searchByIsbn(String isbn, Book[] book){
        //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM cd WHERE id = '" + isbn + "';");
        
        //We close the connection.
        this.isClose();
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        book = new Book[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
      
        //do- while loop will work here.
        do{
        book[set.getRow() -1 ].setId(set.getString("ID"));
        book[set.getRow() -1 ].setTitle(set.getString("title"));
        book[set.getRow() -1 ].setGenre(set.getString("genre"));
        book[set.getRow() -1 ].setAuthor(set.getString("author"));
        book[set.getRow() -1 ].setIsbn(set.getString("ISBN"));
    
        
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
