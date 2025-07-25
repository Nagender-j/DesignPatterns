package org.designpatterns.logModels;

public class WarnLogger extends Logger {
    private static final String WARN_FORMAT = "WARN: %s";
    public WarnLogger(Logger nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void logMessage(LogLevel logLevel, String message) {
        if(LogLevel.WARN.equals(logLevel)) {
            System.out.println(String.format(WARN_FORMAT, message));
        } else if(this.nextLogHandler != null) {
            this.nextLogHandler.logMessage(logLevel, message);
        } else {
            throw new RuntimeException("WARN LOGGER not chained properly : droping message : "+ message);
        }
    }
}
