package co.com.infrastructure.factories.board;

import co.com.domain.entities.board.Board;
import co.com.domain.valueobjects.board.BoardId;
import co.com.infrastructure.entities.board.InfBoard;
import co.com.infrastructure.valueobjects.board.InfBoardId;
import org.springframework.stereotype.Component;

@Component
public class BoardFactory {

    public Board getDomainFromInfrastructureBoard(InfBoard infBoard) {
        return new Board(BoardId.of(infBoard.getInfBoardId().getId()),
                infBoard.getName(),
                infBoard.getDescription(),
                infBoard.getCreationDate(),
                infBoard.getModificationDate(),
                infBoard.getCardId());
    }

    public InfBoard getInfrastructureFromDomainBoard(Board board) {
        return new InfBoard(InfBoardId.of(board.getBoardId().getId()),
                board.getName(),
                board.getDescription(),
                board.getCreationDate(),
                board.getModificationDate(),
                board.getCardId());
    }

}
