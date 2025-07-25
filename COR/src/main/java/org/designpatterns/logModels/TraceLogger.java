package org.designpatterns.logModels;

public class TraceLogger extends Logger{
    private static final String TRACE_FORMAT = "TRACE: %s";
    public TraceLogger(Logger nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void logMessage(LogLevel logLevel, String message) {
        if(LogLevel.TRACE.equals(logLevel)) {
            System.out.println(String.format(TRACE_FORMAT, message));
        } else if(this.nextLogHandler != null) {
            this.nextLogHandler.logMessage(logLevel, message);
        } else {
            throw new RuntimeException("Trace LOGGER not chained properly : droping message : "+ message);
        }
    }
}
