package co.com.domain.valueobjects.board;

public class BoardId {

    private final String id;

    private BoardId(String id) {
        this.id = id;
    }

    public static BoardId of(String id) {
        return new BoardId(id);
    }

    public String getId() {
        return this.id;
    }

}
