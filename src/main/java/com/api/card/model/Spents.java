package com.api.card.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "SPENT")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonIgnoreProperties("hibernateLazyInitializer")
public class Spents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME", length = 100)
    private String name;
    @Column(name = "DESCRIPTION", length = 100)
    private String description;
    @Column(name = "REGISTER_DATE")
    private LocalDateTime registerDt;
    @Column(name = "VALUE", length = 20)
    private Double value;
    @Column(name = "TAGS", length = 100)
    private String tags;
}
