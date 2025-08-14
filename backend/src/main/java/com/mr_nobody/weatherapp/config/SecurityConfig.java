package com.mr_nobody.weatherapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/public").permitAll()  // fixed leading slash
                        .requestMatchers("/api/weather/**").authenticated()
                        .anyRequest().permitAll() // allow other endpoints like /oauth2/** and /login
                )
                .oauth2Login(oauth2 -> oauth2
                        .loginPage("/oauth2/authorization/auth0") // your Auth0 login page
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/")
                        .permitAll()
                );

        return http.build();
    }
}