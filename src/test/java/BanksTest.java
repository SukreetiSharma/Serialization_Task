import XML.Banks;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BanksTest {
    public static void main(String args[]) throws Exception {
        XmlMapper xml = new XmlMapper();
        String readContent = new String(Files.readAllBytes(Paths.get("C:\\Users\\SukreetiSharma\\Documents\\GitHub\\Serialization_Task\\src\\test\\java\\Data.xml")));
        Banks BanksData = xml.readValue(readContent, Banks.class);
        int Id = BanksData.getId();
        String Name = BanksData.getName();
        String Headquarter = BanksData.getHeadquarter();
        System.out.println("ID = " + Id);
        System.out.println("Name = " + Name);
        System.out.println("Headquarter = " + Headquarter);
    }

}
