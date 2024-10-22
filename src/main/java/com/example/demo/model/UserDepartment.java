package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;


}
