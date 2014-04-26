public class SearchHistory {
             Stack history = new Stack();

    public void addToHistory(String searchItem)
    {
         
         this.history.push(searchItem);
    }
    public void getHistory(){
            return this.history;
    }
}
