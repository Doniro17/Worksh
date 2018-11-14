import java.io.File;
import java.io.IOException;

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


    }
}
