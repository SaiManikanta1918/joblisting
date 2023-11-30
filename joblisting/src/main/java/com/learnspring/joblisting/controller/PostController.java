package com.learnspring.joblisting.controller;

import com.learnspring.joblisting.repository.PostRepository;
import com.learnspring.joblisting.model.Post;
import com.learnspring.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@EnableSwagger2
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @ApiIgnore
    @RequestMapping(value="/")
    @CrossOrigin(origins = "http://localhost:3000")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping(value = "/posts")
    @CrossOrigin
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @GetMapping(value = "/post/{text}")
    @CrossOrigin
    public List<Post> filterPosts(@PathVariable String text){
        return srepo.findByText(text);
    }
    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);
    }
}
