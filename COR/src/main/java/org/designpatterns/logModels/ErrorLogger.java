package org.designpatterns.logModels;

public class ErrorLogger extends Logger {
    private static final String ERROR_FORMAT = "ERROR: %s";
    public ErrorLogger(Logger nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void logMessage(LogLevel logLevel, String message) {
        if(LogLevel.ERROR.equals(logLevel)) {
            System.out.println(String.format(ERROR_FORMAT, message));
        } else if(this.nextLogHandler != null) {
            this.nextLogHandler.logMessage(logLevel, message);
        } else {
            throw new RuntimeException("ERROR LOGGER not chained properly : droping message : "+ message);
        }
    }
}
