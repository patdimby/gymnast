package com.news.gymnast.services.implementations;

import com.news.gymnast.dtos.PostDto;
import com.news.gymnast.mapper.PostMapper;
import com.news.gymnast.models.Post;
import com.news.gymnast.repositories.PostRepository;
import com.news.gymnast.services.interfaces.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService implements IPostService {

    @Autowired
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDto> findAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream().map(PostMapper::toDto)
                .collect(Collectors.toList());
    }
}
