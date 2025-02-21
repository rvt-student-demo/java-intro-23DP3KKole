package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import org.apache.http.message.BufferedHeader;

public class Helper{

    public static BufferedReader getReader(String filename) throws IOException{
        return Files.newBufferedReader(getFilePath(filename));
    }

    public static BufferedWriter getWriter(String filename, StandardOpenOption option) throws IOException{
        return Files.newBufferedWriter(getFilePath(filename), option);
    }

    private static Path getFilePath(String filename) throws FileNotFoundException{
        Path filePath = Paths.get("data", filename);
        if (!Files.exists(filePath)){
            throw new FileNotFoundException("File not found: " + filename);
        }
        return filePath;
    }
    
    public static ArrayList<Person> getPersonList() throws Exception{
        
        
        BufferedReader reader = Helper.getReader("persons.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String line;

        reader.readLine();
        while ((line = reader.readLine()) != null){
            String[] parts = line.split(", ");

            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            int weight = Integer.valueOf(parts[2]);
            int height = Integer.valueOf(parts[3]);
            String address = parts[4];

            Person person = new Person(name, age, weight, height, address);
            personList.add(person);
        }
        return personList;
    }
}