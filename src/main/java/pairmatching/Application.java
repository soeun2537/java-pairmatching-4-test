package pairmatching;

import pairmatching.controller.PairMatchingController;
import pairmatching.repository.MatchingRepository;
import pairmatching.service.PairMatchingService;

public class Application {
    public static void main(String[] args) {
        MatchingRepository matchingRepository = new MatchingRepository();
        matchingRepository.initialize();
        PairMatchingService pairMatchingService = new PairMatchingService(matchingRepository);
        PairMatchingController pairMatchingController = new PairMatchingController(pairMatchingService);
        pairMatchingController.run();
    }
}
