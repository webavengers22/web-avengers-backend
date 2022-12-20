package com.we_planner.weplannerbackend.api.hastag;

import javax.persistence.*;

@Entity
@Table(name = "plan_hashtag")
public class PlanHashtag {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "hashtag_id", nullable = false)
    private Long hashtagId;
    
    @Column(name = "plan_id", nullable = false)
    private Long planId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

}
