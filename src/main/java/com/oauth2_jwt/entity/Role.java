package com.oauth2_jwt.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    // TODO : ADMIN 구현
    GUEST("ROLE_GUEST"), USER("ROLE_USER");

    private final String key;
}
