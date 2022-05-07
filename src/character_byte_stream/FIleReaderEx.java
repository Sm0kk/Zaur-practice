package character_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderEx {
    public static void main(String[] args) throws IOException {

        try (FileReader reader = new FileReader("test2.rtf")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        }
    }
}
