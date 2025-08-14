package com.mr_nobody.weatherapp.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/api/public")
    public String publicEndpoint() {
        return "This is a public endpoint — no login required.";
    }

    @GetMapping("/api/private")
    public Object privateEndpoint(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttributes();  // Returns logged-in user profile from Auth0
    }
}