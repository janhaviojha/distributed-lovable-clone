package com.janhavi.distributed_lovable_clone.account_service.dto;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}

