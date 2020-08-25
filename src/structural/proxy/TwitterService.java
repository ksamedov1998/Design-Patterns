package structural.proxy;

public interface TwitterService {
    String getTimeLine(String screenName);
    void postToTimeLine(String screenName,String message);
}
