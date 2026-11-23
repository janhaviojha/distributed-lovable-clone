package com.janhavi.distributed_lovable_clone.account_service.service;

import com.janhavi.distributed_lovable_clone.account_service.dto.auth.AuthResponse;
import com.janhavi.distributed_lovable_clone.account_service.dto.auth.LoginRequest;
import com.janhavi.distributed_lovable_clone.account_service.dto.auth.SignupRequest;
import com.janhavi.distributed_lovable_clone.account_service.dto.auth.UserProfileResponse;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);

    UserProfileResponse me(Long userId);
}