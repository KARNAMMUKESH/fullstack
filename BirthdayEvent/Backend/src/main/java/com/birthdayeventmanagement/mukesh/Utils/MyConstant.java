package com.birthdayeventmanagement.mukesh.Utils;

import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.HEAD;
import static org.springframework.http.HttpMethod.PATCH;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.HttpMethod.PUT;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;

public class MyConstant {
    // Request Mapping
    public static final String AUTH="/api/v1/auth";
    public static final String USER="/api/v1/user";
    public static final String EVENT="/api/v1/event";

    // End Points
    public static final String REGISTER="/register";
    public static final String LOGIN="/login";
    public static final String USERPROFILE="/addprofile";
    public static final String UPDATEPROFILE="/updateprofile";
    public static final String DELETEPROFILE="/deleteprofile";
    public static final String GETUSERPROFILE="/geusertprofile";
    public static final String ADDEVENT="/addevent";
    public static final String UPDATEVENT="/updatevent";
    public static final String DELETEEVENT="/deleteevent";
    public static final String EVENTLIST="/eventlist";
    public static final String USERLIST="/list";

    
    // Web Security
    public static final List
    <String> ORIGINS=Arrays.asList("http://localhost:5173");
    public static final List<String> HEADERS=Arrays.asList(HttpHeaders.AUTHORIZATION,HttpHeaders.CONTENT_TYPE);
    public static final List<String> METHODS=Arrays.asList(GET.name(),POST.name(),
    PUT.name(),PATCH.name(),DELETE.name(),HEAD.name());

    //JasonWebtoken
    public static final String SWAGGER_LOCALHOST_URL = "http://localhost:8181";
    public static final String SWAGGER_SECURITY_SCHEME_NAME = "bearerAuth";
    public static final String SWAGGER_SCHEME = "bearer";
    public static final String SWAGGER_BEARER_FORMAT = "JWT";
    public static final String SWAGGER_DESCRIPTION = "produce a json token";

}
