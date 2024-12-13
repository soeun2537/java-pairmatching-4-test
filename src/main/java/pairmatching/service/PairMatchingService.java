package pairmatching.service;

import static pairmatching.constant.PathConstant.*;
import static pairmatching.constant.message.ErrorMessage.*;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import pairmatching.model.Course;
import pairmatching.model.Level;
import pairmatching.model.Matching;
import pairmatching.model.Mission;
import pairmatching.repository.MatchingRepository;
import pairmatching.util.FileReader;

public class PairMatchingService {

    private final MatchingRepository matchingRepository;

    public PairMatchingService(MatchingRepository matchingRepository) {
        this.matchingRepository = matchingRepository;
    }

    public Matching match(List<String> courseAndLevelAndMission) {
        Matching matching = Matching.initialize(Course.findCourse(courseAndLevelAndMission.get(0)),
                Level.findLevel(courseAndLevelAndMission.get(1)),
                Mission.findMission(courseAndLevelAndMission.get(2)));

        List<String> crews = returnCrews(matching);
        Queue<String> crewsQueue = new LinkedList<>(Randoms.shuffle(crews));
        List<List<String>> pairs = new ArrayList<>();
        while (!crewsQueue.isEmpty()) {
            List<String> pair = new ArrayList<>();
            if (crewsQueue.size() == 3) {
                handleQueue(crewsQueue, pair);
                handleQueue(crewsQueue, pair);
                handleQueue(crewsQueue, pair);
                pairs.add(pair);
                break;
            }
            handleQueue(crewsQueue, pair);
            handleQueue(crewsQueue, pair);
            pairs.add(pair);
        }
        matching.addPairs(pairs);
        matchingRepository.add(matching);
        return matching;
    }

    private static void handleQueue(Queue<String> queue, List<String> pair) {
        String element = queue.element();
        pair.add(element);
        queue.remove(element);
    }

    private static List<String> returnCrews(Matching matching) {
        if (matching.getCourse().equals(Course.백엔드)) {
            return FileReader.readFile(BACKEND_CREW_FILE_PATH.getPath());
        }
        return FileReader.readFile(FRONTEND_CREW_FILE_PATH.getPath());
    }
}
