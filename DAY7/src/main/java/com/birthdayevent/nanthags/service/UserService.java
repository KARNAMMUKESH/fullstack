package com.birthdayevent.nanthags.service;

import com.birthdayevent.nanthags.dto.response.BasicResponse;
import com.birthdayevent.nanthags.dto.response.UserResponse;

public interface UserService {
    BasicResponse<UserResponse> getAllUser();
}
