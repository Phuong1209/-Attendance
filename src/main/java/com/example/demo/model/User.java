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
    private Long id;
    private String user_name;
    private String user_fullname;
    private String user_passwords;
//    @ManyToMany
    private Integer position_id;
//    @ManyToMany
    private Integer department_id;

}
