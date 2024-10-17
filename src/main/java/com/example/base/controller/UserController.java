package com.example.base.controller;

import com.example.base.core.IRestController;
import com.example.base.dto.request.UserUpdateRequest;
import com.example.base.dto.response.UserResponse;
import lombok.extern.slf4j.Slf4j;
import com.example.base.entity.User;
import com.example.base.core.ApiResponse;
import com.example.base.service.UserService;
import org.springframework.web.bind.annotation.*;
import com.example.base.dto.request.UserCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController  {
    private UserService userService;

    public ApiResponse<List<UserResponse>> index() {
        return ApiResponse.<List<UserResponse>>builder()
                .result(userService.index())
                .build();
    }

    
    public ApiResponse<UserResponse> show(String id) {
        return ApiResponse.<UserResponse>builder()
                .result(userService.show(id))
                .build();    }

    
    public ApiResponse<UserResponse> store(UserCreateRequest request) {
        return ApiResponse.<UserResponse>builder()
                .result(userService.store(request))
                .build();
    }

    
    public ApiResponse<UserResponse> update(String id, UserUpdateRequest request) {
        return ApiResponse.<UserResponse>builder()
                .result(userService.update(id, request))
                .build();
    }

    
    public ApiResponse<String> destroy(String id) {
        return ApiResponse.<UserResponse>builder()
                .result(userService.destroy())
                .build();
    }
}


