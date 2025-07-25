package org.designpatterns.logModels;


public abstract class Logger {
   protected Logger nextLogHandler;

    public Logger(Logger nextLogHandler) {
        this.nextLogHandler = nextLogHandler;
    }

    public abstract void logMessage(LogLevel logLevel, String message);

}
