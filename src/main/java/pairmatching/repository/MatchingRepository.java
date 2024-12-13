package pairmatching.repository;

import java.util.ArrayList;
import java.util.List;
import pairmatching.model.Matching;

public class MatchingRepository {

    private List<Matching> matchings;

    public void initialize() {
        this.matchings = new ArrayList<>();
    }
}
