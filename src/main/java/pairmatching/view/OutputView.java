package pairmatching.view;

import static pairmatching.constant.message.OutputMessage.*;

import java.util.List;
import pairmatching.model.Matching;

public class OutputView {

    public static void printOptionGuidance() {
        println(OPTION_GUIDANCE.getMessage());
        println(OPTION_ONE_GUIDANCE.getMessage());
        println(OPTION_TWO_GUIDANCE.getMessage());
        println(OPTION_THREE_GUIDANCE.getMessage());
        println(OPTION_Q_GUIDANCE.getMessage());
    }

    public static void printInformationGuidance() {
        printNewLine();
        println(LINE.getMessage());
        println(COURSE_GUIDANCE.getMessage());
        println(MISSION_GUIDANCE.getMessage());
        println(LEVEL_ONE_GUIDANCE.getMessage());
        println(LEVEL_TWO_GUIDANCE.getMessage());
        println(LEVEL_THREE_GUIDANCE.getMessage());
        println(LEVEL_FOUR_GUIDANCE.getMessage());
        println(LEVEL_FIVE_GUIDANCE.getMessage());
        println(LINE.getMessage());
    }

    public static void printCourseAndLeveAndMissionGuidance() {
        printNewLine();
        println(COURSE_LEVEL_MISSION_GUIDANCE.getMessage());
        println(COURSE_LEVEL_MISSION_EXAMPLE_GUIDANCE.getMessage());
    }

    public static void printExistGuidance() {
        printNewLine();
        println(EXIST_MATCHING_GUIDANCE.getMessage());
        println(EXIST_MATCHING_EXAMPLE_GUIDANCE.getMessage());
    }

    public static void printMatching(Matching matching) {
        printNewLine();
        println(RESULT_GUIDANCE.getMessage());
        for (List<String> pair : matching.getPairs()) {
            if (pair.size() == 3) {
                println(RESULT_THREE.getMessage(pair.get(0), pair.get(1), pair.get(2)));
                continue;
            }
            println(RESULT_TWO.getMessage(pair.get(0), pair.get(1)));
        }
        printNewLine();
    }

    public static void printResetGuidance() {
        printNewLine();
        println(RESET_GUIDANCE.getMessage());
        printNewLine();
    }

    public static void printErrorMessage(RuntimeException e) {
        printNewLine();
        println(e.getMessage());
    }

    private static void println(String content) {
        System.out.println(content);
    }

    private static void printNewLine() {
        System.out.print(System.lineSeparator());
    }
}
