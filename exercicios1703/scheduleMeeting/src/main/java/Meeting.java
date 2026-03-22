import java.time.Duration;
import java.time.LocalTime;

public class Meeting {
    private final String description;
    private final LocalTime startTime, endTime;

    public static Meeting createMeeting(String description, LocalTime startTime, LocalTime endTime){
        if(startTime.isBefore(endTime)){
            return new Meeting(description, startTime, endTime);
        }
        return null;
    }

    private Meeting(String description, LocalTime startTime, LocalTime endTime){
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long durationInMinutes(){
        return Duration.between(startTime, endTime).toMinutes();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime(){
        return endTime;
    }

    public String getDescription(){
        return description;
    }
}
