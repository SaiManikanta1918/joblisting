package com.learnspring.joblisting.repository;

import com.learnspring.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
