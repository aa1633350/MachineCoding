package LoggingFramework;

public class Driver {

    // This is a LLD for how a logging framework works.
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.error("Hello there !!");
    }

}
