package co.com.domain.entities.board;

import co.com.domain.valueobjects.board.BoardId;

import java.util.Date;

public class Board {

    private BoardId boardId;
    private String name;
    private String description;
    private Date creationDate;
    private Date modificationDate;
    private String cardId;

    public Board() {
    }

    public Board(BoardId boardId, String name, String description, Date creationDate, Date modificationDate, String cardId) {
        this.boardId = boardId;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.cardId = cardId;
    }

    public BoardId getBoardId() {
        return boardId;
    }

    public void setBoardId(BoardId boardId) {
        this.boardId = boardId;
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
