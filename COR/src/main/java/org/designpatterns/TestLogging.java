package org.designpatterns;

import org.designpatterns.logModels.*;
import sun.rmi.runtime.Log;

import static org.designpatterns.logModels.LogLevel.*;

public class TestLogging {
    public static void main(String[] args) {
        Logger baseLogger = createLogChain();

        baseLogger.logMessage(DEBUG, "This is a debug message" );
        baseLogger.logMessage(FATAL, "This is a fatal message" );
        baseLogger.logMessage(TRACE, "This is a trace message" );
        baseLogger.logMessage(INFO, " this is a Info message");
        baseLogger.logMessage(WARN, "This is a warn message");
        baseLogger.logMessage(ERROR, "This is a error message");
    }

    private static Logger createLogChain() {
        Logger fatalLogger = new FatalLogger(null);
        Logger errorLogger = new ErrorLogger(fatalLogger);
        Logger warnLogger = new WarnLogger(errorLogger);
        Logger infoLogger = new InfoLogger(warnLogger);
        Logger debugLogger = new DebugLogger(infoLogger);
        return new TraceLogger(debugLogger);
    }
}
