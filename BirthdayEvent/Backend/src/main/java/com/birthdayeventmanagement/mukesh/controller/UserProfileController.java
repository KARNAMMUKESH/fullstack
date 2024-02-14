package com.birthdayeventmanagement.mukesh.controller;


import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.AUTH;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.USERPROFILE;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.UPDATEPROFILE;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.USERLIST;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.DELETEPROFILE;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.GETUSERPROFILE;
import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthdayeventmanagement.mukesh.dto.request.UserProfileIdRequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserProfileRequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserProfileupdataRequest;
import com.birthdayeventmanagement.mukesh.dto.response.BasicResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserProfileDetailsResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserProfileResponse;
import com.birthdayeventmanagement.mukesh.service.UserProfileService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class UserProfileController {
    
    private final UserProfileService service;

    @PostMapping(USERPROFILE)
    public ResponseEntity<UserProfileResponse> UserProfile(@RequestBody UserProfileRequest request){
        UserProfileResponse response = new UserProfileResponse();
        try{
            response = service.addProfileResponse(request);
            return new ResponseEntity<>(response, ACCEPTED);
        }
        catch(Exception e)
        {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }
    @PutMapping(UPDATEPROFILE)
    public ResponseEntity<UserProfileResponse> Updateuser(@RequestBody UserProfileupdataRequest request){
        UserProfileResponse response = new UserProfileResponse();
        try{
            response = service.updatUserProfile(request);
            return new ResponseEntity<>(response, ACCEPTED);
        }
        catch(Exception e)
        {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }
    @DeleteMapping(DELETEPROFILE)
    public ResponseEntity<UserProfileResponse> deleteuser(@RequestBody UserProfileIdRequest request){
        UserProfileResponse response = new UserProfileResponse();
        try{
            response = service.deleteUserProfile(request);
            return new ResponseEntity<>(response, ACCEPTED);
        }
        catch(Exception e)
        {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }
    @GetMapping(GETUSERPROFILE)
    public ResponseEntity<UserProfileDetailsResponse> getuser(@RequestBody UserProfileIdRequest request){
        System.out.println("uigyug");
        UserProfileDetailsResponse response = new UserProfileDetailsResponse();
        try{
            response = service.getUserProfile(request);
            return new ResponseEntity<>(response, ACCEPTED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(response,EXPECTATION_FAILED);
        }
    }
    @GetMapping(USERLIST)
    public ResponseEntity<BasicResponse<UserProfileDetailsResponse>> getAllUser(){
        BasicResponse<UserProfileDetailsResponse> response=new BasicResponse<>();
        try{
            response = service.getAll();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        catch(Exception e){
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }

}
