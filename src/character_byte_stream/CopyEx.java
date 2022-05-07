package character_byte_stream;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/Mykola/Desktop/Screenshot 2022-05-02 at 14.15.24.png"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("24.png"))
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
//            String line;
//            while ((line = reader.readLine()) != null) {
//                writer.write(line);
//                writer.write('\n');
//            }
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
