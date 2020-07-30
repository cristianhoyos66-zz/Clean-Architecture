package co.com.taskmanagement.infrastructure.cardlist;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class CardListResponseDTO implements Serializable {

  private long id;
  private String name;
  private String description;

}
