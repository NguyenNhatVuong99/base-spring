package com.example.base.entity;

import com.example.base.core.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
@Entity
@Data
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class User extends BaseEntity {
    @Column(unique = true)
    String email;
    String password;
    String firstName;
    String lastName;
}
