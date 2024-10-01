package com.kl.nestify.repository;

import com.kl.nestify.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<User, Long> {
    // You can add custom query methods if needed
}
