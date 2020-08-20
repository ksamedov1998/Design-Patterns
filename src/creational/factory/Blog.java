package creational.factory;

public class Blog  extends Website{
    @Override
    protected void createWebsite() {
        pageList.add(new PostPage());
        pageList.add(new ContactPage());
    }
}
