import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private File file;
    private List<String> list = new ArrayList<>();
    private int methodCallCount = 1;

    private FileReader() {

    }

    public FileReader(File file) throws IOException {
        this.file = file;
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            if (!reader.ready()) {
                throw new IOException("Файл пустой");
            }
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        }
    }

    public List<String> getList() {
        return list;
    }

    public String readLine() throws IOException {

        if (hasMoreLines()) {
            StringBuilder sb = new StringBuilder();
            sb
                    .append(file.getName())
                    .append(" Line ")
                    .append(methodCallCount)
                    .append(": ")
                    .append(list.get(methodCallCount - 1));
            methodCallCount++;
            return sb.toString();
        } else {
            return "No more lines";
        }
    }

    public boolean hasMoreLines() throws IOException {

        if (methodCallCount > list.size()) {
            return false;
        } else return true;
    }
}