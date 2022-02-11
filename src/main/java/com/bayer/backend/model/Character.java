package com.bayer.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "character")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String status;

    private String species;

    private String type;

    private String gender;

    @ManyToOne(cascade=CascadeType.ALL)
    private Location origin;

    @ManyToOne(cascade=CascadeType.ALL)
    private Location location;

    private String image;

    @ElementCollection
    private List<String> episode;

    private String url;

    private Date created;

}
