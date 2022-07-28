package com.goorm.t4.youtubeclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Document(value = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String givenName;
    private String nickname;
    private String emailAddress;
    private String sub;
    private Set<String> subscribedToUsers= ConcurrentHashMap.newKeySet();
    private Set<String> subscribers= ConcurrentHashMap.newKeySet();
    private Set<String> videoHistory = ConcurrentHashMap.newKeySet();
    private Set<String> likedVideos = ConcurrentHashMap.newKeySet();
    private Set<String> disLikedVideos= ConcurrentHashMap.newKeySet();

    public void addToLikeVideos(String videoId) {
        likedVideos.add(videoId);
    }

    public void removeFromLikeVideos(String videoId) {
        likedVideos.remove(videoId);
    }

    public void addToDisLikeVideos(String videoId) {
        disLikedVideos.add(videoId);
    }

    public void removeFromDisLikeVideos(String videoId) {
        disLikedVideos.remove(videoId);
    }

    public void addVideoToHistory(String videoId) {
        videoHistory.add(videoId);
    }

    public void addToSubscribedToUsers(String userId) {
        subscribedToUsers.add(userId);
    }

    public void addToSubscribers(String id) {
        subscribers.add(id);
    }

    public void removeFromSubscribedToUsers(String userId) {
        subscribedToUsers.remove(userId);
    }

    public void removeFromSubscribers(String id) {
        subscribers.remove(id);
    }
}
