package com.example.base.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import com.example.base.entity.User;
import com.example.base.dto.response.UserResponse;
import com.example.base.dto.request.UserCreateRequest;
import com.example.base.dto.request.UserUpdateRequest;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreateRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
