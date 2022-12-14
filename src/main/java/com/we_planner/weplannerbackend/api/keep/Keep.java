package com.we_planner.weplannerbackend.api.keep;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="plan_keep")
public class Keep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name ="plan_id", nullable = false)
    private Long planId;

    @Column(name ="planner_id", nullable = false)
    private Long plannerId;

    @Column(name ="keeper_id", nullable = false)
    private Long keeperId;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
