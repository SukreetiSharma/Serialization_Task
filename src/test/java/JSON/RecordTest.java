package JSON;

import com.google.gson.Gson;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class RecordTest {
    @Test
    public void details() throws FileNotFoundException {
    Gson gson = new Gson();
    File inputJsonFile = new File(System.getProperty("user.dir") + "/src/test/java/JSON/Data.json");
    FileReader fileReader = new FileReader(inputJsonFile);
    Records record = gson.fromJson(fileReader, Records.class);
    System.out.println("isbn :"+record.getIsbn());
    System.out.println("LastName :"+ record.getLastname());
    System.out.println("FirstName :"+ record.getFirstname());
    System.out.println("Author Detail :" + record.getAuthorDetail());
    System.out.println("category :"+ record.getCategory());
    }
}
