/**
 *
 * @author Shane
 */

public class ManageInventory {
    
        //Add Funciton
        public void addToInventory(Book book, String title, author, genre, int isbn)
        {
            Book book[] = new Book();
            book.addToInventory(title, author, genre, isbn);
        }
    
        public void addToInventory(Cd cd, String title, artist, genre, int isbn)
        {
            Cd cd[] = new Cd();
            cd.addToInventory(title, artist, genre, isbn);
        }
        
        public void addToInventory(Movie movie, String title, director, genre, int isbn)
        {
            Movie movie[] = new Movie();
            movie.addToInventory(title, director, genre, isbn);
        }
    
        //This is the remove function
        public void removeToInventory(Book book, String title, author, genre, int isbn)
        {
            Book book[] = new Book();
            book.removeToInventory(title, author, genre, isbn);
        }
    
        public void removeToInventory(Cd cd, String title, artist, genre, int isbn)
        {
            Cd cd[] = new Cd();
            cd.removeToInventory(title, artist, genre, isbn);
        }
        
        public void removeToInventory(Movie movie, String title, director, genre, int isbn)
        {
            Movie movie[] = new Movie();
            movie.removeToInventory(title, director, genre, isbn);
        }
    
   
        
        public void updateInventory()
        {
        
        
        
        }
}
