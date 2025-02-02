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
@Table(name="departmentJobtype")
public class DepartmentJobtype {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long department_id;
    private Long jobType_id;
    @ManyToMany(mappedBy="jobType",cascade=CascadeType.ALL)
    private Set<Jobtype> jobType;
    @ManyToMany(mappedBy="department_id",cascade=CascadeType.ALL)
    private Set<Department>department;



}
