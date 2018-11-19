import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExampleTest {

    @Test
    public void getLongestLineCharsCountTest() throws IOException {

        int expected = 8;
        FileReader mockReader = mock(FileReader.class);
        when(mockReader.readLine()).thenReturn("example", "example1", "exampe");
        when(mockReader.hasMoreLines()).thenReturn(true, true, true, false);
        Example example = new Example();
        int actual = example.getLongestLineCharsCount(mockReader);
        assertEquals(expected, actual);
    }
    @Test
    public void getLongestLineCharsCountTestEmpty() throws IOException {

        int expected = 0;
        FileReader mockReader = mock(FileReader.class);
        when(mockReader.readLine()).thenReturn("", "", "");
        when(mockReader.hasMoreLines()).thenReturn(true, true, true, false);
        Example example = new Example();
        int actual = example.getLongestLineCharsCount(mockReader);
        assertEquals(expected, actual);
    }
    @Test (expected = IOException.class)
    public void getLongestLineCharsCountTestEmpt() throws IOException {

        int expected = 0;
        File file = new File("src/test/resources/example2");
        FileReader reader = new FileReader(file);
        Example example = new Example();
    }
}