package co.com.taskmanagement.domain.board;

import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "of")
public class BoardUseCase {

  private BoardPort boardPort;

  public Board getBoardById(BoardId boardId) {
    return boardPort.getBoardById(boardId);
  }

}
