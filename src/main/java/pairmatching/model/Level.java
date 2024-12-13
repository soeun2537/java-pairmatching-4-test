package pairmatching.model;

import static pairmatching.constant.message.ErrorMessage.*;

public enum Level {
    레벨1,
    레벨2,
    레벨3,
    레벨4,
    레벨5,
    ;

    public static Level findLevel(String input) {
        for (Level level : values()) {
            if (level.name().equals(input)) {
                return level;
            }
        }
        throw new IllegalArgumentException(NOT_FOUND_LEVEL.getMessage());
    }
}
