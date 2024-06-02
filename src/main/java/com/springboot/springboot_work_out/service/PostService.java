package com.springboot.springboot_work_out.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springboot.springboot_work_out.model.Post;
import com.springboot.springboot_work_out.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> postList() {
        return postRepository.findAll();
    }
}
