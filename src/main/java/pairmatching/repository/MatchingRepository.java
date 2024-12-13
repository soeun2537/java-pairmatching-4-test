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
}
