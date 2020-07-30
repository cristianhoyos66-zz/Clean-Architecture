package co.com.taskmanagement.infrastructure.cardlist;

import co.com.taskmanagement.infrastructure.board.BoardEntity;
import co.com.taskmanagement.infrastructure.board.BoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CardListRepositoryTest {

  @Autowired
  CardListRepository cardListRepository;

  @Autowired
  BoardRepository boardRepository;

  @Test
  @Rollback(false)
  public void createCardList() {

    for (int i = 1; i < 4; i++) {
      cardListRepository.save(CardListEntity.builder()
          .name(i + "st column")
          .totalAmount(50)
          .description(i + "st column")
          .board(boardRepository.findById(1L).orElse(BoardEntity.builder().build()))
          .build()
      );
    }

    BoardEntity boardEntity = boardRepository.findById(1L).orElse(BoardEntity.builder().build());

      for (CardListEntity cardListEntity: boardEntity.getCardLists()) {
        System.out.println(cardListEntity.getId());
        System.out.println(cardListEntity.getName());
        System.out.println(cardListEntity.getDescription());
      }
  }

}
