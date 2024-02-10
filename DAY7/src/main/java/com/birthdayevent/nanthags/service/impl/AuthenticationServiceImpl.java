package com.birthdayevent.nanthags.service.impl;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

// import static com.birthdayevent.nanthags.utils.MyConstant.USER;
import static com.birthdayevent.nanthags.enumerated.Role.USER;

import com.birthdayevent.nanthags.dto.request.LoginRequest;
import com.birthdayevent.nanthags.dto.request.RegisterRequest;
import com.birthdayevent.nanthags.dto.response.LoginResponse;
import com.birthdayevent.nanthags.dto.response.RegisterResponse;
import com.birthdayevent.nanthags.modal.Users;
import com.birthdayevent.nanthags.repository.UserRepository;
import com.birthdayevent.nanthags.service.AuthenticationService;
import com.birthdayevent.nanthags.utils.JwtUtil;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class AuthenticationServiceImpl implements AuthenticationService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @Override
    public RegisterResponse register(RegisterRequest request) {
        if (!request.getPassword().equals(request.getConfirmPassword())) {
            return RegisterResponse.builder()
                    .message("Password and ConfirmPassword do not match")
                    .build();
        }

        var user = Users.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(USER)
                .build();
        userRepository.save(user);
        return RegisterResponse.builder()
                .message("User registered successfully")
                .build();
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
        var token = jwtUtil.generateToken(user);
        return LoginResponse.builder()
                .message("Logged in successfully.")
                .token(token)
                .build();
    }
}
