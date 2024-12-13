package pairmatching.util;

import static pairmatching.constant.message.ErrorMessage.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private FileReader() {
    }

    public static List<String> readFile(String resourcePath) {
        try (BufferedReader reader = createReader(resourcePath)) {
            return readLines(reader);
        } catch (IOException e) {
            throw new IllegalStateException(NOT_FOUND_FILE.getMessage());
        }
    }

    private static BufferedReader createReader(String resourcePath) {
        InputStream inputStream = FileReader.class.getResourceAsStream(resourcePath);
        if (inputStream == null) {
            throw new IllegalStateException(NOT_FOUND_FILE.getMessage());
        }
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private static List<String> readLines(BufferedReader reader) throws IOException {
        List<String> lines = new ArrayList<>();
        reader.readLine();

        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }
}
