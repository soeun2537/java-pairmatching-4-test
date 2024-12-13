package pairmatching.model;

import static pairmatching.constant.message.ErrorMessage.*;

public enum Course {
    백엔드,
    프론트엔드,
    ;

    public static Course findCourse(String input) {
        for (Course course : values()) {
            if (course.name().equals(input)) {
                return course;
            }
        }
        throw new IllegalArgumentException(NOT_FOUND_COURSE.getMessage());
    }
}
