package pairmatching.constant.message;

public enum OutputMessage {
    OPTION_GUIDANCE("기능을 선택하세요."),
    OPTION_ONE_GUIDANCE("1. 페어 매칭"),
    OPTION_TWO_GUIDANCE("2. 페어 조회"),
    OPTION_THREE_GUIDANCE("3. 페어 초기화"),
    OPTION_Q_GUIDANCE("Q. 종료"),

    LINE("#############################################"),
    COURSE_GUIDANCE("과정: 백엔드 | 프론트엔드"),
    MISSION_GUIDANCE("미션:"),
    LEVEL_ONE_GUIDANCE("  - 레벨1: 자동차경주 | 로또 | 숫자야구게임"),
    LEVEL_TWO_GUIDANCE("  - 레벨2: 장바구니 | 결제 | 지하철노선도"),
    LEVEL_THREE_GUIDANCE("  - 레벨3:"),
    LEVEL_FOUR_GUIDANCE("  - 레벨4: 성능개선 | 배포"),
    LEVEL_FIVE_GUIDANCE("  - 레벨5:"),

    COURSE_LEVEL_MISSION_GUIDANCE("과정, 레벨, 미션을 선택하세요."),
    COURSE_LEVEL_MISSION_EXAMPLE_GUIDANCE("ex) 백엔드, 레벨1, 자동차경주"),

    RESULT_GUIDANCE("페어 매칭 결과입니다."),
    RESULT_TWO("%s : %s"),
    RESULT_THREE("%s : %s : %s"),

    EXIST_MATCHING_GUIDANCE("매칭 정보가 있습니다. 다시 매칭하시겠습니까?"),
    EXIST_MATCHING_EXAMPLE_GUIDANCE("네 | 아니오"),

    RESET_GUIDANCE("초기화 되었습니다."),
    ;

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage(Object... args) {
        return String.format(message, args);
    }
}
