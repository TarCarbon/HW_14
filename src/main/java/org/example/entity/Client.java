package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private int id;

    @Column (name = "name")
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @OneToMany (mappedBy = "client_id", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Ticket> ticket = new ArrayList<>();
}
