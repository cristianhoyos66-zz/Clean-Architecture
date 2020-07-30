package co.com.taskmanagement.infrastructure.person;

import co.com.taskmanagement.infrastructure.card.CardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "person")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

  @Id
  private String id;

  @Column
  private String name;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "birth_date")
  private Date birthDate;

  @Builder.Default
  @Column(name = "creation_date")
  private Date creationDate = new Date();

  @Builder.Default
  @Column(name = "modification_date")
  private Date modificationDate = new Date();

  @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
  private List<CardEntity> cards;

}
