package com.we_planner.weplannerbackend.api.chklist;

import javax.persistence.*;

@Entity
@Table(name = "chklist_item_map")
public class ChklistItemMap {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "chklist_id", nullable = false)
    private Long chklistId;
    
    @Column(name = "chkitem_id", nullable = false)
    private Long chkitemId;
    
}