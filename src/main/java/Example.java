import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {

    public int getLongestLineCharsCount (FileReader reader) throws IOException {
        int maxLength = -1;
        List<String> list = new ArrayList<>();
        int n = 0;

        while (reader.hasMoreLines()) {
            list.add(reader.readLine());
        }
        for (String aList : list) {
            if (aList.length() > maxLength) {
                maxLength = aList.length();
            }
        }
        return maxLength;
    }
}
