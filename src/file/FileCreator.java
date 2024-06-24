package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator implements FileSystem {

    /**
     * logic for create file
     */
    @Override
    public void execute() throws IOException {
        File file = new File("/home/nsakhi/downloads");
        boolean created = file.createNewFile();
        if (created) {
            System.out.println("success!!");
        }

        Path path = Files.createFile(Path.of("home/nsakhi", "asd.txt"));

    }
}
