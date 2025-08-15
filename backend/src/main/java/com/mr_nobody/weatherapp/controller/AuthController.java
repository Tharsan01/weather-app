package com.mr_nobody.weatherapp.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AuthController {

    @GetMapping("/")
    public String home(@AuthenticationPrincipal OAuth2User principal) {
        if (principal != null) {
            return "Hello " + principal.getAttribute("name") + "! You are logged in. <a href='/logout'>Logout</a>";
        } else {
            return "Welcome! Please login first. <a href='/oauth2/authorization/auth0'>Login</a>";
        }
    }
}