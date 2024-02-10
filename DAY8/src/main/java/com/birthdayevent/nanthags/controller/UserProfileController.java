package com.birthdayevent.nanthags.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

// import com.birthdayevent.nanthags.dto.request.UserProfileIdRequest;
import com.birthdayevent.nanthags.dto.request.UserProfileRequest;
import com.birthdayevent.nanthags.dto.request.UserProfileupdataRequest;
import com.birthdayevent.nanthags.dto.response.UserProfileDetailsResponse;
import com.birthdayevent.nanthags.dto.response.UserProfileResponse;
import com.birthdayevent.nanthags.service.UserProfileService;

import static com.birthdayevent.nanthags.utils.MyConstant.AUTH;
import static com.birthdayevent.nanthags.utils.MyConstant.USERPROFILE;
import static com.birthdayevent.nanthags.utils.MyConstant.DELETEPROFILE;
import static com.birthdayevent.nanthags.utils.MyConstant.GETPROFILE;
import static com.birthdayevent.nanthags.utils.MyConstant.UPDATEPROFILE;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.birthdayevent.nanthags.dto.request.UserProfileRequest;
// import com.birthdayevent.nanthags.service.UserProfileService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
public class UserProfileController {

    
    
    private final UserProfileService service;

    @PostMapping(USERPROFILE)
    public ResponseEntity<UserProfileResponse> UserProfile(@RequestBody UserProfileRequest request){
        UserProfileResponse response = new UserProfileResponse();
        try{
            response = service.addProfileResponse(request);
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }
        catch(Exception e)
        {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
        }
    }
    @PutMapping(UPDATEPROFILE)
    public ResponseEntity<UserProfileResponse> Updateuser(@RequestBody UserProfileupdataRequest request,@PathVariable String id){
        UserProfileResponse response = new UserProfileResponse();
        try{
            response = service.updatUserProfile(request,id);
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }
        catch(Exception e)
        {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
        }
    }
    @DeleteMapping(DELETEPROFILE)
    public ResponseEntity<UserProfileResponse> Getuser(@PathVariable String id){
        UserProfileResponse response = new UserProfileResponse();
        try{
            response = service.deleteUserProfile(id);
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }
        catch(Exception e)
        {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
        }
    }
    @GetMapping(GETPROFILE)
    public ResponseEntity<UserProfileDetailsResponse> Deleteuser(@PathVariable String id ){
        UserProfileDetailsResponse response = new UserProfileDetailsResponse();
        try{
            response = service.getUserProfile(id);
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
