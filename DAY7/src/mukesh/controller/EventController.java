package com.birthdayeventmanagement.mukesh.controller;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.AUTH;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.UPDATEVENT;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.EVENTLIST;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.ADDEVENT;
import static com.birthdayeventmanagement.mukesh.Utils.MyConstant.DELETEEVENT;
import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthdayeventmanagement.mukesh.dto.request.UserEventIdrequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserEventRequest;
import com.birthdayeventmanagement.mukesh.dto.request.UserEventupdateRequest;
import com.birthdayeventmanagement.mukesh.dto.response.BasicResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserEventDetailsResponse;
import com.birthdayeventmanagement.mukesh.dto.response.UserEventResponse;
import com.birthdayeventmanagement.mukesh.service.EventService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
public class EventController {

    @Autowired
    private final EventService service;

    @PostMapping(ADDEVENT)
    public ResponseEntity<UserEventResponse> Addevent(@RequestBody UserEventRequest request){
        UserEventResponse response = new UserEventResponse();
        System.out.print("sfdfg");
        try{
            response = service.addEventResponse(request);
            return new ResponseEntity<>(response, ACCEPTED);
        }
        catch(Exception e)
        {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }
     @PutMapping(UPDATEVENT)
    public ResponseEntity<UserEventResponse> Updateuser(@RequestBody UserEventupdateRequest request){
        UserEventResponse response = new UserEventResponse();
        try{
            response = service.UpdateEventResponse(request);
            return new ResponseEntity<>(response, ACCEPTED);
        }
        catch(Exception e)
        {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }
    @DeleteMapping(DELETEEVENT)
    public ResponseEntity<UserEventResponse> deleteuser(@RequestBody UserEventIdrequest request){
        UserEventResponse response = new UserEventResponse();
        try{
            response = service.deleteEventResponse(request);
            return new ResponseEntity<>(response, ACCEPTED);
        }
        catch(Exception e)
        {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }
    @GetMapping(EVENTLIST)
    public ResponseEntity<BasicResponse<UserEventDetailsResponse>> getAllUser(){
        BasicResponse<UserEventDetailsResponse> response=new BasicResponse<>();
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
