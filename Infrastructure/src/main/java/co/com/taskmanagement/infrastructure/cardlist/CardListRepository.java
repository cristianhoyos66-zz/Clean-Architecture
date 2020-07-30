package co.com.taskmanagement.infrastructure.cardlist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardListRepository extends CrudRepository<CardListEntity, Long> {
}
