package co.com.domain.adapters.board;

import co.com.domain.entities.board.Board;
import co.com.domain.valueobjects.board.BoardId;

public interface BoardGateway {

    Board getBoardById(BoardId boardId);

}
