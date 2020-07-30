package co.com.taskmanagement.infrastructure.card;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends CrudRepository<CardEntity, Long> {

  List<CardEntity> findByCardListId(long cardListId);

}
