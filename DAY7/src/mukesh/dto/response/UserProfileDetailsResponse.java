package com.birthdayeventmanagement.mukesh.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileDetailsResponse {
    private String profileid;
    private String fullname;
    private long mobileno;
    private String email;
    private String profile;
    
}
