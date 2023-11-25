package org.example.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "planet")
public class Planet {
    @Id
    @Column (name = "id")
    private String id;

    @Column (name = "planet_name")
    private String name;

}
