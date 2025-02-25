import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;


public class Fileread {
    public static ArrayList<Car> get_benzin() throws Exception{
        ArrayList<Car>car_list=new ArrayList<Car>();
        // FileReader filereader=new FileReader("jarib.txt");
        // String temp_car=filereader.read()
        car_list.add(new Car("AAA-111", "Honda", 2000, "Benzin", 1200.0, true, LocalDate.parse("2026-04-04")));
        // filereader.close();
        return car_list;
    }
}
