import java.io.FileReader;
import java.util.ArrayList;


public class Fileread {
    public static ArrayList<String> get_benzin() throws Exception{
        ArrayList<String>cars=new ArrayList<String>();
        FileReader filereader=new FileReader("jarib.txt");
        filereader.close();
        return cars;
    }
}
