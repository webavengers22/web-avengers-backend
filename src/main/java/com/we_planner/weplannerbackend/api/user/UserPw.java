package com.we_planner.weplannerbackend.api.user;

import java.time.*;
import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "user_pw")
public class UserPw {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "password_encode", length = 100, nullable = false)
    private String passwordEncode;

    @Column(name = "updated_at")
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

}