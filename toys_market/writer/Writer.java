package writer;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Queue;

import toys.Toy;

public class Writer {

    public void writeToys(List<Toy> toys) {
    try(FileWriter  writer = new FileWriter("output.txt")){

        for(Toy toy : toys) {
         String id = toy.getId();    
        String name = toy.getName();
        int weight = toy.getWeight();
        writer.write(id + " " + name + " " + weight + System.getProperty("line.separator"));
        
        }
        writer.close();
        } catch (IOException e) {
             e.printStackTrace();
        }
    }       

    
}
