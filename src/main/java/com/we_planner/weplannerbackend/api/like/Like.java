package com.we_planner.weplannerbackend.api.like;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "plan_like")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name ="plan_id", nullable = false)
    private Long planId;

    @Column(name ="planner_id", nullable = false)
    private Long plannerId;

    @Column(name ="liker_id", nullable = false)
    private Long likerId;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
