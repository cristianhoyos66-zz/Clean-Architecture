package co.com.domain.usecases.board;

import co.com.domain.adapters.board.BoardGateway;
import co.com.domain.entities.board.Board;
import co.com.domain.valueobjects.board.BoardId;

public class BoardUseCase {

    private BoardGateway boardGateway;

    public BoardUseCase(BoardGateway boardGateway) {
        this.boardGateway = boardGateway;
    }

    public Board getBoardById(BoardId boardId) {
        return boardGateway.getBoardById(boardId);
    }

}
