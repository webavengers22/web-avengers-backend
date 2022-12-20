package com.we_planner.weplannerbackend.api.chklist;

import java.time.LocalDateTime;
import javax.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "chklist")
public class PlanChklistFlag {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "plan_id", nullable = false)
    private Long planId;

    @Column(name = "chklist_id", nullable = false)
    private Long chklistId;

    @Column(name = "isChk", nullable = false)
    @ColumnDefault("false")
    private boolean isChk;

    @Column(name = "updated_at")
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}