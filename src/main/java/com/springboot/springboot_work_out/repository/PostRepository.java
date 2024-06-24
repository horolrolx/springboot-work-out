package com.springboot.springboot_work_out.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;
import com.springboot.springboot_work_out.model.Post;

public interface PostRepository extends JpaRepository<Post, UUID> {

    List<Post> findByTitle(String title);
    List<Post> findByTitleContains(String title);
    // jpql
    // query creation -> 메소드 이름만으로 쿼리 생성
}
