package co.com.taskmanagement.domain.board;

public interface BoardOutputPort {
  Board getBoardById(Long boardId);
  Board createBoard(Board board);
}
