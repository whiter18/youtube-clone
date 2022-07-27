package com.goorm.t4.youtubeclone.service;


import com.goorm.t4.youtubeclone.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@RequiredArgsConstructor
public class UserRegistrationService {
    @Value("${auth0.userinfoEndpoint}")
    private String userinfoEndpoint;

    private final UserRepository userRepository;
    public void registerUser(String tokenValue){
        // Make a call to the userInfo Endpoint
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(userinfoEndpoint))
                .setHeader("Authorization",String.format("Bearer %s",tokenValue))
                .build();

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
        try {
            HttpResponse<String> responseString = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (Exception exception){
            throw new RuntimeException("Exception occurred while registering user", exception);
        }
        // Fetch user details and save them to the database

    }
}
