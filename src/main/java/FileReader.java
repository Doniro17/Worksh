import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private File file;
    FileReader (File file) {
        this.file = file;
    }

    private List<String> list = new ArrayList<>();
    private int methodCallCount = 1;

    public List<String> getList() {
        return list;
    }

    public String readLine() throws IOException {

        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            if (!reader.ready()) {
                throw new IOException("Файл пустой");
            }
            String line;
            if (hasMoreLines()) {
                while ((line = reader.readLine()) != null) {
                    list.add(line);
                }
                sb
                        .append(file.getName())
                        .append(" Line ")
                        .append(methodCallCount)
                        .append(": ")
                        .append(list.get(methodCallCount - 1));
                methodCallCount++;
                reader.close();
                return sb.toString();
            } else {
                return "No more lines";
            }
        }catch (IOException e) {
                System.out.println("Файл не найден");
                throw new IOException(e);
        }

    }

    public boolean hasMoreLines() throws IOException {

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            int stringCount = 0;
            while (( reader.readLine()) != null) {
                stringCount++;
            }
            reader.close();
            if (methodCallCount > stringCount) {
                return false;
            } else return true;
        }
    }
}