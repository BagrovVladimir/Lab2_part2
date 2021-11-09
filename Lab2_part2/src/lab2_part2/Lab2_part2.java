
package lab2_part2;

public class Lab2_part2 {


    public static void main(String[] args) {
        
        
        
        File file1= new DocFile("j110-lab2-hiers", 2312, Format.docx, 2);
        File file2= new Picture("spb-map", 1703527, Format.png, new PictureSize(1024, 3072));
        File file3= new Audio("06-PrettyGirl", 7893454, Format.mp3, "Eric Clapton, Pretty Girl", new Duration(0, 5, 28));
        File file4= new Video("BackToTheFuture1", 1470984192, Format.avi, "Back to the future I, 1985", new Duration(1, 48, 8), new VideoSize(640, 352));
        
        Audio audiofile1= new Audio("01-Smotri", 4935808, Format.mp3, "Ariya - Generator zla, 1998", new Duration(0, 8, 33));
        Audio audiofile2= new Audio("02-Gryaz", 5310592, Format.mp3, "Ariya - Generator zla, 1998", new Duration(0, 12, 38));
        Audio audiofile3= new Audio("03-Dezertir", 7121024, Format.mp3, "Ariya - Generator zla, 1998", new Duration(0, 14, 58));
        Audio audiofile4= new Audio("04-Pitka tishinoi", 6322304, Format.mp3, "Ariya - Generator zla, 1998", new Duration(0, 12, 51));
        
        
        
        
       File[] files={file1, file2, file3, file4}; 
       Audio[] audiofiles={audiofile1, audiofile2, audiofile3, audiofile4};
        
        File.printAll(files);
        
        System.out.println("");
                                    //Данный метод подходит для класса Audio, т.к. класс Audio является дочерним от класса File.
        Audio.printAll(audiofiles); //Все методы суперкласса работают и с объектами дочерних классов, или переопределяются в них.
    }
    
}
