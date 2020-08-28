package behavioral.state;

public class FanHighState extends State {
    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to off state. ");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan state is high!";
    }
}
