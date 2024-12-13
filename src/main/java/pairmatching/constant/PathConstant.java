package pairmatching.constant;

public enum PathConstant {

    BACKEND_CREW_FILE_PATH("/backend-crew.md"),
    FRONTEND_CREW_FILE_PATH("/frontend-crew.md"),
    ;

    private final String path;

    PathConstant(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
