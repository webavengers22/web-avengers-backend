package com.we_planner.weplannerbackend.api.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignUpRequestDto{
    private String email;
    private String birthdate;
    private String gender;
    private String withType;
    private String password;
    private String nickname;
    private String profileImage;
    private String profileIntroduce;
}