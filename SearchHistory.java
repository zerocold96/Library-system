package librarysystem;

import java.util.Stack;

public class SearchHistory {
             Stack history = new Stack();

    public void addToHistory(String searchItem)
    {
         
         this.history.push(searchItem);
    }
    public Stack getHistory(){
            return this.history;
    }
}
