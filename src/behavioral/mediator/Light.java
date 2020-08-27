package behavioral.mediator;

//receiver
public class Light {
    private boolean isOn;

    private String location = "";
    
    
    public Light(String location) {
        this.location = location;
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
        System.out.println("Light switched on");
    }
    private void off(){
        System.out.println("Light switched off");
    }

}