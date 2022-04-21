package behavioral.state.abuse;

public class StopWatch {
    private boolean isRunning;
    public void click(){
        if(isRunning){
            isRunning = false;
            System.out.println("stopped");
        } else {
            isRunning = true;
            System.out.println("running");
        }
    }
}
