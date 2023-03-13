package LoggingFramework;

public abstract class AbstractLogger {

    int logLevel;
    AbstractLogger nextLoggingLevel;
    public void setNextLoggingLevel(AbstractLogger nextLoggingLevel) {
        this.nextLoggingLevel = nextLoggingLevel;
    }

    void logMessage(int logLevel, String msg) {
        if(this.logLevel <= logLevel) {
            displayMsg(msg);
        }
        if(nextLoggingLevel != null) {
            nextLoggingLevel.logMessage(logLevel,msg);
        }
    }

    public abstract void displayMsg(String msg);
}
