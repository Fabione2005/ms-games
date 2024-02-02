package com.ms.games.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Game {

    @Id
    @GeneratedValue(generator = "uuid")
    private UUID id;
    private String name;
    private double size;
    private String description;
    private String genre;
}
