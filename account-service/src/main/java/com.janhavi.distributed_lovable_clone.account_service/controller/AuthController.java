package com.janhavi.distributed_lovable_clone.account_service.controller;

import com.janhavi.distributed_lovable_clone.account_service.dto.auth.AuthResponse;
import com.janhavi.distributed_lovable_clone.account_service.dto.auth.LoginRequest;
import com.janhavi.distributed_lovable_clone.account_service.dto.auth.SignupRequest;
import com.janhavi.distributed_lovable_clone.account_service.dto.auth.UserProfileResponse;
import com.janhavi.distributed_lovable_clone.account_service.service.AuthService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthController {

    AuthService authService;
//    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest request) {
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

     // X-User-Id is set by the API Gateway after JWT verification
    // @GetMapping("/users/me")
    // public UserProfileResponse me(@RequestHeader("X-User-Id") Long userId) { return authService.me(userId); }

}

