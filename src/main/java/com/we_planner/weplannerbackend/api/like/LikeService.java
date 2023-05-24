
public class LikeService {
    private final LikeRepository likeRepository;

    public boolean addLike(AddLikeRequestDto addLikeRequest){
        // 이미 좋아요한 경우 예외 발생 필요
        return likeRepository.save(addLikeRequest);
    }
}
