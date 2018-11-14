import java.io.IOException;

public class Example {

    public int getLongestLineCharsCount (FileReader reader, String path) throws IOException {
        int maxLength = -1;
        while (reader.readLine(path).equals("No more lines")) {
            if (reader.readLine(path).length() > maxLength) {
                maxLength = reader.readLine(path).length();
                System.out.println(reader.readLine(path));
            }
        }
        System.out.println(reader.readLine(path));

        return maxLength;
    }
}
