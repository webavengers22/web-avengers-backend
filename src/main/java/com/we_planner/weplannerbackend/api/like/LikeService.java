@Service
public class LikeService {
    private final LikeRepository likeRepository;

    public Like findByPlanIdAndUserId(Long planId, Long userId){
        return likeRepository.findByPlanIdAndUserId(plandId, userId);
    }

    public boolean addLike(AddLikeRequestDto addLikeRequest){
        Like like = this.findByPlanIdAndUserId(addLikeRequest.planId, addLikeRequest.userId);

        if(like){
            throw new Error('같은 일정에 좋아요할 수 없습니다.');
        }
        return likeRepository.save(addLikeRequest);
    }
}
