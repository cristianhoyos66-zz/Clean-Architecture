package co.com.infrastructure.repositories.board;

import co.com.infrastructure.entities.board.InfBoard;
import co.com.infrastructure.valueobjects.board.InfBoardId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends CrudRepository<InfBoard, InfBoardId> {

}
