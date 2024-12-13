package pairmatching.constant.message;

public enum ErrorMessage {

    INVALID_FORMAT("올바르지 않은 형식으로 입력했습니다. 다시 입력해 주세요."),
    NOT_FOUND_COURSE("존재하지 않는 과정입니다. 다시 입력해 주세요."),
    NOT_FOUND_LEVEL("존재하지 않는 레벨입니다. 다시 입력해 주세요."),
    NOT_FOUND_MISSION("존재하지 않는 미션입니다. 다시 입력해 주세요."),
    NOT_FOUND_RECORD("매칭 이력이 없습니다."),
    NOT_FOUND_FILE("파일을 찾을 수 없습니다."),
    ;

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
