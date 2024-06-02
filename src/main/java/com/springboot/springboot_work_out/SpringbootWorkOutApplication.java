package com.springboot.springboot_work_out;

import java.util.*;
import java.time.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.springboot_work_out.model.Post;
import com.springboot.springboot_work_out.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringbootWorkOutApplication implements CommandLineRunner {
	private final PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWorkOutApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Post> postList = List.of(
            new Post(UUID.randomUUID(),"title1","contents1","Song",LocalDateTime.now()),
            new Post(UUID.randomUUID(),"title2","contents2","Kim",LocalDateTime.now()),
            new Post(UUID.randomUUID(),"title3","contents3","Lee",LocalDateTime.now())
        );
		postRepository.saveAll(postList);
	}

}
