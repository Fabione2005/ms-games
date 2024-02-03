package com.ms.games.model.bean;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Entity
@Data
public class Game {

    @Id
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @NotEmpty(message = "field name cannot be empty")
    private String name;

    private double size;

    @NotEmpty(message = "field description cannot be empty")
    private String description;

    @NotEmpty(message = "field genre cannot be empty")
    private String genre;
}
