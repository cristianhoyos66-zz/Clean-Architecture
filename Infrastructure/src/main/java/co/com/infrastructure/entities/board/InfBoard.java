package co.com.infrastructure.entities.board;

import co.com.infrastructure.valueobjects.board.InfBoardId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class InfBoard {

    @EmbeddedId
    private InfBoardId infBoardId;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Date creationDate;
    @Column
    private Date modificationDate;
    @Column
    private String cardId;

    public InfBoard() {
    }

    public InfBoard(InfBoardId infBoardId, String name, String description, Date creationDate, Date modificationDate, String cardId) {
        this.infBoardId = infBoardId;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.cardId = cardId;
    }

    public InfBoardId getInfBoardId() {
        return infBoardId;
    }

    public void setBoardId(InfBoardId infBoardId) {
        this.infBoardId = infBoardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

}
