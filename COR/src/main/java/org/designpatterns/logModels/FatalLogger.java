package org.designpatterns.logModels;

public class FatalLogger extends Logger {
    private static final String FATAL_FORMAT = "FATAL: %s";
    public FatalLogger(Logger nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void logMessage(LogLevel logLevel, String message) {
        if(LogLevel.FATAL.equals(logLevel)) {
            System.out.println(String.format(FATAL_FORMAT, message));
        } else if(this.nextLogHandler != null) {
            this.nextLogHandler.logMessage(logLevel, message);
        } else {
            throw new RuntimeException("FATAL LOGGER not chained properly : droping message : "+ message);
        }
    }
}
