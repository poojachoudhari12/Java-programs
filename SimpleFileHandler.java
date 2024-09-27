import java.io.*;

public class SimpleFileHandler {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        try {
            // Get the name of the file from the user
            System.out.print("Enter the filename: ");
            fileName = br.readLine();

            // Attempt to read from the file
            try (FileInputStream fis = new FileInputStream(fileName)) {
                System.out.println("Contents of the file:");
                int byteData;
                while ((byteData = fis.read()) != -1) {
                    System.out.print((char) byteData);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found. It will be created.");
            }

            // Ask user if they want to add content to the file
            System.out.print("\nDo you want to add content to the file? (yes/no): ");
            String response = br.readLine();

            if (response.equalsIgnoreCase("yes")) {
                // Read content from the user
                System.out.print("Enter the content you want to add: ");
                String userInput = br.readLine();

                // Write the data into the file
                try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
                    fos.write(userInput.getBytes());
                    fos.write(System.lineSeparator().getBytes());
                    System.out.println("Data has been added to the file.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
