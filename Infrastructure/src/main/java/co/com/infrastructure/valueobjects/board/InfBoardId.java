package co.com.infrastructure.valueobjects.board;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class InfBoardId implements Serializable {

    private final String id;

    private InfBoardId(String id) {
        this.id = id;
    }

    public static InfBoardId of(String id) {
        return new InfBoardId(id);
    }

    public String getId() {
        return this.id;
    }

}
