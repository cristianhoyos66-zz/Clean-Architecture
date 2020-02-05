package co.com.infrastructure.services.board;


import co.com.domain.adapters.board.BoardGateway;
import co.com.domain.entities.board.Board;
import co.com.domain.valueobjects.board.BoardId;
import co.com.infrastructure.entities.board.BoardEntity;
import co.com.infrastructure.adapters.board.BoardAdapter;
import co.com.infrastructure.repositories.board.BoardRepository;
import co.com.infrastructure.valueobjects.board.InfBoardId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements BoardGateway {

    private BoardRepository boardRepository;
    private BoardAdapter boardAdapter;

    @Autowired
    public BoardService(BoardRepository boardRepository, BoardAdapter boardAdapter) {
        this.boardRepository = boardRepository;
        this.boardAdapter = boardAdapter;
    }

    @Override
    public Board getBoardById(BoardId boardId) {
        BoardEntity boardEntity = boardRepository.findById(InfBoardId.of(boardId.getId())).orElse(null);
        return boardAdapter.boardEntityToBoard(boardEntity);
    }
}
