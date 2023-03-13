package LoggingFramework;

public class LogManager {

    protected static AbstractLogger getChainOfLogger() {
        AbstractLogger info = new InfoLogger(1);
        AbstractLogger error = new InfoLogger(2);
        AbstractLogger debug = new InfoLogger(3);

        info.setNextLoggingLevel(error);
        error.setNextLoggingLevel(debug);
        return info;
    }
}
