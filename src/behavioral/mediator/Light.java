package behavioral.mediator;

//receiver
public class Light {
    private boolean isOn = false;

    private String location = "";
    
    
    public Light(String location) {
        this.location = location;
    }

    public boolean isOn(){
        return isOn;
    }
    public void toggle(){
        if(isOn){
            off();
            isOn = false;
        }else{
            on();
            isOn = true;
        }
        
    }
    public void on(){
        System.out.println(location + "'s light switched on");
    }
    private void off(){
        System.out.println("Light switched off");
    }

}