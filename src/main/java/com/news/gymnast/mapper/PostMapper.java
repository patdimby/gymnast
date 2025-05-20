package com.news.gymnast.mapper;

import com.news.gymnast.dtos.PostDto;
import com.news.gymnast.models.Post;

public class PostMapper {

    public static PostDto toDto(Post post) {

        return PostDto.builder().
                id(post.getId()).
                title(post.getTitle()).
                url(post.getUrl()).
                content(post.getContent()).
                description(post.getDescription()).
                createdOn(post.getCreatedOn()).
                updatedOn(post.getUpdatedOn()).
                build();
    }

    public static Post toEntity(PostDto dto) {

        return Post.builder().
                id(dto.getId()).
                title(dto.getTitle()).
                url(dto.getUrl()).
                content(dto.getContent()).
                description(dto.getDescription()).
                createdOn(dto.getCreatedOn()).
                updatedOn(dto.getUpdatedOn()).
                build();
    }
}
