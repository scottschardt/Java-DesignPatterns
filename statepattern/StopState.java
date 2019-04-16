public class StopState implements State {
    public void doAction(Context context){
        System.out.println("Player is in the stop state");
        context.setState(this);
    }
}