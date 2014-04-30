package librarysystem;

//This class is not needed.
public class MediaSearch {
         
         public Book[] searchMedia(Book book, int searchType, String searchItem)
         {
             switch(searchType){
                 case 1:
                     book.searchByAuthor(searchItem);
                     break;
                 case 2:
                     //do a different search
                    // book = new Book();
                     book.searchByTitle(searchItem);
                     break;
                 case 3:
                     //do a different search
                     //book = new Book();
                     book.searchByGenre(searchItem);
                     break;
                 case 4:
                     //do a different search
                     //book = new Book();
                     book.searchByIsbn(searchItem);
                     break;    
                     
             }
             return book.books;
         }
         
         public Cd[] searchMedia(Cd cd, int searchType, String searchItem){
         
             switch(searchType){
                 case 1:
                     //do search
                     //cd = new Cd();
                     cd.searchByTitle(searchItem);
                     break;
                 case 2:
                     //do search
                     //cd = new Cd();
                     cd.searchByGenre(searchItem);
                     break;
                 case 3:
                     //do search
                     //cd = new Cd();
                     cd.searchByArtist(searchItem);
                     break;
             }
             return cd.cds;
         }
         
         public Movie[] searchMedia(Movie movie, int searchType, String searchItem){
         
             switch(searchType){
                 case 1:
                     //do search
                     //movie = new Movie();
                     movie.searchByTitle(searchItem);
                     break;
                 case 2:
                     //do search
                     //movie = new Movie();
                     movie.searchByGenre(searchItem);
                     break;
                 case 3:
                     //do search
                     //movie = new Movie();
                     movie.searchByDirector(searchItem);
                     break;
               
                } 
             return movie.movies;
             }
     }
