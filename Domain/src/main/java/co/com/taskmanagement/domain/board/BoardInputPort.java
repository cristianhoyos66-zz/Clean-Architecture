package co.com.taskmanagement.domain.board;

public interface BoardInputPort {

  Board getBoardById(Long boardId);
  Board createBoard(Board board);

}
