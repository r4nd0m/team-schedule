package schedule.io;

import schedule.model.Schedule;

import java.io.*;

public class OutputWriter {
    public static void write(Schedule outputData, String outputFilePath) throws IOException {
        File outputFile = new File(outputFilePath);

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        writer.write(outputData.toOutputString());

        writer.close();
    }
}
