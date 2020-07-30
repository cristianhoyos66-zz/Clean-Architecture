package co.com.taskmanagement.domain.card;

import java.util.List;

public interface CardInputPort {

  List<Card> getCardsByCardList(Long cardListId);

  void moveCardToColumn(Long cardId, Long newColumnId);

}
