package com.birthdayeventmanagement.mukesh.service;

import com.birthdayeventmanagement.mukesh.dto.request.LoginRequest;
import com.birthdayeventmanagement.mukesh.dto.request.RegisterRequest;
import com.birthdayeventmanagement.mukesh.dto.response.LoginResponse;
import com.birthdayeventmanagement.mukesh.dto.response.RegisterResponse;

public interface AuthenticationService {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

}
