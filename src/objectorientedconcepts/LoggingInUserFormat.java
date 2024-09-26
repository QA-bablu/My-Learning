package objectorientedconcepts;

import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingInUserFormat {
    public static void main(String[] args) {
        // Create a logger
        Logger logger = Logger.getLogger(LoggingInUserFormat.class.getName());
        
        // Create a custom formatter
        SimpleFormatter formatter = new SimpleFormatter() {
            private static final String format = "[%1$tF %1$tT] [%2$s] [%3$s] %4$s %n";

            @Override
            public synchronized String format(LogRecord lr) {
                return String.format(format,
                        new java.util.Date(lr.getMillis()),
                        lr.getLevel().getLocalizedName(),
                        lr.getLoggerName(),
                        lr.getMessage()
                );
            }
        };

        // Remove default console handler
        logger.setUseParentHandlers(false);
        
        // Create a console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(formatter);
        logger.addHandler(consoleHandler);

        // Log messages
        logger.info("User specific log message 1");
        logger.warning("User specific log message 2");
    }
}
