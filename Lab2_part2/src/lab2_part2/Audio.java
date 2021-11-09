
package lab2_part2;

public class Audio extends Multimedia{

    public Audio(String name, int size, Format format, String info, Duration duration) {
        super(name, size, format, info, duration);
    }

    @Override
    public void print() {
        String s;
        s= String.format("%s%s%-5s %s   %d%s%s%s %s%s %s", getName(), ".", getFormat(), "|",getSize(), "|",
                getFormat().getFullNameFormat(), ",",getInfo(), ",",getDuration().stringDuration());
        System.out.println(s);
    }
    
    
    
}
