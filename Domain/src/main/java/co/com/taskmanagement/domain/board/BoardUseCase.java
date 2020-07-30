package co.com.taskmanagement.domain.board;

import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "of")
public class BoardUseCase implements BoardInputPort {

  private BoardOutputPort boardOutputPort;

  @Override
  public Board getBoardById(Long boardId) {
    return boardOutputPort.getBoardById(boardId);
  }

  @Override
  public Board createBoard(Board board) {
    return boardOutputPort.createBoard(board);
  }

}
