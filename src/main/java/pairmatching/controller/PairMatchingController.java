package pairmatching.controller;

import java.util.List;
import java.util.Optional;
import pairmatching.model.Matching;
import pairmatching.service.PairMatchingService;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingController {

    private final PairMatchingService pairMatchingService;

    public PairMatchingController(PairMatchingService pairMatchingService) {
        this.pairMatchingService = pairMatchingService;
    }

    public void run() {
        while (true) {
            Optional<String> option = returnOption();
            if (!option.isPresent()) {
                break;
            }
            if (option.get().equals("1")) {
                optionOne();
                continue;
            }
            if (option.get().equals("2")) {
                if (optionTwo()) {
                    break;
                }
                continue;
            }
            if (option.get().equals("3")) {
                optionThree();
                continue;
            }
            if (option.get().equals("Q")) {
                break;
            }
        }
    }

    private void optionOne() {
        OutputView.printInformationGuidance();
        while (true) {
            Optional<List<String>> courseAndLevelAndMission = returnCourseAndLevelAndMission();
            if (!courseAndLevelAndMission.isPresent()) {
                break;
            }
            if (checkExist(courseAndLevelAndMission)) {
                continue;
            }
            Matching matching = pairMatchingService.match(courseAndLevelAndMission.get());
            OutputView.printMatching(matching);
            break;
        }
    }

    private boolean checkExist(Optional<List<String>> courseAndLevelAndMission) {
        if (pairMatchingService.isExist(courseAndLevelAndMission.get())) {
             if (!returnExist()) {
                 return true;
             }
             pairMatchingService.remove(courseAndLevelAndMission.get());
         }
        return false;
    }

    private boolean optionTwo() {
        OutputView.printInformationGuidance();
        Optional<List<String>> courseAndLevelAndMission = returnCourseAndLevelAndMission();
        if (!courseAndLevelAndMission.isPresent()) {
            return true;
        }
        Matching matching = pairMatchingService.findMatching(courseAndLevelAndMission.get());
        OutputView.printMatching(matching);
        return false;
    }

    private void optionThree() {
        OutputView.printResetGuidance();
        pairMatchingService.resetMatching();
    }

    private Optional<String> returnOption() {
        for (int attempt = 0; attempt < 3; attempt++) {
            try {
                OutputView.printOptionGuidance();
                return Optional.of(InputView.readOption());
            } catch (RuntimeException e) {
                OutputView.printErrorMessage(e);
            }
        }
        return Optional.empty();
    }

    private Optional<List<String>> returnCourseAndLevelAndMission() {
        for (int attempt = 0; attempt < 3; attempt++) {
            try {
                OutputView.printCourseAndLeveAndMissionGuidance();
                return Optional.of(InputView.readCourseAndLevelAndMission());
            } catch (RuntimeException e) {
                OutputView.printErrorMessage(e);
            }
        }
        return Optional.empty();
    }

    private Boolean returnExist() {
        for (int attempt = 0; attempt < 3; attempt++) {
            try {
                OutputView.printExistGuidance();
                return InputView.readExist();
            } catch (RuntimeException e) {
                OutputView.printErrorMessage(e);
            }
        }
        return false;
    }
}
