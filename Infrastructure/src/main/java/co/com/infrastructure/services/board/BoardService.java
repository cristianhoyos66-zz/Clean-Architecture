package co.com.infrastructure.services.board;


import co.com.domain.adapters.board.BoardAdapter;
import co.com.domain.entities.board.Board;
import co.com.domain.valueobjects.board.BoardId;
import co.com.infrastructure.entities.board.InfBoard;
import co.com.infrastructure.factories.board.BoardFactory;
import co.com.infrastructure.repositories.board.BoardRepository;
import co.com.infrastructure.valueobjects.board.InfBoardId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements BoardAdapter {

    private BoardRepository boardRepository;
    private BoardFactory boardFactory;

    @Autowired
    public BoardService(BoardRepository boardRepository, BoardFactory boardFactory) {
        this.boardRepository = boardRepository;
        this.boardFactory = boardFactory;
    }

    @Override
    public Board getBoardById(BoardId boardId) {
        InfBoard infBoard = boardRepository.findById(InfBoardId.of(boardId.getId())).orElse(null);
        return boardFactory.getDomainFromInfrastructureBoard(infBoard);
    }
}
