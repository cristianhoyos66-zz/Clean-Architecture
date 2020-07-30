package co.com.taskmanagement.infrastructure.board;


import co.com.taskmanagement.domain.board.Board;
import co.com.taskmanagement.domain.board.BoardOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BoardService implements BoardOutputPort {

  private final BoardRepository boardRepository;
  private final BoardAdapter boardAdapter;

  @Override
  public Board getBoardById(Long boardId) {
    BoardEntity boardEntity = boardRepository.findById(boardId).orElse(BoardEntity.builder().build());
    return boardAdapter.boardEntityToBoard(boardEntity);
  }

  @Override
  public Board createBoard(Board board) {
    BoardEntity boardEntityToSave = boardAdapter.boardToBoardEntity(board);
    BoardEntity savedBoardEntity = boardRepository.save(boardEntityToSave);
    return boardAdapter.boardEntityToBoard(savedBoardEntity);
  }
}
