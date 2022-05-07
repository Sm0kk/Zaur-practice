package character_byte_stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Hello World.\n"
                + "Hello mate.\n"
                + "Hello programing\n";
        String s = "Hello!";
         FileWriter writer = null;
        try {
            writer = new FileWriter("Test2.rtf", true);
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}
