
package lab2_part2;

public abstract class Multimedia extends File{
    
    private String info;
    private Duration duration;

    public Multimedia(String name, int size, Format format, String info, Duration duration) {
        super(name, size, format);
        setInfo(info);
        setDuration(duration);
    }
    
    

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        if (info!=null && !info.trim().isEmpty()) {
            this.info=info;} 
        else {throw new IllegalArgumentException("Info cannot be null");}
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        if (duration!=null) {
             this.duration = duration;} 
        else {throw new IllegalArgumentException("Duration-instance cannot be null");}
    }
    
    
    
}
