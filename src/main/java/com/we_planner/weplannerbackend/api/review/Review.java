package com.we_planner.weplannerbackend.api.review;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="plan_review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name ="plan_id", nullable = false)
    private Long planId;

    @Column(name ="description", columnDefinition = "LONGTEXT", nullable = false)
    private String description;

    @Column(name ="last_writer_id", nullable = false)
    private Long lastWriterId;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;
}
