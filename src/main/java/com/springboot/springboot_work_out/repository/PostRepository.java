package com.springboot.springboot_work_out.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import com.springboot.springboot_work_out.model.Post;

public interface PostRepository extends JpaRepository<Post, UUID> {
    
}
