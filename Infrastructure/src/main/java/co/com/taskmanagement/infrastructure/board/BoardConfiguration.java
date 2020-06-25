package co.com.taskmanagement.infrastructure.board;

import co.com.taskmanagement.domain.board.BoardUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BoardConfiguration {

  private final BoardService boardService;

  @Bean
  public BoardUseCase boardUseCase() {
    return BoardUseCase.of(boardService);
  }

}
