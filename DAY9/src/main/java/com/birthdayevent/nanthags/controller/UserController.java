package com.birthdayevent.nanthags.controller;

import static com.birthdayevent.nanthags.utils.MyConstant.USER;
import static com.birthdayevent.nanthags.utils.MyConstant.USERLIST;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.OK;
// import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthdayevent.nanthags.dto.response.BasicResponse;
import com.birthdayevent.nanthags.dto.response.UserResponse;
import com.birthdayevent.nanthags.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(USER)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(USERLIST)
    public ResponseEntity<BasicResponse<UserResponse>> create() {
        BasicResponse<UserResponse> response = new BasicResponse<>();
        try {
            response = userService.getAllUser();
            return new ResponseEntity<>(response,OK);
        } catch (Exception e) {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }

    


}
