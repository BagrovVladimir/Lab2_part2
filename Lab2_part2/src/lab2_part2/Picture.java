
package lab2_part2;

public class Picture extends File{
    
    private PictureSize  pictureSize;
   

    public Picture(String name, int size, Format format, PictureSize pictureSize) {
        super(name, size, format);
        //setPictureSize(pz);
        //setPictureSize(pictureSize);
        //setPictureSize(pictureSize.getW);
        //PictureSize pictureSize.=widht;
        //pictureSize.setWidth(widht);
        //pictureSize.setHeight(height);
        //pictureSize=new PictureSize(w, h);
        //this.pictureSize=pictureSize;
        setPictureSize(pictureSize);
    }

    
    
    public PictureSize getPictureSize() {
        return pictureSize;
    }

    public void setPictureSize(PictureSize pictureSize) {
        if (pictureSize!=null) {
             this.pictureSize = pictureSize;} 
        else {throw new IllegalArgumentException("PictureSize-instance cannot be null");} 
    }   

    @Override
    public void print() {
        String s;
        s= String.format("%s%s%-11s %s   %d%s%s%s %s", getName(), ".", getFormat(), "|",getSize(), "|",
                getFormat().getFullNameFormat(), ",",
                getPictureSize().stringPictureSize());
        System.out.println(s);
    }
}
