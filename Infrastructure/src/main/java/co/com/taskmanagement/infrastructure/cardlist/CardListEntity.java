package co.com.taskmanagement.infrastructure.cardlist;

import co.com.taskmanagement.infrastructure.board.BoardEntity;
import co.com.taskmanagement.infrastructure.card.CardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "card_list")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardListEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @Column(name = "total_amount")
  private int totalAmount;

  @Column
  private String description;

  @Builder.Default
  @Column(name = "creation_date")
  private Date creationDate = new Date();

  @Builder.Default
  @Column(name = "modification_date")
  private Date modificationDate = new Date();

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "board_id")
  private BoardEntity board;

  @OneToMany(mappedBy = "cardList", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<CardEntity> cards;

}
