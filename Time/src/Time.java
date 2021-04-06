public class Time {

    private int hour, minute, second;

    Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;

    }

    public void nextSecond(){
    second++;
    if (second >= 60){
        second = 0;
        minute++;
    }
    if (minute >= 60){
        minute = 0;
        hour++;
    }
    if (hour >= 24){
        hour = 0;
    }
    }

    public void previousSecond(){
        second--;

        if (second <= -1){
            second = 59;
            minute--;
        }
        if (minute <= -1 ){
            minute = 59;
            hour--;
        }
        if (hour <= -1){
            hour = 23;
        }
    }

    public String toString() {
        if (minute < 10 && hour < 10 && second < 10){
        return "0" + this.hour + ":0" + this.minute + ":0" + this.second;
    }
        if (second < 10 && minute < 10){
            return + this.hour + ":0" + this.minute + ":0" + this.second;
        }
        if (second < 10 && hour < 10){
            return "0" + this.hour + ":" + this.minute + ":0" + this.second;
        }
        if (minute < 10 && hour < 10){
            return "0" + this.hour + ":0" + this.minute + ":" + this.second;
        }

        if (minute < 10){
            return + this.hour + ":0" + this.minute + ":" + this.second;
        }
        if (second < 10){
            return + this.hour + ":" + this.minute + ":0" + this.second;
        }
        if (hour < 10){
            return "0" + this.hour + ":" + this.minute + ":" + this.second;
        }
        else{
            return + this.hour + ":" + this.minute + ":" + this.second;
        }
    }

}
