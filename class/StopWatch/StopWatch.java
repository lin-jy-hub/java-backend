package StopWatch;
import java.util.*;

public class StopWatch{
        private long startTime;
        private long endTime;
        Calendar cal;
        StopWatch() {
            cal = Calendar.getInstance();
            startTime = cal.getTimeInMillis();
        }
        void start() {
            cal = Calendar.getInstance();
            startTime = cal.getTimeInMillis();
        }
        void stop() {
            cal = Calendar.getInstance();
            endTime = cal.getTimeInMillis();
        }
        long getElapsedTime() {
            return endTime - startTime;
        }
    }