package pairmatching.model;

import static pairmatching.constant.message.ErrorMessage.*;

public enum Mission {
    자동차경주(Level.레벨1),
    로또(Level.레벨1),
    숫자야구게임(Level.레벨1),
    장바구니(Level.레벨2),
    결제(Level.레벨2),
    지하철노선도(Level.레벨2),
    성능개선(Level.레벨4),
    배포(Level.레벨4),
    ;

    private final Level level;

    Mission(Level level) {
        this.level = level;
    }

    public static Mission findMission(String input) {
        for (Mission mission : values()) {
            if (mission.name().equals(input)) {
                return mission;
            }
        }
        throw new IllegalArgumentException(NOT_FOUND_MISSION.getMessage());
    }
}
