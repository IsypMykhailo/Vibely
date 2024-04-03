package com.the_herd.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tickets")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ticketId;

    @ManyToOne
    @JoinColumn(name = "eventId", nullable = false)
    @Getter
    @Setter
    private Event event; 

    @OneToOne
    @JoinColumn(name = "id")
    @Getter
    @Setter
    private UUID userId;

    @Getter
    @Setter
    private double price;
}