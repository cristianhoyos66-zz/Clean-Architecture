package co.com.taskmanagement.domain.cardlist;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class CardList {

  private Long id;
  private String name ;
  private String description;
  @Builder.Default
  private Date creationDate = new Date();
  @Builder.Default
  private Date modificationDate = new Date();

}
