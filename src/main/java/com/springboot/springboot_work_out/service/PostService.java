package com.springboot.springboot_work_out.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springboot.springboot_work_out.model.Post;
import com.springboot.springboot_work_out.repository.PostRepository;
import com.springboot.springboot_work_out.mapper.PostMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public List<Post> postList(String title) {
        // return postRepository.findByTitle(title);
        return postRepository.findByTitleContains(title);
        // return postMapper.listPost();
    }
}
