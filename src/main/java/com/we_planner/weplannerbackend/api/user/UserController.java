package com.we_planner.weplannerbackend.api.user;

import com.we_planner.weplannerbackend.api.user.dto.UserSignUpRequestDto;

import lombok.RequiredArgsConstructor;

import com.we_planner.weplannerbackend.api.user.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;    

    @PostMapping(value = '/signup')
    public Boolean signUp(@RequestBody(required = true) UserSignUpRequestDto signUpDto){
        return userService.addUser(signUpDto);
    }

    @GetMapping(value = '/user/{userId}')
    public UserResponseDto getUser(@PathVariable long userId){
        return userService.getUerById(userId);
    }
}
