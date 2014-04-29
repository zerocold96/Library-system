/**
 *
 * @author Shane
 */
package librarysystem;

public class ManageInventory {
    
        //Add Funciton
        public void addToInventory(Book book,String ID, String title,String author,String genre,String isbn)
        {
            book.addToInventory(ID, title, author, genre, isbn);
        }
    
        public void addToInventory(Cd cd,String ID, String title,String artist,String genre)
        {
            cd.addToInventory(ID, title, artist, genre);
        }
        
        public void addToInventory(Movie movie,String ID, String title, String director, String genre)
        {
            movie.addToInventory(ID, title, director, genre);
        }
    
        //This is the remove function
        public void removeFromInventory(Book book)
        {
            book.removeFromInventory(book.getTitle(), book.getAuthor(), book.getGenre(), book.getIsbn());
        }
    
        public void removeFromInventory(Cd cd)
        {
            cd.removeFromInventory(cd.getTitle(), cd.getArtist(), cd.getGenre());
        }
        
        public void removeFromInventory(Movie movie)
        {
            movie.removeFromInventory(movie.getTitle(), movie.getDirector(), movie.getGenre());
        }
    
   
        
        public void updateInventoryTitle(Book book, String title)
        {
            book.updateTitle(title);
        }
        
        public void updateInventoryTitle(Cd cd, String title)
        {
            cd.updateTitle(title);
        }
        
        public void updateInventoryTitle(Movie movie, String title)
        {
            movie.updateTitle(title);
        }
        
        public void updateInventoryID(Book book, String ID){
            book.updateID(ID);
        }
        
        public void updateInventoryID(Cd cd, String ID){
            cd.updateID(ID);
        }
        
        public void updateInventoryID(Movie movie, String ID){
            movie.updateID(ID);
        }
        
        public void updateInventoryGenre(Book book, String genre){
            book.updateGenre(genre);
        }
        
        public void updateInventoryGenre(Cd cd, String genre){
            cd.updateGenre(genre);
        }
        
        public void updateInventoryGenre(Movie movie, String genre){
            movie.updateGenre(genre);
        }
        
        public void updateInventoryAuthor(Book book, String author){
            book.updateAuthor(author);
        }
        
        public void updateInventoryDirector(Movie movie, String director){
            movie.updateDirector(director);
        }
        
        public void updateInventoryArtist(Cd cd, String artist){
            cd.updateArtist(artist);
        }
}
