package com.we_planner.weplannerbackend.api.customer;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    private CategoryType category;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;
}
