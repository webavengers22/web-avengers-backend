package com.we_planner.weplannerbackend.api.hastag;
 
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "hashtag")
public class Hashtag {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "hashtag", length = 12, nullable = false)
    private String hashtag;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}