import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;    

    @PostMapping(value = '/signup')
    public Boolean signUp(@RequestBody(required = true) UserSignUpRequestDto signUpDto){
        return userService.addUser(signUpDto);
    }
}
