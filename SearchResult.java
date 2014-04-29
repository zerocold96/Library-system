/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarysystem;

import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author zero
 */
public class SearchResult extends JPanel {
    private String text = "Hellow world!";
    private JPanel menubar = new JPanel(new GridLayout(1,6));
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawString(text, 75, 75);
    }
    
    public SearchResult(){
    
    }
    
    public SearchResult(String data){
        this.add(menubar);
        int i = 0;
        
        //we perform the search 
        MediaSearch search = new MediaSearch();
        //we search in books first.
        Book book = new Book();
        //Book[] books = search.searchMedia(book, 1, data);
        
        
            menubar.add(new JButton());
        
        //Here we can add a button image with a book
        /*
        search.searchMedia(book, 2, data);
        search.searchMedia(book, 3, data);
        
        Cd cd = new Cd();
        search.searchMedia(cd, 1, data);
        search.searchMedia(cd, 2, data);
        search.searchMedia(cd, 3, data);
        
        Movie movie = new Movie();
        search.searchMedia(movie, 1, data);
        search.searchMedia(movie, 2, data);
        search.searchMedia(movie, 3, data);
        */
    }
}
