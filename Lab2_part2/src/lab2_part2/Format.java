
package lab2_part2;

public enum Format {
    docx("docx"), 
    png("image"), 
    mp3("audio"), 
    avi("video");
    
    private final String fullNameFormat;
    
    private Format(String fullNameFormat) {
        this.fullNameFormat = fullNameFormat;
    }

    public String getFullNameFormat() {
        return fullNameFormat;
    }
    
    
}
