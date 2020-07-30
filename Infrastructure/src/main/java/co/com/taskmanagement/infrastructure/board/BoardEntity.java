package co.com.taskmanagement.infrastructure.board;

import co.com.taskmanagement.infrastructure.cardlist.CardListEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "board")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @Column
  private String description;

  @Builder.Default
  @Column(name = "creation_date")
  private Date creationDate = new Date();

  @Builder.Default
  @Column(name = "modification_date")
  private Date modificationDate = new Date();;

  @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<CardListEntity> cardLists;

}
