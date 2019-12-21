package schedule.io;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import schedule.model.InputData;

public class InputReader {
    public static InputData read(String inputFilePath) throws FileNotFoundException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(inputFilePath), StandardCharsets.UTF_8);
        JsonReader jsonReader = Json.createReader(reader);
        JsonObject inputDataJson = jsonReader.readObject();

        return new InputData(inputDataJson);
    }
}
