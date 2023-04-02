import java.util.Optional;

import com.we_planner.weplannerbackend.api.user.User;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUserId(long userId);
}
