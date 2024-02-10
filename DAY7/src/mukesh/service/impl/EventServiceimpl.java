package com.birthdayeventmanagement.mukesh.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birthdayeventmanagement.mukesh.Repository.UserEventRepository;
import com.birthdayeventmanagement.mukesh.dto.request.UserEventIdrequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserEventRequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserEventupdateRequest;
import com.birthdayeventmanagement.mukesh.dto.response.BasicResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserEventDetailsResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserEventResponse;
import com.birthdayeventmanagement.mukesh.model.UserEvent;
import com.birthdayeventmanagement.mukesh.service.EventService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventServiceimpl implements EventService {

    @Autowired
    private UserEventRepository repository;
    
    @SuppressWarnings("null")
    @Override
    public UserEventResponse addEventResponse(UserEventRequest request)
    {
        var userevent=UserEvent.builder()
        .maxparticipants(request.getMaxparticipants())
        .eventdestination(request.getEventdestination())
        .eventname(request.getEventname())
        .price(request.getPrice())
        .build();
        repository.save(userevent);
       return UserEventResponse.builder().message("success").build();
    }
    @SuppressWarnings("null")
    @Override
    public UserEventResponse UpdateEventResponse(UserEventupdateRequest request)
    {
        Optional<UserEvent> userProfileOptional = repository.findById(request.getEventid());
        if (userProfileOptional.isPresent()) {
            UserEvent usereEvent = userProfileOptional.get();
            usereEvent.setEventname(request.getEventname());
            usereEvent.setEventdestination(request.getEventdestination());
            usereEvent.setMaxparticipants(request.getMaxparticipants());
            usereEvent.setPrice(request.getPrice());
            repository.save(usereEvent);
            return UserEventResponse.builder().message("success").build();
        } else {
            return UserEventResponse.builder().message("Event not found").build();
        }
    }
    @SuppressWarnings("null")
    @Override
    public UserEventResponse deleteEventResponse(UserEventIdrequest request)
    {
         Optional<UserEvent> userProfileOptional = repository.findById(request.getEventid());
        if (userProfileOptional.isPresent()) {
           repository.deleteById(request.getEventid());
            return UserEventResponse.builder().message(" Deleted success").build();
        } else {
            return UserEventResponse.builder().message("Profile not found").build();
        }   
    }
    @Override
    public BasicResponse<UserEventDetailsResponse> getAll() {
        List<UserEvent> users=repository.findAll();
        List<UserEventDetailsResponse> useresponse=users.stream().map(user->UserEventDetailsResponse.builder()
        .eventid(user.getEventid())
        .eventname(user.getEventname())
        .eventdestination(user.getEventdestination())
        .price(user.getPrice())
        .maxparticipants(user.getMaxparticipants())
        .build()).collect(Collectors.toList());
        return BasicResponse.<UserEventDetailsResponse>builder().message("User data fetch successfully").data(useresponse).build();
        
    }
    
}
