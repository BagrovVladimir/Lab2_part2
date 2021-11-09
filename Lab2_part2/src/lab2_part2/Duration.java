
package lab2_part2;

public class Duration {
    
    private int hour;
    private int minute;
    private int sec;

    public Duration(int hour, int minute, int sec) {
        setHour(hour);
        setMinute(minute);
        setSec(sec);
    }
    

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour>=0) {this.hour=hour;} 
        else {throw new IllegalArgumentException("Hour must be 0 or more");}
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute>=0) {this.minute=minute;} 
        else {throw new IllegalArgumentException("Minute must be 0 or more");}
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    
    public String stringDuration(){//строковое представление продолжительности медиафайла
        String s;
        if (hour==0) {s=minute+":"+sec;} 
        else {s=hour+":"+minute+":"+sec;}
        return s;
    }
    
}
