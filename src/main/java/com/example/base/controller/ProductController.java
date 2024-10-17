package com.example.base.controller;

import com.example.base.core.ApiResponse;
import com.example.base.core.IRestController;
import com.example.base.dto.request.ProductCreateRequest;
import com.example.base.dto.request.ProductUpdateRequest;
import com.example.base.dto.response.ProductResponse;
import com.example.base.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController implements IRestController<ProductCreateRequest, ProductUpdateRequest, ProductResponse> {


    @Override
    public ApiResponse<List<ProductResponse>> index() {
        return null;
    }

    @Override
    public ApiResponse<ProductResponse> show(String id) {
        return null;
    }

    @Override
    public ApiResponse<ProductResponse> store(ProductCreateRequest productCreateRequest) {
        return null;
    }

    @Override
    public ApiResponse<ProductResponse> update(String id, ProductUpdateRequest productUpdateRequest) {
        return null;
    }

    @Override
    public ApiResponse<String> destroy(String id) {
        return null;
    }
}

