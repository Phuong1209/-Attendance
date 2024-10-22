package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tasks")

public class TaskManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private LocalDateTime date;
    private float totalTime;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "checkin_time_id", nullable = false)
    private WorkingTime checkin_time;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project projects;

    @ManyToOne
    private Jobtype jobtypes;



}
