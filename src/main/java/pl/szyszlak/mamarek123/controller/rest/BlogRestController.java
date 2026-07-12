package pl.szyszlak.mamarek123.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.szyszlak.mamarek123.model.BlogPostDTO;
import pl.szyszlak.mamarek123.service.interfaces.BlogService;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class BlogRestController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<BlogPostDTO> getAllPosts() {
        return blogService.getAllPosts();
    }
}