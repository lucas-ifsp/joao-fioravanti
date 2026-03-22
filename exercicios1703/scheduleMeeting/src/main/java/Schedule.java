import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private final LocalDate day;
    private final LocalTime startTime, endTime;
    private Meeting[] meetings = new Meeting[20];
    private int meetingsIndex = 0;

    public static Schedule createSchedule(LocalDate day, LocalTime startTime, LocalTime endTime){
        if(startTime.isBefore(endTime)){
            return new Schedule(day, startTime, endTime);
        }
        return null;
    }

    public static Schedule createSchedule(LocalTime startTime, LocalTime endTime){
        LocalDate today = LocalDate.now();
        return  createSchedule(today, startTime, endTime);
    }

    private Schedule(LocalDate day, LocalTime startTime, LocalTime endTime){
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void addMeeting(Meeting meeting){
        if(meeting.getStartTime().isAfter(startTime) && meeting.getEndTime().isBefore(endTime)
                && meeting.getEndTime().isAfter(meeting.getStartTime()) && isMeetingValid(meeting))
        {
            meetings[meetingsIndex++] = meeting;
        }
    }

    private boolean isMeetingValid(Meeting meeting){
        for(int i = 0; i<meetingsIndex; i++){
            if(!(meeting.getEndTime().isBefore(meetings[i].getStartTime()) || meeting.getStartTime().isAfter(meetings[i].getEndTime()))){
                return false;
            }
        }
        return true;
    }

    public void removeMeeting(Meeting meeting){
        for(int i =0; i<meetingsIndex; i++){
            if(meeting == meetings[i]){
                for(int j = i; j<meetingsIndex-1; j++){
                    meetings[j] = meetings[j+1];
                }
                meetingsIndex--;
                break;
            }
        }
    }

    public double percentageSpentInMeetings(){
        long durationDay = Duration.between(startTime, endTime).toMinutes(), sumMeetingsDuration = 0;

        for(int i = 0; i<meetingsIndex; i++){
            sumMeetingsDuration += meetings[i].durationInMinutes();
        }
        return (double) (sumMeetingsDuration * 100) /durationDay;
    }

    public String scheduleAsString(){
        StringBuilder schedule = new StringBuilder();
        for(int i = 0; i<meetingsIndex; i++){
            schedule.append(meetings[i].getDescription());
            schedule.append(' ');
            schedule.append(meetings[i].getStartTime().toString());
            schedule.append(' ');
            schedule.append(meetings[i].getEndTime().toString());
            schedule.append("\n");
        }
        return schedule.toString();
    }

}
