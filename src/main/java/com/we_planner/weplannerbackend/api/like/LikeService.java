
public class LikeService {
    private final LikeRepository likeRepository;

    public boolean addLike(AddLikeRequestDto addLikeRequest){
        return likeRepository.save(addLikeRequest);
    }
}
