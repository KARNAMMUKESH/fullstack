package com.birthdayevent.nanthags.utils;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.HEAD;
import static org.springframework.http.HttpMethod.PATCH;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.HttpMethod.PUT;


import java.util.Arrays;
import java.util.List;

public class MyConstant {
    // Request Mappings
    public static final String AUTH = "/api/v1/auth";
    public static final String USER = "/api/v1/user";
    public static final String ADMIN = "/api/v1/admin";
    public static final String EVENT = "/api/v1/event";

    // End Points
    public static final String REGISTER = "/register";
    public static final String LOGIN = "/login";
    public static final String USERLIST = "/userlist";
    public static final String USERPROFILE = "/profile";
    public static final String DELETEPROFILE = "/deleteprofile/{id}";
    public static final String UPDATEPROFILE = "/updateprofile/{id}";
    public static final String GETPROFILE = "/getprofile/{id}";
    public static final String USEREVENT = "/details";
    public static final String POSTEVENT = "/post";

    // Web Security
    public static final List<String> ORIGINS = Arrays.asList("http://localhost:4000");
    public static final List<String> HEADERS = Arrays.asList(AUTHORIZATION, CONTENT_TYPE);
    public static final List<String> METHODS = Arrays.asList(GET.name(), POST.name(), PATCH.name(),
            PUT.name(), DELETE.name(), HEAD.name());

    public static final String SWAGGER_LOCALHOST_URL = "http://localhost:8081";
    public static final String SWAGGER_SECURITY_SCHEME_NAME = "baererAuth";
    public static final String SWAGGER_SCHEME = "bearer";
    public static final String SWAGGER_BEARER_FORMAT = "JWT";    
    public static final String SWAGGER_DESCRIPTION = "Produce a Json Web Token";

}
