package com.we_planner.weplannerbackend.api.chklist;

import java.time.*;
import javax.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "chklist")
public class Chklist {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "chklist_title", length = 20, nullable = false)
    private String chklistTitle;
    
    @Column(name = "chklist_subtitle", length = 30)
    private String chklistSubtitle;
    
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
    
}