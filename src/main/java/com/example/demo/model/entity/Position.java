package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
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
