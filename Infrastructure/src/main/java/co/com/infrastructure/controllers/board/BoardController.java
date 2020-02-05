package co.com.infrastructure.controllers.board;

import co.com.domain.entities.board.Board;
import co.com.domain.usecases.board.BoardUseCase;
import co.com.domain.valueobjects.board.BoardId;
import co.com.infrastructure.adapters.board.BoardAdapter;
import co.com.infrastructure.entities.board.BoardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    private BoardUseCase boardUseCase;

    @Autowired
    private BoardAdapter boardAdapter;

    @RequestMapping("board/{id}")
    public BoardEntity getBoardById(@PathVariable String id) {
        Board board = boardUseCase.getBoardById(BoardId.of(id));
        return boardAdapter.boardToBoardEntity(board);
    }

}
