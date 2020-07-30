package co.com.taskmanagement.infrastructure.card;

import co.com.taskmanagement.infrastructure.cardlist.CardListEntity;
import co.com.taskmanagement.infrastructure.person.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "card")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Builder.Default
  private Long id = 0L;

  @Column
  @Builder.Default
  private String name = "";

  @Column
  @Builder.Default
  private String description = "";

  @Column(name = "creation_date")
  @Builder.Default
  private Date creationDate = new Date();

  @Column(name = "modification_date")
  @Builder.Default
  private Date modificationDate = new Date();

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "card_list_id")
  private CardListEntity cardList;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "person_id")
  private PersonEntity person;

}
