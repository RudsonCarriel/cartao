package com.api.card.model.dto;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SpentDto implements Serializable{

    private static final long serialVersionUID = 2807140965026584818L;
    private String name;
    private String description;
    private Double value;
    private String tags;

}
