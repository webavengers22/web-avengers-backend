package com.we_planner.weplannerbackend.api.user;

import com.we_planner.weplannerbackend.api.user.dto.UserSignUpRequestDto;
import com.we_planner.weplannerbackend.api.user.repository.UserRepository;
import com.we_planner.weplannerbackend.api.user.repository.UserPwRepository;
import com.we_planner.weplannerbackend.api.user.repository.UserProfileRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserPwRepository userPwRepository;
    private final UserProfileRepository userProfileRepository;

    public boolean addUser(UserSignUpRequestDto signUpDto){
        User user = new User();

        user.setEmail(signUpDto.getEmail());
        user.setBrithdate(signUpDto.getBirthdate());
        user.setGender(signUpDto.getGender()); 

        UserPw userPw = new UserPw();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userPw.setPasswordEncode(passwordEncoder.encode(signUpDto.getPassword()));

        UserProfile userProfile = new UserProfile();
        userProfile.setNickname(signUpDto.getNickname());
        userProfile.setProfileImage(signUpDto.getProfileImage());
        userProfile.setProfileIntroduce(signUpDto.getProfileIntroduce());

        userRepository.save(user);
        userPwRepository.save(userPw);
        userProfileRepository.save(userProfile);
        return true;
    }
}
