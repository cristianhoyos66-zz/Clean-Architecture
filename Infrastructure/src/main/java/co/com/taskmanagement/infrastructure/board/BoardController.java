package co.com.taskmanagement.infrastructure.board;

import co.com.taskmanagement.domain.board.Board;
import co.com.taskmanagement.domain.board.BoardId;
import co.com.taskmanagement.domain.board.BoardUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BoardController {

  private final BoardUseCase boardUseCase;

  private final BoardAdapter boardAdapter;

  @RequestMapping("board/{id}")
  public BoardEntity getBoardById(@PathVariable String id) {
    Board board = boardUseCase.getBoardById(BoardId.of(id));
    return boardAdapter.boardToBoardEntity(board);
  }

}
