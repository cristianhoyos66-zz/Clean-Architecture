package co.com.taskmanagement.domain.board;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "of")
@Getter
public class BoardId {
  private final String id;
}
