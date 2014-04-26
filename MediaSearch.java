public class MediaSearch {
         
         public Book[] searchMedia(Book book, int searchType, String searchItem)
         {
             switch(searchType){
                 case 1:
                     //do search
                     book = new Book();
                     book.searchByAuthor(searchItem);
                     return book.books[];
                     break;
                 case 2:
                     //do a different search
                     book = new Book();
                     book.searchByTitle(searchItem);
                     return book.books[];
                     break;
                 case 3:
                     //do a different search
                     book = new Book();
                     book.searchByGenre(searchItem);
                     return book.books[];
                     break;
                 case 4:
                     //do a different search
                     book = new Book();
                     book.searchByIsbn(searchItem);
                     return book.books[];
                     break;    
                     
             }
         }
         public Cd[] searchMedia(Cd cd, int searchType, String searchItem){
         
             switch(searchType){
                 case 1:
                     //do search
                     cd = new Cd();
                     cd.searchByTitle(searchItem);
                     return cd.cds[];
                     break;
                 case 2:
                     //do search
                     cd = new Cd();
                     cd.searchByGenre(searchItem);
                     return cd.cds[];
                     break;
                 case 3:
                     //do search
                     cd = new Cd();
                     cd.searchByArtist(searchItem);
                     return cd.cds[];
                     break;
                 case 4:
                     //do search
                     cd = new Cd();
                     cd.searchByIsbn(searchItem);
                     return cd.cds[];
                     break;
             }
         }
         
         public Movie[] searchMedia(Movie movie, int searchType, String searchItem){
         
             switch(searchType){
                 case 1:
                     //do search
                     movie = new Movie();
                     movie.searchByTitle(searchItem);
                     return movie.movies[];
                     break;
                 case 2:
                     //do search
                     movie = new Movie();
                     movie.searchByGenre(searchItem);
                     return movie.movies[];
                     break;
                 case 3:
                     //do search
                     movie = new Movie();
                     movie.searchByDirector(searchItem);
                     return movie.movies[];
                     break;
                 case 4:
                     //do search
                     movie = new Movie();
                     movie.searchByIsbn(searchItem);
                     return movie.movies[];
                     break;
                }  
             }
     }
