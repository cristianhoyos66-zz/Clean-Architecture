package co.com.taskmanagement.infrastructure.cardlist;

import co.com.taskmanagement.domain.cardlist.CardList;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CardListAdapter {

  public List<CardList> cardListEntitiesToCardLists(List<CardListEntity> cardListEntities) {
    return cardListEntities.stream()
        .map(cardListEntity -> CardList
            .builder()
            .id(cardListEntity.getId())
            .name(cardListEntity.getName())
            .description(cardListEntity.getDescription())
            .build())
        .collect(Collectors.toList());
  }

  public List<CardListResponseDTO> cardListsToCardListResponses(List<CardList> cardLists) {
    return cardLists.stream()
        .map(cardList -> CardListResponseDTO
            .builder()
            .id(Optional.ofNullable(cardList.getId()).orElse(0L))
            .name(cardList.getName())
            .description(cardList.getDescription())
            .build())
        .collect(Collectors.toList());
  }

}
