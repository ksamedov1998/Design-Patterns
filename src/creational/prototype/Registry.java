package creational.prototype;


import java.util.HashMap;
import java.util.Map;

class Registry{
    private Map<String,Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try{
            item = (Item) (items.get(type)).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(20.44);
        movie.setRuntime(60.30);
        movie.setUrl("https://www.mock.com/movie?id=11");
        items.put("Movie",movie);

        Book book =  new Book();
        book.setNumberOfPages(335);
        book.setPrice(20.6);
        book.setTitle("There is always the end");
        book.setUrl("https://www.mock.com/book?id=11");
        items.put("Book",book);
    }
}
