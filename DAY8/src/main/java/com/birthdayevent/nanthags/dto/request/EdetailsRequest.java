package com.birthdayevent.nanthags.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EdetailsRequest {

    private long id;
    private String eventname;
    private String location;
    private String themename;
    private String image;
    private String pgname;
    private String vgname;
    private int pgnumber;
    private int vgnumber;
    private int themecost;


}
