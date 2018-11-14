import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader {

    private int methodCallCount = 1;

    public String readLine(String path) throws IOException {
        File file = new File(path);
        StringBuilder sb = new StringBuilder();
        int stringCount = 0;
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(path))) {
            String line;
            if (hasMoreLines(methodCallCount, path)) {
                while ((line = reader.readLine()) != null) {
                    if (stringCount == methodCallCount - 1) {
                        break;
                    }
                    stringCount++;
                }
                methodCallCount++;
                sb
                        .append(file.getName())
                        .append(" Line ")
                        .append(stringCount+1)
                        .append(": ")
                        .append(line);
                reader.close();
                return sb.toString();
            } else {
                return "No more lines";
            }
        }

    }

    private boolean hasMoreLines(int count, String path) throws IOException {
        File file = new File(path);
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(path))) {
            String str;
            int stringCount = 0;
            while ((str = reader.readLine()) != null) {
                stringCount++;
            }
            reader.close();
            if (count > stringCount) {
                return false;
            } else return true;
        }
    }
}