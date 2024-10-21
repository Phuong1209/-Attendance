package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "position")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String position_name;
}
