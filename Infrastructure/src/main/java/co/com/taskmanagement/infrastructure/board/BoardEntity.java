package co.com.taskmanagement.infrastructure.board;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Date;

@Entity(name = "BOARD")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {

  @EmbeddedId
  private BoardIdEntity boardIdEntity;
  @Column
  private String name;
  @Column
  private String description;
  @Column
  private Date creationDate;
  @Column
  private Date modificationDate;
  @Column
  private String cardId;

}
