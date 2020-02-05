package co.com.infrastructure.adapters.board;

import co.com.domain.entities.board.Board;
import co.com.domain.valueobjects.board.BoardId;
import co.com.infrastructure.entities.board.BoardEntity;
import co.com.infrastructure.valueobjects.board.InfBoardId;
import org.springframework.stereotype.Component;

@Component
public class BoardAdapter {

    public Board boardEntityToBoard(BoardEntity boardEntity) {
        return new Board(BoardId.of(boardEntity.getInfBoardId().getId()),
                boardEntity.getName(),
                boardEntity.getDescription(),
                boardEntity.getCreationDate(),
                boardEntity.getModificationDate(),
                boardEntity.getCardId());
    }

    public BoardEntity boardToBoardEntity(Board board) {
        return new BoardEntity(InfBoardId.of(board.getBoardId().getId()),
                board.getName(),
                board.getDescription(),
                board.getCreationDate(),
                board.getModificationDate(),
                board.getCardId());
    }

}
