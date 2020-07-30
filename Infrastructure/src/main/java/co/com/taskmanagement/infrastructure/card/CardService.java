package co.com.taskmanagement.infrastructure.card;

import co.com.taskmanagement.domain.card.Card;
import co.com.taskmanagement.domain.card.CardOutputPort;
import co.com.taskmanagement.infrastructure.cardlist.CardListEntity;
import co.com.taskmanagement.infrastructure.cardlist.CardListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CardService implements CardOutputPort {

  private final CardRepository cardRepository;
  private final CardListRepository cardListRepository;
  private final CardAdapter cardAdapter;

  @Override
  public List<Card> getCardsByCardList(Long cardListId) {
    List<CardEntity> cardEntities = cardRepository.findByCardListId(cardListId);
    return cardAdapter.cardEntitiesToCards(cardEntities);
  }

  @Override
  public void moveCardToColumn(Long cardId, Long newColumnId) {
    Optional<CardEntity> optCardEntity = cardRepository.findById(cardId);
    optCardEntity.ifPresent(cardEntity -> {
      setCardListIfPresent(cardEntity, newColumnId);
    });
  }

  private void setCardListIfPresent(CardEntity cardEntity, Long newColumnId) {
    Optional<CardListEntity> optCardListEntity = cardListRepository.findById(newColumnId);
    optCardListEntity.ifPresent(cardListEntity -> {
      cardEntity.setCardList(cardListEntity);
      cardRepository.save(cardEntity);
    });
  }

}
