package co.com.taskmanagement.infrastructure.board;

import co.com.taskmanagement.domain.board.Board;
import co.com.taskmanagement.infrastructure.cardlist.CardListAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BoardAdapter {

  @Autowired
  CardListAdapter cardListAdapter;

  public Board boardEntityToBoard(BoardEntity boardEntity) {
    return Board.builder()
        .id(boardEntity.getId())
        .name(boardEntity.getName())
        .description(boardEntity.getDescription())
        .cardLists(cardListAdapter.cardListEntitiesToCardLists(boardEntity.getCardLists()))
        .creationDate(boardEntity.getCreationDate())
        .modificationDate(boardEntity.getModificationDate())
        .build();
  }

  public BoardEntity boardToBoardEntity(Board board) {
    return BoardEntity.builder()
        .name(board.getName())
        .description(board.getDescription())
        .creationDate(board.getCreationDate())
        .modificationDate(board.getModificationDate())
        .build();
  }

  public Board boardRequestDTOToBoard(BoardRequestDTO boardRequestDTO) {
    return Board.builder()
        .name(boardRequestDTO.getName())
        .description(boardRequestDTO.getDescription())
        .build();
  }

  public BoardResponseDTO boardToBoardResponseDTO(Board board) {
    return BoardResponseDTO.builder()
        .id(Optional.ofNullable(board.getId()).orElse(0L))
        .name(board.getName())
        .description(board.getDescription())
        .cardLists(cardListAdapter.cardListsToCardListResponses(board.getCardLists()))
        .build();
  }

}
