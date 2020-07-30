package co.com.taskmanagement.infrastructure.board;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends CrudRepository<BoardEntity, Long> {

}
