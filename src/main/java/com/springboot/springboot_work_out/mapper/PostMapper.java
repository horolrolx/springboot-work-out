package com.springboot.springboot_work_out.mapper;


import com.springboot.springboot_work_out.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    public List<Post> listPost(); // 메소드명이 post.xml 속 id랑 일치 해야함
}
