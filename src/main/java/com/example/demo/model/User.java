package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String user_name;
    private String user_fullname;
    private String user_passwords;
    @ManyToMany
    @JoinTable(
            name="position",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "position_id")
    )
    private Position position;
    @ManyToMany
    @JoinTable(
            name="department",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "department_id")
    )
    private Department department;

}
