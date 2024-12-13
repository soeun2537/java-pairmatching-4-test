package pairmatching.util;

import static pairmatching.constant.InputConstant.*;
import static pairmatching.constant.message.ErrorMessage.*;

import pairmatching.model.Course;
import pairmatching.model.Level;
import pairmatching.model.Mission;

public class Validator {

    private Validator() {
    }

    public static void validateNotNull(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    public static void validateOption(String input) {
        if (!input.matches(OPTION_PATTERN.getContent())) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    public static void validateCharacter(String input) {
        if (!input.matches(CHARACTER_PATTERN.getContent())) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    public static void validateYesOrNo(String input) {
        if (!input.matches(YES_NO_PATTERN.getContent())) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    public static void validateNonExistCourse(String input) {
        Course.findCourse(input);
    }

    public static void validateNonExistLevel(String input) {
        Level.findLevel(input);
    }

    public static void validateNonExistMission(String input) {
        Mission.findMission(input);
    }
}
