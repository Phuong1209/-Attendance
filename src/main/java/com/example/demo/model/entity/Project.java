package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "projects")

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @OneToMany(mappedBy = "projects", cascade = CascadeType.ALL)
    private Long id;
    private String name;
    private String code;
    private LocalDateTime create_at;
    private LocalDateTime update_at;







}
