import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserResponseDto {
    public long userId;
    public String nickname;
    public String email;
    public String profileImage;
    public String profileIntroduce;
}
