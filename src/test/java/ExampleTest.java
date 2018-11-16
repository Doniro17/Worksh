import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExampleTest {

    @Test
    public void getLongestLineCharsCountTest() throws IOException {

        int expected = 8;
        FileReader mockReader = mock(FileReader.class);
        when(mockReader.readLine()).thenReturn("exmple", "examphjт", "wer");
        when(mockReader.hasMoreLines()).thenReturn(true, true, true, false);
        Example example = new Example();
        int actual = example.getLongestLineCharsCount(mockReader);
        assertEquals(expected, actual);


    }
}