package com.birthdayevent.nanthags.service;

import com.birthdayevent.nanthags.dto.request.LoginRequest;
import com.birthdayevent.nanthags.dto.request.RegisterRequest;
import com.birthdayevent.nanthags.dto.response.LoginResponse;
import com.birthdayevent.nanthags.dto.response.RegisterResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);
}
