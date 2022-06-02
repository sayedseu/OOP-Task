package utils;

import java.time.LocalDateTime;

public class TimeManager {

    public static String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
