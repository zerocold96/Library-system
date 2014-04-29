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
    public Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String Author) {
        this.author = Author;
    }
    
    @SuppressWarnings("empty-statement")
    public boolean searchByID(String ID) {
        //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM book WHERE ID = '" + ID + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.books = new Book[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.books[set.getRow() -1 ] = new Book();
        this.books[set.getRow() -1].setId(set.getString("ID"));
        this.books[set.getRow() -1 ].setTitle(set.getString("title"));
        this.books[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.books[set.getRow() -1 ].setAuthor(set.getString("author"));
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
        ResultSet set = stmt.executeQuery("SELECT * FROM book WHERE title = '" + title + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.books = new Book[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.books[set.getRow() -1 ] = new Book();
        this.books[set.getRow() -1].setId(set.getString("ID"));
        this.books[set.getRow() -1 ].setTitle(set.getString("title"));
        this.books[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.books[set.getRow() -1 ].setAuthor(set.getString("author"));
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @SuppressWarnings("empty-statement")
    public boolean searchByGenre(String genre) {
        //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM book WHERE genre = '" + genre + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.books = new Book[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.books[set.getRow() -1 ] = new Book();
        this.books[set.getRow() -1].setId(set.getString("ID"));
        this.books[set.getRow() -1 ].setTitle(set.getString("title"));
        this.books[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.books[set.getRow() -1 ].setAuthor(set.getString("author"));
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
    
    public boolean searchByIsbn(String isbn){
         //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM book WHERE isbn = '" + isbn + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.books = new Book[set.getRow()];
        
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.books[set.getRow() -1 ] = new Book();
        this.books[set.getRow() -1].setId(set.getString("ID"));
        this.books[set.getRow() -1 ].setTitle(set.getString("title"));
        this.books[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.books[set.getRow() -1 ].setAuthor(set.getString("author"));
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
    
    public boolean searchByAuthor(String author){
         //we open the connection.  
    if(this.isConnected()){
        try{
        //we create the statement 
        Statement stmt = getCon().createStatement();
        
        //we query the category table
        ResultSet set = stmt.executeQuery("SELECT * FROM book WHERE author = '" + author + "';");
        
        
        //We populate the array with all the element of the set.
        
        //We move to the last row in the set.
        set.last();
        
        //we get the row number and assigned it as the total size of element in the array.
        //book = new Book[set.getRow()];
        this.books = new Book[set.getRow()];
        //We set the set cursor back to the first element.
        set.first();
        
        //do- while loop will work here.
        do{
        this.books[set.getRow() -1 ] = new Book();
        this.books[set.getRow() -1].setId(set.getString("ID"));
        this.books[set.getRow() -1 ].setTitle(set.getString("title"));
        this.books[set.getRow() -1 ].setGenre(set.getString("genre"));
        this.books[set.getRow() -1 ].setAuthor(set.getString("author"));
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
    
    public boolean updateAuthor(String author){
    if(this.isConnected()){
        try{
            //we create the statement 
             Statement stmt = getCon().createStatement();
        
            //we query the category table
             stmt.executeUpdate("UPDATE TABLE " + getMediaCategory() + " SET author = '" + author + "' WHERE ID = " + this.getAuthor() + ";");
            
            this.isClose();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
        
        return false;
    }
    
    public boolean updateIsbn(String isbn){
    if(this.isConnected()){
        try{
            //we create the statement 
             Statement stmt = getCon().createStatement();
        
            //we query the category table
             stmt.executeUpdate("UPDATE TABLE " + getMediaCategory() + " SET isbn = '" + isbn + "' WHERE ID = " + this.getId() + ";");
            
            this.isClose();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
        
        return false;
    }
    
    public boolean addToInventory(String ID,String title,String author,String genre,String isbn){
        //we run the query here and we rturn true if the book is added
        if(this.isConnected()){
        try{
            //we create the statement 
             Statement stmt = getCon().createStatement();
        
            //we query the category table
             stmt.executeUpdate("INSERT INTO book (ID, title, author, genre, isbn) values('" + ID + "','" + title + "','" + author + "','" + genre + "','" + isbn + "');");
            
            this.isClose();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
        
        return false;
    }
    
    public boolean removeFromInventory(String title, String author,String genre, String isbn){
        //we run the query here and we rturn true if the book is added
        if(this.isConnected()){
        try{
            //we create the statement 
             Statement stmt = getCon().createStatement();
        
            //we query the category table
             stmt.executeUpdate("DELETE FROM book where title ='" + title + "' AND author ='" + author + "' AND genre ='" + genre + "' AND isbn ='" + isbn + "' ;");
            
            this.isClose();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
        
        return false;
    }
    
    public Book(){
        super(1);
    }
}
