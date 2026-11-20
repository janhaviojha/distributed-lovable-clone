package com.janhavi.distributed_lovable_clone.account_service.service;

import com.janhavi.distributed_lovable_clone.account_service.dto.AuthResponse;
import com.janhavi.distributed_lovable_clone.account_service.dto.LoginRequest;
import com.janhavi.distributed_lovable_clone.account_service.dto.SignupRequest;
import com.janhavi.distributed_lovable_clone.account_service.dto.UserProfileResponse;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);

    UserProfileResponse me(Long userId);
}