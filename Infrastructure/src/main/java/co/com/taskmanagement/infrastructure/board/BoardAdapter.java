package co.com.taskmanagement.infrastructure.board;

import co.com.taskmanagement.domain.board.Board;
import co.com.taskmanagement.domain.board.BoardId;
import org.springframework.stereotype.Component;

@Component
public class BoardAdapter {

  public Board boardEntityToBoard(BoardEntity boardEntity) {
    return Board.builder()
        .boardId(BoardId.of(boardEntity.getBoardIdEntity().getId()))
        .name(boardEntity.getName())
        .description(boardEntity.getDescription())
        .creationDate(boardEntity.getCreationDate())
        .modificationDate(boardEntity.getModificationDate())
        .cardId(boardEntity.getCardId())
        .build();
  }

  public BoardEntity boardToBoardEntity(Board board) {
    return BoardEntity.builder()
        .boardIdEntity(BoardIdEntity.of(board.getBoardId().getId()))
        .name(board.getName())
        .description(board.getDescription())
        .creationDate(board.getCreationDate())
        .modificationDate(board.getModificationDate())
        .cardId(board.getCardId())
        .build();
  }

}
