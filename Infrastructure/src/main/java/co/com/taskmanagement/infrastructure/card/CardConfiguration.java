package co.com.taskmanagement.infrastructure.card;

import co.com.taskmanagement.domain.card.CardUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CardConfiguration {

  private final CardService cardService;

  @Bean
  public CardUseCase cardUseCase() {
    return CardUseCase.of(cardService);
  }

}
