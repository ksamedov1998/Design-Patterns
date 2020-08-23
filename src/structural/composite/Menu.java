package structural.composite;

public class Menu extends  MenuComponent{

    public Menu(String name, String url) {
       this.name = name;
       this.url = url;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(print(this));

        for(MenuComponent component :  menuComponentList){
            builder.append(print(component));
        }

        return builder.toString();
    }

    public MenuComponent add(MenuComponent menuComponent){
        menuComponentList.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent){
        menuComponentList.remove(menuComponent);
        return menuComponent;
    } String print(MenuComponent menuComponent){
        return new StringBuilder(name).append(": " + url + "\n").toString();
    }


}
