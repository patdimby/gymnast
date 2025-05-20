package com.news.gymnast.services.interfaces;

import com.news.gymnast.dtos.PostDto;

import java.util.List;

public interface IPostService {
    List<PostDto> findAllPosts();
}
