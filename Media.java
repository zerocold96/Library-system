/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem;

import java.sql.Connection;
import java.sql.DriverManager;

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
    
    public Media(){};
}
