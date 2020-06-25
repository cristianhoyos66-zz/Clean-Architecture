package co.com.taskmanagement.infrastructure.board;


import co.com.taskmanagement.domain.board.BoardPort;
import co.com.taskmanagement.domain.board.Board;
import co.com.taskmanagement.domain.board.BoardId;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BoardService implements BoardPort {

  private final BoardRepository boardRepository;
  private final BoardAdapter boardAdapter;

  @Override
  public Board getBoardById(BoardId boardId) {
    BoardEntity boardEntity = boardRepository.findById(BoardIdEntity.of(boardId.getId())).orElse(null);
    return boardAdapter.boardEntityToBoard(boardEntity);
  }
}
