package pairmatching.model;

import java.util.ArrayList;
import java.util.List;

public class Matching {

    private Course course;
    private Level level;
    private Mission mission;
    private List<List<String>> pairs;

    private Matching(Course course, Level level, Mission mission, List<List<String>> pairs) {
        this.course = course;
        this.level = level;
        this.mission = mission;
        this.pairs = pairs;
    }

    public static Matching initialize(Course course, Level level, Mission mission) {
        return new Matching(course, level, mission, new ArrayList<>());
    }

    public void addPairs(List<List<String>> pairs) {
        this.pairs = pairs;
    }

    public Course getCourse() {
        return course;
    }

    public Level getLevel() {
        return level;
    }

    public Mission getMission() {
        return mission;
    }

    public List<List<String>> getPairs() {
        return pairs;
    }
}
