package behavioral.state;

public class Fan {
    private State fanOffState;
    private State fanLowState;
    private State fanMedState;
    private State fanHighState;
    private State state;

    public Fan(){
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState= new FanMedState(this);
        fanHighState= new FanHighState(this);
        state = fanOffState;
    }

    public void pullChain(){
        state.handleRequest();
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    @Override
    public String toString() {
        return "State : " + state;
    }
}
