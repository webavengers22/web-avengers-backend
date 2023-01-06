package com.we_planner.weplannerbackend.api.user;

import java.time.LocalDateTime;
import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "user_social")
public class UserSocial {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "user_id", length = 100, nullable = false)
    private String userId;
    
    @Column(name = "social_code", length = 2, nullable = false)
    private String socialCode;
    
    @Column(name = "external_id", length = 100, nullable = false)
    private String externalId;
    
    @Column(name = "access_token", length = 50, nullable = false)
    private String accessToken;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

}