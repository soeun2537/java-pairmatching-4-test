package pairmatching.repository;

import static pairmatching.constant.message.ErrorMessage.*;

import java.util.ArrayList;
import java.util.List;
import pairmatching.model.Matching;

public class MatchingRepository {

    private List<Matching> matchings;

    public void initialize() {
        this.matchings = new ArrayList<>();
    }

    public void add(Matching matching) {
        matchings.add(matching);
    }

    public boolean isExist(List<String> courseAndLevelAndMission) {
        for (Matching matching : matchings) {
            if (matching.getCourse().name().equals(courseAndLevelAndMission.get(0)) &&
                    matching.getLevel().name().equals(courseAndLevelAndMission.get(1)) &&
                    matching.getMission().name().equals(courseAndLevelAndMission.get(2))) {
                return true;
            }
        }
        return false;
    }

    public Matching findMatching(List<String> courseAndLevelAndMission) {
        for (Matching matching : matchings) {
            if (matching.getCourse().name().equals(courseAndLevelAndMission.get(0)) &&
                    matching.getLevel().name().equals(courseAndLevelAndMission.get(1)) &&
                    matching.getMission().name().equals(courseAndLevelAndMission.get(2))) {
                return matching;
            }
        }
        throw new IllegalArgumentException(NOT_FOUND_RECORD.getMessage());
    }

    public void remove(List<String> courseAndLevelAndMission) {
        matchings.remove(findMatching(courseAndLevelAndMission));
    }

    public void reset() {
        matchings = new ArrayList<>();
    }
}
