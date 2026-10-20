import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Concept 1: File Handling
// This program writes student marks to a text file, adds one more line,
// and then reads the file back line by line.
public class FileHandlingExample {
    public static void main(String[] args) {
        String fileName = "students.txt";

        // 1. Write to a new file (overwrites old content)
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Ram, 78\n");
            writer.write("Sita, 85\n");
            writer.write("Hari, 66\n");
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // 2. Append one more line (true = append mode)
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("Gita, 91\n");
            System.out.println("One more record appended.");
        } catch (IOException e) {
            System.out.println("Error while appending: " + e.getMessage());
        }

        // 3. Read the file line by line
        System.out.println("\nContents of " + fileName + ":");
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count++;
                System.out.println(count + ". " + line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
        System.out.println("Total records read: " + count);
    }
}
