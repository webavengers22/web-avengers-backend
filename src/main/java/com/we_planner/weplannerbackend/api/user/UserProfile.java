package com.we_planner.weplannerbackend.api.user;

import java.time.*;
import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "user_profile")
public class UserProfile {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;
    
    @Column(name = "nickname", length = 12, nullable = false)
    private String nickname;
    
    @Column(name = "profile_image", length = 100)
    private String profileImage;
    
    @Column(name = "profile_introduce", length = 100)
    private String profileIntroduce;

    @Column(name = "updated_at")
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

}