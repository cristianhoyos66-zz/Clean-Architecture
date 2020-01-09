package co.com.domain.usecases.board;

import co.com.domain.adapters.board.BoardAdapter;
import co.com.domain.entities.board.Board;
import co.com.domain.valueobjects.board.BoardId;

public class BoardUseCase {

    private BoardAdapter boardAdapter;

    public BoardUseCase(BoardAdapter boardAdapter) {
        this.boardAdapter = boardAdapter;
    }

    public Board getBoardById(BoardId boardId) {
        return boardAdapter.getBoardById(boardId);
    }

}
