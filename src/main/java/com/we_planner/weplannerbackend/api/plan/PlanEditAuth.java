package com.we_planner.weplannerbackend.api.plan;
 
import java.time.LocalDateTime;
import javax.persistence.*;
import com.we_planner.weplannerbackend.api.plan.Enum.AuthType;

@Entity
@Table(name = "plan_edit_auth")
public class PlanEditAuth {

    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "plan_id", nullable = false)
    private Long planId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "isWriter", nullable = false)
	public AuthType isWriter;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
