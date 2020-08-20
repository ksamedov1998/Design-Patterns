package creational.factory;

public class Shop extends Website {
    @Override
    protected void createWebsite() {
        pageList.add(new ContactPage());
        pageList.add(new CardPage());
        pageList.add(new PostPage());
    }
}
