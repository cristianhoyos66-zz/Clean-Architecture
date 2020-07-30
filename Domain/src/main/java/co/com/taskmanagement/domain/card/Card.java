package co.com.taskmanagement.domain.card;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Card {

  private Long id;
  private String name ;
  private String description;
  @Builder.Default
  private Date creationDate = new Date();
  @Builder.Default
  private Date modificationDate = new Date();

}
