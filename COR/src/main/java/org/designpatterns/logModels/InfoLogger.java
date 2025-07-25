package org.designpatterns.logModels;

public class InfoLogger extends Logger{
    private static final String INFO_FORMAT = "INFO: %s";
    public InfoLogger(Logger nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void logMessage(LogLevel logLevel, String message) {
        if(LogLevel.INFO.equals(logLevel)) {
            System.out.println(String.format(INFO_FORMAT, message));
        } else if(this.nextLogHandler != null) {
            this.nextLogHandler.logMessage(logLevel, message);
        } else {
            throw new RuntimeException("Info LOGGER not chained properly : droping message : "+ message);
        }
    }
}
