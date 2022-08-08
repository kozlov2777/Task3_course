package reader;

import souvenir.Souvenir;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reader{
    public List<Souvenir> getSouvenirFromFile(String filename){
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))) {
            return reader.lines().map(Souvenir::of).toList();
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}

