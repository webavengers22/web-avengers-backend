package com.we_planner.weplannerbackend.api.customer;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "customer_question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "customer_id", nullable=false)
    private Long customerId;

    @Column(name="user_id", nullable = false)
    private Long userId;

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @Column(name = "description", columnDefinition = "LONGTEXT", nullable = false)
    private String description;

    @Column(name = "answer", columnDefinition = "LONGTEXT", nullable = false)
    private String answer;

    @Column(name = "file",  length = 100)
    private String file;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
