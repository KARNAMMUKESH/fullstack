package com.birthdayeventmanagement.mukesh.service;


import com.birthdayeventmanagement.mukesh.dto.request.UserProfileIdRequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserProfileRequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserProfileupdataRequest;
import com.birthdayeventmanagement.mukesh.dto.response.BasicResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserProfileDetailsResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserProfileResponse;

public interface UserProfileService {

     UserProfileResponse addProfileResponse(UserProfileRequest request);
     UserProfileResponse updatUserProfile(UserProfileupdataRequest request);
     UserProfileResponse deleteUserProfile(UserProfileIdRequest request);
     UserProfileDetailsResponse getUserProfile(UserProfileIdRequest request);
     BasicResponse<UserProfileDetailsResponse> getAll();
     
}
