package co.com.taskmanagement.domain.card;

import java.util.List;

public interface CardOutputPort {
  List<Card> getCardsByCardList(Long cardListId);
  void moveCardToColumn(Long cardId, Long newColumnId);
}
