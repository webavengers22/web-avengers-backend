package com.we_planner.weplannerbackend.api.chklist;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "chklist_item")
public class ChklistItem {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(length = 100, nullable = false)
    private String chkitem;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}