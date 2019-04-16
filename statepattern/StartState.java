public class StartState implements State {
    public void doAction(Context context){
        System.out.println("Player is in the start state");
        context.setState(this);
    }
}