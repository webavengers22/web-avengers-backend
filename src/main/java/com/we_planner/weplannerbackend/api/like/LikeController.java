import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class LikeController {
    private final LikeService likeService;

    @PostMapping(value = 'add/like')
    public Boolean like(@RequestBody(required = true) AddLikeRequestDto addLikeRequest){
        return likeService.addLike(addLikeRequest);
    }
}
