package com.example.base.core;

import com.example.base.dto.request.UserCreateRequest;
import com.example.base.entity.User;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IRestController<CreateRequest, UpdateRequest, Response> {
    /**
     * Display a listing of the resource.
     */
    @GetMapping
    ApiResponse<List<Response>> index();

    /**
     * Store a newly created resource in storage.
     */
    @GetMapping("/{id}")
    ApiResponse<Response> show(@PathVariable String id);

    /**
     * Display the specified resource.
     */
    @PostMapping
    ApiResponse<Response> store(@RequestBody @Valid CreateRequest request);
    /**
     * Update the specified resource in storage.
     */
    @PutMapping("/{id}")
    ApiResponse<Response> update(@PathVariable String id, UpdateRequest request);

    /**
     * Remove the specified resource from storage.
     */
    @DeleteMapping("/{id}")
    ApiResponse<String> destroy(@PathVariable String id);
}

