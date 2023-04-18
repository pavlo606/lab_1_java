package ua.lviv.iot.algo.part1.lab3.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import ua.lviv.iot.algo.part1.lab3.Insect;
import ua.lviv.iot.algo.part1.lab3.InsectManager;

public class InsectWriter {
    public final void writeToFile(final List<Insect> insects) {
        InsectManager manager = new InsectManager(insects);
        List<Insect> sortedInsects = manager.sortInsects();

        try (FileWriter fileWriter = new FileWriter("result.csv")) {
            Insect lastInsect = sortedInsects.get(0);
            fileWriter.write(lastInsect.getHeaders() + '\n');

            for (Insect insect: sortedInsects) {
                if (lastInsect.getClass() != insect.getClass()) {
                    fileWriter.write(insect.getHeaders() + '\n');
                }
                fileWriter.write(insect.getCSV() + '\n');

                lastInsect = insect;
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
