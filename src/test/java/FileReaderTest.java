import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {

    @org.junit.Test
    public void readLineTest() throws IOException {

        String expected = "example Line 2: А может и нет";
        File file = new File("src/test/resources/example");
        FileReader reader = new FileReader(file);
        reader.readLine();
        String actual = reader.readLine();
        assertEquals(expected, actual);
    }
}