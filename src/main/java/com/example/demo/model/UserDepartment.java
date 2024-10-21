package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_department")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDepartment {
    private User user_id;
    private Department department_id;

}
