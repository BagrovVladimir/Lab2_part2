
package lab2_part2;

public abstract class File {
    private String name;
    private int size;
    private Format format;
    
    static int fileNameLength;
    static int sizeLength;
    

    public File(String name, int size, Format format) {
        setName(name);
        setSize(size);
        setFormat(format);
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && !name.trim().isEmpty()) {
            this.name=name;} 
        else {throw new IllegalArgumentException("Name cannot be null");}
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size>=0) {this.size=size;} 
        else {throw new IllegalArgumentException("Size must be 0 or more");}
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        if (format!=null) {
             this.format = format;} 
        else {throw new IllegalArgumentException("Format-instance cannot be null");}
    }
    
    public abstract void print();
    
    
    public static void printAll(File[] files){
        System.out.println("-------------------------------------------------------------------------");
        
        String s1;
        s1=String.format("     %-14s %s   %s   %s %s", "File name", "|", "Size", "|","Details");
        System.out.println(s1);
        

        System.out.println("--------------------+----------+-----------------------------------------");
        
        for (File file : files) {
            file.print(); 
        }
        
        System.out.println("--------------------------------------------------------------------------");
        
    };

    
    
    
    
    
    
    
}
