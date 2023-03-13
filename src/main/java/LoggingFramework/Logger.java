package LoggingFramework;

import static LoggingFramework.LogManager.getChainOfLogger;

public class Logger {
    static Logger instance;
    static AbstractLogger chainOfLogger;
    public static Logger getInstance() {
        if(instance ==  null) {
            instance = new Logger();
            chainOfLogger = getChainOfLogger();
        }
        return instance;
    }

    private void createLog(int level, String msg){
        chainOfLogger.logMessage(level,msg);
    }

    public void info (String msg) {
        createLog(1,msg);
    }

    public void error (String msg) {
        createLog(2,msg);
    }

    public void debug (String msg) {
        createLog(3,msg);
    }
}
