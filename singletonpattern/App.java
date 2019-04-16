public class App {
    public static void main(String args[]){

        PerformanceStage stage = PerformanceStage.getInstance();

        stage.turnOnLights();

        System.out.println(stage.getCounter());
    }
}