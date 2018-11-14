import java.io.*;

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
            bufferedStream.close();

            try (PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileNew), "utf-8"))) {

                String name = "Афанасьев";
                printWriter.println(new String((bytes), "utf-8"));
                printWriter.println(new String(name.getBytes(), "utf-8"));

                printWriter.flush();
                printWriter.close();
            }
        }
        FileReader reader = new FileReader();

        Example example = new Example();
        System.out.println(example.getLongestLineCharsCount(reader, "Homework3.txt"));

       /* System.out.println(reader.readLine("Homework3.txt"));
        System.out.println(reader.readLine("Homework3.txt"));
        System.out.println(reader.readLine("Homework3.txt"));
        System.out.println(reader.readLine("Homework3.txt"));*/

    }
}