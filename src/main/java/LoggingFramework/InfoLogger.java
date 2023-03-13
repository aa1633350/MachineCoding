package LoggingFramework;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public void displayMsg(String msg) {
        System.out.println("INFO : " + msg);
    }
}
