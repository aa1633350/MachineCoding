package LoggingFramework;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int logLevel) {
        this.logLevel = logLevel;
    }
    @Override
    public void displayMsg(String msg) {
        System.out.println("ERROR : " + msg);
    }
}
