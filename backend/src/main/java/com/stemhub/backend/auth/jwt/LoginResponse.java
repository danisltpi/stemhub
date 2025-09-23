package com.stemhub.backend.auth.jwt;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class LoginResponse {
    @Getter
    @Setter
    private String jwt;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private List<String> roles;

    public LoginResponse(String username, List<String> roles, String jwt) {
        this.username = username;
        this.roles = roles;
        this.jwt = jwt;
    }
}
