package co.com.infrastructure.configurations;

import co.com.domain.usecases.board.BoardUseCase;
import co.com.infrastructure.services.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfiguration {

    @Autowired
    private BoardService boardService;

    @Bean
    public BoardUseCase boardUseCase() {
        return new BoardUseCase(boardService);
    }

}
