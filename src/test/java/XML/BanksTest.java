package XML;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.testng.annotations.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
public class BanksTest {
    @Test
    public  void xmlToString() throws Exception {
        XmlMapper xml = new XmlMapper();
        String readContent = new String(Files.readAllBytes(Paths.get("C:\\Users\\SukreetiSharma\\Documents\\GitHub\\Serialization_Task\\src\\test\\java\\XML\\Data.xml")));
        Bank BanksData = xml.readValue(readContent, Bank.class);
        System.out.println("ID = " + BanksData.getId());
        System.out.println("Name = " + BanksData.getName());
        System.out.println("Headquarter = " + BanksData.getHeadquarter());
    }

}
