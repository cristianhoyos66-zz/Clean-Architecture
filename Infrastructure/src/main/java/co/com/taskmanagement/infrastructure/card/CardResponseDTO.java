package co.com.taskmanagement.infrastructure.card;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class CardResponseDTO implements Serializable {

  private long id;
  private String name;
  private String description;

}
