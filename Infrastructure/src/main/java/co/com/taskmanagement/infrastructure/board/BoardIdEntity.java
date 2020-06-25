package co.com.taskmanagement.infrastructure.board;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor(staticName = "of")
@Getter
public class BoardIdEntity implements Serializable {
  private final String id;
}
