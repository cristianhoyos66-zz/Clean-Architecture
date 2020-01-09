package co.com.infrastructure.controllers.board;

import co.com.domain.entities.board.Board;
import co.com.domain.usecases.board.BoardUseCase;
import co.com.domain.valueobjects.board.BoardId;
import co.com.infrastructure.entities.board.InfBoard;
import co.com.infrastructure.factories.board.BoardFactory;
import co.com.infrastructure.services.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardFactory boardFactory;

    @RequestMapping("board/{id}")
    public InfBoard getBoardById(@PathVariable String id) {
        Board board = new BoardUseCase(boardService).getBoardById(BoardId.of(id));
        return boardFactory.getInfrastructureFromDomainBoard(board);
    }

}
