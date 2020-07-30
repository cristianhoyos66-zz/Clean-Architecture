package co.com.taskmanagement.infrastructure.card;

import co.com.taskmanagement.infrastructure.cardlist.CardListEntity;
import co.com.taskmanagement.infrastructure.cardlist.CardListRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CardRepositoryTest {

  @Autowired
  private CardRepository cardRepository;

  @Autowired
  private CardListRepository cardListRepository;

  @Test
  public void saveCards() {
    CardListEntity cardListEntity = cardListRepository.findById(3L).orElse(CardListEntity.builder().build());
    for (int i = 0; i < 5; i++) {
      cardRepository.save(CardEntity
          .builder()
          .name("Card2")
          .description("Card2")
          .cardList(cardListEntity)
          .build()
      );
    }
  }

}
