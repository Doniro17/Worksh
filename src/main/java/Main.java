import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    /**
     * main project class
     */

    private Main() {
    }

    /**
     *
     */
    public static void main(final String[] args) throws IOException {

        //src/main/resources/text.txt
        File fileExist = new File("Homework3.txt");
        File fileNew = new File("MyHomework.txt");
        fileNew.createNewFile();
        //С помощью Java IO запишите содержимое Homework3.txt в MyHomework.txt как массив байтов

        try (InputStream bufferedStream = new BufferedInputStream(new FileInputStream(fileExist))) {
            byte[] bytes = new byte[(int) fileExist.length()];
            bufferedStream.read(bytes);


            try (PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileNew), StandardCharsets.UTF_8))) {

                String name = "Афанасьев";
                printWriter.println(new String((bytes), StandardCharsets.UTF_8));
                printWriter.println(new String(name.getBytes(), StandardCharsets.UTF_8));
                printWriter.flush();
            }
        }
        Example example = new Example();
        FileReader fileReader = new FileReader(fileExist);

        System.out.println(example.getLongestLineCharsCount(fileReader));

    }
}