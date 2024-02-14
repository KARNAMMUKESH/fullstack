package com.birthdayeventmanagement.mukesh.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEventRequest { 
    private String eventname;
    private String eventdestination;
    private String price;
    private String organizer;
    private String date;
    private String imageurl; 
    private Long maxparticipants;   
}
