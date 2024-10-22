package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "WorkingTime")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkingTime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long user_id;
    private LocalDate date;
    private LocalDateTime checkin_time;
    private LocalDateTime checkout_time;
    private LocalDateTime breaktime;
    private LocalDateTime worktime;
    private LocalDateTime overtime;
    private LocalDate create_at;
    private LocalDateTime update_at;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User users;
}


