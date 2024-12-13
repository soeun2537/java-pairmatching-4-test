package pairmatching.util;

import static pairmatching.constant.InputConstant.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    private Parser() {
    }

    public static List<String> separateBySeparator(String input, String separator) {
        return Arrays.stream(input.split(separator))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public static boolean parseBoolean(String input) {
        return TRUE_STRING.getContent().equalsIgnoreCase(input);
    }
}
