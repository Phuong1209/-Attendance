package com.example.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String department_name;
    @ManyToMany
    private Set<DepartmentJobtype> departmentJobtype;

}
