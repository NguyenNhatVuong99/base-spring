package com.example.base.entity;

import com.example.base.core.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Product extends BaseEntity {
    private String name;
    private String description;
}
