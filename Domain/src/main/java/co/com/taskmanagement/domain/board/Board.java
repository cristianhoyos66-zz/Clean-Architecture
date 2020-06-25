package co.com.taskmanagement.domain.board;

import lombok.*;

import java.util.Date;

@Data
@Builder
public class Board {

  private BoardId boardId;
  private String name;
  private String description;
  private Date creationDate;
  private Date modificationDate;
  private String cardId;

}
