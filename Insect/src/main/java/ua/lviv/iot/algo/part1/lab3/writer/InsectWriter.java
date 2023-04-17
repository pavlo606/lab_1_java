package ua.lviv.iot.algo.part1.lab3.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import ua.lviv.iot.algo.part1.lab3.*;

public class InsectWriter {
    public void writeToFile(final List<Insect> insects) throws IOException{
        InsectManager manager = new InsectManager(insects);
        List<Insect> sortedInsects = manager.sortInsects();
        
        try (FileWriter fileWriter = new FileWriter("result.csv");) {
            Insect lastInsect = sortedInsects.get(0);
            fileWriter.write(lastInsect.getHeaders() + '\n');

            for (Insect insect: sortedInsects) {
                if (lastInsect.getClass() != insect.getClass()) {
                    fileWriter.write(insect.getHeaders() + '\n');
                }
                fileWriter.write(insect.getCSV() + '\n');
                System.out.println("Wrote to file " + insect.getCSV());

                lastInsect = insect;
            }
            
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
    }
}
