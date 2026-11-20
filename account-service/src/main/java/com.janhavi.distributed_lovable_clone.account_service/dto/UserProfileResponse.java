package com.janhavi.distributed_lovable_clone.account_service.dto;

import com.janhavi.distributed_lovable_clone.account_service.entity.User;

public record UserProfileResponse(Long id, String email, String name) {
    public static UserProfileResponse from(User u) {
        return new UserProfileResponse(u.getId(), u.getUsername(), u.getName());
    }
}