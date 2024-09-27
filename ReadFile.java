/*Algorithm:
1. Create a class with name ReadFile.
2. Get name of the file from user.
3. Create FileInputStream object. Read and display contents of file using read() method.
4. Ask user if he wants to add contents to the file.
5. If yes then read the contents from the user.
6. Create object of FileOutputStream and write the data into file.
7. If file does not exist then create a new file and store user data into it.
Note: Please follow the naming conventions while writing the program.*/

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Step 2: Get the name of the file from user
            System.out.print("Enter the filename: ");
            String fileName = br.readLine();

            // Step 3: Create FileInputStream object and read contents of the file
            try {
                fis = new FileInputStream(fileName);
                System.out.println("Contents of the file:");

                int byteData;
                while ((byteData = fis.read()) != -1) {
                    System.out.print((char) byteData); // Display as characters
                }
                fis.close(); // Close the input stream
            } catch (FileNotFoundException e) {
                System.out.println("File not found. A new file will be created.");
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }

            // Step 4: Ask user if they want to add contents to the file
            System.out.print("\nDo you want to add content to the file? (yes/no): ");
            String response = br.readLine();

            if (response.equalsIgnoreCase("yes")) {
                // Step 5: Read the contents from the user
                System.out.print("Enter the content you want to add: ");
                String userInput = br.readLine();

                // Step 6: Create object of FileOutputStream and write the data into the file
                fos = new FileOutputStream(fileName, true); // Append mode
                fos.write(userInput.getBytes()); // Write user input to file
                fos.write(System.lineSeparator().getBytes()); // Add new line
                System.out.println("Data has been added to the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
