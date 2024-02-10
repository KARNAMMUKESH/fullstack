package com.birthdayevent.nanthags.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.birthdayevent.nanthags.dto.response.BasicResponse;
import com.birthdayevent.nanthags.dto.response.UserResponse;
import com.birthdayevent.nanthags.modal.Users;
import com.birthdayevent.nanthags.repository.UserRepository;
import com.birthdayevent.nanthags.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public BasicResponse<UserResponse> getAllUser() {
        List<Users> users = userRepository.findAll();
        List<UserResponse> userResponse = users.stream()
                .map(user -> UserResponse.builder()
                        .id(user.getId())
                        .name(user.getName())
                        .email(user.getEmail())
                        .password(user.getPassword())
                        .role(user.getRole())
                        .build())
                .collect(Collectors.toList());
        return BasicResponse.<UserResponse>builder().message("User data fetched successfully!").data(userResponse)
                .build();
    }
}
