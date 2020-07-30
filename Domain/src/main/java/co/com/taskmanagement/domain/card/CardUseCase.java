package co.com.taskmanagement.domain.card;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor(staticName = "of")
public class CardUseCase implements CardInputPort {

  private CardOutputPort cardOutputPort;

  @Override
  public List<Card> getCardsByCardList(Long cardListId) {
    return cardOutputPort.getCardsByCardList(cardListId);
  }

  @Override
  public void moveCardToColumn(Long cardId, Long newColumnId) {
    cardOutputPort.moveCardToColumn(cardId, newColumnId);
  }
}
