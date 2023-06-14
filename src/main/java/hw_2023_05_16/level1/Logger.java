package hw_2023_05_16.level1;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<String> logs = new ArrayList<>();
    public void log(String message) {
        logs.add(message);
    }
}
