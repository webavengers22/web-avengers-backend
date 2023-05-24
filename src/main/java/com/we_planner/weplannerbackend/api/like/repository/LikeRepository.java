public interface LikeRepository extends JpaRepository<Like, Long>{
    Like findByPlanIdAndUserId(Long planId, Long userId);
}
