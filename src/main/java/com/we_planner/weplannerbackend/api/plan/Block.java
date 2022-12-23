package com.we_planner.weplannerbackend.api.plan;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.we_planner.weplannerbackend.api.plan.Enum.BlockType;

@Entity
@Table(name = "plan_block")
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "plan_id", nullable = false)
    private Long planId;

    @Column(name = "block_type", nullable = false)
    private BlockType blockType;

    @Column(name = "block_ord", nullable = false)
    private Long blockOrd;

    @Column(name = "parent_id", nullable = false)
    private Long parentId;

    @Column(name = "day_num", nullable = false)
    private Long dayNum;

    @Column(name = "block_req", length = 100, nullable = false)
    private String blockReq;

    @Column(name = "block_opt", length = 100, nullable = false)
    private String blockOpt;

    @Column(name = "time", nullable = false)
    private LocalDateTime time;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
