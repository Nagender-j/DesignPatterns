package org.designpatterns.logModels;

public class DebugLogger extends Logger{
    private static final String DEBUG_FORMAT = "Debug: %s";
    public DebugLogger(Logger nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void logMessage(LogLevel logLevel, String message) {
        if(LogLevel.DEBUG.equals(logLevel)) {
            System.out.println(String.format(DEBUG_FORMAT, message));
        } else if(this.nextLogHandler != null) {
            this.nextLogHandler.logMessage(logLevel, message);
        } else {
            throw new RuntimeException("Debug LOGGER not chained properly : droping message : "+ message);
        }
    }
}
