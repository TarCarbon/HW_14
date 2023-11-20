package org.example.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@Entity
@Table (name = "ticket")
public class Ticket {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "create_at")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private LocalDateTime createdAt;

    @Column ( name = "client_id" )
    @ManyToOne (fetch = FetchType.LAZY)
    private Client clientId;


    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "from_planet_id")
    private Planet fromPlanetID;


    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "to_planet_id")
    private Planet toPlanetID;

}
