package structural.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeLine(String screenName) {
        return "TimeLine accessed!";
    }

    @Override
    public void postToTimeLine(String screenName, String message) {

    }
}
