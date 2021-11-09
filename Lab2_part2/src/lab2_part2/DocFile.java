
package lab2_part2;

public class DocFile extends File{
    private int pages;

    public DocFile(String name, int size, Format format, int pages) {
        super(name, size, format);
        setPages(pages);
    }
    
    

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages>=0) {this.pages=pages;} 
        else {throw new IllegalArgumentException("Pages must be 0 or more");}
    }

    @Override
    public void print() {
        String s;
        s= String.format("%s%s%s%s      %d%s%s%s %d %s", getName(), ".", getFormat(), "|", getSize(), "|", 
                getFormat().getFullNameFormat(), ",",getPages(), " pages");
        System.out.println(s);
        //System.out.println(getName()+"."+getFormat()+"|"+getSize()+"|"+getFormat().getFullNameFormat()+getPages()+" pages.");
    }
    
    
    
}
