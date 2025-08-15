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
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/api/public/**", "/login/**", "/oauth2/**").permitAll()
                        .requestMatchers("/api/weather/**").authenticated()
                        .anyRequest().permitAll()
                )
                .oauth2Login(oauth2 -> oauth2
                        .loginPage("/oauth2/authorization/auth0")
                        .defaultSuccessUrl("http://localhost:3000/weather", true) // 👈 Redirect to React page
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("http://localhost:3000") // 👈 Go back to frontend home after logout
                        .permitAll()
                );

        return http.build();
    }
}
