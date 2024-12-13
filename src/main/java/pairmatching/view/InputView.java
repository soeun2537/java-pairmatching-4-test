package pairmatching.view;

import static pairmatching.constant.InputConstant.*;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import pairmatching.util.Parser;
import pairmatching.util.Validator;

public class InputView {

    public static String readOption() {
        String input = input();
        Validator.validateNotNull(input);
        Validator.validateOption(input);
        return input;
    }

    public static List<String> readCourseAndLevelAndMission() {
        String input = input();
        List<String> courseAndLevelAndMission = Parser.separateBySeparator(input, INPUT_SEPARATOR.getContent());
        for (String entry : courseAndLevelAndMission) {
            Validator.validateNotNull(entry);
            Validator.validateCharacter(entry);
        }
        Validator.validateNonExistCourse(courseAndLevelAndMission.get(0));
        Validator.validateNonExistLevel(courseAndLevelAndMission.get(1));
        Validator.validateNonExistMission(courseAndLevelAndMission.get(2));
        return courseAndLevelAndMission;
    }

    public static boolean readExist() {
        String input = input();
        Validator.validateNotNull(input);
        Validator.validateYesOrNo(input);
        return Parser.parseBoolean(input);
    }

    private static String input() {
        return Console.readLine();
    }
}
