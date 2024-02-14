package com.birthdayeventmanagement.mukesh.service.impl;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birthdayeventmanagement.mukesh.Repository.UserProfileRepository;
import com.birthdayeventmanagement.mukesh.dto.request.UserProfileIdRequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserProfileRequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserProfileupdataRequest;
import com.birthdayeventmanagement.mukesh.dto.response.BasicResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserProfileDetailsResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserProfileResponse;
import com.birthdayeventmanagement.mukesh.model.UserProfile;
import com.birthdayeventmanagement.mukesh.service.UserProfileService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserProfileServiceimpl implements UserProfileService {
    @Autowired
    private final UserProfileRepository repo;
    @SuppressWarnings("null")
    @Override
    public UserProfileResponse addProfileResponse(UserProfileRequest request){ 
        var userprofile=UserProfile.builder()
        .fullname(request.getFullname())
        .email(request.getEmail())
        .mobileno(request.getMobileno())
        .profile(request.getProfile())
        .build();
       repo.save(userprofile);

       return UserProfileResponse.builder().message("success").build();
       
    }
    @SuppressWarnings("null")
    @Override
    public UserProfileResponse updatUserProfile(UserProfileupdataRequest request)
    {
        Optional<UserProfile> userProfileOptional = repo.findById(request.getProfileid());
        if (userProfileOptional.isPresent()) {
            UserProfile userProfile = userProfileOptional.get();
            userProfile.setFullname(request.getFullname());
            userProfile.setEmail(request.getEmail());
            userProfile.setMobileno(request.getMobileno());
            userProfile.setProfile(request.getProfile());
            repo.save(userProfile);
            return UserProfileResponse.builder().message("success").build();
        } else {
            return UserProfileResponse.builder().message("Profile not found").build();
        }
    }
    @SuppressWarnings("null")
    @Override
    public UserProfileResponse deleteUserProfile(UserProfileIdRequest request)
    {
        Optional<UserProfile> userProfileOptional = repo.findById(request.getProfileid());
        if (userProfileOptional.isPresent()) {
           repo.deleteById(request.getProfileid());
            return UserProfileResponse.builder().message(" Deleted success").build();
        } else {
            return UserProfileResponse.builder().message("Profile not found").build();
        }
    }
    @SuppressWarnings("null")
    @Override
    public UserProfileDetailsResponse getUserProfile(UserProfileIdRequest request)
    {
        Optional<UserProfile> userProfileOptional = repo.findById(request.getProfileid());
        System.out.println("dfsfdsgdfg");
        if (userProfileOptional.isPresent()) {
            UserProfile userProfile = userProfileOptional.get();
            return UserProfileDetailsResponse.builder()
            .profileid(userProfile.getProfileid())
            .fullname(userProfile.getFullname())
            .mobileno(userProfile.getMobileno())
            .profile(userProfile.getProfile()).
            email(userProfile.getEmail()).build();
        }
        else{
            return UserProfileDetailsResponse.builder().email(null).fullname(null).mobileno(0).profile(null).build();
        }
    }
    @Override
    public BasicResponse<UserProfileDetailsResponse> getAll() {
        List<UserProfile> users=repo.findAll();
        List<UserProfileDetailsResponse> useresponse=users.stream().map(user->UserProfileDetailsResponse.builder()
        .profileid(user.getProfileid())
        .fullname(user.getFullname())
        .email(user.getEmail())
        .mobileno(user.getMobileno())
        .profile(user.getProfile())
        .build()).collect(Collectors.toList());
        return BasicResponse.<UserProfileDetailsResponse>builder().message("User data fetch successfully").data(useresponse).build();
        
    }
}
