package com.birthdayeventmanagement.mukesh.service;

import com.birthdayeventmanagement.mukesh.dto.request.UserEventIdrequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserEventRequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserEventupdateRequest;
import com.birthdayeventmanagement.mukesh.dto.response.BasicResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserEventDetailsResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserEventResponse;

public interface EventService {
    
    UserEventResponse addEventResponse(UserEventRequest request);
    UserEventResponse UpdateEventResponse(UserEventupdateRequest request);
    UserEventResponse deleteEventResponse(UserEventIdrequest request);
    BasicResponse<UserEventDetailsResponse> getAll();
}
