package hw_pattern.task2_Record;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;

    Logger(){

    }

    public Logger getInstance(){
        if(instance == null){
             instance = new Logger();
        }
        return instance;
    }

    private final List<LoggerInformation> logs = new ArrayList<>();

    public void register(LoggerInformation loggerInformation){
        logs.add(loggerInformation);
    }

    public void logAll(){
        for(LoggerInformation record: logs){
            record.print();
        }
    }
}
