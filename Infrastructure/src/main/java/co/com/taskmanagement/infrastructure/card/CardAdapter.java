package co.com.taskmanagement.infrastructure.card;

import co.com.taskmanagement.domain.card.Card;
import co.com.taskmanagement.domain.cardlist.CardList;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CardAdapter {

  public List<Card> cardEntitiesToCards(List<CardEntity> cardEntities) {
    return cardEntities.stream()
        .map(cardListEntity -> Card
            .builder()
            .id(cardListEntity.getId())
            .name(cardListEntity.getName())
            .description(cardListEntity.getDescription())
            .build())
        .collect(Collectors.toList());
  }

  public List<CardResponseDTO> cardsToCardResponses(List<Card> cards) {
    return cards.stream()
        .map(card -> CardResponseDTO
            .builder()
            .id(card.getId())
            .name(card.getName())
            .description(card.getDescription())
            .build())
        .collect(Collectors.toList());
  }

}
