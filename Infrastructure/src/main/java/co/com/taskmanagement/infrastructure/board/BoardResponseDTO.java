package co.com.taskmanagement.infrastructure.board;

import co.com.taskmanagement.infrastructure.cardlist.CardListResponseDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BoardResponseDTO {

  private long id;
  private String name;
  private String description;
  private List<CardListResponseDTO> cardLists;

}
