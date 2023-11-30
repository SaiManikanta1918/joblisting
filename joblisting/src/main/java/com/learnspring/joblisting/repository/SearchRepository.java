package com.learnspring.joblisting.repository;

import com.learnspring.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
