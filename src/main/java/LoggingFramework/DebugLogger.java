package LoggingFramework;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int logLevel) {
        this.logLevel = logLevel;
    }
    @Override
    public void displayMsg(String msg) {
        System.out.println("DEBUG : " + msg);
    }
}
