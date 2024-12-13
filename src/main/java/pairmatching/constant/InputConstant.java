package pairmatching.constant;

public enum InputConstant {

    OPTION_PATTERN("^(1|2|3|Q)$"),
    YES_NO_PATTERN("^(네|아니오)$"),
    CHARACTER_PATTERN("^[가-힣0-9]+$"),

    INPUT_SEPARATOR(","),
    TRUE_STRING("네"),
    ;

    private final String content;

    InputConstant(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
