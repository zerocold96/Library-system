/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author zero
 */
public class SearchResult extends JPanel {
    //we define the grid
    private GridLayout grid = new GridLayout(0,4);
    //we crete the menubar and added the grid to it
    private JPanel menubar = new JPanel(grid);
    ImageIcon bookJpg = new ImageIcon(getClass().getResource("book.jpg"));
    ImageIcon cdJpg = new ImageIcon(getClass().getResource("cd.jpg"));
    ImageIcon movieJpg = new ImageIcon(getClass().getResource("movie.jpg"));
    
    public JPanel getPanel(){
        return this;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
    }
    
    public SearchResult(){
    
    }
    
    public SearchResult(String data){
       
        getPanel().setLayout(new BorderLayout());
        getPanel().add(menubar,BorderLayout.BEFORE_LINE_BEGINS);
        
        Book book = new Book();
        
        if(book.searchByAuthor(data)){
            for(int i = 0; i < book.books.length; i ++){
                JButton bookPic = new JButton(book.books[i].getTitle(),bookJpg);   
                menubar.add(bookPic);
            }
        }
        
        else if(book.searchByGenre(data)){
            for(int i = 0; i < book.books.length; i ++){
                JButton bookPic = new JButton(book.books[i].getTitle(),bookJpg);   
                menubar.add(bookPic);
            }
        }
        
        else if(book.searchByTitle(data)){
            for(int i = 0; i < book.books.length; i ++){
                JButton bookPic = new JButton(book.books[i].getTitle(),bookJpg);   
                menubar.add(bookPic);
            }
        }
        
        
        
  
        Cd cd = new Cd();
        
        if(cd.searchByArtist(data)){
            for(int i = 0; i < cd.cds.length; i ++){
            JButton cdPic = new JButton(cd.cds[i].getTitle(), cdJpg);
            menubar.add(cdPic);
            }
        }
        
        if(cd.searchByGenre(data)){
            for(int i = 0; i < cd.cds.length; i ++){
            JButton cdPic = new JButton(cd.cds[i].getTitle(), cdJpg);
            menubar.add(cdPic);
            }
        }
        
        if(cd.searchByTitle(data)){
            for(int i = 0; i < cd.cds.length; i ++){
            JButton cdPic = new JButton(cd.cds[i].getTitle(), cdJpg);
            menubar.add(cdPic);
            }
        }
        
        
        Movie movie = new Movie();
        
        if(movie.searchByDirector(data)){
            for(int i = 0; i < movie.movies.length; i ++){
            JButton moviePic = new JButton(movie.movies[i].getTitle(), movieJpg);
            menubar.add(moviePic);
            }
        }
        if(movie.searchByGenre(data)){
            for(int i = 0; i < movie.movies.length; i ++){
            JButton moviePic = new JButton(movie.movies[i].getTitle(), movieJpg);
            menubar.add(moviePic);
            }
        }
        if(movie.searchByTitle(data)){
             for(int i = 0; i < movie.movies.length; i ++){
            JButton moviePic = new JButton(movie.movies[i].getTitle(), movieJpg);
            menubar.add(moviePic);
            }
        }
        
    }
}
