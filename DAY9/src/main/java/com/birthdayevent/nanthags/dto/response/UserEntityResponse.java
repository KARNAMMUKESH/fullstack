package com.birthdayevent.nanthags.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntityResponse {
    private int id;
    private String applicant_name;
    private String event_name;
    private String applicant_address;
    private long applicant_mobile_no;
    private String applicant_email;
    private String date;
    private String time;
    private int no_of_people;
    private String food_type;
    private List<String> add_ons;
}
