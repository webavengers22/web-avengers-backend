import java.util.Optional;

import com.we_planner.weplannerbackend.api.user.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long>{
    Optional<UserProfile> findByUserId(long userId);
}
