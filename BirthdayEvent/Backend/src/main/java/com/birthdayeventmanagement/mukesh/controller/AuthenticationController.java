package com.birthdayeventmanagement.mukesh.controller;


import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.AUTH;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.LOGIN;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.REGISTER;
import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;

// import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthdayeventmanagement.mukesh.dto.request.LoginRequest;
import com.birthdayeventmanagement.mukesh.dto.request.RegisterRequest;
import com.birthdayeventmanagement.mukesh.dto.response.LoginResponse;
import com.birthdayeventmanagement.mukesh.dto.response.RegisterResponse;
import com.birthdayeventmanagement.mukesh.service.AuthenticationService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class AuthenticationController {

    private final AuthenticationService AuthenticationService;

    @PostMapping(REGISTER)
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request){
        RegisterResponse response = new RegisterResponse();
        try {
            response = AuthenticationService.register(request);
            return new ResponseEntity<>(response, ACCEPTED);
        } catch (Exception e) {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }

    @PostMapping(LOGIN)
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
        LoginResponse response = new LoginResponse();
        try {
            response = AuthenticationService.login(request);
            return new ResponseEntity<>(response, ACCEPTED);
        } catch (Exception e) {
            LoginResponse.builder()
            .message("Something went wrong!").token("").build();
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
            // System.out.println(e);
            // response.setMessage("Something went wrong!");
            // response.setToken("");
            // return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }
}
