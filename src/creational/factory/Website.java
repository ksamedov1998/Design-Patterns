package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pageList = new ArrayList<>();


    public Website(){
        this.createWebsite();
    }

    protected abstract void createWebsite();

    public List<Page> getPageList() {
        return pageList;
    }

}
