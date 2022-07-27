package com.goorm.t4.youtubeclone.repository;

import com.goorm.t4.youtubeclone.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {
}
