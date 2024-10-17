package com.example.base.service;

import java.util.List;

import lombok.AccessLevel;
import com.example.base.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import com.example.base.mapper.UserMapper;
import com.example.base.exception.ErrorCode;
import org.springframework.stereotype.Service;
import com.example.base.exception.AppException;
import com.example.base.dto.response.UserResponse;
import com.example.base.repository.UserRepository;
import com.example.base.dto.request.UserCreateRequest;
import com.example.base.dto.request.UserUpdateRequest;


@Service
@RequiredArgsConstructor()
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {

    UserRepository userRepository;
    UserMapper userMapper;

    User findById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.USER_NOT_EXISTED));
    }

    public List<UserResponse> index() {
        return userRepository.findAll().stream().map(userMapper::toUserResponse).toList();
    }

    public UserResponse store(UserCreateRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new AppException(ErrorCode.USER_EXISTED);
        }
        User user = userMapper.toUser(request);
        userRepository.save(user);
        return userMapper.toUserResponse(user);

    }

    public UserResponse show(String id) {
        User user = this.findById(id);
        return userMapper.toUserResponse(user);
    }

    public UserResponse update(String id, UserUpdateRequest request) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            userMapper.updateUser(user, request);
            userRepository.save(user);
        }
        return userMapper.toUserResponse(user);
    }

    public User destroy(String id) {
        User user = userRepository.findById(id).orElse(null);
        userRepository.delete(user);
        return user;
    }
}
