package org.example.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@Getter @Setter
@Entity
@Table (name = "planet")
public class Planet {
    @Id
    @Column (name = "id")
    private String id;

    @Column (name = "planet_name")
    private String name;

}
