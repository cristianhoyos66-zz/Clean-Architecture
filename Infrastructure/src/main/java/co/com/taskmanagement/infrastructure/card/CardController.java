package co.com.taskmanagement.infrastructure.card;

import co.com.taskmanagement.domain.card.Card;
import co.com.taskmanagement.domain.card.CardInputPort;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cards")
@AllArgsConstructor
public class CardController {

  private final CardAdapter cardAdapter;
  private final CardInputPort cardInputPort;

  @GetMapping
  public ResponseEntity<List<CardResponseDTO>> getCardsByCardList(@RequestParam(name = "cardListId") Long cardListId) {
    List<Card> cards = cardInputPort.getCardsByCardList(cardListId);
    return ResponseEntity.ok().body(cardAdapter.cardsToCardResponses(cards));
  }

  @PatchMapping("/{cardId}")
  public ResponseEntity<Void> moveCardToColumn(@PathVariable Long cardId, @RequestBody Map<String, Long> requestBody) {
    cardInputPort.moveCardToColumn(cardId, requestBody.get("newColumndId"));
    return ResponseEntity.noContent().build();
  }

}
