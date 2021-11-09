
package lab2_part2;

public class Video extends Multimedia{
    
    private VideoSize videoSize;
    
    public  Video(String name, int size, Format format, String info, Duration duration, VideoSize videoSize){
        super(name, size, format, info, duration);
        setVideoSize(videoSize);
    }
    

   
    
    

    public VideoSize getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(VideoSize videoSize) {
        if (videoSize!=null) {
             this.videoSize = videoSize;} 
        else {throw new IllegalArgumentException("VideoSize-instance cannot be null");}
    }

    @Override
    public void print() {
        String s;
        s= String.format("%s%s%s%s%d%s%s%s %s%s %s %s", getName(), ".", getFormat(), "|",getSize(), "|",
                getFormat().getFullNameFormat(), ",",getInfo(), ",",getDuration().stringDuration(), getVideoSize().stringVideoSize());
        System.out.println(s);
    }
    
    
    
    
}
