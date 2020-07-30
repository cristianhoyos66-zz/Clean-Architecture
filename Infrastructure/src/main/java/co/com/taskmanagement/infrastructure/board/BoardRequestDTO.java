package co.com.taskmanagement.infrastructure.board;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class BoardRequestDTO implements Serializable {

  private String name;
  private String description;

}
