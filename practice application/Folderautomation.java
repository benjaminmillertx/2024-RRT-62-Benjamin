import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MoveJavaFiles {
    public static void main(String[] args) {
        // Define the source and destination folders
        String sourceFolder = "/path/to/source/folder";
        String destinationFolder = "/path/to/destination/folder/Java";

        // Create File objects for source and destination folders
        File sourceDir = new File(sourceFolder);
        File destinationDir = new File(destinationFolder);

        // Ensure that the source folder exists
        if (!sourceDir.exists() || !sourceDir.isDirectory()) {
            System.err.println("Source folder does not exist or is not a directory.");
            return;
        }

        // Ensure that the destination folder exists, create it if necessary
        if (!destinationDir.exists()) {
            destinationDir.mkdirs();
        }

        // Get a list of .java files in the source folder
        File[] javaFiles = sourceDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".java"));

        // Move each .java file to the destination folder
        if (javaFiles != null) {
            for (File javaFile : javaFiles) {
                try {
                    Path sourcePath = javaFile.toPath();
                    Path destinationPath = new File(destinationDir, javaFile.getName()).toPath();
                    Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Moved: " + javaFile.getName());
                } catch (IOException e) {
                    System.err.println("Error moving file: " + javaFile.getName());
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("No .java files found in the source folder.");
        }
    }
}
