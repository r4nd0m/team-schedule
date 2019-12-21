package schedule;

import java.io.*;
import java.util.List;

import javafx.util.Pair;
import schedule.io.InputReader;
import schedule.io.OutputWriter;
import schedule.logic.SchedulingLogic;
import schedule.model.*;
import schedule.validation.InputDataValidator;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify path to input data file.");

            return;
        }

        File inputFile = new File(args[0]);
        if (!inputFile.exists()) {
            System.out.printf("Unable to find specified file %s.%n", args[0]);

            return;
        }

        try {
            InputData inputData = InputReader.read(args[0]);

            System.out.println("Input data loaded, validating...");

            Pair<Boolean, List<String>> validationResult = InputDataValidator.validate(inputData);

            if (!validationResult.getKey()) {
                System.out.println("Invalid input data: ");
                validationResult.getValue().forEach(System.out::println);

                return;
            }

            System.out.println("Validation completed, processing...");

            Schedule outputData = SchedulingLogic.createSchedule(inputData);

            if (args.length > 1) {
                OutputWriter.write(outputData, args[1]);
                System.out.printf("Results saved to %s.%n", args[1]);
            } else {
                System.out.println("Output file not specified, results will be printed on the screen.");
                System.out.println(outputData.toOutputString());
            }
        } catch (Exception ex) {
            System.out.printf("Error: %s.%n", ex.getMessage());
        }
    }
}
