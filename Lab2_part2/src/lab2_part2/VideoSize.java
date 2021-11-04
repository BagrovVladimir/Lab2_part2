
package lab2_part2;

public class VideoSize {
    
    private int width;
    private int height;

    public VideoSize(int width, int height) {
        setWidth(width);
        setHeight(height);
    }
    

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width>=0 && width%4==0) {this.width=width;} 
        else {throw new IllegalArgumentException("Width must be 0 or more and multiple of 4");}
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height>=0 && height%4==0) {this.height=height;} 
        else {throw new IllegalArgumentException("Height must be 0 or more and multiple of 4");}
    }
    
    public String stringVideoSize(){ //строковое представление размера видеоизображения
        return width+"x"+height;
    }
    
}
