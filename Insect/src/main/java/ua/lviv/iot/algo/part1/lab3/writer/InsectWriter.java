package ua.lviv.iot.algo.part1.lab3.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import ua.lviv.iot.algo.part1.lab3.Insect;
import ua.lviv.iot.algo.part1.lab3.manager.InsectManager;

public class InsectWriter {
    private static final String RESULT_FILE = "result.csv";

    public final void writeToFile(final List<Insect> insects) {
        if (insects.size() == 0) {
            return;
        }

        InsectManager manager = new InsectManager(insects);
        List<Insect> sortedInsects = manager.sortInsects();

        try (FileWriter fileWriter = new FileWriter(RESULT_FILE)) {
            Insect lastInsect = sortedInsects.get(0);
            fileWriter.write(lastInsect.getHeaders() + '\n');

            for (Insect insect: sortedInsects) {
                if (lastInsect.getClass() != insect.getClass()) {
                    fileWriter.write(insect.getHeaders() + '\n');
                }
                fileWriter.write(insect.getCSV() + '\n');

                lastInsect = insect;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
